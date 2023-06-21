package com.mycompany.study.ch13.third;

import com.mycompany.study.ch13.first.Box;

public class ExBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<>();
		
		Box<Integer> box2 = Util.boxing(80);
	}

}
