package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.StudentController;
import com.nt.vo.StudentVO;

public class StudentClient {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StudentVO vo = new StudentVO();

		System.out.println("Student Name: ");
		vo.setsName(s.nextLine());
		System.out.println("Branch : ");
		vo.setBranch(s.nextLine());
		System.out.println("Total Marks secured [0 to 1000]: ");
		vo.setTotalMarks(s.nextLine());

		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
					"com/nt/cfgs/applicationContext.xml");
			StudentController controller = ctx.getBean("studentController", StudentController.class);
			String studentDetails = controller.processStudentDetails(vo);
			System.out.println(studentDetails);
			ctx.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		s.close();
	}
}
