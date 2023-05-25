package com.mycompany.study.ch02;

public class ExChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		//char c1_1 = "A";  오류 : "를 쓰지않음
		//char c1_2 = 'Aoos'; 오류 : 한글자만 사용할수 있음
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println("c1 : " + c4);
		System.out.println("c2 : " + c5);
		System.out.println("c3 : " + c6);
		
		int uniCode = c1;
		System.out.println("c1 : " + uniCode);
		
		int uniCode1 = c4;
		System.out.println("c4 : " + uniCode1);
		
	}

}
