package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
//	숫자 하나를 입력 받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 숫자 하나 입력 받기
		System.out.print("숫자를 입력하세요: " );
		int num = sc.nextInt();
		
		// 현재 값이 1개가 될때까지 줄이며 *을 출력
		int currentNum = num;		
		for (int loopCount = 1; loopCount < num; loopCount++) {
			for (int j = currentNum; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
			currentNum--;
		}
		
		// 임시 값이 현재 숫자와 같을 때까지 늘리며 *을 출력
		currentNum = 1;	
		for (int loopCount = 1; loopCount <= num; loopCount++) {
			for (int j = 1; j <= currentNum; j++) {
				System.out.print("*");
			}
			System.out.println();
			currentNum++;
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
