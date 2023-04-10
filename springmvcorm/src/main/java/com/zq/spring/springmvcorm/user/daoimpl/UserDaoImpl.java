package com.zq.spring.springmvcorm.user.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zq.spring.springmvcorm.user.dao.UserDao;
import com.zq.spring.springmvcorm.user.entity.User;

@Repository // because it is going to do db work
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(User user) {
		int result = (int) hibernateTemplate.save(user);
		return result;
	}

	@Override
	public List<User> findUsers() {
		List<User> users = hibernateTemplate.loadAll(User.class);
		return users;
	}

	@Override
	public User findUser(Integer id) {
		User user=hibernateTemplate.get(User.class, id);
		return user;
	}

}
