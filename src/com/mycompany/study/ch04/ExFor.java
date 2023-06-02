package com.mycompany.study.ch04;

public class ExFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 2단 부터 출력 되는 구구단 프로그램을 작성하시오
		// 2 * 1 = 2
		int num = 0;
		for(int i=1; i<10; i++) {
			System.out.println(i +"단");
			for(int j=1; j<10; j++) {
				num = i * j;
				System.out.println(i + "*" + j + "=" + num);
			}
			System.out.println("-----------------");
			
		}
	}

}
