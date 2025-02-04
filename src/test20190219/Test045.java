package test20190219;
/*======================================
 ■■■ 실행 흐름의 컨트롤 ■■■
 - 반복문(while) 실습
=======================================*/

// 실습 문제
// 1부터 100까지의 정수 중에서
// 짝수의 합과 홀수의 합을 따로 구분하여 계산한다.
// 그리고 그 결과값을 출력하는 프로그램을 구현한다.
// 단, 반복문은 while반복문을 사용하며,
// 조건문은 if조건문을 사용하여 작성할 수 있도록 한다.

// 실행 예)
// 1부터 100까지의 정수 중
// 짝수의 합 : 2550
// 홀수의 합 : 2550
// 계속하려면 아무키나 누르세요...

public class Test045
{
	public static void main(String[] args)
	{

	// 문제 인식 및 분석
	// 1. 1부터 100까지 증가하는 변수 선언한다. 
	// 2. 짝수의 합과 홀수의 합을 담을 변수 sum2 과 sum1를 선언한다.
	// 3. 조건식을 사용한다.

	int a = 1;
	int b = 2;
	int sum2 = 0;
	int sum1 = 0;

	while(a <= 100)
	{
		sum2 += b;
		b += 2;

		sum1 += a;
		a += 1;
	}

	// 반복문은 횟수를 적게 쓸수록 리소스 소모가 감소된다.

	System.out.println("1부터 100까지의 정수 중");
	System.out.println("짝수의 합 :" + sum2);
	System.out.println("홀수의 합 :" + sum1);


	}
}