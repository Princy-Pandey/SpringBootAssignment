package com.cg.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    Employee objA = (Employee) context.getBean("employee");
	    System.out.println("Employee Details");
	    System.out.println("-----------------------");
	    System.out.println("Employee ID:" +objA.getEmployeeId());
	    System.out.println("Employee Name:" +objA.getEmployeeName());
	    System.out.println("Employee salary:" +objA.getSalary());
	    System.out.println("sbu details:" +objA.getSbuDetails());
	    System.out.println("Employee Age:" +objA.getAge());

	}

}
