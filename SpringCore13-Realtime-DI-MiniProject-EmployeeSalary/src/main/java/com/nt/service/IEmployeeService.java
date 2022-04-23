package com.nt.service;

import java.sql.SQLException;

import com.nt.dto.EmployeeDTO;

public interface IEmployeeService {

	public String employeeSalCalculation(EmployeeDTO dto) throws SQLException;

}
