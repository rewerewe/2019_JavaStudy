package test0218_2;
/*===============================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - if ~ else문 실습 
================================================*/

// ○ 과제 (2019-02-18)
// 사용자로부터 알파벳 한 문자를 입력받아
// 이를 판별하여 입력받은 알파벳이 모음일 경우만
// 결과를 출력하는 프로그램을 구현한다.
// 단, 대소문자를 모두 적용할 수 있도록 처리한다.
// 또한, 알파벳 이외의 문자가 입력되었을 경우
// 입력 오류에 대한 내용을 사용자에게 안내할 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> 모음 OK-!
// >> 계속하려면 아무키나 누르세요...

// 알파벳 한 문자 입력 : e
// >> 모음 OK-!
// >> 계속하려면 아무키나 누르세요...

// 알파벳 한 문자 입력 : B
// >> 자음 Ok-!
// >> 계속하려면 아무키나 누르세요...

// 알파벳 한 문자 입력 : 1
// >> 입력 오류-!
// >> 계속하려면 아무키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		// 주요 변수 선언 및 연산 처리 

		System.out.print("알파벳 한 문자 입력 : ");
		// 한 문장이 아닌 한 문자를 읽어와야 하므로 alpah = br.readLine(); 적용 안됨. 
		// System.in.read()은 아스키 값을 읽어 온다.
		// 강제 형 변환
		char alpah = (char)System.in.read();
		
		// 알파벳 중 모음일 경우에, '모음 OK' 출력
		// 알파벳 아스키 값 : 대문자 65 ~ 90 / 소문자 97 ~ 122
		// 모음 아스키 값 
		// A : 65 
		// I : 73
		// U : 85
		// E : 69
		// O : 79
		// 
		// a : 97
		// i : 105 
		// u : 117
		// e : 101
		// o : 111
		
		// 알파벳 아스키 값 범위 
		if (alpah >= 65 && alpah < 122)
		{
			// 알파벳 모음 아스키 값일 경우만 
			// 경우 ①
			 if (alpah == 65 || alpah == 73 || alpah == 85 || alpah == 69 || alpah == 79 
				 || alpah == 97 || alpah == 105 || alpah == 117 || alpah == 101 || alpah == 111)
			
			// 경우 ②
			// if (alpah == 'a' || alpah == 'e' || alpah == 'i' || alpah == 'o' || alpah == 'u' 
			//	|| alpah == 'A' || alpah == 'E' || alpah == 'I' || alpah == 'O' || alpah == 'U')
			{
				System.out.println("모음 OK-!");
			}
			// 알파벳 모음 외에 
			else 
			{
				System.out.print("");
			}
		}
		else 
		{
			// 알파벳이 아닌 경우 
			System.out.println("입력 오류-!");
		}
		
	}
}

// 실행 결과
/*
알파벳 한 문자 입력 : A
모음 OK-!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : a
모음 OK-!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : w
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : ㅁ
입력 오류-!
계속하려면 아무 키나 누르십시오 . . .
*/

