package com.mycompany.study.ch15.fourth;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
	
	public static void main(String[] args) {
	
		Map<String, Integer> map = new HashMap<>();
		// Map<데이터타입, 값> standard
		
		Map<String, String> map2 = new HashMap<>();
		
		HashMap<String, Integer> hash = new HashMap<>();
		// not bad
		
		map.put("이건희", 200);
		map.put("이은희", 100);
		map.put("이경희", 300);
		
		System.out.println("map.get(\"이건희\"):" + map.get("이건희"));
		
		map.remove("이경희"); //map의 "이경희" 라는 정보 삭제
		map.clear(); // map의 index 전부 삭제
		
		// 향상된 for문
		for(String strKey : map.keySet()) {
			Integer strValue = map.get(strKey);
			System.out.println(strKey + " : " + strValue);
		}
		
		
		
	}
	
	
	

}
