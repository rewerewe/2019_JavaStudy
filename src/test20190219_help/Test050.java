package test20190219_help;
/*=============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
==============================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나...

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무 키나...

// ※ 소수 : 1 또는 자기자신의 값 이외의 어떤 수로도 나눌 수 없는 값
//			 단, 1은 소수 아님

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test050
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 어렵!
		// 설명 듣고 해봄
		// 원리는 이해했는데 코딩이 안됨ㅠㅠ
		/* (나)
		System.out.print("임의의 정수 입력 : ");
		int n;
		n = Integer.parseInt(br.readLine());		//입력받는 수 n
		//1로는 모든 수가 나눠지므로 i 초기값 2부터
		//n직전값까지의 모든 수(i++이용)가 n으로 나눠지지 않아야함
		if (n==1)//1먼저 제외해줌
		{
			System.out.println(n + " → 소수 아님");
		}
		*/
		/*
		else //1제외 모든값
		{
			int i=2;//i 조건문에 쓰기 전에 변수선언 및 초기값 설정부터 해야 함
			while (i<n) //n직전값까지 모든 수
			{
				if (n%i==0)
				{
					System.out.println(n + " → 소수 아님");
				}
				i++;
			}

				System.out.println(n + " → 소수");

		}	
		*/

		/*
		while (i<n)
		{

			i++;
		}
		if (n%i==0 || n==1)		//사용자입력값n이 i의 배수이거나 1일때
		{
			while (i<n)
			{
				i++;
			}
			System.out.println(n + " → 소수 아님");
		}
		else if (n%i!=0)		//사용자입력값n이 i의 배수가 아닐때
		{
			System.out.println(n + " → 소수");
		}
		*/
		
		//(해설)
		int num;		//사용자입력값

		System.out.print("임의의 정수 입력 : ");
		num=Integer.parseInt(br.readLine());

		int n=2;		//나눗셈 연산 수행할 변수 

		boolean flag=true;	//flag변수:결론X 이를 토대로 다른 요인과 비교
							//⇔초기값=소수			//check~!!!
		//String temp = "소수다"; ~Test051
	
		while (n<num)
		{
			if (num%n==0)
			{
				flag = false;// 나눠떨어짐 →소수아님
				// temp="소수아니다";
				break;		 // flag=false;로 결론나면 반복문 멈추고 빠져나간다
			}

			n++;

		}

		// 결과 출력(출력 전에 수행해야 할 추가 확인 →1인지 여부 확인)
		// 소수다 && 1이 아니다
		// →최종적인 결론은 소수다
		// 그렇지 않으면
		// →최종적인 결론은 소수 아니다

			//flag==true안해도 OK ∵초기값
		if (flag==true && num!=1)
			System.out.printf("%d → 소수~!!!\n", num);
		// if (temp=="소수다" ~) (X) 문자열 값비교X
		// if (temp변수에 "소수다"라는 문자열이 담겼다면..&&num!=1)의 형태로 해줘야 함
		// 소수이고 1이 아닌지를 둘다 만족하는지 확인해야 하므로
		// 문자열값 크기 비교가 안되니까
		else
			System.out.printf("%d → 소수 아님~!!!\n", num);

	}
}