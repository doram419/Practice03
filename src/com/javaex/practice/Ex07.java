package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
//	숫자를 입력 받아 아래와 같이 출력하세요
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력 받기
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		// 점차 늘어나는 식으로 출력하기
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
