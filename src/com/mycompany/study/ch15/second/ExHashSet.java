package com.mycompany.study.ch15.second;

import java.util.HashSet;

public class ExHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> languages = new HashSet<>();
		
		languages.add("Java");
		languages.add("JDBC");
		languages.add("Servlet/JSP");
		languages.add("1");
		languages.add("2");
		languages.add("3");
		languages.add("4");
		languages.add("5");
		languages.add("6");
		languages.add("7");
		languages.add("aava");
		languages.add("9");
		languages.add("Java"); // 같은걸 또 넣어도 안나옴
		
		languages.remove("4");
		
		for(String language:languages) {
			System.out.println("language : " + language);
		}
		
	}

}
