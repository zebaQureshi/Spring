package com.zq.grpId.pkg.spring.springjdbcassignment.passenger.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zq.grpId.pkg.spring.springjdbcassignment.passenger.dao.PassengerDao;
import com.zq.grpId.pkg.spring.springjdbcassignment.passenger.entity.Passenger;
import com.zq.grpId.pkg.spring.springjdbcassignment.passenger.rowmapper.PassengerRowMapper;

public class PassengerDaoImpl implements PassengerDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Passenger p) {
		// TODO Auto-generated method stub
		String sql = "insert into test_pass values(?,?,?)";
		int result = jdbcTemplate.update(sql, p.getId(), p.getFirstName(), p.getLastName());

		return result;
	}

	@Override
	public int update(Passenger p) {
		String sql = "update test_pass set first_name=? where id=?";
		int result = jdbcTemplate.update(sql, p.getFirstName(), p.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "Delete from test_pass where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Passenger read(int id) {
		String sql = "Select * from test_pass where id=?";
		PassengerRowMapper rowmapper = new PassengerRowMapper();
		Passenger p = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return p;
	}

	@Override
	public List<Passenger> readAllPassengers() {
		String sql = "Select * from test_pass";
		PassengerRowMapper rowmapper = new PassengerRowMapper();
		List<Passenger> p = jdbcTemplate.query(sql, rowmapper);
		return p;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
