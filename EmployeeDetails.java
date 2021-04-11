package cse215_lab_tasks_09_problem01;

class Person {
    private String name;
    private String gender;
    private int age;
    
    public Person() {

    }
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    private String id;
    private String department;
    private double salary;

    public Employee() {

    }
    public Employee(String name, String gender, int age, String id, String department, double salary) {
        super(name, gender, age);
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Faculty extends Employee{
    private String initial;
    private String rank;

    public Faculty() {

    }
    public Faculty(String name, String gender, int age, String id, String department, double salary, String initial, String rank) {
        super(name, gender, age, id, department, salary);
        this.initial = initial;
        this.rank = rank;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return "Faculty Name: " + getName() + "\nAge: " + getAge() + "\nSalary: $" + getSalary() + "\nInitial: " + getInitial();
    }
}

public class EmployeeDetails {
	public static void main(String[] args) {
		Faculty f1 = new Faculty("Dr. William B. Poucher", "Male", 55, "696969", "ECE", 1000000, "WBPh", "Professor");
		System.out.println(f1.toString());
	}
}
