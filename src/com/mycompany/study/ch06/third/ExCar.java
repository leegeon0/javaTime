package com.mycompany.study.ch06.third;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car = new Car();
		
		Car car2 = new Car("라임");
		
		Car car3 = new Car(2,"M340i","딥블루","BMW");
		
		System.out.println("car.name : " + car.name);
		System.out.println("car.color : " + car.color);
		System.out.println("=============");
		
		System.out.println("car2.engine : " + car2.engine);
		System.out.println("car2.name : " + car2.name);
		System.out.println("car2.color : " + car2.color);
		System.out.println("=============");
		
		System.out.println("car3.name : " + car3.name);
		System.out.println("car3.color : " + car3.color);
		System.out.println("=============");
	}

}
