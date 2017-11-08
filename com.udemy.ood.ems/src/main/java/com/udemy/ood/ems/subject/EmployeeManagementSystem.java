package com.udemy.ood.ems.subject;

import com.udemy.ood.ems.common.Observer;
import com.udemy.ood.ems.common.Subject;
import com.udemy.ood.ems.model.Employee;
import com.udemy.ood.ems.model.dao.EmployeeDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeManagementSystem implements Subject {

	private final List<Observer> observers = new ArrayList<>();
	private final List<Employee> employees = new ArrayList<>();

	private final EmployeeDAO employeeDAO;

	public EmployeeManagementSystem(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public synchronized void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public synchronized void remove(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(Observer::notifySelf);
	}
}
