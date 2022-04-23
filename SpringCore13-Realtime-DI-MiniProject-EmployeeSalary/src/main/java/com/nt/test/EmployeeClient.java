package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class EmployeeClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {
			EmployeeVO vo = new EmployeeVO();
			Scanner s = new Scanner(System.in);
			System.out.println("Employee name : ");
			vo.seteName(s.nextLine());
			System.out.println("Employee address : ");
			vo.seteAddrs(s.nextLine());
			System.out.println("Basic Salary : ");
			vo.setBasicSal(s.nextLine());

			XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
			MainController controller = factory.getBean("controller", MainController.class);
			String processEmployeeDetails = controller.processEmployeeDetails(vo);
			System.out.println(processEmployeeDetails);

		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
