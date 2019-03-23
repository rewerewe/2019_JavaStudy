package test20190219;
/*======================================
 ■■■ 실행 흐름의 컨트롤 ■■■
 - 반복문(while) 실습
=======================================*/

// 실행 예)
// 1부터 100까지의 정수의 합 : 5050
// 1부터 100까지의 짝수의 합 : 2550
// 1부터 100까지의 홀수의 합 : 2550
// 계속하려면 아무키나 누르세요...

public class Test046
{
	public static void main(String[] args)
	{
		// ○ 주요 변수 선언
		// int n = 1, sum = 0, even = 0, odd =0;
		int n=1, sum, even, odd;
		sum = even = odd = 0;
	
		// ○ 연산 및 처리 (반복문 구성)
		while (n <= 100)
		{
			sum += n;

			if (n % 2 == 0)
				even += n;
			else 
				odd += n;
			n++;
		}

		System.out.println("1부터 100까지 정수의 합 : " + sum);
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);
	
		// 내가 풀이한 내용 
		/*
		// 1. 1부터 1씩 증가할 변수와 누적합을 담을 변수 
		//		두개의 변수가 필요하다.


		// ○ 주요 변수 선언 
		int a = 1;
		int sum = 0;
		int num1, num2;
		
		// ○ 연산 및 처리 
		while (a <= 100)
		{
			sum += a;
				a++;

			if (a % 2 == 0)
			{
				num2 += 2
			}
		}
		
		System.out.println("1부터 100까지 정수의 합 : " + sum);
		System.out.println("1부터 100까지 짝수의 합 : ");
		System.out.println("1부터 100까지 홀수의 합 : ");

		// ○ 결과 출력 

		*/

	}
}

// 실행 결과
/*
1부터 100까지 정수의 합 : 5050
1부터 100까지 짝수의 합 : 2550
1부터 100까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/