package com.mycompany.study.ch07.first;

public class ExMobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		cellPhone.powerOn(1);
		
		System.out.println("==========");
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOn(1);
		dmbCellPhone.changeChannelDmb(3);
		
		System.out.println("==========");
		
		MobilePhone mobilephone = new MobilePhone();
		
		mobilephone.jasal();
		mobilephone.powerOn(1);
		mobilephone.changeChannelDmb(2);
		
	}

}
