package com.udemy.ood.employees_manager.client;

import com.udemy.ood.employees_manager.model.Employee;
import com.udemy.ood.employees_manager.model.dao.EmployeeDAO;

public class Manager {

	private static int employeeCount = 0;

	private EmployeeDAO employeeDAO;

	public Manager() {
		employeeDAO = new EmployeeDAO();
	}

	public int hireEmployee(String name, String department) {
		final int id = ++employeeCount;
		employeeDAO.saveEmployee(new Employee(id, name, department));
		return id;
	}

	public void terminateEmployee(int employeeID) {
		employeeDAO.deleteEmployee(employeeDAO.getEmployeeByID(employeeID));
	}

	public void printEmployeeReport(int employeeID) {

	}

}
