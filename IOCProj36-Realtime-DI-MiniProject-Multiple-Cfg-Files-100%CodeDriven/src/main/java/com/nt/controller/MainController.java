package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public final class MainController {

	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
System.out.println("-->MainController::service object injected using constrcutor injetion!");
		this.service = service;
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		System.out.println("MainController.processCustomer():: invoked");

		// DTO object created
		CustomerDTO dto = new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAdrs(vo.getCustAdrs());
		dto.setPrincipleAmt(Long.parseLong(vo.getPrincipleAmt()));
		dto.setRateOfInterest(Float.parseFloat(vo.getRateOfInterest()));
		dto.setTenure(Integer.parseInt(vo.getTenure()));

		String registerCustomerResultMsg = service.registerCustomer(dto);
		return registerCustomerResultMsg;
	}

}
