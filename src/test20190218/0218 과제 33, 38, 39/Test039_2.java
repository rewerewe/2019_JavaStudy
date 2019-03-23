

// ○ 과제 (2019-02-18)
// 사용자로부터 알파벳 한 문자를 입력받아서 이를 판별하여
// 소문자를 입력받았을 경우... 대문자로 변환하고
// 대문자를 입력받았을 경우... 소문자로 변환하는
// 프로그램을 구현한다.
// 단, 입력은 『System.in.read()』 메소드를 활용할 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> a
// 계속하려면 아무키나 누르세요... 

// 알파벳 한 문자 입력 : c
// >> C
// 계속하려면 아무키나 누르세요... 

// 알파벳 한 문자 입력 : 6
// >> 입력 오류-! 
// 계속하려면 아무키나 누르세요... 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
		System.out.print("알파벳 한 문자 입력 : ");
		char alpah = (char)System.in.read();

		// 사용자 입력값이 대문자 일 때, 
		if (alpah >= 65 && alpah <= 90)
		{
			// 아스키코드에서 대문자는 소문자보다 먼저 등장한다...
			// 대문자의 아스키 코드는 65 ~ 90
			// 소문자의 아스키 코드는 97 ~ 122
			// ex) a인 경우 ASCII = 65
			// ex) A인 경우 ASCII = 97
			// A - a = 97 - 65 = 32
			// 동일한 알파벳을 입력했을때 대소문자의 수치 차이는 32!
			// 대문자 < 소문자이므로 대문자인 경우 32를 더하고, 소문자인 경우 32를 빼면된다!
			// 복합 대입 연산자 사용 +=: a를 b만큼 더해준다. 
			System.out.println(">> " + (alpah += 32));
		}
		else if (alpah >= 97 && alpah <= 122)
		{		
			// 복합 대입 연산자 사용 -=: a를 b만큼 빼준다. 
			System.out.println(">> " + (alpah -= 32));
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
알파벳 한 문자 입력 : a
>> A
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : A
>> a
계속하려면 아무 키나 누르십시오 . . .
*/