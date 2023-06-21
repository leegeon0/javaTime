package com.mycompany.study.ch10.second;

public class ExThrows {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		findClass();
		
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.ang.String2");
	}

}
