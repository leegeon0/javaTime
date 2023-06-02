package com.mycompany.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int 타입의 변수를 3개 선언하고
		// 세 정수중에서 최대값, 최소값을 구하는 프로그램을 작성하시요
		
		int a = 1;
		int b = 6;
		int c = 3;
		
		int max = a;
		int min = b;
		
		if(b > max) {
			max = b;
		}else if(b < min) {
			min = b;
		}else {
			
		}
		if(c > max) {
			max = c;
		}else if(c < min) {
			min = c;
		}else {
			
		}
		if(a > max) {
			max = a;
		}else if(a < min) {
			min = a;
		}else {
			
		}
		
		System.out.println("최소값은 : " + min);
		System.out.println("최대값은 : " + max);
	}

}
