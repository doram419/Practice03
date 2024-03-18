package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
//	다음과 같은 프로그램을 작성하세요
//	a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
//	- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
//	b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
//	 - 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 
	
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력 받기
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum = 0;
		
		// 홀짝 판단
		// 홀수인지 판단하기
		boolean isOdd = (num % 2 == 1) ? true : false;
		
		for (int i = 1; i <= num; i++) {
			// 홀수인 경우에는, 입력 값까지 홀수의 합을 출력
			if (isOdd && i % 2 == 1)
			{
					sum += i;
			}
			
			// 짝수인 경우에는, 입력 값까지 짝수의 합을 출력
			if (!isOdd && i % 2 == 0)
			{
					sum += i;
			}
		}
		
		// 합 출력하기
		System.out.println("결과값: " + sum);
		
		// 스캐너 닫기
		sc.close();
	}
}
