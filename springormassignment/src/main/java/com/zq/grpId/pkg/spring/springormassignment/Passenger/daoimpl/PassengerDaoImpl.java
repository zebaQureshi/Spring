package com.zq.grpId.pkg.spring.springormassignment.Passenger.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.zq.grpId.pkg.spring.springormassignment.Passenger.dao.PassengerDao;
import com.zq.grpId.pkg.spring.springormassignment.Passenger.entity.Passenger;

public class PassengerDaoImpl implements PassengerDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public int create(Passenger p) {
		Integer result = (Integer) hibernateTemplate.save(p);
		return result;
	}

	@Override
	@Transactional
	public void update(Passenger p) {
		hibernateTemplate.update(p);
	}

	@Override
	@Transactional
	public void delete(Passenger p) {
		hibernateTemplate.delete(p);
	}

	@Override
	public Passenger selectOne(int id) {
		Passenger passenger = hibernateTemplate.get(Passenger.class, id);
		return passenger;
	}

	@Override
	public List<Passenger> selectAll() {
		List<Passenger> passengers = hibernateTemplate.loadAll(Passenger.class);
		return passengers;
	}

}
