package com.mycompany.study.ch07.fourth;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		TrGugu trGuGu = new TrGugu();
		
		while(trGuGu.z) {
			System.out.println("정수를 입력해 주세요");
			int scannerInt = scanner.nextInt();
			
			if(scannerInt != 0) {
				trGuGu.gugu(scannerInt);
			}else {
				System.out.println("프로그램 종료");
				trGuGu.z = false;
			}
		}
	}

}
