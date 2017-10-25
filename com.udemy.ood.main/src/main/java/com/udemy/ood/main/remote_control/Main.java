package com.udemy.ood.main.remote_control;

import com.udemy.ood.remote_control.device.TV;
import com.udemy.ood.remote_control.remote.RemoteControl;

public class Main {

	public static void main(String[] args) {
		RemoteControl control = RemoteControl.getInstance();
		TV tv = new TV();

		control.controlDevice(tv);
		control.turnOnDevice();
		control.turnOffDevice();
	}
}
