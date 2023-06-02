package com.mycompany.study.ch05;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] scoreEnglish;
//		int scoreMath[];
//		
//		String[] name;
//		String name2[];
//		
//		double[] total;
//		double avg[];
//		
//		char[] grade232301;
//		char grade232302[];
//		
//		boolean[] score;
//		boolean[] score2[];
		
		int[] scoreChemistry = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		String[] scoreStudent = {"건희","경희","은희","정민","동준","동호","준택","현지","소연","인석"};
		char[] string = {'a','b','c','d','e'};
		scoreChemistry[0] = 5;
		// 추가는 할 수 없으나 값을 변경하는건 가능하다.
//		scoreChemistry[10] = 25; : 이미 초기화 선언한곳에서는 추가를 할수 없다
		
//		int[] scorePhysics;
//		scorePhysics = {10,20,30,40,50}; 사용할 수 없음
		// 선언과 동시에 초기화
		
		int a = scoreChemistry.length;
//		System.out.println(a);
		// a에 scoreChemistry의 배열수를 선언하고 출력
//
//		System.out.println(scoreChemistry[0]);
//		System.out.println(scoreChemistry[5]);
		// scoreChemistry의 배열 0번째 5번째의 값을 출력
		// index out of bounds : 인덱스의 영역을 벗어난 오류
		
		//for문 이용
		int sum = 0;
		for(int i = 0; i<a; i++) {
			System.out.println(scoreChemistry[i]);
			sum = sum + scoreChemistry[i];
		}
		System.out.println("sum : " + sum);
		// i = 0 초기화 i < scoreChemistry.length 일때 scoreChemistry[i]값 출력
		 // i는 배열의 수까지 계속 증가하므로 마지막 배열의 값까지 출력하게 된다.
		
		System.out.println("-------------");
		// while문 이용(사실상 while문은 잘 사용하지않음)
//		int i = 0;
//		int sum2 = 0;
//		while(i<a) {
//			System.out.println(scoreChemistry[i]);
//			sum2 = sum2 + scoreChemistry[i];
//			i++;
//		}
//		System.out.println("sum2 : " + sum2);
//		System.out.println("-------------");
		
		// 향상된 포문 collection(데이터의 묶음) 타입인 값만 쓸 수 있음. 다른 조건을 추가 할 수 없음 
//		int sum3 =0;
//		for(int bb: scoreChemistry) {
//			System.out.println(bb);
//			sum3 = sum3 + bb;
//		}
//		System.out.println("sum3 : " + sum3);
		
	}

}
