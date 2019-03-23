package test20190308;
/*=====================================
 ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스 
======================================*/

/*
 
 ※ Calendar 클래스는 추상클래스이기 때문에 객체를 생성할 수 없다.
 (추상 클래스 : 미완성된 클래스)
 	
 즉, 『Calendar ob = new Calendar();』 → 이와 같은 구문을 통해 인스턴스 생성 불가

 ○ Calendar 클래스 객체(인스턴스)를 생성할 수 있는 방법
	
	1. Calendar ob1 = Calendar.getInstance();				//-- getInstance 메소드. 정적 Static 메소드로 객체를 만듦.

	2. Calendar ob2 = new GregorianCalendar();				//-- 업 캐스팅으로 Calendar 클래스의 메소드를 재정의 하여 사용하고 있는 것임. 
																 하위클래스 GregorianCalendar 가 오버라이딩하여 완성시킴 
	3. GregorianCalendar ob3 = new GregorianCalendar();		//-- 직접 인스턴스 생성 

	(※ GregorianCalendar : Calendar 클래스의 하위(자식) 클래스)
    calendar는 import java.util.Calendar에 있다. 	
*/

// 년, 월, 일, 요일을 Calendar 클래스로부터 가져와 출력 
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test137
{
	public static void main(String[] args)
	{
		// Calendar 클래스 인스턴스 생성
		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해 
		// 날짜 관련 정보를 얻어낼 수 있는 메소드 → get()
		int y = rightNow.get(Calendar.YEAR);
		int m = rightNow.get(Calendar.MONTH)+1;	 //-- 배열에 월별 정보가 들어있는 개념이라, get()할 때는 +1, set()할때는 -1 해주어야 함.  
		int d = rightNow.get(Calendar.DATE);
		int w = rightNow.get(Calendar.DAY_OF_WEEK);

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>> 2019-3-7 5

		//테스트
		/*
		System.out.println(Calendar.SUNDAY);		//--==>> 1
		System.out.println(Calendar.MONDAY);		//--==>> 2
		System.out.println(Calendar.TUESDAY);		//--==>> 3
		System.out.println(Calendar.WEDNESDAY);		//--==>> 4
		System.out.println(Calendar.THURSDAY);		//--==>> 5
		System.out.println(Calendar.FRIDAY);		//--==>> 6
		System.out.println(Calendar.SATURDAY);		//--==>> 7 
		*/
		
		String week = "";
		switch (w)
		{
			// case 1 : week="일요일"; break;
			case Calendar.SUNDAY : week="일요일"; break;
			// case 2 : week="월요일"; break;
			case Calendar.MONDAY : week="월요일"; break;
			// case 3 : week="화요일"; break;
			case Calendar.TUESDAY :week="화요일"; break;
			// case 4 : week="수요일"; break;
			case Calendar.WEDNESDAY :week="수요일"; break;
			// case 5 : week="목요일"; break;
			case Calendar.THURSDAY :week="목요일"; break;
			// case 6 : week="금요일"; break;
			case Calendar.FRIDAY :week="금요일"; break;
			// case 7 : week="토요일"; break;
			case Calendar.SATURDAY :week="토요일"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--==>> 2019-3-7 목요일

		///////////////////////////////////////////////////////////////////////


		// Caledar 클래스 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		// 달력의 날짜 세팅 → 『set()』 메소드 활용 
		rightNow2.set(2019, 6, 18);			//--7월 check!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 5 → 목요일
		
		// 출력
		System.out.print(rightNow2.get(Calendar.YEAR) + "-" + rightNow2.get(Calendar.MONTH) + "-" + rightNow2.get(Calendar.DATE) + " ");
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]); //-- 『-1』 check!!
		//--==>> 2019-6-18 목요일


		///////////////////////////////////////////////////////////////////////

		System.out.println();
		
		GregorianCalendar hbd = new GregorianCalendar();
		
		hbd.set(1987, 1, 3);
		
		System.out.println(hbd.get(Calendar.DAY_OF_WEEK));
		//--==>> 3 → 화요일
		
		//출력
		System.out.print(hbd.get(Calendar.YEAR) + "-" + hbd.get(Calendar.MONTH) + "-" + hbd.get(Calendar.DATE) + " ");
		System.out.println(week2[hbd.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 1987-1-3 화요일

		



		

	}
}