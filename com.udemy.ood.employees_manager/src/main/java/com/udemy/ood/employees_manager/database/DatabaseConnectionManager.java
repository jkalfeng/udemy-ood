package com.udemy.ood.employees_manager.database;

import com.udemy.ood.employees_manager.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionManager {

	private static DatabaseConnectionManager instance = new DatabaseConnectionManager();

	private boolean connected;
	// pretend this is the database...
	private final List<Employee> database = new ArrayList<>();

	private DatabaseConnectionManager() {}

	public static DatabaseConnectionManager getInstance() {
		return instance;
	}

	public void connect() {
		connected = true;
		System.out.println("Successfully connected to the database");
	}

	public void disconnect() {
		connected = false;
		System.out.println("Successfully disconnected from the database");
	}

	public List<Employee> getDatabase() {
		if (!connected) {
			throw new RuntimeException("Database not connected, cannot perform action");
		}
		return database;
	}

}
