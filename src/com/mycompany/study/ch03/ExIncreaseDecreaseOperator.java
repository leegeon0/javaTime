package com.mycompany.study.ch03;

public class ExIncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.02
		
		// 증감 연산자 (++,--)
		
		int i = 0;
		int j = 0;
		
		int result1 = ++i;
		int result2 = j++;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		int k = i++; // i를 k에 대입, i를 1증강
		int m = ++j; // j를 1wmdrk, j를 m에 대입
		
		System.out.println("k : " + k);
		System.out.println("i : " + i);
		System.out.println("m : " + m);
		System.out.println("j : " + j);
		
		
		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		--i;
		int z = ++i + j++;
		
		System.out.println("z : " + z);
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		
		
	}

}
