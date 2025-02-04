package test20190215;
/*=======================================
 ■■■ 연산자 (Operator) ■■■
 - 삼항 연산자 == 조건 연산자 
=========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
// 결과를 출력하는 프로그램을 작성한다.
// 단, 입력 데이터는 BufferedReader 의 readLine()을 통해 넘겨받을 수 있도록 한다.
// 또한, 조건 연산자(삼항 연산자)를 활용하여 기능을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : -12
// -12 → 음수
// 계속하려면 아무 키나...

// 임의의 정수 입력 : 257
// 257 → 양수
// 계속하려면 아무 키나...

// 임의의 정수 입력 : 0
// 0 → 영
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{

		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ○ 주요 변수 선언

		int n;							//-- 사용자 입력값을 담을 변수
		String strResult;				//-- 음수인지 양수인지 영인지 판변결과를 담을 변수

		// ○ 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		/*
		n 이 0보다 크다 → true → 양수
						→ false → n 이 0 보다 작다 → true → 음수
													 → false → 영
		*/

		strResult = n > 0 ? "양수" : (n < 0 ? "음수" : "영");

		// ○ 결과 출력 
		System.out.println(n + " → " + strResult);


		/*  내가 풀이한 내용 
		// BufferedReader 인스턴스 생성 
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		// 주요 변수 선언
		int num1;
		String strResult;

		// 1) 사용자로부터 데이터를 입력받는다.
		System.out.print("임의의 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		srtResult = (num1) ? 양수 : 음수
		
		// 결과 출력 
		System.out.print(num1 + " → " + strResult);	*/
		

	}
}

// 실행 결과

/*
임의의 정수 입력 : -12
-12 → 음수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 257
257 → 양수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 0
0 → 영
계속하려면 아무 키나 누르십시오 . . .

*/