package test20190220_60_61_62_63;
/*=================================================================
 ■■■ 실행 흐름의 컨드롤 (제어문) ■■■
 - 반복문 (for문) 실습
 - 별찍기 실습
※ 여러가지 반복문 형태로 출력 : 중첩(이중, 삼중) 반복문
==================================================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*
    *
   **
  ***
 ****
*****
*/

public class Test060_2 {
	public static void main(String[] args) {
		// 1. 일반적인 방법
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
		
		
		// 2. 반복문(Loop Statement), 종류는 while, for..., 반복문을 쓰는 이유 : 프로그래밍을 강력하게 하기 위해서.
		
		// 3-1. 개행이 없음
//		for (int j = 0; j < 5; j++) {
//			for (int i = 0; i < 5; i++) {
//				System.out.print("*");
//			}
//		}
		// 3-2.의 결과
		// *************************
		
		// 4-1. 개행을 더함
//		for (int j = 0; j < 5; j++) {
//			for (int i = 0; i < 5; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 4-2.의 결과
		// *****
		// *****
		// *****
		// *****
		// *****

		// 5. 조건문(Condition Statement), 종류는 if, switch..., 조건문을 쓰는 이유 : 프로그래밍을 똑똑하게 하기 위해서.
		// 6-1. if로 공백이냐 별이냐를 컨트롤
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5; i++) {
				if(j == 1) {
					if(i < 5) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				
				if(j == 2) {
					if(i < 4) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				
				if(j == 3) {
					if(i < 3) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				
				if(j == 4) {
					if(i < 2) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				
				if(j == 5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// 6-2.의 결과
		// j == 1
		// j == 2
		// j == 3
		// j == 4
		// j == 5
		
		//    * j == 1, i == 1, ... , 5
		//   ** j == 2
		//  *** j == 3
		// **** j == 4
		//***** j == 5
	}
}