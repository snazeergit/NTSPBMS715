package com.nt.dao;

import java.sql.SQLException;

import com.nt.bo.EmployeeBO;

public interface IEmployeeDAO {
	
	public int insertEmployeeRecord(EmployeeBO bo)throws SQLException;

}
