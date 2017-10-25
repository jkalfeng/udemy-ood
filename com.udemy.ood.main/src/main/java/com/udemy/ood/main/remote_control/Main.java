package com.udemy.ood.main.remote_control;

import com.udemy.ood.remote_control.service.Device;
import com.udemy.ood.remote_control.service.RemoteControl;

public class Main {

	public static void main(String[] args) {
		RemoteControl control = RemoteControl.getInstance();
		control.chooseControl(Device.GAME_CONSOLE);
		control.turnOnDevice();
		control.turnOffDevice();
	}
}
