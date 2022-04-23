package com.nt.service;

import java.sql.SQLException;

import com.nt.dto.PatientDTO;

public interface IPatientService {
	public String calculateBillAmount(PatientDTO dto) throws SQLException;
}
