package test0219_2;
/*=========================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - 반복문(while) 실습
===========================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수까지의 전체 합과, 짝수 합과, 홀수의 합을 
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 276
// >> 1 ~ 276까지 정수의 합 : xxxx
// >> 1	~ 276까지 짝수의 합 : xxxx
// >> 1 ~ 276까지 홀수의 합 : xxxx
// 계속하려면 아무키나.... 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		// 문제 인식 및 분석
		// 1. 사용자로부터 임의의 정수를 입력받는다. = BufferedReader 사용 
		// 2. 입력받은 정수(n)를 변수에 담는다. = 변수 n 선언 
		// 3. 1부터 1씩 증가할 변수(i)와 누적합(sum), 짝수합(even), 홀수합(odd)을 담을 변수 4개가 필요하다.
		// 4. 짝수합(even)을 변수에 담는다 
		//     even = 입력받은 정수를 2로 나누어 나머지가 0 이라면(n % 2 == 0) → 짝수 
		// 5. 홀수합(odd)을 변수에 담는다. 
		//	   odd = 입력받은 정수를 2로 나누어 나머지가 0 이 아니라면(n % 2 != 0) → 홀수 

		// ○ 주요 변수 선언

		// 입력 받은 정수 담을 변수 n, 1씩 증가할 변수 i, 누적합 sum, 짝수합 even, 홀수합 odd 선언
		int n;
		int i=1;
		int sum = 0, even = 0, odd = 0;

		// 사용자로부터 임의의 정수를 입력 받음 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ① 사용자에게 안내메시지 출력 
		System.out.print("임의의 정수 입력 : ");
		// ② 입력 받은 정수(String 타입)를 변환(Int 타입으로)하여 변수(n)에 담음
		n = Integer.parseInt(br.readLine());


		// ○ 연산 및 처리 (반복문 구성)

		
		// 결과 값 예상
		// 입력받은 n = 3

		// p = 1, n = 3 → 1 <= 3 → sum += 1 → p++
		// p = 2, n = 3 → 2 <= 3 → sum += 2 → p++
		// p = 3, n = 3 → 3 <= 3 → sum += 3 → p++
		// p = 4, n = 3 → 4 <= 3 → false

		// 입력받은 정수(n)까지 반복문 실행 
		while (i <= n)
		{
			// 누적합 
			sum += i;

			// 결과 값 예상
			// if n = 4, even : 2 + 4 = 6, odd : 1 + 3 = 4 
			// if n = 6, even : 2 + 4 + 6 = 12, odd : 1 + 3 + 5 = 9
			// 짝수합
			if (i % 2 == 0)
				even += i;

			// 홀수합 ① 
			else if (i % 2 != 0)
				odd += i;	

			// 홀수합 ②
			// else {
			//	odd += p;

			i++;
		}

		// ○ 결과 출력
		System.out.printf(">> 1 ~ %d 까지 정수의 합 : %d\n", n, sum);
		System.out.printf(">> 1 ~ %d 까지 짝수의 합 : %d\n", n, even);
		System.out.printf(">> 1 ~ %d 까지 홀수의 합 : %d\n", n, odd);

	}
}

// 실행 결과
/*
임의의 정수 입력 : 10
>> 1 ~ 10 까지 정수의 합 : 55
>> 1 ~ 10 까지 짝수의 합 : 30
>> 1 ~ 10 까지 홀수의 합 : 25
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 100
>> 1 ~ 100 까지 정수의 합 : 5050
>> 1 ~ 100 까지 짝수의 합 : 2550
>> 1 ~ 100 까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/
