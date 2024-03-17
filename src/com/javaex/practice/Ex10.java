package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
//	정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
	public static void main(String[] args) {
		// 정수 다섯 개를 입력받아 가장 큰 수를 출력하세요.
		
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 정수 다섯 개를 입력받기
		System.out.println("숫자를 입력하세요");
		int num[] = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print("숫자" + (i + 1) + " : ");
			num[i] = sc.nextInt();
		}
		
		// 가장 큰 수 출력하기
		int numMax = num[0];
		for (int i = 1; i < 5; i++) {
			if(numMax < num[i])
				numMax = num[i];
		}
		
		System.out.println("최대값은 " + numMax + "입니다.");
		
		// 스캐너 닫기
		sc.close();
	}
}
