package com.mycompany.study.ch05;

public class ExArrayCreateByNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr1 = new int[3];
//		arr1 = {10,99,98}; 에러 발생
		arr1[0] = 100;
		arr1[1] = 90;
		arr1[2] = 80;
		int[] arr2;
		arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		
		int sum = 0;
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
			sum = sum + arr1[1] ;
		}
		System.out.println("sum : " + sum);
		
		
	}

}
