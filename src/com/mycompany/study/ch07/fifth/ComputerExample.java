package com.mycompany.study.ch07.fifth;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 반지름: ");
		double radius = scanner.nextDouble();
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
	       double result1 = calculator.param(radius);
	        double result2 = computer.param(radius);

	        System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
	        System.out.println("원면적: " + result1);
	        
	        System.out.println("");
	        
	        System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
	        System.out.println("원면적: " + result2);
		
	}

}
