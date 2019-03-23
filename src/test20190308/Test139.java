package test20190308;
/*=====================================
 ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스 
======================================*/

/*
 ○ 실습 문제
 	오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
	확인하여 결과를 출력하는 프로그램을 구현한다.
	단, Calendar 클래스를 활용하여 처리한다.

	실행 예)
	오늘 날짜 : 2019-3-8 금요일
	몇 일 후의 날짜를 확인하고자 하십니까? : 200

	=========[확인결과]===========
	200일 후 : 2019-xx-xx x요일
	==============================
	계속하려면 아무키나 누르세요...
*/

import java.util.Scanner;
import java.util.Calendar;

public class Test139
{
	public static void main(String[] args) 
	{
		// 함께 풀이한 내용 
		Scanner sc = new Scanner(System.in);

		// Calendar 클래스 인스턴스 생성
		Calendar now = Calendar.getInstance();

		// 주요 변수 선언
		int nalsu;			//-- 사용자로부터 입력받은 날수 
		int y, m, d, w;		//-- 연, 월, 일, 요일
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		// 현재의 연, 월, 일, 요일 확인(가져오기 : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH);
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		// 현재의 연, 월, 일, 요일 확인결과 출력
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " "  + week[w-1] + "요일");

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu < 1);

		// 날 수 더하기 연산
		now.add(Calendar.DATE, nalsu);

		// 결과 출력
		System.out.println();
		System.out.println("=========[확인결과]===========");
		System.out.printf("%d 후 : %tF %tA\n", nalsu, now, now);
		// %d 
		// %t : 날짜타입(시간타입)을 담는 옵션 문자. DATE 타입이어야 함. 
		// %t + 대문자 F A → String 의 System.out.format 에서도 사용할 수 있음. 
		// 추가로 찾아보고 살을 붙여서 필기로 정리해둘 것. 
		System.out.println("==============================");



	}
}
// 실행 결과
/*
오늘 날짜 : 2019-2-8 금요일
몇 일 후의 날짜를 확인하고자 하십니까? : 200

=========[확인결과]===========
200 후 : 2019-09-24 화요일
==============================
계속하려면 아무 키나 누르십시오 . . .

*/