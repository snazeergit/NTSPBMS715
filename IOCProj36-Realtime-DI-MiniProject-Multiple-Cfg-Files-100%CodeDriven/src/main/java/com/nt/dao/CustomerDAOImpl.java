package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class CustomerDAOImpl implements ICustomerDAO {

	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO REALTIME_DI_CUSTOMER_TABLE VALUES (CUST_NO_SEQUENCE.NEXTVAL,?,?,?,?,?,?)";
	private DataSource ds;

	public CustomerDAOImpl(DataSource ds) {
		System.out.println("-->CustomerDAOImpl::datasource Object injected using constrcutor injetion!");
		this.ds = ds;
	}

	@Override
	public int insertCustomerRecord(CustomerBO bo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("CustomerDAOImpl.insertCustomerRecord()::invoked");
		int insertResult = 0;
		// get pooled jdbc connection
		try (Connection connection = ds.getConnection();
				PreparedStatement prepareStatement = connection.prepareStatement(CUSTOMER_INSERT_QUERY);) {
			prepareStatement.setString(1, bo.getCname());
			prepareStatement.setString(2, bo.getCaddr());
			prepareStatement.setLong(3, bo.getPamt());
			prepareStatement.setFloat(4, bo.getRoi());
			prepareStatement.setFloat(5, bo.getIntamt());
			prepareStatement.setInt(6, bo.getTenure());
			insertResult = prepareStatement.executeUpdate();
			if (insertResult == 1) {
				System.out.println("Customer record inserted to database successfully");
			} else {
				System.err.println("Customer record insertion to database failed");
			}
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
		return insertResult;
	}

}
