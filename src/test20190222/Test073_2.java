package test20190222;
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

// 내가 풀이한 내용 

import java.util.Scanner;
import java.io.IOException;

class NumCal
{	
	int a;
	int b;
	char cal;
	double result = 0;	// result 초기화 해주거나, switch 문 default 해주거나 
	
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();		// 두 정수를 받아야 하므로 

		System.out.print("임의의 연산자 입력(+ - * /) : ");
		// cal = sc.next();
		cal = (char)System.in.read();
	}

	double calcul()
	{

		switch (cal)
		{
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
			
		}
		
		return result;
	}


	void print()
	{
		System.out.printf(">> %d %c %d = %.2f\n", a, cal, b, result);
	}


}
public class Test073_2
{
	public static void main(String[] args) throws IOException
	{
		NumCal ob = new NumCal();
		ob.input();
		double cal = ob.calcul();
		ob.print();
	}
}

// 실행결과
/*
임의의 두 정수 입력(공백 구분) : 10 20
임의의 연산자 입력(+ - * /) : +
>> 10 + 20 = 30
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 10 20
임의의 연산자 입력(+ - * /) : -
>> 10 - 20 = -10
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 10 20
임의의 연산자 입력(+ - * /) : *
>> 10 * 20 = 200
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 10 20
임의의 연산자 입력(+ - * /) : /
>> 10 / 20 = 0.00
계속하려면 아무 키나 누르십시오 . . .

*/
