package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("oracleStudentDao")
public final class OracleStudentDAOImpl implements IStudentDAO {

	private static final String STUDNET_INSERT_QUERY = "INSERT INTO STUDENT_TABLE VALUES(STUDENT_NO_SEQ.NEXTVAL,?,?,?,?,?)";

	@Autowired

	//since we have multiple datasource(Spring's DriverManagerDataSource, Apache DBCP2 and HikariCP datasources) configured so there is no ambiguity.To fix this Qualifier is used. 
	@Qualifier("hikaricpDS")
	private DataSource ds;

	@Override
	public int insertStudentRecord(StudentBO bo) throws SQLException, Exception {
		int update = 0;
		try (Connection connection = ds.getConnection();
				PreparedStatement ps = connection.prepareStatement(STUDNET_INSERT_QUERY);) {
			ps.setString(1, bo.getsName());
			ps.setString(2, bo.getBranch());
			ps.setInt(3, bo.getTotalMarks());
			ps.setDouble(4, bo.getPercentage());
			ps.setString(5, bo.getGrade());
			update = ps.executeUpdate();

			System.out.println(ds.getClass());

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return update;
	}

}
