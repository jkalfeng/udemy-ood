package com.udemy.ood.factory;

public class DeviceFactory {

	private final GeneralManufacturingProcess process;

	public DeviceFactory(GeneralManufacturingProcess process) {
		this.process = process;
	}

	public Device build() {
		process.launchProcess();
		return process.getDevice();
	}

}
