package test20190226;
/*=============================== 
 ■■■ 클래스와 인스턴스 ■■■
 - 클래스 설계
 - 배열 활용
================================*/

/*
	○ 실습문제 
	아래의 클래스(WeekDay)를 완성한다.
	사용자로부터 년, 월, 일을 입력받아
	해당 날짜의 요일을 출력하는 프로그램을 구현한다.

	단, 달력 클래스(Calendar)는 사용하지 않는다.
	또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
	그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
*/

// 실행 예)
// 년 월 일 입력(공백 구분) : 2019 2 26

// >> 2019년 2월 26일 → 화요일
// 계속하려면 아무키나 누르세요...

// ※ 문제 인식 및 분석
//    - 윤년(366일) 및 평년(365일)의 개념 적용
//    - 1년 1월 1일 → 월요일


// 

import java.util.Scanner;

class WeekDay_2
{
	// 주요 변수 선언(속성 구성)
	private int y, m, d;		//-- 사용자가 입력한 년, 월, 일을 담을 변수 

	// 메소드 정의(입력 받기)
	void input()
	{
		
		// 안내 메시지 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();

	}

	// 메소드 정의(요일 산출하기)
	//String week()
	Integer week()
	{
		// 전체 일수, 루프 변수, 요일 변수 선언 
		int daySum, i, w;
		
		// 직전 연도까지의 일수 구하기
		// 365일 * 직전 연도 + 윤년의 수
		// 윤년 = 4의 배수이면서 100의 배수가 아니거나 400의 배수
		// (y-1)/4 (y-1)/100 (y-1)/400
		// daySum = 365 * 직전 연도 + 윤년 
		daySum = 365;

		return daySum ;	
	}

	// 메소드 정의(결과 출력하기)
	void print(Integer day)
	{
		
	}

}

public class Test091_2
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();

		wd.input();						//-- 입력 메소드 호출 
		
		// String result = wd.week();		//-- 요일 산출 메소드 호출
		
		// wd.print(result);			//-- 결과 출력 메소드 호출 
	}
}		
	