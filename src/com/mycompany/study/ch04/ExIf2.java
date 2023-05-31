package com.mycompany.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double normal = 0.05;
		double bronze = 0.1;
		double silver = 0.15;
		double gold = 0.2;
		double platinum = 0.027;
		
		int grade = 3;
		
		double cost = 120000;
		double discount = 0;
	
		if(grade == 1) {
			discount = 0.05;
		}else if(grade == 2) {
			discount = 0.10;
		}else if(grade == 3) {
			discount = 0.15;
		}else if(grade == 4) {
			discount = 0.20;
		}else{
			discount = 0.027;
		}
		
		
		
		double discountCost = cost - (cost * discount);
		System.out.println("정가가 " + cost + "원인 당신의 할인등급을 적용한 가격은 " + discountCost);
		
		
//		if(grade == 1) {
//			salesCost = cost *(1-0.05);
//			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는 : " + (int) salesCost + "원 입니다");
//		}else if(grade == 2) {
//			salesCost = cost *(1-0.1);
//			System.out.println("정가가" + cost + "원인 브론즈 등급의 할인가는 : " + (int) salesCost + "원 입니다");
//		}else if(grade == 3) {
//			salesCost = cost *(1-0.15);
//			System.out.println("정가가" + cost + "원인 실버 등급의 할인가는 : " + (int) salesCost + "원 입니다");
//		}else if(grade == 4) {
//			salesCost = cost *(1-0.2);
//			System.out.println("정가가" + cost + "원인 골드 등급의 할인가는 : " + (int) salesCost + "원 입니다");
//		}else if(grade == 5) {
//			salesCost = cost *(1-0.027);
//			System.out.println("정가가" + cost + "원인 플래티넘 등급의 할인가는 : " + (int) salesCost + "원 입니다");
//		}else {
//			System.out.println("등급은 1~5등급까지만 가능합니다");
//		}
	}

}
