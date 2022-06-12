package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	private ICustomerDAO dao;

	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("-->CustomerMgmtServiceImpl::dao object injected using constrcutor injetion!");
		this.dao = dao;
	}

	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		System.out.println("CustomerMgmtServiceImpl.registerCustomer()::invoked");

		// Interest calculation
		float intamt = dto.getPrincipleAmt() * dto.getRateOfInterest() * dto.getTenure() / 100.0f;

		CustomerBO bo = new CustomerBO();

		bo.setCname(dto.getCustName());
		bo.setCaddr(dto.getCustAdrs());
		bo.setPamt(dto.getPrincipleAmt());
		bo.setIntamt(intamt);
		bo.setRoi(dto.getRateOfInterest());
		bo.setTenure(dto.getTenure());

		int insertResultMessage = dao.insertCustomerRecord(bo);

		if (insertResultMessage == 0) {
			return "Customer registration Failed!";
		} else {
			return "Customer registration Succeeded!";
		}
	}

}
