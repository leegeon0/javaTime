package com.mycompany.study.ch10.first;

public class ExTryCatchFinaliy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Class cla = Class.forName("ExTry");
		
		
		
			try {
				Class cla = Class.forName("ExTry");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("클래스가 없으니 다른 것으로 ㄱ");
			}
//
//			
//			try {
//				Class job = Class.forName("ExJob");
//			} catch(ClassNotFoundException e) {
//				System.out.println("없는디..");
//			}
	}

}
