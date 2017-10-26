package com.udemy.ood.remote_control.remote;

import java.util.Optional;

public class RemoteControl {

	private static RemoteControl instance = new RemoteControl();
	private Controllable controllable;

	private RemoteControl() {}

	public static RemoteControl getInstance() {
		return instance;
	}

	public void controlDevice(Controllable controllable) {
		this.controllable = controllable;
	}

	public void turnOnDevice() {
		Optional.ofNullable(controllable)
				.ifPresent(t -> controllable.performOnAction());
	}

	public void turnOffDevice() {
		Optional.ofNullable(controllable)
				.ifPresent(t -> controllable.performOffAction());
	}

}
