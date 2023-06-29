package com.mycompany.study.ch16;

public class ExRemoteControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television television = new Television();
		
		int max = 100;
		int min = -10;
		
		television.turnOn();
		television.setMute(true);
		television.setMute(false);
		television.setVolume(min);
		television.changeBattery();
		television.turnOff();

	}

}
