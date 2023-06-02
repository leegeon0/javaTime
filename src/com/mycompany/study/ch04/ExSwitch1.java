package com.mycompany.study.ch04;

public class ExSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 2;
//		
//		switch(num) {
//		case 1:
//			System.out.println("1번이 나왔음");
//			break;
//		case 2:
//			System.out.println("2번이 나왔음");
//			break;
//		case 3:
//			System.out.println("3번인 나왔음");
//			break;
//		}
		
		String position = "나";
		
		switch(position) {
		case "사장":
			System.out.println("사장의 연봉은 100억입니다");
			break;
		case "부장":
			System.out.println("부장의 연봉은 50억입니다");
			break;
		case "과장":
			System.out.println("과장의 연봉은 40억입니다");
			break;
		case "대리":
			System.out.println("대리의 연봉은 20억입니다");
			break;
		case "나":
			System.out.println("나의 연봉은 10억입니다");
			break;
			
		}
	}

}
