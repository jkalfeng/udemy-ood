package com.udemy.ood.remote_control.devices;

import com.udemy.ood.remote_control.common.Controllable;

public class GameConsole implements Controllable {
	@Override
	public void performOnAction() {
		System.out.println("Game on!");
	}

	@Override
	public void performOffAction() {
		System.out.println("Booo....");
	}
}
