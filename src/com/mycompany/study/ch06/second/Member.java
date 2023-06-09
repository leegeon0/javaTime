package com.mycompany.study.ch06.second;

import java.util.Date;

public class Member {
	String name;
	String id;
	String password;
	Date birthday;
	String email;
	String address;
	
	Member(String name, String id, String password, Date birthday, String email, String address){
		this.name = name;
		this.id = id;
		this.password = password;
		this.birthday = birthday;
		this.email = email;
		this.address = address;
	}
	
	
	void signUp() {
		System.out.println("회원 등록");
	}
	void withdrawal() {
		System.out.println("회원 탈퇴");
	}
	void changeInfo() {
		System.out.println("회원 수정");
	}
	
}
