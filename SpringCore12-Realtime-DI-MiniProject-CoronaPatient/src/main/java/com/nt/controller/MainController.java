package com.nt.controller;

import java.sql.SQLException;

import com.nt.dto.PatientDTO;
import com.nt.service.IPatientService;
import com.nt.vo.PatientVO;

public final class MainController {
	private IPatientService service;

	public MainController(IPatientService service) {
		this.service = service;
	}

	public String processPatientDetails(PatientVO vo) throws SQLException{
		
		PatientDTO dto=new PatientDTO();
		dto.setpName(vo.getpName());
		dto.setpAddrs(vo.getpAddrs());
		dto.setPerDayCharge(Double.parseDouble(vo.getPerDayCharge()));
		dto.setTotalDaysStayed(Integer.parseInt(vo.getTotalDaysStayed()));
		
		String calculateBillAmount = service.calculateBillAmount(dto);
		
		return calculateBillAmount;
	}
}
