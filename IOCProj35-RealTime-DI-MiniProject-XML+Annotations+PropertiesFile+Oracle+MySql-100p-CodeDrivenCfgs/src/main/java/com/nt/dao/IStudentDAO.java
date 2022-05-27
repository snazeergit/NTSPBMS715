package com.nt.dao;

import java.sql.SQLException;

import com.nt.bo.StudentBO;

public interface IStudentDAO {
	
	public int insertStudentRecord(StudentBO bo) throws SQLException, Exception;

}
