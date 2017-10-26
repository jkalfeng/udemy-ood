package com.udemy.ood.factory.common;

public class Factory {

	private final GeneralManufacturingProcess process;

	public Factory(GeneralManufacturingProcess process) {
		this.process = process;
	}

	public Manufacturable build() {
		process.launchProcess();
		return process.getProduct();
	}

}
