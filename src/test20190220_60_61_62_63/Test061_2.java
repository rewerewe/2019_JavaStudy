package test0220_60_61_62_63;
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
   ***
  *****
 *******
*********
*/

public class Test061_2 {
	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 9; i++) {
				if (j == 1) {
					if (i == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 2) {
//					if (i == 4 || i == 5 || i == 6) {
//					if (3 < i && i < 7) {
					if (4 <= i && i <= 6) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 3) {
					if (3 <= i && i <= 7) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 4) {
					if (2 <= i && i <= 8) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}