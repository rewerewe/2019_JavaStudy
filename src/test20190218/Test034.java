/*
 실행 흐름의 컨트롤(제어문)
 - if ~ else 실습 
 */

 // 실습 문제
 // 임의의 두 정수와 연산자를 입력받아 
 // 해당 연산자의 처리 결과를 출력하는 프로그램을 작성한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력	: 10
// 두 번째 정수 입력	: 14
// 연산자 입력(+ - * /) : +

// >> 10 + 14 = 24
// 계속하려면 아무키나....

// ---------------------------------
// 첫 번째 정수 입력	: 5
// 두 번째 정수 입력	: 3
// 연산자 입력(+ - * /) : /

// >> 5 / 3 = 1
// 계속하려면 아무키나....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034 
{
	public static void main(String[] args) throws IOException
	{
	// 방식 ③
	/*
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	int a, b, result = 0;
	char op;

	System.out.print("첫 번째 정수 입력 : ");
	a = Integer.parseInt(br.readLine());

	System.out.print("두 번째 정수 입력 : ");
	b = Integer.parseInt(br.readLine());
	
	System.out.print("연산자 입력(+ - * /) : ");		
	op = (char)System.in.read();					//-- 자동 형 변화 규칙에 어긋나기 때문에 명시해주어야 함. 
	

	if (op == '+')
	{
		result = a + b;
	}
	else if (op == '-')
	{
		result = a - b;
	}
	else if (op == '*')
	{		
		result = a * b;
	}
	else if (op == '/')
	{
		result = a / b;
	}

	System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);

	*/

	// 방식 ① 	
	/*

	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	int a, b;
	char op;
	int temp;

	System.out.print("첫 번째 정수 입력 : ");
	a = Integer.parseInt(br.readLine());

	System.out.print("두 번째 정수 입력 : ");
	b = Integer.parseInt(br.readLine());
	
	System.out.print("연산자 입력(+ - * /) : ");
	// op = Integer.parseInt(br.readLine());
	// op = br.readLine(); -- String op 여야 함. 
	// temp = (char)System.in.read();		
	op = (char)System.in.read();					//-- 자동 형 변화 규칙에 어긋나기 때문에 명시해주어야 함. 
	
	// '1234' → Integer.parseInt(); → 1234
	// 'ABCD' → Integer.parseInt(); → (x)

	if (op == '+')
	{
		System.out.printf("\n>> %d + %d = %d", a, b, (a + b));
	}
	else if (op == '-')
	{
		System.out.printf("\n>> %d - %d = %d", a, b, (a - b));
	}
	else if (op == '*')
	{
		System.out.printf("\n>> %d * %d = %d", a, b, (a * b));
	}
	else if (op == '/')
	{
		System.out.printf("\n>> %d / %d = %d", a, b, (a / b));
	}
	else 
	{
		System.out.print("입력 과정에 오류가 존재합니다.");
	}

	*/

	// 방식 ②
	

	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	int a, b, op; 

	System.out.print("첫 번째 정수 입력 : ");
	a = Integer.parseInt(br.readLine());

	System.out.print("두 번째 정수 입력 : ");
	b = Integer.parseInt(br.readLine());

	System.out.print("연산자 입력(+ - * /) : ");
	op = System.in.read();
	
	// 테스트(확인)
	System.out.prinln("op : " + op);
	//-- + → op : 43
	//   - → op : 45
	//   * → op : 42
	//   / → op : 47

	if (op == 43)	// +
	{
		System.out.printf("\n>> %d + %d = %d", a, b, (a + b));
	}
	else if (op == 45)	// - 
	{
		System.out.printf("\n>> %d - %d = %d", a, b, (a - b));
	} 
	else if (op == 42)	// *
	{
		System.out.printf("\n>> %d * %d = %d", a, b, (a * b));
	}
	else if (op == 47)	// / 
	{
		System.out.printf("\n>> %d / %d = %d", a, b, (a / b));
	}
	else 
	{
		System.out.print("입력 과정에 오류가 존재합니다.");
	}






	// 내가 풀이한 내용 ②
	
	/* 
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	int nNum1, nNum2;
	int nTot = 0;
	char cal;


	System.out.print("첫 번째 정수 입력 : ");
	nNum1 = Integer.parseInt(br.readLine());

	System.out.print("두 번째 정수 입력 : ");
	nNum2 = Integer.parseInt(br.readLine());

	System.out.print("연산자 입력(+ - * /) :");
	cal = (char)System.in.read();

	if (cal == 43)
	{
		nTot = nNum1 + nNum2;
	}
	else if (cal == 45)
	{
		nTot = nNum1 - nNum2;
	}
	else if (cal == 42)
	{
		nTot = nNum1 * nNum2;
	}
	else if (cal == 47)
	{
		nTot = nNum1 / nNum2;
	}
	*/



	/* 내가 풀이한 내용 ①

	if (cal == '+')
	{
		cal2 = nNum1 + nNum2;
	}
	else if (cal == '-')
	{
		cal2 = nNum1 - nNum2;
	}
	else if (cal == '*')
	{
		cal2 = nNum1 * nNum2;
	}
	else if (cal == '/')
	{
		cal2 = nNum1 / nNum2;
	}
	

	System.out.println();
	System.out.printf("%d %c %d = %d\n", nNum1, cal, nNum2, nTot);

	*/

	}
}

// 실행 결과

/* 방식 ②

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 14
연산자 입력(+ - * /) : +

>> 10 + 14 = 24
계속하려면 아무 키나 누르십시오 . . .

--------------------------------------

첫 번째 정수 입력 : 5
두 번째 정수 입력 : 3
연산자 입력(+ - * /) : /

>> 5 / 3 = 1
계속하려면 아무 키나 누르십시오 . . .

*/


/* 방식 ③

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 14
연산자 입력(+ - * /) : +

>> 10 + 14 = 24
계속하려면 아무 키나 누르십시오 . . .

--------------------------------------

첫 번째 정수 입력 : 5
두 번째 정수 입력 : 3
연산자 입력(+ - * /) : /

>> 5 / 3 = 1
계속하려면 아무 키나 누르십시오 . . .

*/