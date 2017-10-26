package com.udemy.ood.factory;

public interface GeneralManufacturingProcess {

	default void launchProcess() {
		assembleDevice();
		testDevice();
		packageDevice();
		storeDevice();
	}

	void storeDevice();

	void packageDevice();

	void testDevice();

	void assembleDevice();

}
