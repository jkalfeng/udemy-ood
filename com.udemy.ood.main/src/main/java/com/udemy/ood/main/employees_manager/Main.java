package com.udemy.ood.main.employees_manager;

import com.udemy.ood.employees_manager.client.Manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Integer> activeEmployeeIDs = new ArrayList<>();
		Manager m = new Manager();
		if (activeEmployeeIDs.add(m.hireEmployee("Jay", "CS"))) {
			System.out.println("Employee added");
		}
	}

}
