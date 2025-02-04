package test20190307;
/*=====================================
 ■■■ 자바의 주요(중요) 클래스 ■■■
  - StringTokenizer 클래스 (중요도 낮음) 
======================================*/

/*
 ○ StringTokenizer 클래스는 
	문자열 파싱(parsing)을 위한  정보를 제공하는 클래스로
	파싱(parsing) 하고자 하는 문자열을 인자로 받아 생성하는데, 
	여기에서 파싱(parsing)이란 하나의 문자열을 여러 문자열로 
	나누는 작업을 의미하게 되며, 이 때 나누는 단위가 되는 문자열을 
	토큰(token)이라고 한다.
	
	StringTokenizer 클래스를 사용하기 위해서는
	java.util 패키지의 StringTokenizer를 import 해야 한다.

	StringTokenizer 클래스는 호환성을 유지하는 목적으로 (== 안쓴다, 쓰지 말아라의 개념)
	보관 유지되고 있으며 문자열을 파싱(parsing)하기 위해서는
	String 클래스의 split() 메소드나 java.util.regex 패키지를 
					--------------   ----------------
	사용할 것을 권장하고 있다.

 ○ 생성자
 	- 원형 
	  StringTokenizer(String str)
	  StringTokenizer(String str, String delim)
	  StringTokenizer(String ste, String delim, boolean returnDelims)
	  → 주어진 문자열 str을 단어로 분리하는 객체를 생성하며
	  	 공백(구분) 문자는 delim에 포함된 문자로 처리하게 된다.
		 만약 returnDelims 가 true라면.. 공백(구분) 문자도 
		 분리된 유효환 데이터로 간주한다.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test135
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("파싱할 문자열 입력(컴마구분) : ");
		strTemp = br.readLine();
		//-- "사과, 딸기, 바나나, 복숭아"

		// StringTokenizer 클래스 인스턴스 생성
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//-- strTemp 를 대상 문자열로...
		//	 『,』 를 구분자로....

		// 확인
		st.countTokens();
		System.out.println(st.countTokens());		//--==>> 4
		//-- 『int countTokens()』
		//	 : 파싱된 문자열의 갯수를 리턴(반환) 한다. 
		//-- 정수 형태로 파싱된 문자열을 구분?


		strArr = new String[st.countTokens()];
		//-- 배열방의 갯수를 토큰 분할된 갯수만큼 구성한다. 

		n=0;

		while (st.hasMoreTokens())
			strArr[n++] = st.nextToken();
		//--『hasMoreTokens()』
		//	  : 사용할 수 있는 토큰이 남아있는 경우 true 를 반환
		//		더 이상 사용할 토큰이 남아있지 않은 경우 false 반환.
		//		확인 결과만 반환할 뿐... 헤드를 이동시키지는 ?榜쨈?.

		//-- 『nextToken()』
		//	  : 다음 토큰을 얻어온다.
		//		다음 토큰을 얻어오며 헤드를 이동시키게 된다.
		//		만약 구분자를 바꾸었을 경우 다음 호출에도
		//		바뀐 구분자를 이요하여 토큰을 분리한다.

		System.out.print("파싱된 토큰(문자열) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
	}
}

//실행결과
/*
파싱할 문자열 입력(컴마구분) :  사과,딸기,바나나,포도,복숭아,수박,파인애플
7
파싱된 토큰(문자열) :  사과 딸기 바나나 포도 복숭아 수박 파인애플
계속하려면 아무 키나 누르십시오 . . .
*/