package com.mycompany.study.ch04;

public class ExIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int score = 50;
		
		if(score >=90) {
			if(score >=97) {
				System.out.println("당신의 학점은 A+ 입니다");
			}else if(score >=94) {
				System.out.println("당신의 학점은 A 입니다");
			}else {
				System.out.println("당신의 학점은 A- 입니다");
			}
		}else if(score >=80) {
			if(score >=87) {
				System.out.println("당신의 학점은 B+ 입니다");
			}else if(score >=84) {
				System.out.println("당신의 학점은 B 입니다");
			}else {
				System.out.println("당신의 학점은 B- 입니다");
			}
		}else if(score >=70) {
			if(score >=77) {
				System.out.println("당신의 학점은 C+ 입니다");
			}else if(score >=74) {
				System.out.println("당신의 학점은 C 입니다");
			}else {
				System.out.println("당신의 학점은 C- 입니다");
			}
		}
	}

}
