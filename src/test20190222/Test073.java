/*==================================
 ■■■ 클래스와 인스턴스 ■■■
 - 클래스 설계 실습 
====================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자 입력(+ - * /)	  :  +
// >> 10 + 5 = 15 
// 계속하려면 아무키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// ○ 주요 속성 구성 
	int su1, su2;
	char op;

	// ○ 메소드 정의(기능 : 입력)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /)    : ");
		op = (char)System.in.read();
	}

	// ○ 메소드 정의(기능 : 연산) 
	int cal()
	{
		int result;
		
		switch (op)
		{

			case '+' : result = su1 + su2; break;
			case '-' : result = su1 - su2; break;
			case '*' : result = su1 * su2; break;
			case '/' : result = su1 / su2; break;
			default "
		
		}

		return result;
	}

	// ○ 메소드 정의(기능 : 출력)
	// >> 10 + 5 = 15
	void print(int r)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, r);
	}

	
}

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 클래스 기반의 인스턴스 생성 
		Calculate ob = new Calculate();

		// 생성한 인스턴스를 통한 입력 메소드 호출 
		ob.input();
		// 생성한 인스턴스를 통한 연산 메소드 호출
		int result = ob.cal();
		// 생성한 인슨턴스를 통한 출력 메소드 호출 
		ob.print(result);
	}
}