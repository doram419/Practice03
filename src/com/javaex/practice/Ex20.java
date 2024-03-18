package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
//	아래와 설명에 맞는 프로그램을 작성하세요
//	숨겨진 숫자를 맞추는 게임입니다.
//	프로그램이 실행되면 1~100 사이의 숫자가 결정됩니다.
//	사용자가 입력한 숫자가 결정된 숫자보다 높으면 “더 낮게” 출력
//	사용자가 입력한 숫자가 결정된 숫자보다 낮으면 “더 높게” 출력 되며
//	정답을 맞춘 경우 “맞았습니다.” 출력됩니다.
//	게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료됩니다.
//	(y 인 경우 다시 게임이 시작됩니다.)
//	*개발시 랜덤하게 생성된 값을 출력해서 테스트 하면 편리합니다.
	
	public static void main(String[] args) {
		//	프로그램이 실행시 1~100 사이의 랜덤하게 정답값 결정
		int answerProgram = (int)(Math.random()*100);
		int answerUser;
		boolean isContinue = true;
		char repeat = '0';
		
		//스캐너 열기
		Scanner sc= new Scanner(System.in);
		
		//UI구성
		System.out.println("==============================");
		System.out.println("\t[숫자맞추기게임 시작]");
		System.out.println("==============================");
		
		while (isContinue) {
			System.out.print(">>");
			answerUser = sc.nextInt();
			
			// 정답 판별
			// 사용자의 답이 프로그램이 결정한 정답보다 낮으면 “더 높게” 출력
			if(answerUser < answerProgram)
			{
				System.out.println("더 높게");
			}
			// 사용자의 답이 프로그램이 결정한 정답보다 높으면 “더 낮게” 출력
			else if(answerUser > answerProgram)
			{
				System.out.println("더 낮게");
			}
			//	정답을 맞춘 경우 “맞았습니다.” 출력
			else
			{
				System.out.println("맞았습니다.");
	
				while(!(repeat == 'y') && !(repeat == 'n'))
				{
					//	게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료됩니다.
					//	(y 인 경우 다시 게임이 시작됩니다.)
					System.out.println("게임을 종료하시겠습니까? (y/n)");
					repeat = sc.next().charAt(0);
					
					if(repeat == 'y')
					{
						isContinue = false;
						System.out.println("==============================");
						System.out.println("\t[숫자맞추기게임 종료]");
						System.out.println("==============================");	
					}
					else if (repeat == 'n'){
						answerProgram = (int)(Math.random()*100);
						System.out.println("==============================");
						System.out.println("\t[숫자맞추기게임 시작]");
						System.out.println("==============================");
					}
					else
					{
						System.out.println("y 또는 n을 입력해주세요.");
					}
				}
				repeat = '0';
			}
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
