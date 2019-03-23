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

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		
		// 문제 인식 및 분석
		// 1. 사용자로부터 단 수를 입력받는다.
		// 2. 입력받은 데이터를 담을 변수(n), 1부터 1씩 증가할 변수(i)가 필요하다.
		// 3. 입?뭐事? 데이터가 정수 1~9가 아니라면 프로그램 종료. 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, i = 1;
		int result = 0;

		System.out.print("원하는 단(구구단) 입력 : ");
		n = Integer.parseInt(br.readLine());

		while (i <= 9)
		{			
			if (n <= 9 && n >= 1)
			{
				result = n * i;
				System.out.printf("%d * %d = %d\n", n, i, result);
			}
			else
			{	
				System.out.print("1부터 9까지의 정수만 입력 가능합니다.\n");
				//
				break;
			}
			i++;
		}
	}
}

// 실행 결과
/*
원하는 단(구구단) 입력 : 7
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력 : 11
1부터 9까지의 정수만 입력 가능합니다.
계속하려면 아무 키나 누르십시오 . . .
*/
