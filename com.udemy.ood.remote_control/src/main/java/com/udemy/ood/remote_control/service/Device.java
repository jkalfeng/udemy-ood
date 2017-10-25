package com.udemy.ood.remote_control.service;

import com.udemy.ood.remote_control.devices.Projector;
import com.udemy.ood.remote_control.devices.SoundSystem;
import com.udemy.ood.remote_control.devices.TV;

public enum Device {

	PROJECTOR(Projector.class), SOUND_SYSTEM(SoundSystem.class), TELEVISION(TV.class);

	private final Class<? extends Controllable> clazz;

	Device(Class<? extends Controllable> clazz) {
		this.clazz = clazz;
	}

	public Class<? extends Controllable> getControllableClass() {
		return clazz;
	}
}
