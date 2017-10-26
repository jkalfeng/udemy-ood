package com.udemy.ood.factory.common;

public interface GeneralManufacturingProcess {

	default void launchProcess() {
		assembleProduct();
		testProduct();
		packageProduct();
		storeProduct();
	}

	Manufacturable getProduct();

	void storeProduct();

	void packageProduct();

	void testProduct();

	void assembleProduct();

}
