package com.udemy.ood.remote_control;

public class RemoteControl {

	private static RemoteControl instance = new RemoteControl();

	private RemoteControl() {

	}

	public static RemoteControl getInstance() {
		return instance;
	}

}
