package com.mycompany.study.ch04;

public class ExIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ch04.01
		
		// if - 학점 계산
		
		int score = 62;
		
		if(score >= 90) {
			if(score < 94 && score >=90) {
				System.out.println("당신의 학점은 A-");
			}else if(score < 97 && score >=94) {
				System.out.println("당신의 학점은 A");
			}else {
				System.out.println("당신의 학점은 A+");
			}
		}else if(score < 90 && score >=80) {
			if(score < 84 && score >=80) {
				System.out.println("당신의 학점은 B-");
			}else if(score < 87 && score >=84) {
				System.out.println("당신의 학점은 B");
			}else {
				System.out.println("당신의 학점은 B+");
			}
		}else if(score < 80 && score >=70) {
			if(score < 74 && score >=70) {
				System.out.println("당신의 학점은 C-");
			}else if(score < 77 && score >=74) {
				System.out.println("당신의 학점은 C");
			}else {
				System.out.println("당신의 학점은 C+");
			}
		}else if(score < 70 && score >=60) {
			if(score < 64 && score >=60) {
				System.out.println("당신의 학점은 D-");
			}else if(score < 67 && score >=64) {
				System.out.println("당신의 학점은 D");
			}else {
				System.out.println("당신의 학점은 D+");
			}
		}else {
			System.out.println("당신의 학점은 F");
		}
	}

}
