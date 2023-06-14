package com.mycompany.study.ch07.fifth;

import java.lang.reflect.Parameter;

public class Computer extends Calculator {
	@Override
    public double param(double radius) {
        return Constants.PAI_2 * radius * radius;
    }
	
}
