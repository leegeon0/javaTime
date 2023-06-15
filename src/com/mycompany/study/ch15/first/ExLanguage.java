package com.mycompany.study.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Language> arrayList = new ArrayList<Language>(); //
		// Vector<Language> arrayList = new Vector<Language>();
		// List<Language> list = new ArrayList<Language>();
		
		for(Language language: arrayList) {
			System.out.println(language.name);
			System.out.println(language.version);
		} // 사다리만 만들어 놨을뿐이라 값이 들어가지 못한다.
		
//		arrayList.add("java");   Language 객체를 넣어 주어야하기 때문에 에러 발생 
		
		Language language = new Language("Java", 11); //객체를 생하여 데이터를 삽입 
		
		arrayList.add(language);
		arrayList.add(new Language("python",8));
		arrayList.add(new Language("C#",6));//객체를 add
		
		for(Language nice: arrayList) {
			System.out.println("language name : " + nice.name);
			System.out.println("language version : " + nice.version);
			System.out.println("==============");
		}
		
		
		
		
		
		
		
		
		
		
//		List<String>list = new ArrayList<String>(); //generic
//		
//		list.add("java");
//		list.add("python");
//		list.add("node");
//		list.add(2,"C#"); // 2번째 index에 "C#"을 삽입
//		
//		int i =0;
//		for(String a: list) {
//			System.out.println(i + " : " + a);
//			i++;
//		}
//		System.out.println("==============");
//		list.remove(2);
//		list.remove("python");
//		list.size();
//		
//		
//		int j = 0;
//		for (String a: list) {
//			System.out.println(j + " : " + a);
//			j++;
//		}
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("list.get(" + i + ")" + list.get(i));
//		}
//		System.out.println("=======================");
//		//향상된 for문
//		//for(타입  변수: 객체){}
//		for(String a: list) {
//			//String a = list[i];
//			System.out.println("a : " + a);
//		}
//		System.out.println("===========");
//		
//		ArrayList<String>li = new ArrayList<String>();
//
//		li.add("javascript");
//		li.add("python0");
//		li.add("node.js");
//		li.add(2,"C++"); // 2번째 index에 "C#"을 삽입
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("li.get(" + i + ")" + li.get(i));
//		}
//		System.out.println("=======================");
//		//향상된 for문
//		//for(타입  변수: 객체){}
//		for(String a: li) {
//			//String a = list[i];
//			System.out.println("a : " + a);
//		}
	}

}
