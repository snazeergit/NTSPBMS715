package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.StudentController;
import com.nt.vo.StudentVO;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		StudentVO vo = new StudentVO();

		System.out.println("Student Name: ");
		vo.setsName(s.nextLine());
		System.out.println("Branch : ");
		vo.setBranch(s.nextLine());
		System.out.println("Total Marks secured [0 to 1000]: ");
		vo.setTotalMarks(s.nextLine());

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		StudentController controller = factory.getBean("studentController", StudentController.class);
		try {
			String studentDetails = controller.processStudentDetails(vo);
			System.out.println(studentDetails);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
