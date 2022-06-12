package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.PatientBO;

public final class PatientDAOImpl implements IPatientDAO {
	private static final String PATIENT_INSERT_QUERY = "INSERT INTO CORONA_PATIENT_TABLE VALUES(PATIENT_NO_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;

	public PatientDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insertPatientDetails(PatientBO bo) throws SQLException {
		int insertQueryResult = 0;
		try (Connection connection = ds.getConnection();
				PreparedStatement ps = connection.prepareStatement(PATIENT_INSERT_QUERY);) {
			ps.setString(1, bo.getpName());
			ps.setString(2, bo.getpAddrs());
			ps.setDouble(3, bo.getPerDayCharge());
			ps.setInt(4, bo.getTotalDaysStayed());
			ps.setDouble(5, bo.getBillAmt());
			insertQueryResult = ps.executeUpdate();
			if (insertQueryResult == 1) {
				System.out.println("Patient details Inserted");
			} else {
				System.out.println("Insertion failed");
			}
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return insertQueryResult;
	}

}
