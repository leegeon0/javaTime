package com.mycompany.study.ch06.third;

public class Car {
	int engine;
	String name;
	String color;
	String company;
	
	
	
	Car(){
		
	}
	Car(int engine){
		this.engine = engine;
	}
	
	
	Car(String color){
		this.color = color;
		
	}
	
	
	Car(int engine, String name, String color, String company){
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company;
		
	}
	
	
	
	void go() {
		System.out.println("앞으로 갑니다.");
	}
	void back() {
		System.out.println("뒤로 갑니다.");
	}
}
