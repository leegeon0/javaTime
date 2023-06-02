package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
//		for(int i = 0; i<3; i++) {
//			for(int j = 0; j<3; j++) {
//				System.out.println(score[i][j]);
//			}
//		}
//		for(int i = 0; i<score.length; i++) {
//			for(int j = 0; j<score[i].length; j++) {
//				System.out.println("score[" + i + "][" + j + "]:" + score[i][j]);
//			}
//			System.out.println("-------------");
//		}
//		int[][] score = {{11,12,13},{21,22,23},{31,32,33}};
//		
//		//kor, eng, math 과목별 총합과 평균
//		//사람별 총합과 평균
//		String[] name = {"이건희","이은희","이경희"};
//		
//		int sumKor = 0;
//		int sumEng = 0;
//		int sumMath = 0;
//		int[] sumEach = {0,0,0};
//		
//		
//		for(int i = 0; i<score.length; i++) {	
//			for(int j = 0; j<score[i].length; j++) {
//				sumKor += score[i][j];
//			}
//			System.out.println(sumKor);
//			System.out.println(name[i] + "의 점수 합은 " + sumKor + "이고 평균은 " + sumKor/score[i].length + "입니다.");
//		}
//		
		
//		for(int i = 0; i<score.length; i++) {
//			for(int j = 0; j<score[i].length; j++) {
//				
//				switch(j) {
//				case 0:
//					sumKor = sumKor + score[i][j];
//					break;
//				
//				case 1:
//					sumEng = sumEng + score[i][j];
//					break;
//			
//				case 2:
//					sumMath = sumMath + score[i][j];
//					break;
//		}
//				
//				sumEach[i] = sumEach[i] + score[i][j]; 
//			}
//			System.out.println(sumKor +" " + sumEng + " " + sumMath);
		
		int[][] score = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};
		String[] name = {"이건희", "이은희", "이경희"};

		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int[] sumEach = {0, 0, 0};

		// 과목별 총합과 개인별 총합 계산
		for (int i = 0; i < score.length; i++) {
		    for (int j = 0; j < score[i].length; j++) {
		        sumEach[i] += score[i][j];
		        if (j == 0) {
		            sumKor += score[i][j];
		        } else if (j == 1) {
		            sumEng += score[i][j];
		        } else if (j == 2) {
		            sumMath += score[i][j];
		        } else {
		        	
		        }
		        
		    }
		}
		

		// 과목별 평균 계산
		double avgKor = (double) sumKor / score.length;
		double avgEng = (double) sumEng / score.length;
		double avgMath = (double) sumMath / score.length;

		// 개인별 평균 계산
		double[] avgEach = new double[score.length];
		for (int i = 0; i < score.length; i++) {
		    avgEach[i] = (double) sumEach[i] / score[i].length;
		}

		System.out.println("Korean Total: " + sumKor);
		System.out.println("English Total: " + sumEng);
		System.out.println("Math Total: " + sumMath);

		System.out.println("Korean Average: " + avgKor);
		System.out.println("English Average: " + avgEng);
		System.out.println("Math Average: " + avgMath);

		for (int i = 0; i < score.length; i++) {
		    System.out.println(name[i] + " Total: " + sumEach[i]);
		    System.out.println(name[i] + " Average: " + avgEach[i]);
		}

			

			
			

	}

}
