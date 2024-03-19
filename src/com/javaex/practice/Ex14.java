package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
//	13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요.
	
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
			if(i != 1)
			{
				System.out.print("+");
			}
			System.out.print(i);
		}
		
		// continue로 구성
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//			System.out.print(i);
//			if(i == num)
//			{
//				continue;
//			}
//			System.out.print("+");
//		}
		
		// 합계 출력
		System.out.println("\n합계:" + sum);
		
		// 스캐너 닫기
		sc.close();
	}
}
