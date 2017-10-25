package com.udemy.ood.remote_control.devices;

import com.udemy.ood.remote_control.service.Controllable;

public class TV implements Controllable {
	private TV() {}

	@Override
	public void performOnAction() {
		System.out.println("TV is on");
	}

	@Override
	public void performOffAction() {
		System.out.println("TV is off");
	}
}
