package com.udemy.ood.main.employees_manager;

import com.udemy.ood.employees_manager.client.Manager;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Manager m = new Manager();
		m.hireEmployee("Jay", "CS");
	}

}
