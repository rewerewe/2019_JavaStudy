/*==========================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - switch문 실습
===========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연상의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch문을 활용하여 처리할 수 있도록 하며
// 연산 결과는 편의상 정수 형태로 처리하도록 한다.

// 실행 예)
// 첫 번째 정수 입력    : 10
// 두 번째 정수 입력    : 28
// 연산자 입력(+ - * /) : +

// >> 10 + 28 = 38
// 계속하려면 아무 키나 누르세요.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("첫 번째 정수 입력    : ");
	int num1 = Integer.parseInt(br.readLine());

	System.out.print("두 번째 정수 입력    : ");
	int num2 = Integer.parseInt(br.readLine());
	
	// System.in.read() : 아스키코드 값을 읽어오므로, 형 변환 해준다. 
	System.out.print("연산자 입력(+ - * /) : ");
	char cal = (char)System.in.read();
	
	// 함께 풀이한 내용
	int result;
	
	switch(cal)
	{
		// swtitch문의 『정수』 부분에는 byte, short, int, long 만 들어가지만, JDK 버전이 업그레인되면서 char 쓸 수 있게 됨. 
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = num1 / num2; break;
		default : return;						//--메소드 종료 → main() 메소드 종료 → 프로그램 종료
												//-- return문 은 1) 값의 반환 2) 메소드 종료를 의미한다. 
												
	}

	// ※ 『』 : 1. 값의 반환
	//			 2. 메소드 종료 
	
	System.out.println();
	System.out.printf(">> %d %c %d = %d\n", num1, cal, num2, result); 



	// 내가 풀이한 내용
	/*

	// 연산자별 아스키코드 : + 43 
	//						 - 45 
	//						 * 42
	//						 / 47

	// 아스키코드 값으로 case 지정 
	switch (cal)
	{
		case 43 : System.out.printf(">> %d + %d = %d\n", num1, num2, (num1 + num2)); break;
		case 45 : System.out.printf(">> %d - %d = %d\n", num1, num2, (num1 - num2)); break;
		case 42 : System.out.printf(">> %d * %d = %d\n", num1, num2, (num1 * num2)); break;
		case 47 : System.out.printf(">> %d / %d = %d\n", num1, num2, (num1 / num2)); break;
	}
    

	// 부호로 case 지정 
	/*
	switch (cal)
	{
		case '+' : System.out.printf(">> %d + %d = %d\n", num1, num2, (num1 + num2)); break;
		case '-' : System.out.printf(">> %d - %d = %d\n", num1, num2, (num1 - num2)); break;
		case '*' : System.out.printf(">> %d * %d = %d\n", num1, num2, (num1 * num2)); break;
		case '/' : System.out.printf(">> %d / %d = %d\n", num1, num2, (num1 / num2)); break;
	}
	
	*/
	

	}
}


// 실행 결과
/*
첫 번째 정수 입력    : 10
두 번째 정수 입력    : 90
연산자 입력(+ - * /) : +

>> 10 + 90 = 100
계속하려면 아무 키나 누르십시오 . . .
*/
