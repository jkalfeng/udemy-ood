package com.udemy.ood.employees_manager.reporting;

import com.udemy.ood.employees_manager.model.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

	private Employee employee;

	public EmployeeReportFormatter(Employee employee, Format format) {
		super(format);
		this.employee = employee;
	}

	public String getFormattedEmployee() {
		return getFormattedValue(employee);
	}

}
