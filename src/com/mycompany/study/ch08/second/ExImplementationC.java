package com.mycompany.study.ch08.second;

public class ExImplementationC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA interfaceA = new ImplementationC();
		InterfaceB interfaceB = new ImplementationC();
		InterfaceC interfaceC = new ImplementationC();
		
		interfaceA.methodA();
		interfaceB.methodA();
		interfaceB.methodB();
		interfaceC.methodA();
		interfaceC.methodB();
		interfaceC.methodC();
		
	}

}
