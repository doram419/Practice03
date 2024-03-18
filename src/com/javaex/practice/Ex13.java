package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
//	아래와 설명에 맞는 프로그램을 작성하세요
//	숫자를 1개 입력 받아 입력한 숫자까지 누적합계를 구하는 프로그램을 작성하세요.
//	예를 들어 100을 입력 받는다면 아래와 같이 계산됩니다.
//	𝟏 + 𝟐 + 𝟑 + 𝟒 + 𝟓 + ⋯ + 𝟗𝟗 + 𝟏𝟎0
	
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 숫자 1개 입력 받기
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		
		// 입력한 숫자까지 누적합계를 구하기
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		// 합계 출력
		System.out.println("합계:" + sum);
		
		// 스캐너 닫기
		sc.close();
	}
}
