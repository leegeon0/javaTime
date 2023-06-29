package com.mycompany.study.ch16;

public class Television implements RemoteControl {
	public int volume = 0;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > max_volume) {
			this.volume = max_volume;
		}else if(volume < min_volume) {
			this.volume = min_volume;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
