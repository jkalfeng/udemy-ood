package com.udemy.ood.factory.factory_process;

import com.udemy.ood.factory.common.GeneralManufacturingProcess;
import com.udemy.ood.factory.common.Manufacturable;
import com.udemy.ood.factory.device.Computer;

public class ComputerFactoryProcess implements GeneralManufacturingProcess {

	private Computer computerDevice;

	@Override
	public Manufacturable getProduct() {
		return computerDevice;
	}

	@Override
	public void storeProduct() {

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
