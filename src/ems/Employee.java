package ems;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private String department;
	private int contact;
	private double salary;
	
	public Employee(int id,String name,String designation,String department,int contact,double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department= department;
		this.contact = contact;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department
				+ ", contact=" + contact + ", salary=" + salary + "]";
	}
	
	
}
