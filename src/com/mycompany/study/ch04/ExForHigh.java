package com.mycompany.study.ch04;

public class ExForHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. (10*5)
		//  *********
		//  *********
		//  *********
		//  *********
		//  *********
		// 출력하는 프로그램
		
		// 2. (1,5번째 출력)
		// **********
		// **
		// **
		// **
		// **********

		for (int i = 0; i < 5; i++) { // 외부 반복: 5번 반복
            for (int j = 0; j < 10; j++) { // 내부 반복: 10번 반복
                System.out.print("*");
            }
            System.out.println(); // 한 줄 출력 후 줄바꿈
            
        }
		System.out.println("------------------");
        for (int i = 1; i <= 5; i++) { // 외부 반복: 5번 반복
            for (int j = 1; j <= 10; j++) { // 내부 반복: 10번 반복
            	if(i>1 && i<5) {
            		if(j>1 && j<10) {
            			System.out.print(" ");	
            		}else {
                		System.out.print("*");
                	}
            	}else {
            		System.out.print("*");
            	}
            	
            }
            System.out.println(); // 한 줄 출력 후 줄바꿈
        }
        
//        for(int i=1; i<=5; i++) {
//			for(int j=1; j<=10; j++) {
//				if(i>=2 && i<=4) {
//					if(j>=2 && j<=9) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("-------------------");
	}

}
