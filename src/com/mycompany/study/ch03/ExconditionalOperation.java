package com.mycompany.study.ch03;

public class ExconditionalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ch03.10
		
		//삼항 연산자 (조건식)? A : B
		
		int math = 85;
		
		char grade = (math>90) ?'A':'B';
		//참이면 A 거짓이면 B를 대입
		System.out.println("grade : " + grade);
		//실상에서 많이 쓰임 코드를 줄이기 위함
		
		if(math>70) {
			grade = 'A';
		}else {
			grade = 'B';
		}
		System.out.println("grade : " + grade);
		
	}

}
