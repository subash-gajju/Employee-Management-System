package ems;

import java.util.*;

public class Main {
	public static void menu(){
		System.out.println("***Welcome To The Employee Management System***\n"
				+ "\nChoose the operation you want to perform"
				+"\n1. Add Employee"
				+"\n2. View All Employee"
				+"\n3. View Employee By Id"
				+"\n4. Update Employee's Detail"
				+"\n5. Delete Employee"
				+"\n6. Exit Application");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService empServ = new EmployeeService();
		
		do {
			menu();
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					empServ.addEmp();
					break;
				case 2:
					empServ.viewAllEmps();
					break;
				case 3:
					empServ.viewEmpById();
					break;
				case 4:
					empServ.updateEmployee();
					break;
				case 5:
					empServ.deleteEmployee();
					break;
				case 6:
					System.out.println("***Thank You!!***");
					System.exit(0);
				default:
					System.out.println("Enter a valid choice");
					break;
			}
		}while(true);
	}

}
