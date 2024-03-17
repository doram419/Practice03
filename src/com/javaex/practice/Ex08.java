package com.javaex.practice;

public class Ex08 {
//	아래와 같이 구구단을 출력하세요
	public static void main(String[] args) {
		final int guguMax = 9;
		
		for (int i = 1; i <= guguMax; i++) {
			for (int j = 1; j <= guguMax; j++) {
				System.out.print(i + " * " + j +
						" = " + (i*j) + "\t");
			}	
			System.out.println();
		}
	}
}
