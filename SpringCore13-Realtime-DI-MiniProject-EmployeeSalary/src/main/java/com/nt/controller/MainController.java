package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;
import com.nt.vo.EmployeeVO;

public final class MainController {

	private IEmployeeService service;

	public MainController(IEmployeeService service) {
		this.service = service;
	}

	public String processEmployeeDetails(EmployeeVO vo) throws Exception {
		EmployeeDTO dto = new EmployeeDTO();
		dto.seteName(vo.geteName());
		dto.seteAddrs(vo.geteAddrs());
		dto.setBasicSal(Double.parseDouble(vo.getBasicSal()));
		String salCalculation = service.employeeSalCalculation(dto);
		return salCalculation;
	}

}
