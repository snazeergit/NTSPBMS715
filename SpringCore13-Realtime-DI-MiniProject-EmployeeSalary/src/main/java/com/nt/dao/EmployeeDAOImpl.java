package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public final class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String EMPLOYEE_INSERT_QUERY = "INSERT INTO EMPLOYEE_TABLE VALUES(EMP_NO_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;

	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insertEmployeeRecord(EmployeeBO bo) throws SQLException {
		int update = 0;
		try (Connection connection = ds.getConnection();
				PreparedStatement ps = connection.prepareStatement(EMPLOYEE_INSERT_QUERY);) {
			ps.setString(1, bo.geteName());
			ps.setString(2, bo.geteAddrs());
			ps.setDouble(3, bo.getBasicSal());
			ps.setDouble(4, bo.getGrossSal());
			ps.setDouble(5, bo.getNetSal());
			update = ps.executeUpdate();
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
