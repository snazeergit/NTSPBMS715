package com.nt.dao;

import com.nt.bo.CustomerBO;

public interface ICustomerDAO {
	public int insertCustomerRecord(CustomerBO bo)throws Exception;
}
