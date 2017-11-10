package com.udemy.ood.main.factory;

import com.udemy.ood.factory.client.User;
import com.udemy.ood.factory.common.GeneralManufacturingProcess;
import com.udemy.ood.factory.common.Manufacturable;
import com.udemy.ood.factory.factory_process.SmartphoneFactoryProcess;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		GeneralManufacturingProcess factoryProcess = new SmartphoneFactoryProcess();
		Manufacturable product = factoryProcess.launchProcess().getProduct();
		user.use(product);
	}
}
