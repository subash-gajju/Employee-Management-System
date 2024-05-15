package ems;

import java.util.*;

public class EmployeeService {
	Scanner sc = new Scanner(System.in);
	
	HashSet<Employee> empSet = new HashSet<Employee>();

	Employee emp1 = new Employee(1001,"Utsav","Designer","IT",988237826,25000.00);
	Employee emp2 = new Employee(1002,"Subash","Developer","IT",98825676,35000.00);
	Employee emp3 = new Employee(1003,"Sunil","Accountant","Finance",988234223,30000.00);
	Employee emp4 = new Employee(1004,"Alish","Receptionist","Admin",982362782,20000.00);
	Employee emp5 = new Employee(1005,"Kabir","DevOps","IT",988237987,30000.00);
	
	public EmployeeService(){
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
	}
	
	public void addEmp() {
		System.out.println("Enter employee's id");
		int id = sc.nextInt();
		System.out.println("Enter employee's name");
		String name = sc.nextLine();
		System.out.println("Enter employee's designation");
		String designation = sc.nextLine();
		System.out.println("Enter employee's department");
		String department = sc.nextLine();
		System.out.println("Enter employee's contact");
		int contact = sc.nextInt();
		System.out.println("Enter employee's salary");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(id,name,designation,department,contact,salary);
		
		empSet.add(emp);
		
		System.out.println("Employee added successfully");
	}
	
	public void viewAllEmps() {
		for(Employee emp:empSet) {
			System.out.println(emp);
		}
	}
	
	public void viewEmpById() {
		System.out.println("Enter the employee's id: ");
		int id = sc.nextInt();
		boolean found = false;
		
		for(Employee emp:empSet) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found = true;
			}
		}if(!found) {
			System.out.println("Couldnot find the employee");
		}
	}
	
	public void updateEmployee() {
		System.out.println("Enter empolyee's id: ");
		int id = sc.nextInt();
		boolean found = false;
		
		for(Employee emp:empSet) {
			if(emp.getId()==id) {
				System.out.println("Enter the updated designation: ");
				String updatedDesg = sc.nextLine();
				System.out.println("Enter the updated salary: ");
				double updatedSal = sc.nextDouble();
				emp.setDesignation(updatedDesg);
				emp.setSalary(updatedSal);
				System.out.println("Employee details updated successfully");
				found = true;
			}
		}if(!found) {
			System.out.println("Couldnot the find employee");
		}
	}
	
	public void deleteEmployee() {
		System.out.println("Enter the employee id: ");
		int id = sc.nextInt();
		boolean found = false;
		
		Employee empToRemove = null;
		
		for(Employee emp:empSet) {
			if(emp.getId()==id) {
				empToRemove = emp;
				found = true;
			}
		}if(!found) {
			System.out.println("Couldnot find the employee");
		}else {
			empSet.remove(empToRemove);
			System.out.println("Employee deleted successfully.");
		}
	}
	
}
