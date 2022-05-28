package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("mysqlStudentDao")
public final class MySQLStudentDAOImpl implements IStudentDAO {

	private static final String STUDNET_INSERT_QUERY = "INSERT INTO STUDENT_TABLE(SNAME,BRANCH,TOTALMARKS,PERCENTAGE,GRADE) VALUES(?,?,?,?,?)";
	
	@Autowired
	
	//since we have one datasource(Oracle datasource) configured so there is no ambiguity so Qualifier is not needed
	//@Qualifier("datasource")
	private DataSource ds;

	//since its Autowired we don't need to have constructor or setter to support it. 
	/*public StudentDAOImpl(DataSource ds) {
		this.ds = ds;
	}*/

	@Override
	public int insertStudentRecord(StudentBO bo) throws SQLException, Exception {
		// TODO Auto-generated method stub
		int update = 0;
		try (Connection connection = ds.getConnection();
				PreparedStatement ps = connection.prepareStatement(STUDNET_INSERT_QUERY);) {
			ps.setString(1, bo.getsName());
			ps.setString(2, bo.getBranch());
			ps.setInt(3, bo.getTotalMarks());
			ps.setDouble(4, bo.getPercentage());
			ps.setString(5, bo.getGrade());
			update = ps.executeUpdate();

		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}

		return update;
	}

}
