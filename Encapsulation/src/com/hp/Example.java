package com.hp;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
			
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the Employee Id");
	int employeeId=sc.nextInt();
	
	System.out.println("Enter Employee Name ");
	String employeeName=sc.next();
	
	System.out.println("Enter the Employee Salary");
	int employeeSalary=sc.nextInt();
	
	Employee emp=new Employee();
	emp.setId(employeeId);
	emp.setName(employeeName);
	emp.setSalary(employeeSalary);
	
	System.out.println("Id of the Employee : "+ emp.getId());
	System.out.println("Id of the Employee :"+ emp.getName());
	System.out.println("Id of the Employee :"+ emp.getSalary());
	
	
	
		
	
	
	}		

}


