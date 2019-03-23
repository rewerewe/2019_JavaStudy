package test20190315;
/*======================================
 ■■■ 자바의 기본 입출력 (I/O) ■■■ 
=======================================*/

// Reader 실습 

// Test166과 비교해서 보기-!!!

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test168
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in		 : 자바의 표준 입력 스트림 → 바이트 기반 스트림 
		// new InputStreamReader(System.in);
		// System.in.read()는? → 바이트 기반 스트림

		// InputStreamReader : 바이트 기반 스트림을 문자 기반 스트림으로 변환
		//					   (변환기, 번역기, 역할 수행)
		// Reader			 : 문자 기반 스트림 객체 
		// Reader rd = System.in; (Ⅹ)
		Reader rd = new InputStreamReader(System.in);


		System.out.println("문자열 입력(종료:Ctrl+z)");
	

		// read() : InputStream 클래스의 대표적 메소드 (→ 바이트 스트림)
		while (   (data = rd.read()  )  != -1)
		{
			ch = (char)data;
			
			// print() : 문자 스트림 
			System.out.print(ch);	//--==>> 정상작동됨 
			/*	 
				문자열 입력(종료:Ctrl+z)
				abcd
				abcd
				1234
				1234
				가나다라
				가나다라
				^Z
				계속하려면 아무 키나 누르십시오 . . .
			*/



			// write() : OuputStream 클래스의 대표적 메소드 (→ 바이트 스트림)
			// System.out.write(ch);		//--==>> 한글 깨짐 
			/* 
				문자열 입력(종료:Ctrl+z)
				abcd
				abcd
				1234
				1234
				가나다라
				 ??|
				^Z
				계속하려면 아무 키나 누르십시오 . . .
			*/
		}
	}
}