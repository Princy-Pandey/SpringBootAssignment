package com.cg.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    Employee objA = (Employee) context.getBean("employee1");
	    System.out.println("Employee Details");
	    System.out.println("-----------------------");
	    System.out.println("Employee ID:" +objA.getEmployeeId());
	    System.out.println("Employee Name:" +objA.getEmployeeName());
	    System.out.println("Employee salary:" +objA.getSalary());
	    System.out.println("Employee salary:" +objA.getBusinessUnit());
	    System.out.println("Employee Age:" +objA.getAge());

	}

}
