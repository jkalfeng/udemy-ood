package com.udemy.ood.employees_manager.model;

public class Employee {

	private final int id;
	private String name;
	private String department;

	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id +
				", name='" + name + '\'' +
				", department='" + department + '\'' +
				'}';
	}

}
