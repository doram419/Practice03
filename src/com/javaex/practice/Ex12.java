package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
//	팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력 받아 팩토리얼 값을 출력하세요.
//	5 입력시 1*2*3*4*5 의 값이 출력됩니다.
//	7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.
	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 숫자 1개 입력 받기
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
				
		//팩토리얼 값 계산
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		
		// 출력
		System.out.println("결과값: " + factorial);
		
		// 스캐너 닫기
		sc.close();
	}
}
