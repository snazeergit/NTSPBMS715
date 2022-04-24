package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.IStudentService;
import com.nt.vo.StudentVO;

public final class StudentController {
	private IStudentService service;

	public StudentController(IStudentService service) {
		this.service = service;
	}

	public String processStudentDetails(StudentVO vo) throws Exception {
		StudentDTO dto = new StudentDTO();
		dto.setsName(vo.getsName());
		dto.setBranch(vo.getBranch());
		dto.setTotalMarks(Integer.parseInt(vo.getTotalMarks()));

		String registerStudent = service.registerStudent(dto);

		return registerStudent;

	}

}
