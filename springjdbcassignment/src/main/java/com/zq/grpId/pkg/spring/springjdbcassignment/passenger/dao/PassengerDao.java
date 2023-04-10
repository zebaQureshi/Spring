package com.zq.grpId.pkg.spring.springjdbcassignment.passenger.dao;

import java.util.List;

import com.zq.grpId.pkg.spring.springjdbcassignment.passenger.entity.Passenger;

public interface PassengerDao {

	int create(Passenger p);

	int update(Passenger p);

	int delete(int id);

	Passenger read(int id);

	List<Passenger> readAllPassengers();

}
