package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
//	아래와 같이 은행 프로그램을 작성하세요
//	“1.예금” 선택 후 금액을 입력하면 예금액이 합산됩니다.
//	“2.출급” 선택 후 금액을 입력하면 예금액이 차감됩니다.
//	“3.잔고” 선택 시 현재 잔고가 출력됩니다.
//	“4.종료” 선택 시 종료됩니다.
//	“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);

		// 유저선택, 디폴트 값 0
		int userSelected = 0;
		int depositValue = 0;
		int accountAmount = 0;
		int withdrawValue = 0;

		// 프로그램이 유저가 4를 선택할때까지 반복된다.
		// 종료변수 선언
		boolean isEnd = false;
		
			while (!isEnd) {
				// UI 생성 / 출력
				System.out.println("--------------------------------------");
				System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4. 종료");
				System.out.println("--------------------------------------");
				// 유저선택 입력
				System.out.print("선택>");
				userSelected = sc.nextInt();
	
				switch (userSelected) {
					// “1.예금”
					case 1 -> {
						// 금액을 입력하면 예금액이 계좌금액에 합산된다.
						System.out.print("예금액>");
						depositValue = sc.nextInt();
						accountAmount += depositValue;
					}
					// “2.출급”
					case 2 -> {
						// 금액을 입력하면 출금액이 계좌금액에서 차감됩니다.
						// 대신 차감될 금액보다 계좌금액이 적으면 메세지 출력함
						System.out.print("출금액>");
						withdrawValue = sc.nextInt();
						if (accountAmount >= withdrawValue)
							accountAmount -= withdrawValue;
						else
							System.out.println("계좌에 있는 금액보다 "
									+ "더 많은 금액을 출금 할 수 없습니다.!\n" 
									+ "현재 " + accountAmount + " 보유 중");
					}
					// “3.잔고” 
					case 3 -> {
						// 선택 시 현재 잔고가 출력
						System.out.println("잔고액>" + accountAmount);
					}
					// “4.종료” 
					case 4 -> {
						// 종료
						System.out.println("프로그램 종료");
						isEnd = true;
					}
		
					// “1,2,3,4 이외의 숫자” 
					default -> {
						//다시입력해주세요 메시지 출력
						System.out.println("다시입력해주세요 ");
					}
				}
			}
			
			// 스캐너 닫기
			sc.close();
	}
}
