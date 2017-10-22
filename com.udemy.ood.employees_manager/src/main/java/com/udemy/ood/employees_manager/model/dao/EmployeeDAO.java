package com.udemy.ood.employees_manager.model.dao;

import com.udemy.ood.employees_manager.database.DatabaseConnectionManager;
import com.udemy.ood.employees_manager.model.Employee;

import java.util.Optional;

public class EmployeeDAO implements AutoCloseable {

	private DatabaseConnectionManager connectionManager;

	public EmployeeDAO() {
		connectionManager = DatabaseConnectionManager.getInstance();
		connectionManager.connect();
	}

	public void saveEmployee(Employee employee) {
		connectionManager.insert(employee);
	}

	public void deleteEmployee(Employee employee) {
		connectionManager.delete(employee);
	}

	public Employee getEmployeeByID(int id) {
		return Optional.ofNullable(connectionManager.getEmployee(id))
					.orElseThrow(() -> new RuntimeException("Unable to find employee with given id"));
	}

	@Override
	public void close() throws Exception {
		connectionManager.disconnect();
	}

}
