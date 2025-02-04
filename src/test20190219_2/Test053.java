package test20190219_2;
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

		// 사용자로부터 임의의 정수를 입력 받음 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ○ 주요 변수 선언

		// 입력 받은 정수 담을 변수 n, 1씩 증가할 변수 i, 결과값 담을 변수 result 선언 
		int n, i = 1;
		int result = 0;
		
		// ① 사용자에게 안내메시지 출력 
		System.out.print("원하는 단(구구단) 입력 : ");
		// ② 입력 받은 정수(String 타입)를 변환(Int 타입으로)하여 변수(n)에 담음
		n = Integer.parseInt(br.readLine());

		// ○ 연산 및 처리 (반복문 구성)

		
		// 결과 값 예상
		// 입력받은 n = 7
		// 증가할 수 i = 1, 2, 3, ..., 9
		while (i <= 9)
		{			
			if (0 < i && i < 10)
			{
				// 결과값 예상
				// 7 * 1 = 7
				// 7 * 2 = 14
				result = n * i;
				System.out.printf("%d * %d = %d\n", n, i, result);
			}
			else
			{	
				System.out.print("1부터 9까지의 정수만 입력 가능합니다.\n");
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
