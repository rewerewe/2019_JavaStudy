package test20190218_33_38_39;


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

public class Test038_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("알파벳 한 문자 입력 : ");
		System.out.println(System.in.read());
		char alpah = (char)System.in.read();
		if ((alpah > 64 && alpah < 91) || (alpah > 96 && alpah < 123))
		{
			if(alpah == 'a' || alpah == 'e' || alpah == 'i' || alpah == 'o' || alpah == 'u' 
				|| alpah == 'A' || alpah == 'E' || alpah == 'I' || alpah == 'O' || alpah == 'U') {
				System.out.println("모음 OK-!");
			} else {
				System.out.println("자음 OK-!");
			}
		} else {
			System.out.println("알파벳이 아닙니다.");
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

알파벳 한 문자 입력 : k
자음 OK-!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : ㅁ
입력 오류-!
계속하려면 아무 키나 누르십시오 . . .
*/

