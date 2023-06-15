package com.mycompany.study.ch15.first.tr;

import java.util.ArrayList;

public class ExMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Member> arraylist = new ArrayList<Member>();
		
		Member member1 = new Member("이건희","lee","아오123",43211234,"lgh1891@naver.com");
		Member member2 = new Member("이은희","lee","아오12345",12345678,"eun898@naver.com");
		Member member3 = new Member("이경희","lee","아이123",64641232,"kyeong12@naver.com");
		
		arraylist.add(member1);
		arraylist.add(member2);
		arraylist.add(member3);
		
		for(Member member: arraylist) {
//			System.out.println("member.name : " + member.name);
//			System.out.println("member.id : " + member.id);
//			System.out.println("member.password : " + member.password);
//			System.out.println("member.tel : " + member.tel);
//			System.out.println("member.email : " + member.email);
//			System.out.println("================");
			System.out.println(member.name + " | " + member.id + " | " + member.password + " | " + member.tel + " | " + member.email);

		}
	}

}
