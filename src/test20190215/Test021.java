/*==========================================
 ■■■ 자바의 기본 프로그래밍 ■■■
 - BufferedReader
 - 산술연산자
 - printf()
===========================================*/

//	사용자로부터 정수를 두 번 입력받아 사칙연산 및 나머지 연산을 수행하여 
//	결과를 출력하는 프로그램을 구현한다.
//	단, 입력받은 과정을 BufferedReader 를 활용할 수 있도록 하고 
//	출력하는 과정은 printf() 메소드를 활용할 수 있도록 한다.

//	실행 예)
//	첫 번째 정수 입력 : 10 
//	두 번째 정수 입력 : 2

//	====[결과]====
//	10 + 2 = 12
//	10 - 2 = 8
//	10 * 2 = 20 
//	10 / 2 = 5
//	10 % 2 = 0 
//	==============
// 계속하려면 아무키나 입력하세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test021
{
	public static void main(String[] args) throws IOException
	{
		// 함께 풀이한 내용

		// 주요 변수 선언
		int num1, num2;						//-- 사용자 입력값을 담을 변수
		int res1, res2, res3, res4, res5;	//--각 연산의 결과값을 담을 변수 

		// BufferedReader 인스턴스 생성 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 연산 및 처리
		// ·사용자에게 안내메시지 출력 및 입력값 변수에 담아내기
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		//산술 연산을 통해 결과값 산출
		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;


		// 결과 출력 
		System.out.println();
		System.out.println("====[결과]====");

		System.out.printf("%d + %d = %d%n", num1, num2, res1);		// d: 디시멀. 10진수 정수형 
		System.out.printf("%d - %d = %d%n", num1, num2, res2);
		System.out.printf("%d * %d = %d%n", num1, num2, res3);
		System.out.printf("%d / %d = %d%n", num1, num2, res4);
		System.out.printf("%d %% %d = %d%n", num1, num2, res5);
		System.out.println("==============");



		/*  내가 풀이한 내용 

		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ○ 주요 변수 선언
		int a, b;
		int p, m, d, h;

		// ○ 연산 및 처리

		// 1. 사용자에게 메시지를 입력 받는다.
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		// 2. 연산 
		p = a + b 
		m = a - b
		d = a * b
		h = a / b		

		// ○ 결과 출력 
		System.out.println(a);	 */
		


	}

}

// 실행 결과

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2

====[결과]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
==============
계속하려면 아무 키나 누르십시오 . . .
*/