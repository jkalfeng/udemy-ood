package com.udemy.ood.remote_control.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RemoteControl {

	private static RemoteControl instance = new RemoteControl();
	private Controllable controllable;

	private RemoteControl() {}

	public static RemoteControl getInstance() {
		return instance;
	}

	public void chooseControl(Device device) {
		try {
			Constructor<? extends Controllable> controllableConstructor = device.getControllableClass().getDeclaredConstructor();
			controllableConstructor.setAccessible(true);
			this.controllable = controllableConstructor.newInstance();
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			controllable = null;
			System.err.println("Unable to choose such device to control.");
		}
	}

	public void turnOnDevice() {
		controllable.performOnAction();
	}

	public void turnOffDevice() {
		controllable.performOffAction();
	}

}
