package com.javaex.practice;

public class Ex06 {
	// 1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요
	public static void main(String[] args) {
		
		// 1에서 100까지의 수까지 반복 
		for (int i = 1; i <= 100; i++) {
			// 배수를 x라고 친다면 x 를 5로 나눴을 때 나머지가 0이면
			// x는 5의 배수, 마찬가지로 7의 배수도 구할 수 있다.
			// 5의 배수이면서 7의 배수 찾기
			if( i % 5 == 0 && i % 7 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
