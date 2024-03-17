package com.javaex.practice;

public class Ex09 {
	// 다음과 같이 출력하세요
	public static void main(String[] args) {
		int num = 0;
		
		for (int i = 1; i <= 10; i++) {
			num = i;
			
			for (int j = 0; j <= 9; j++) {
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
	}
}
