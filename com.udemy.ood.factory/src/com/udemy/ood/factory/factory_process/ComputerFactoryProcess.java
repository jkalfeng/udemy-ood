package com.udemy.ood.factory.factory_process;

import com.udemy.ood.factory.common.GeneralManufacturingProcess;
import com.udemy.ood.factory.common.Manufacturable;
import com.udemy.ood.factory.device.Computer;

public class ComputerFactoryProcess implements GeneralManufacturingProcess {

	private Computer computer;

	@Override
	public Manufacturable getProduct() {
		return computer;
	}

	@Override
	public void storeProduct() {
		computer = new Computer();
	}

	@Override
	public void packageProduct() {

	}

	@Override
	public void testProduct() {

	}

	@Override
	public void assembleProduct() {

	}
}
