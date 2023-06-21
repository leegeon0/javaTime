package com.mycompany.study.ch13.third;

import com.mycompany.study.ch13.first.Box;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		return box;
	}
}
