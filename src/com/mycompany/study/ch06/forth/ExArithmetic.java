package com.mycompany.study.ch06.forth;

public class ExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Car car = new Car();
		Arithmetic arithmetic = new Arithmetic();
		
		int minusResult = arithmetic.minus(5, 3);
		System.out.println("minusResult = " + minusResult);
		
		int addResult = arithmetic.add(minusResult, 11);
		System.out.println("addResult = " + addResult);
		
		int multi = arithmetic.multi(addResult, 7);
		System.out.println("multi = " + multi);
		
		int division = arithmetic.division(multi, 4);
		System.out.println("division = " + division);
		
		String chName = arithmetic.changeEngName("장원영");
		System.out.println("나오나?? "  + chName);
		
	
		arithmetic.pretty("아이브");
		int money = arithmetic.getMoney();
		System.out.println(money + "원을 주웠습니다");
	}

}
