package com.mycompany.study.ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testRotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();

        // 1부터 45까지의 숫자를 리스트에 추가합니다.
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        // 리스트를 무작위로 섞습니다.
        Collections.shuffle(numbers);

        // 리스트에서 처음부터 6개의 숫자를 선택합니다.
        List<Integer> selectedNumbers = numbers.subList(0, 6);

        // 선택된 숫자를 정렬합니다.
        Collections.sort(selectedNumbers);

        // 선택된 숫자를 출력합니다.
        System.out.println("로또 번호: " + selectedNumbers);
        
        
        // Ctrl + Shift + O : 필요한 import 자바 가져옴
	}

}
