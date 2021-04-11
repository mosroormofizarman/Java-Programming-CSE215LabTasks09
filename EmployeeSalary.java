package cse215_lab_tasks_09_problem02;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	private String address;
	
	public Person() {
	
	}
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

class Employee extends Person{
	private String department;
	private String designation;
	public Employee() {
		
	}
	public Employee(String name, int age, String address, String department, String designation) {
		super(name,age,address);
		this.department = department;
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

class PartTimeEmployee extends Employee{
	private double hours;
	private double rate;
	
	public PartTimeEmployee() {
		
	}
	public PartTimeEmployee(String name, int age, String address, String department, String designation, double hours, double rate) {
		super(name, age, address, department, designation);
		this.hours = hours;
		this.rate = rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String toString() {
		return "Salary(PT): "+salary() + " TK";
	}
	public double salary() {
		return this.hours*this.rate*4;
	}
}

class FullTimeEmployee extends Employee{
	private double basic;
	private double allowance;
	
	public FullTimeEmployee() {
		
	}
	public FullTimeEmployee(String name, int age, String address, String department, String designation, double basic, double allowance) {
		super(name, age, address, department, designation);
		this.basic = basic;
		this.allowance = allowance;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public String toString() {
		return "Salary(FT): "+salary() + " TK";
	}
	public double salary() {
		return this.basic + (this.basic*(this.allowance/100));
	}
}

public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PartTimeEmployee pe = new PartTimeEmployee("Mosroor", 100, "Bangladesh", "ECE", "Student", input.nextDouble(), input.nextDouble());
		FullTimeEmployee fe = new FullTimeEmployee("Arman", 100, "Bangladesh", "ECE", "Student", input.nextDouble(), input.nextDouble());
		System.out.println(pe.toString());
		System.out.println(fe.toString());
		
		input.close();
	}
}

