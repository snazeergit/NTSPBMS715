package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

@SuppressWarnings("deprecation")
public class RealTimeDIClient {

	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		MainController mainController = factory.getBean("controller", MainController.class);
		System.out.println("RealTimeDIClient.main()::controller object has been fetched");

		// try with resources
		try (Scanner scanner = new Scanner(System.in)) {
			CustomerVO vo = new CustomerVO();

			// VO Object loaded with Customer Form data
			System.out.println("Customer Name : ");
			vo.setCustName(scanner.nextLine());
			System.out.println("Customer Address : ");
			vo.setCustAdrs(scanner.nextLine());
			System.out.println("Principle Amount(P): ");
			vo.setPrincipleAmt(scanner.nextLine());
			System.out.println("Tenure(T) : ");
			vo.setTenure(scanner.nextLine());
			System.out.println("Rate of Interest(R) : ");
			vo.setRateOfInterest(scanner.nextLine());

			String processCustomer = mainController.processCustomer(vo);
			System.out.println(processCustomer);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
