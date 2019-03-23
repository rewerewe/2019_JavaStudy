package test20190219_help;
/*=============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
==============================================*/

/*
○ 반복문의 개요
	주어진 조건이 『참』인 경우
	일정한 영역의 문장들을 반복 수행하다가
	조건식이 거짓이 되는 순간
	반복 수행을 중단하는 문장이다.
	이와 같은 반복문에는 『while』, 『do~while』, 『for』문 등이 있으며
	반복문의 제어를 위해 『break』, 『continue』 등을
	함께 사용하는 경우도 있다.
*/

/*
○ while문
	조건식을 먼저 비교하여
	조건식의 결과가 참인 경우, 특정 영역을 반복 수행하는 문장으로
	반복 횟수가 정해져 있지 않은 경우나
	반복 횟수가 많은 경우 주로 사용한다.
	while문은 조건이 맞지 않는 경우
	반복은 커녕 단 한 번도 실행되지 않을 수 있다.

○ 형식 및 구조
	while(조건식)
	{
		실행문;
	}
*/



public class Test043
{
	public static void main(String[] args)
	{
		//①~④ : 결과 예측해보고 왜 차이가 나는지
		/*
		//①
		int n=0;
		while (n<=10)
		{
			System.out.println("n = " + n);
			n++;
		}
		*/

		/*
		//②
		int n=0;
		while (n<=10)
		{
			n++;
			System.out.println("n = " + n);	//자리바꿈
		}
		*/

		/*
		//③
		int n=0;
		while (n<10)						  // =제외
		{
			System.out.println("n = " + ++n); //pre-fix
		}
		*/

		/*
		//④
		int n=0;										//0
		while (n++<10)						  //post-fix//0 2
		{												//1
			System.out.println("n = " + ++n);			//2
		}
		*/


		// 1부터 100까지의 합을 계산하여
		// 결과를 출력하는 프로그램을 구현한다.
		// 단, while반복문을 활용한다.

		// 실행 예)
		// 1부터 100까지의 합 : 5050		
		// 계속하려면 아무 키나...

		// ※ 문제 인식 및 분석
		//	  1. 출력 구문이 반복문의 영역 밖에 위치해야 한다(출력구문:1개OR반복수만큼)
		//	  2. 1부터 1씩 증가할 변수와
		//		 누적합을 담을 변수
		//		 두 개의 변수가 필요하다.

		// 주요 변수 선언
		int n=1;	// n:1~100 - 1부터 차례로 담아 1씩 증가하는 변수 선언 및 초기화
		int m=0;	// m:누적값	- 
		
		// 연산 및 처리(반복문 구성)
		while (n<=100)
		{				// 누적합을 담을 변수(m)가 그만큼(n만큼) 증가해 나가는 연산
			m+=n;		// m을n만큼 증가시킨다 →+=(:기준값이 있어야 함)
			n++;		// n이 1씩 증가해가는 연산
		}

		// 결과 출력
		System.out.printf("1부터 100까지의 합 : %d\n", m); 
		//System.out.println("1부터 100까지의 합 : " + m);

	}
}

//실행 결과
/*

①		②		③		④
n = 0
n = 1	n = 1	n = 1
n = 2	n = 2	n = 2	n = 2
n = 3	n = 3	n = 3
n = 4	n = 4	n = 4	n = 4
n = 5	n = 5	n = 5
n = 6	n = 6	n = 6	n = 6
n = 7	n = 7	n = 7
n = 8	n = 8	n = 8	n = 8
n = 9	n = 9	n = 9
n = 10	n = 10	n = 10	n = 10
		n = 11

1부터 100까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/