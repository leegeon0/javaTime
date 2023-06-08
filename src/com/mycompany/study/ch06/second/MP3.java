package com.mycompany.study.ch06.second;

public class MP3 {
	
	
	// field
	int Type = 1;
	String music = "My Love";
	String artist = "Westlife";
	String color = "검정색";
	boolean palyButton = true;
	boolean stopButton = false;
	
	
	// method
	
	void pause() {
		System.out.println("일시정지 합니다.");
	}
	
	void volumeUp() {
		System.out.println("볼륨을 높입니다.");
	}
	void volumeDown() {
		System.out.println("볼륨을 낮춥니다.");
	}
	
	
}
