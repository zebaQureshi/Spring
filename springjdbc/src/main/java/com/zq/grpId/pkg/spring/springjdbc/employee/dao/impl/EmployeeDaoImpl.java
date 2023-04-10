package com.zq.grpId.pkg.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.zq.grpId.pkg.spring.springjdbc.employee.dao.EmployeeDao;
import com.zq.grpId.pkg.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.zq.grpId.pkg.spring.springjdbc.employee.entity.Employee;

@Component("empdaoImpl") //specifying bean name explicitly
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	@Qualifier("jdbcTemplate1")
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "Insert into test_emp values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "Update test_emp set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(Employee employee) {
		String sql = "Delete from  test_emp where id=?";
		int result = jdbcTemplate.update(sql, employee.getId());
		return result;
	}

	@Override
	public Employee read(int id) {

		String sql = "Select * from test_emp where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowMapper, id);
		// here rowmapper object is helping in converting result set row to employee
		// type
		return emp;
	}

	@Override
	public List<Employee> readAllEmployees() {

		String sql = "Select * from test_emp";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowMapper);
		return result;

	}

}
