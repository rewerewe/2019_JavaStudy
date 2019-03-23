/*===========================
 ■■■ 만년 달력 ■■■	
=============================*/

/*
	실행 예)
	『연도』를 입력하세요 : 2019
	『월』을 입력하세요   : 7 
	
	       [ 2019년 7월 ]

	일  월  화  수  목  금  토
	===========================
	  	 1	 2	 3	 4	 5	 6
	 7	 8	 9	10	11	12	13
	14	15	16	17	18	19	20
	21	22	23	24	25	26	27
	28	29	30	31 
	===========================

입력받은 연도의 1일이 무슨 요일인지 알아야 함.

*/

// 함께 풀이한 내용 
// → 내가 풀이한 내용은 Test100002.java

/*
	 ※ 문제 인식 및 분석

	 - 서기 1년 1월 1일 : 월요일

	 - 연도가 4의 배수이면서 100의 배수가 아니거나,
	   400의 배수이면 2월 29(윤년),
	   나머지 2월은 28일(평년)
	 
	 - 2019년 7월 달력을 그린다고 가정하면
	   1. 1. 1 ~ 2019. 6. 30 까지의 전체 날 수를 구한다. 
	   그 날 수에 +1 연산을 수행하면.... (2019년 7월 1일의 요일 확인)
	 
	 - 요일 = 전체날수%7 
	   요일 = 0 → 일요일
	   		  1 → 월요일 
			  :
	   
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test100
{

	public static void main(String[] args) throws IOException
	{
		// BufferedReader클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 배열 선언 및 초기화 
		// 각 달이 담고 있는 마지막 날짜(매 월의 최대 날짜)
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 확인 
		// System.out.println(days.length); //--==>> 12

		// 주요 변수 선언
		int nalsu, y, m, w;			//-- 날수, 년, 월, 요일
		
		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
				do
		{
			System.out.print("『월』를 입력하세요   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		//------------------------------------------------여기까지 수행하면 유효한 년도, 월 입력한 상태~!!!

		// 입력받은 년도에 해당하는 2월의 마지막날 계산
		if ((y%4==0 && y%100!=0) || (y%400==0))			//-- 윤년이라면...
		{
			days[1] = 29;
		}
		else											//--평년이라면....
		{
			days[1] = 28; 
		}

		//-- else 구문은 
		//		현재 days[1]가 28로 입력되어 있는 상태이기 때문에
		//		생략이 가능한 구문이 된다.

		// 1년 1월 1일 ~ 입력받은년도 이전년도의 12월 31일까지의
		// 날 수 계산
		nalsu = (y-1) * 365 + (y-1)/4  - (y-1)/100 + (y-1)/400;

		// 입력받은년도(해당년도)의 1월 1일 ~ 입력한 월의 이전 월 까지의
		// 날수 누적 계산 
		for (int i=0; i<(m-1); i++)
		{
			nalsu += days[i];
		}
		
		// 입력받은 월의 1일
		nalsu += 1;				//++nalsu;

		// 확인
		// System.out.println(nalsu);
		//-- 2019년 3월 기준 --==>> 737119

		//---------------------------------------------------여기까지 수행하면 모든 날 수에 대한 종합 완료.

		// 요일 산출 
		//-- 입력 받은 월의 1일이 무슨 요일인지 확인하기 위한 연산
		w = nalsu%7;
		
		// 확인 
		// System.out.println(w);
		//--==>> 5 → 2019년 3월 → 월요일
		//-- 2019년 7월 기준

		// 출력(달력 그리기)
		System.out.println();
		System.out.println("\t[ " + y + "년" + m + "월 ]");
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");
		
		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		// 1일이 월요일일 경우 반복문 수행 
		for (int i=1; i<=w; i++)											// (예시를 들어보자) w = 0~6 까지 수행된다.  
			System.out.print("    ");		// 네 칸 공백
																			//					 현재 : 5, i : 1 ~ 5, 
																			//                   현재 : 1, i : 1 

		// 확인 
		// System.out.printf("%4d", 1);

		// 해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		// days 배열의 인덱스 때문에 m-1
		for (int i=1; i<=days[m-1]; i++)									// (예시를 들어보자) 월별 일수[입력 받은 달-1]
		{
			System.out.printf("%4d", i);
			w++;			//-- 날짜가 증가하는 만큼 
							//   요일도 함께 증가할 수 있도록 처리 

			if (w%7==0)		//일요일, 마다  
			{	
				System.out.println(); //
			}
		}
		
		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		// 이미 일요일 개행이 이루어젺디 때문에
		// 이 경우에는 추가 개행을 하지 않도록 처리

		if (w%7!=0)
			System.out.println();

		System.out.println("============================");
		
	}
}
// 실행결과
/*
『연도』를 입력하세요 : 2019
『월』를 입력하세요   : 8

        [ 2019년8월 ]

  일  월  화  수  목  금  토
============================
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31
============================
계속하려면 아무 키나 누르십시오 . . .
*/