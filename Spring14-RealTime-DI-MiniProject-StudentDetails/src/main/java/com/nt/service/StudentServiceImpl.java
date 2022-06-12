package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.IStudentDAO;
import com.nt.dto.StudentDTO;

public final class StudentServiceImpl implements IStudentService {

	private IStudentDAO dao;

	Float percentage;

	public StudentServiceImpl(IStudentDAO dao) {
		this.dao = dao;
	}

	public Float studentPercentageCal(StudentDTO dto) throws NumberFormatException, Exception {
		percentage = (dto.getTotalMarks() / 10f);
		return percentage;
	}

	public String studentGradeCal(StudentDTO dto) throws Exception {
		//Ternary operator
		//return (percentage>=90)?"First Class with Distinction":(percentage>=80 && percentage<90)?"First Class":(percentage>=70 && percentage<80)?"Second Class":(percentage>=60 && percentage<70)?"Third Class":(percentage>=30 && percentage<60)?"Just Pass":"Failed";
		if (percentage >= 90) {
			return "First Class with Distinction";
		} else if (percentage >= 80 && percentage < 90) {
			return "First Class";
		} else if (percentage >= 70 && percentage < 80) {
			return "Second Class";
		} else if (percentage >= 60 && percentage < 70) {
			return "Third Class";
		} else if (percentage >= 30 && percentage < 60) {
			return "Just Pass";
		} else {
			return "Failed";
		}
	}

	@Override
	public String registerStudent(StudentDTO dto) throws Exception {
		Float percentCal = studentPercentageCal(dto);
		String gradeCal = studentGradeCal(dto);
		StudentBO bo = new StudentBO();
		bo.setsName(dto.getsName());
		bo.setBranch(dto.getBranch());
		bo.setTotalMarks(dto.getTotalMarks());
		bo.setPercentage(percentCal);
		bo.setGrade(gradeCal);
		dao.insertStudentRecord(bo);
		if (gradeCal.equals("Failed")) {
			return dto.getsName() + " has failed with " + dto.getTotalMarks() + " marks";
		} else {
			return dto.getsName() + " has passed in " + gradeCal
					+ " with a percentage of " + percentCal + "%";
		}
	}
}