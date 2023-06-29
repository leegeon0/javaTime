package com.mycompany.study.ch16;

public interface RemoteControl {

    int max_volume = 10;
    int min_volume = 0;
    
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    public default  void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    public default  void changeBattery() {
        System.out.println("건전지를 교체합니다.");
    }
	
}
