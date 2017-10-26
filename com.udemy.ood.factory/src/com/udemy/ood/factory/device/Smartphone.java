package com.udemy.ood.factory.device;

import com.udemy.ood.factory.common.Manufacturable;

public class Smartphone implements Manufacturable {
	@Override
	public void performFunction() {
		System.out.println("Running a smartphone");
	}
}
