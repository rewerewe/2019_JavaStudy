package test20190219_help;
/*=============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
==============================================*/

// 실행 예)
// 연산 결과 : xxx

// 1 * 2 * 3 * 4 * ... * 10

public class Test049
{
	public static void main(String[] args)
	{
		
		int n=1;
		int result=1;

		while (n<=10)
		{
			result*=n;
			n++;
		}

		System.out.println(result);

		/*
		//해설
		int n=0, result=0;		//check~!!!
								//누적곱을 담을 변수 1로 초기화
		while (n<10)
		{
			n++; //++n;이어도 안됨
			result *= n;
		}
		System.out.println(result);
		*/

	}

}

//실행 결과
/*
3628800
계속하려면 아무 키나 누르십시오 . . .
*/