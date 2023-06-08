package com.mycompany.study.ch06.second;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		System.out.println(a);
		
		Car car = new Car(); //생성
		System.out.println("car.name : " + car.name);
		System.out.println("car.engine : " + car.engine);
		System.out.println("car.color : " + car.color);
		System.out.println("car.company : " + car.company);
		
		car.go();
		car.back();
		
		
		
		MP3 mp3 = new MP3(); // 기본 생성자
		System.out.println("당신이 선택한 노래는 " + mp3.Type + " " + mp3.artist + " " + mp3.music + "입니다");
		System.out.println("정지하겠습니까?? " + mp3.stopButton);
	}

}
