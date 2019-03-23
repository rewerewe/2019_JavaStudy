package test0219_3;
/*=========================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - 반복문(while) 실습
===========================================*/

// ○ 과제
// 사용자로부터 원하는 단(구구단)을 입력받아 
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면 
// 프로그램을 종료해버릴 수 있도록 처리한다.

// 실행 예)
// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//   ： 
// 7 * 9 = 63 
// 계속하려면 아무키나...

// 원하는 단(구구단) 입력 : 11
// 1부터 9까지의 정수만 입력 가능합니다.
// 계속하려며 아무키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum = -1, dan = 1;

		System.out.print("원하는 단(구구단) 입력 : ");
		inputNum = Integer.parseInt(br.readLine());
		
		/*
		while (dan <= 9)
		{
			// 1, 2, 3, ..., 9
			if (0 < inputNum && inputNum > 10) {
				result = inputNum * dan;
				// 7 * 1 = 7
				// 7 * 2 = 14
				System.out.printf("%d * %d = %d \n", inputNum, dan, result);
			} else {
				System.out.println("1부터 9까지의 정수만 입력 가능합니다.");
			}
		}
		*/

		// 1, 2, 3, ..., 9
		if (0 < inputNum && inputNum < 10) {
			while (dan <= 9) {
				// 7 * 1 = 7
				// ...
				// 7 * 9 = 63
				System.out.printf("%d * %d = %d \n", inputNum, dan, inputNum * dan);
				dan++;
			}
		} else {
			System.out.println("1부터 9까지의 정수만 입력 가능합니다.");
		}
	}
}


