package com.nt.service;

import java.sql.SQLException;

import com.nt.bo.PatientBO;
import com.nt.dao.IPatientDAO;
import com.nt.dto.PatientDTO;

public final class PatientMgmtServiceImpl implements IPatientService {
	private IPatientDAO dao;

	public PatientMgmtServiceImpl(IPatientDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calculateBillAmount(PatientDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		double billAmount = (1.18) * dto.getPerDayCharge() * dto.getTotalDaysStayed();
		PatientBO bo = new PatientBO();
		bo.setBillAmt(billAmount);
		bo.setpName(dto.getpName());
		bo.setpAddrs(dto.getpAddrs());
		bo.setPerDayCharge(dto.getPerDayCharge());
		bo.setTotalDaysStayed(dto.getTotalDaysStayed());
		int insertPatientDetails = dao.insertPatientDetails(bo);
		return insertPatientDetails == 0 ? "Bill amount calculation is failed"
				: "Bill amount calculation is succeeded : Rs "+ billAmount+"/-";

		/*if (insertPatientDetails == 0) {
			return "Bill amount calculation is failed";
		} else {
			return "Bill amount calculation is succeeded"+billAmount;
		}*/
	}

}
