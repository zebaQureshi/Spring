package com.zq.grpId.pkg.spring.springorm.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zq.grpId.pkg.spring.springorm.dao.ProductDao;
import com.zq.grpId.pkg.spring.springorm.entity.Product;

@Component("daoImpl")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public int create(Product product) {
		// TODO Auto-generated method stub
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
          hibernateTemplate.update(product);	  //updates based on id specified in the entity class	
	}

	@Override
	@Transactional
	public void delete(Product product) {
        hibernateTemplate.delete(product);		
	}

	@Override
	public Product selectOne(int id) {
         Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> selectAll() {
           List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}
}
