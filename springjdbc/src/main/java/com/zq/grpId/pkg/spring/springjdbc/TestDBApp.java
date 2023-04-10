package com.zq.grpId.pkg.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestDBApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/zq/grpId/pkg/spring/springjdbc/config.xml");
		JdbcTemplate template = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		String sql = "insert into test_emp values(?,?,?)";
		int rowsUpdated = template.update(sql, 2, "Bat", "Man");
		System.out.println("Number of rows updated:" + rowsUpdated);

	}

}
