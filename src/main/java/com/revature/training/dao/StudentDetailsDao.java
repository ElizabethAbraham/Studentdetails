package com.revature.training.dao;
import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.training.model.StudentDetails;
import com.revature.training.util.ConnectionUtil;

public class StudentDetailsDao {
	private JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();
	public void save(StudentDetails student1 ){
		String sql="insert into StudentDetails(name,classpost) values(?,?)";
		Object[] params={ student1.getName(),student1.getClasspost()};
		
		int rows=jdbctemplate.update(sql,params);
		System.out.println(+rows);
		}
	}
	

	
	

