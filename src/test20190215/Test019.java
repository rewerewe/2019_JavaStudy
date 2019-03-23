package test20190215;
/*========================================
 ■■■ 자바의 기본 프로그램 ■■■
 - 자바의 기본 입출력 : java.util.Scanner					// java package에 들어있는 Scanner 라는 설계도
=========================================*/

// ※ java.util.Scanner 
//	  단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	  디폴트(default)로 사용되는 단락 문자는 공백이다.
//	  작성된 다음 토큰은 『next()』 메소드를 사용하여		// throws IOException 을 작성하지 않아도 거부반응 없음.
//	  다른 형태의 값으로 변환할 수 있다. 

import java.util.Scanner;

public class Test019
{
	public static void main(String[] arge)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);


		// ○ 주요 변수 선언
		String name;
		int kor, eng, mat, tot;


		// ○ 연산 및 처리
		System.out.print("이름, 국어, 영어, 수학 입력(『,』 구분) : ");
		//-- 이재준,90,80,70

		// sc = new Scanner(sc.next()).useDelimiter("문자열과문자열사이의,");
		// sc = new Scanner(sc.next()).useDelimiter("\\s* 과 \\s* 사이의,");		\\s*:임의의 문자열 
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				 --------	             ------------						
		//			 이재준,90,80,70			임의의 문자열과 문자열을 
		//										사용자 정의 구분자를 통해 분할

		// 대상.메소드명();

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// 총점 산출
		tot = kor + eng + mat;


		// ○ 결과 출력 
		System.out.println();
		System.out.printf("이름 : %s\n", name);
		System.out.printf("총점 : %d\n", tot);
	}

}

// 실행 결과
/*
이름, 국어, 영어, 수학 입력(『,』 구분) : 정임혜,80,70,80

이름 : 정임혜
총점 : 230
계속하려면 아무 키나 누르십시오 . . .
*/

