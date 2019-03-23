
/*
 ○ 실습 문제 
 	사용자로부터 연, 월을 입력받아 
	해당 연 월을 달력을 그려주는(출력하는) 프로그램을 구현한다.
	단, Caledar 클래스를 활용하여 작성할 수 있도록 한다.

	실행 예)
	연도 입력 : 0
	연도 입력 : 2019
	월 입력 : -2 
	월 입력 : 16
	월 입력 : 7 

		  [ 2019년 7월 ]

	일  월  화  수  목  금  토
	===========================
	  	 1	 2	 3	 4	 5	 6
	 7	 8	 9	10	11	12	13
	14	15	16	17	18	19	20
	21	22	23	24	25	26	27
	28	29	30	31 
	===========================
	계속하려면 아무키나 누르세요...
	
*/

public class Test138002
{
	public static void main(String[] args)
	{

// 내가 풀이한 내용 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class Test138
{

	public static void main(String[] args) throws IOException
	{
		Test138 ob = new Test138();
		Calendar obCal = Calendar.getInstance();
		
		int y;
		int m;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
			
		}
		while (y<=0);

		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<=0 || m>12);

		
		// 확인
		// System.out.println(y);
		// System.out.println(m);

		//---------------------------------------------------------- 유효한 연, 월 확인
		
		// 입력받은 날로 set → 그 날의 요일 찾기 : set 할때 월에는 -1
		obCal.set(y, m-1, 1);
		
		//확인
		// System.out.print(obCal.get(Calendar.DAY_OF_WEEK));
		// 6 → 금요일
		// 입력한 달의 
		// System.out.println("막일 : " + obCal.getActualMaximum(Calendar.DAY_OF_MONTH));
		// 31 → 31
		
		// String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		

		
		// 확인
		System.out.println("요일 : " + obCal.get(Calendar.DAY_OF_WEEK));
		System.out.println("배열요일 :" + week[obCal.get(Calendar.DAY_OF_WEEK)-1]);

		System.out.println("설정한 달의 일자 : " + obCal.get(Calendar.DATE));

		// for (int i=1; obCal.getActualMaximun(Calendar.DAY_OF_WEEK); )
		// {
		// }

		// 출력
		// System.out.println();
		// System.out.print("	[" + obCal.get(Calendar.YEAR) + "년 " + obCal.get(Calendar.MONTH) + "월]	"); 
		

		
		
	}
}
	}
}