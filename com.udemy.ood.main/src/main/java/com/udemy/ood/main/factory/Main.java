package com.udemy.ood.main.factory;

import com.udemy.ood.factory.Device;
import com.udemy.ood.factory.DeviceFactory;
import com.udemy.ood.factory.factory_process.DesktopFactoryProcess;

public class Main {

	public static void main(String[] args) {
		DesktopFactoryProcess desktopFactoryProcess = new DesktopFactoryProcess();
		DeviceFactory factory = new DeviceFactory(desktopFactoryProcess);

		Device desktop = factory.build();
	}
}
