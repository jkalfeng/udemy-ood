package com.udemy.ood.employees_manager.client;

import com.udemy.ood.employees_manager.model.Employee;
import com.udemy.ood.employees_manager.model.dao.EmployeeDAO;

public class Manager {

	private static int employeeCount = 0;

	public int hireEmployee(String name, String department) {
		try (EmployeeDAO employeeDAO = new EmployeeDAO()) {
			final int id = ++employeeCount;
			employeeDAO.saveEmployee(new Employee(id, name, department));
			return id;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void terminateEmployee(int employeeID) {
		try (EmployeeDAO employeeDAO = new EmployeeDAO()) {
			employeeDAO.deleteEmployee(employeeDAO.getEmployeeByID(employeeID));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printEmployeeReport(int employeeID) {

	}

}
