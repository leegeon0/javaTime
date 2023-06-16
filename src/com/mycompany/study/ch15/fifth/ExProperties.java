package com.mycompany.study.ch15.fifth;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Properties;

public class ExProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties properties = new Properties();
		
		// URL path = ExProperties.class.getResource("database.properties");
		String path = ExProperties.class.getResource("database.properties").getPath();
		System.out.println(path);
		//.getResource(소스파일); 소스파일 
		//.getPath(); 주소 가져오기
		
		// FileReader fileReader = new FileReader(path);
		
		// FileReader.load(fileReader);
		

	}

}
