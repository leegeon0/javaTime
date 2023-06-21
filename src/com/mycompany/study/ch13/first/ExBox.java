package com.mycompany.study.ch13.first;

public class ExBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<>();
		box.setT("아잉");
		System.out.println(box.getT());
		Box<Integer> box2 = new Box<>();
		box2.setT(300);
		System.out.println(box2.getT());
		Box<Object> box3 = new Box<>();
		box3.setT(12);
		box3.setT("이이잉");
		System.out.println(box3.getT());
	}

}
