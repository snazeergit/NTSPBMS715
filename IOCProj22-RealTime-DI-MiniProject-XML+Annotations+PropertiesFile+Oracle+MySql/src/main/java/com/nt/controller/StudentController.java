package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.nt.dto.StudentDTO;
import com.nt.service.IStudentService;
import com.nt.vo.StudentVO;

@Controller("studentController")
public final class StudentController {
	@Autowired 
	
	//@Qualifier("studentService")
	//since we have one service class so there is no ambiguity so Qualifier is not needed
	private IStudentService service;

	//since its Autowired we don't need to have constructor or setter to support it. 
	/*public StudentController(IStudentService service) {
		super();
		this.service = service;
	}*/

	public String processStudentDetails(StudentVO vo) throws Exception {
		StudentDTO dto = new StudentDTO();
		dto.setsName(vo.getsName());
		dto.setBranch(vo.getBranch());
		dto.setTotalMarks(Integer.parseInt(vo.getTotalMarks()));

		String registerStudent = service.registerStudent(dto);

		return registerStudent;

	}

}
