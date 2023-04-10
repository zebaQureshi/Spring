package com.zq.grpId.pkg.spring.springorm.dao;

import java.util.List;

import com.zq.grpId.pkg.spring.springorm.entity.Product;

public interface ProductDao {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product selectOne(int id);
	List<Product> selectAll();
}
