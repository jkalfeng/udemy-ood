package com.udemy.ood.factory.device;

import com.udemy.ood.factory.common.Manufacturable;

public class Computer implements Manufacturable {
	@Override
	public void performFunction() {
		System.out.println("Running a computer");
	}
}
