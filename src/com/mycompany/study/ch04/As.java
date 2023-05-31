package com.mycompany.study.ch04;

public class As {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double originalPrice = 120.0;  // 기존 가격
        String memberGrade = "silver"; // 멤버 등급 (영어)
        
        double discountRate;
        
        if (memberGrade.equalsIgnoreCase("regular")) {
            discountRate = 0.05;
        } else if (memberGrade.equalsIgnoreCase("bronze")) {
            discountRate = 0.1;
        } else if (memberGrade.equalsIgnoreCase("silver")) {
            discountRate = 0.15;
        } else if (memberGrade.equalsIgnoreCase("gold")) {
            discountRate = 0.2;
        } else if (memberGrade.equalsIgnoreCase("platinum")) {
            discountRate = 0.027;
        } else {
            discountRate = 0.0;
        }
        
        double discountedPrice = originalPrice - (originalPrice * discountRate);
        System.out.println("할인 적용 가격: " + discountedPrice);
	}

}
