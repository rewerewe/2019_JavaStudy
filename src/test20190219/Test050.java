/*=========================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - 반복문(while) 실습
===========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 10 
// 10 → 소수 아님
// 계속하려면 아무키나...

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무키나...

// ※ 소수 : 1 또는 자기자신의 값 이외의 어떤 수로도 나눌 수 없는 값.
//			 단, 1의 소수 아님 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언 및 초기화 

		int num;					//-- 사용자 입력값을 담을 변수 
		
		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		int n = 2;								//-- 사용자 입력값을 대상으로
												//   나눗셈 연산을 수행할 변수(1씩 증가 예정) 

		boolean flag = true;					//-- 소수라는 기본 값.을 설정 **check~~!!
		// String temp = "소수다";

		while (n < num)							// 입력 받은 정수부터 그 수 직전까지 반복한다. 
		{
			if (num % n == 0)
			{
				flag = false;					//-- 소수가 아니다
				// String temp = "소수가 아니다";
				break;
			}

			n++;								//나눠지는 값이 1씩 증가한다.
		}

		// 결과 출력(출력 전에 수행해야 할 추가 확인 → 1인지 여부에 대한 확인)
		// 소수다 && 1이 아니다.
		// → 최종적인 결론으로 소수다.
		// 그렇지 않으면
		// → 최종적인 결론으로 소수 아니다. 

		if (flag==true && num != 1)				//-- 논리적으로 판단할 수 있는 상태여야 한다. ∴ boolean형 변수 flag 를 선언
			System.out.printf("%d → 소수 \n", num);
		else 
			System.out.printf("%d → 소수아님 \n", num);

		

		// 내가 풀이한 내용 (feat. 지혜님)

		/*

		// 문제 인식 및 분석
		// 1. 사용자로부터 정수를 입력받는다 (BufferedReader 사용) 
		// 2. 받아온 데이터를 나누어 소수인지 아닌지 판별, 결과값을 담을 변수(result) 선언
		// 3. 반복문 구성
		

		// 사용자로부터 데이터 받음 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 정수 입력 : ");
		
		// 주요 변수 선언
		int n;
		n= Integer.parseInt(br.readLine());
		
		String result=""; 

		if (n == 1) 
		{
			System.out.printf("%d → 소수 아님\n",n);		
		}
		else if (n != 1)
		{
			int i=2;			// 나눌 정수를 변수 i로 선언, i 값은 while문에서 반복, 증가한다. 
				while (i < n)
				{	
					if (n % i != 0)
					{	
						result = "소수";
						
					} else {

						result = "소수 아님";


					}

					System.out.printf( "i %d n %d result %s ",i,n,result); 

					i++;
				}
			
			
		}
		
			System.out.printf("%d → %s\n", n, result);
			
		
		/*
		int n;	
		n= Integer.parseInt(br.readLine());
		
		int result;
		
		// 반복문 구성 
		while (n <= 100)
		{
			result = (n / (n-1));

			if (result != 0 && result == 1)
			{
				System.out.printf("%d → 소수", n);
			}
			else 
			{
				System.out.printf("%d → 소수 아님", n);
			}
			
			n++;
			
		}
		*/
	}
}

// 실행 결과 
/*
임의의 정수 입력 : 11
11 → 소수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 8
8 → 소수아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 1
1 → 소수아님
계속하려면 아무 키나 누르십시오 . . .
*/