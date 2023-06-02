package com.mycompany.study.ch04;

public class ExIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// int 타입의 변수를 2개 선언하고
		// 두 정수가 주어졌을때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오
		
		int x = 0;
		int y = 1;
		
		if(x>0 && y>0) {
			System.out.println("x,y는 1사분면에 속합니다");
		}else if(x<0 && y>0) {
			System.out.println("x,y는 2사분면에 속합니다");
		}else if(x<0 && y<0) {
			System.out.println("x,y는 3사분면에 속합니다");
		}else if(x>0 && y<0){
			System.out.println("x,y는 4사분면에 속합니다");
		}else if(x==0 && y!=0) {
			System.out.println("x,y는 x축 위에 있습니다");
		}else if(x!=0 && y==0) {
			System.out.println("x,y는 y축 위에 있습니다");
		}else {
			System.out.println("x,y는 원점입니다.");
		}
	}

}
