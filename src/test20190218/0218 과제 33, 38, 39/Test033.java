

// ○ 과제 (2019-02-18)
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, if ~ else 조건문을 활용할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000 → 윤년
// 계속하려면 아무키나...

// 임의의 연도 입력 : 2012
// 2012 → 윤년 
// 계속하려면 아무키나...

// 임의의 연도 입력 : 2018
// 2018 → 평년
// 계속하려면 아무키나...

// 임의의 연도 입력 : 2019
// 2019 → 평년
// 계속하려면 아무키나...

// ※ 윤년의 판별 조건
// 연도가 4의 배수이면서 100의 배수가 아니거나
// 400의 배수이면 윤년-!
// 그렇지 않으면 평년-!

// java package 안에 있는 BufferedReader, InputStreamReader 설계도를 사용하겠다.
// IOException 예외 사항이 있는 경우 던져 내겠다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// 문자 기반의 스트림과 바이트 기반의 스트림을 연결해줄 InputStreamReader 함께 선언
		// System.in => 자바에서 표준 입력을 받는 방식(=키보드 입력)
		// System.in의 타입이 InputStream 즉, 바이트를 읽는 객체이므로
		// 이를 문자열로 변환해주는 InputStreamReader로 처리.
		// BufferedReader는 문자 입력 스트림으로부터 문자를 읽음.
		// 즉 정리해서 실행하면 br은 키보드의 입력을 문자열로 받게 해준다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		// 변수 선언 및 연산 처리 


		// ① 사용자에게 데이터를 입력 받는다.
		System.out.print("임의의 연도 입력 : ");

		// ② 데이터 읽어와 정수값으로 변환하여, 변수에 담아내기 		
		int n = Integer.parseInt(br.readLine());


		// 조건식을 만족할 경우, 결과값(윤년, 평년)을 담아낼 변수
		String moon;

		// 『4의 배수』는 나누었을 때, 나머지가 0인 경우이다. 
		// 나머지를 구해야 하므로 연산자 『%』를 이용한다. 
		// 『100의 배수』가 아닐 때, 『400의 배수』일 때도 마찬가지로 나머지 연산자 『%』를 사용한다. 
		// if ~ else문을 사용해 조건식을 만들어 주는데, 
		// 두 가지 조건을 모두 만족해야 하므로 (4의 배수 이고, 100의 배수가 아닐 때) 논리AND연산자 『&&』를,
		// 두 가지 조건 중 하나를 만족해야 하는 ((4의 배수 이고, 100의 배수가 아닐때) or (400의 배수)) 논리OR연산자 『||』를 사용한다. 

		if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0)
		{
			moon = "윤년";
		}
		else 
		{
			moon = "평년";
		}
		
		// printf로 형식에 맞추어 출력하겠다. 
		System.out.printf("%d → %s\n", n, moon);

	}
}

// 실행 결과
/*
임의의 연도 입력 : 2000
2000 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2012
2012 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2018
2018 → 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2019
2019 → 평년
계속하려면 아무 키나 누르십시오 . . .
*/
