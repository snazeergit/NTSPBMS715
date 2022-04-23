package com.nt.service;

import java.sql.SQLException;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public final class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDAO dao;

	public EmployeeServiceImpl(IEmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String employeeSalCalculation(EmployeeDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeBO bo = new EmployeeBO();
		Double grossSal = dto.getBasicSal() * 1.4;
		Double netSal = dto.getBasicSal() * 0.8;
		bo.seteName(dto.geteName());
		bo.seteAddrs(dto.geteAddrs());
		bo.setBasicSal(dto.getBasicSal());
		bo.setGrossSal(grossSal);
		bo.setNetSal(netSal);

		int insertEmployeeRecord = dao.insertEmployeeRecord(bo);

		return insertEmployeeRecord == 0 ? "Exployee record insertion failed" : "Employee record insertion Successful";
	}

}
