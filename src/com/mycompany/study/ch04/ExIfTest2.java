package com.mycompany.study.ch04;

public class ExIfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double normal = 0.05;
		double bronze = 0.1;
		double silver = 0.15;
		double gold = 0.2;
		double platinum = 0.027;
		
		int cost = 120000;
		int grade = 1;
		double discount = 0;
		if(grade == 1) {
			discount = normal;
		}else if(grade == 2) {
			discount = bronze;
		}else if(grade == 3) {
			discount = silver;
		}else if(grade == 4) {
			discount = gold;
		}else if(grade == 5) {
			discount = platinum;
		}else {
			System.out.println("등급은 1~5 까지 있음");
		}
		
		double sum = cost - (cost * discount);
		System.out.println("당신의 할인가 :" + (int) sum);

	}

}
