package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.PatientVO;

public class CoronaPatientClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		PatientVO vo = new PatientVO();
		System.out.println("Patient name : ");
		vo.setpName(scanner.nextLine());
		System.out.println("Patient address : ");
		vo.setpAddrs(scanner.nextLine());
		System.out.println("Per day charge in hospital : ");
		vo.setPerDayCharge(scanner.nextLine());
		System.out.println("Total days stayed : ");
		vo.setTotalDaysStayed(scanner.nextLine());

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		MainController controller = factory.getBean("controller", MainController.class);
		try {
			String processPatientDetails = controller.processPatientDetails(vo);
			System.out.println(processPatientDetails);
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
