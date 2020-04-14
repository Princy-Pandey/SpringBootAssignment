package com.cg.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    SBU objA = (SBU) context.getBean("sbu1");
	    System.out.println("sbu Details");
	    System.out.println("-----------------------");
	    System.out.println("sbu ID:" +objA.getSbuId());
	    System.out.println("sbuHead:" +objA.getSbuHead());
	    System.out.println("sbu Name:" +objA.getSbuName());
	    System.out.println("Employee Details");
	    System.out.println("-----------------------");
	    System.out.println("Employee :" +objA.getEmplist());
	}

}
