package com.zq.grpId.pkg.spring.springormassignment.Passenger.dao;

import java.util.List;

import com.zq.grpId.pkg.spring.springormassignment.Passenger.entity.Passenger;

public interface PassengerDao {
	
	int create(Passenger p);
	void update(Passenger p);
	void delete(Passenger p);
	Passenger selectOne(int id);
	List<Passenger> selectAll();

}
