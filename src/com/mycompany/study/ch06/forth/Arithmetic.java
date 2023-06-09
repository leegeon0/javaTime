package com.mycompany.study.ch06.forth;

public class Arithmetic {
	
	public int minus(int a, int b) {
		int y = a - b;
		return y;
	}
	
	public int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int multi(int a, int b) {
		int y = a * b;
		return y;
	}
	
	public int division(int a, int b) {
		int y = a / b;
		return y;
	}
	
	public String changeEngName(String x) {
		String change;
		if(x.equals("장원영")) {
			change = "Tony";	
		}else {
			change = "누고 개쇄리야";
		}
		
		return change;
	}
	
//	public String outString(String x) {
//		String ch;
//		if(x.equals("아이브")) {
//			ch = "장원영은 너무 예뻐";
//		}else {
//			ch = "장원영은 너무 예뻐";
//		}
//		return "";
//	} 에러임
	
	public void pretty(String name) {
		switch(name) {
		case "아이브":
			System.out.println("장원영은 너무 예뻐");
			break;
		default:
			System.out.println("다른사람은 그냥 예뻐");
			break;
		}
	}
}
