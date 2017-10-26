package com.udemy.ood.factory.factory_process;

import com.udemy.ood.factory.Device;
import com.udemy.ood.factory.GeneralManufacturingProcess;
import com.udemy.ood.factory.device.Desktop;

public class DesktopFactoryProcess implements GeneralManufacturingProcess {

	private Desktop desktopDevice;

	@Override
	public Device getDevice() {
		return desktopDevice;
	}

	@Override
	public void storeDevice() {

	}

	@Override
	public void packageDevice() {

	}

	@Override
	public void testDevice() {

	}

	@Override
	public void assembleDevice() {

	}
}
