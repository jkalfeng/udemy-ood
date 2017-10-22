package com.udemy.ood.employees_manager.client;

import java.util.Random;

public class Manager {

	public int hireEmployee(String name) {

		int id = new Random(System.currentTimeMillis()).nextInt();
		return Math.abs(id);
	}

	public void terminateEmployee(int id) {

	}

}
