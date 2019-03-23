
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class Test139002
{
	public static void main(String[] args) throws IOException
	{
		// 내가 풀이한 내용 
		// Calendar 인스턴스 생성
		Calendar cal = Calendar.getInstance();
		
		
		// 오늘 요일, 몇일 후 변수 선언
		String w;
		int adays;

		// 요일 배열 생성
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"}; 
		
		w = week[(cal.get(Calendar.DAY_OF_WEEK)-1)];

		// 오늘날짜 출력
		System.out.println("오늘 날짜 : " + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE) + " " + w);
		
		
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		adays = Integer.parseInt(br.readLine());

		cal.add(Calendar.DATE, adays);

		
		System.out.printf("%d 후  : " , adays);  
		System.out.println(cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DATE) + " " + w);
		
		

	}
}