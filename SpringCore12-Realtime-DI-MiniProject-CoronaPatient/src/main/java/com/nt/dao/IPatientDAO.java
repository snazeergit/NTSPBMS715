package com.nt.dao;

import java.sql.SQLException;

import com.nt.bo.PatientBO;

public interface IPatientDAO {
	public int insertPatientDetails(PatientBO bo) throws SQLException;

}
