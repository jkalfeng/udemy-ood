package com.udemy.ood.factory.factory_process;

import com.udemy.ood.factory.common.GeneralManufacturingProcess;
import com.udemy.ood.factory.common.Manufacturable;
import com.udemy.ood.factory.device.Smartphone;

public class SmartphoneFactoryProcess implements GeneralManufacturingProcess {

	private Smartphone smartphone;

	@Override
	public Manufacturable getProduct() {
		return smartphone;
	}

	@Override
	public void storeProduct() {
		smartphone = new Smartphone();
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
