package com.mycompany.study.ch07.first;

public class MobilePhone extends DmbCellPhone {

	
	// field
	
	int area;
	
	//method
	
	void jasal() {
		powerOn();
		turnOnDmb();
		System.out.println("자살해 그냥 임마");
	}
	
	@Override
	void changeChannelDmb(int channel) {
		System.out.println("MobilePhone.changeChannelDmb");
	}
	
	@Override
	void powerOn(int a) {
		System.out.println("개꿀~");
	}
}
