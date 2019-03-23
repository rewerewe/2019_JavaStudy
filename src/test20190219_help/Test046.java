package test20190219_help;
/*=============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
==============================================*/

// 1부터 100까지 정수의 합 : 5050
// 1부터 100까지 짝수의 합 : 2550
// 1부터 100까지 홀수의 합 : 2500
// 계속하려면...

public class Test046
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		int n=0;
		int dec=0;
		int even=0;
		int odd=0;
		
		// int dec, even, odd;
		// dec=even=odd=0;
		// 0을 odd에 대입, odd를 even에 대입, even을 dec에 대입 ⇒ odd,even,dec 모두0
		
		// 연산 및 처리
		while (n<=100)
		{

			/* (나) 틀린점 - 정수 조건식에 어떻게 처리할지
					해결 : if문 사용X while문에 바로
			if (?)
			{
				n += n;
			}
			*/


			//정수
			dec += n;
			//짝수
			if (n%2==0)
			{
				even += n;
				
			}
			//홀수
			else if (n%2!=0)
			{
				odd += n;
			}
			/*
			//판별불가
			else
			{
				System.out.println("판별 불가");
				return;
			}
			*/

			n++;
		}
		// 결과 출력
		System.out.println("1부터 100까지 정수의 합 : " + dec);
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);
		
	}
}