package test20190218;

/*==========================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - if 문 실습
===========================================*/

// 실습문제 

// 사용자로부터 받은 임의의 정수를 입력받아
// 입력받은 정수가 짝수인지 홀수인지 판별하여 
// 결과를 출력하는 프로그램을 구현한다.

// 단, BufferedReader의 readLine() 메소드를 통해 입력받을 수 있도록 처리하고
// 단일 if 문을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : 37
// 37 → 홀수입니다.
// 계속하려면 아무키나...2019-02-18

// 임의의 정수 입력 : 26
// 26 → 짝수입니다.
// 계속하려면 아무키나...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test030
{
	public static void main(String [] args) throws IOException
	{
		// 버퍼드리더 인스턴스 생성

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		// 주요 변수 선언

		int a;

		// 연산 및 처리

		// 안내메시지 출력
		System.out.print("임의의 정수 입력 : ");

		// 입력받은 데이터 변수에 담기 
		a = Integer.parseInt(br.readLine());
		
		// 함께 풀이한 내용, 결과 출력 

		if (a % 2 ==0)
			System.out.printf("%d → 짝수입니다.\n", a);	
		
		if (a % 2 !=0)
			System.out.printf("%d → 홀수입니다.\n", a);

		
		/* 내가 풀이한 내용 

		if (a % 2 ==0)
			System.out.printf("짝수");
		
		else 
			System.out.println("홀수");	*/


	}
}

// 실행 결과 
/*
임의의 정수 입력 : 37
37 → 홀수입니다.
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 26
26 → 짝수입니다.
계속하려면 아무 키나 누르십시오 . . .
*/
