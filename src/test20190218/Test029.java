package test20190218;
/*=======================================
 ■■■ 연산자 (Operator) ■■■
 - 삼항 연산자 == 조건 연산자 
=========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가... 윤년인지, 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader 의 readLine()을 활용하고
// 연산은 조건 연산자를 활용할 수 있도록 한다.repglfd';;'fd;'pegdgfdfsdfds

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나...

// 임의의 연도 입력 : 2011
// 2011년 → 평년
// 계속하려면 아무 키나...

// ※ 윤년의 판별 조건												//	※ 일정관리(달력, 스케쥴) 어플리케이션에 꼭 필요함. 
// 연도가 4의 배수이면서 100의 배수가 아니거나						//	날짜 컨트롤 하기 위해서는 알아야 하는 계산법. 
// 400의 배수이면 윤년-!											//	4년에 한번씩은 윤년이 온다. 
// 그렇지 않으면 평년-!												//	100년에 한번씩은 윤년이 없다.
																	//	(그렇지만 모자라서) 400년에 한번씩은 윤년이 온다. 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
	/* 함께 풀이한 내용

	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

	int year;
	String strResult;

	System.out.print("임의의 연도 입력 : ");
	year = Integer.parsInt(br.readLine());

	(year % 4 == 0 && year % 100 == 0 || year % 400 == 0) ? "윤년" : "평년";

	System.out.printf("%d년 → %s\n", year, strResult); */




	// BufferedReader 인스턴스 생성
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

	// 주요 변수 선언
	int n;
	String strResult;


	// 연산 및 처리
	// 1) 사용자로부터 데이터를 입력 받는다.
	System.out.print("임의의 연도 입력 : ");
	n = Integer.parseInt(br.readLine());

	// 2) 입력받은 데이터가 윤년인지, 평년인지 판별한다.

	strResult = (n % 4 == 0) ? "윤년" : "평년";
	
	// 결과 출력 
	System.out.println(n + " → " + strResult);	


	}

}

// 실행 결과 
/*

임의의 연도 입력 : 2000
2000 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2011
2011 → 평년
계속하려면 아무 키나 누르십시오 . . .

*/
