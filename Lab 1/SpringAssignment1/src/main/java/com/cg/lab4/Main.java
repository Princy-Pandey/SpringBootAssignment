package com.cg.lab4;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    System.out.println("Employee ID");
	    Scanner scan=new Scanner(System.in);
	    int employeeId=scan.nextInt();
	    Employee objB = (Employee) context.getBean("employee5");
	    for(Employee employee1:objB.emplist)
	    {
	    if(employeeId==employee1.getEmployeeId())
	    {
	    	System.out.println(employee1.getEmployeeName());
	    	System.out.println(employee1.getSalary());
	    }
	    else
	    {
	    	System.out.println("employeID does not exist");
	    }
	}
	}

}
