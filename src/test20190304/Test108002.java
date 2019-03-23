package test20190304;
/*==================================
 ■■■ 클래스 고급 ■■■
 - 상속 (Inheritance)
==================================*/
// 내가 풀이한 내용 
/*	
	○ 실습 문제
	다음과 같은 프로그램을 구현한다.
	단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

	실행 예)
	임의의 두 정수 입력(공백 구분) : 20 15
	연산자 입력(+ - * / ) : - 
	>> 20 - 15 = 5 
	계속하려면 아무키나 누르세요...

*/

import java.util.Scanner;
import java.io.IOException;

// 부모 클래스 
class Aclass_2 
{
	 protected int x, y;
	 protected char op;

	Aclass_2()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// 자식 클래스 
class Bclass_2 extends Aclass_2 
{ 
	double result;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
	}

	double cal()
	{
		switch (op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = x / y; break;
		}

		return result;	
	}

}


public class Test108002
{
	public static void main(String[] args) throws IOException
	{
		Bclass_2 ob = new Bclass_2();

		ob.input();
		double result = ob.cal();
		ob.write(result);		
	}
}

// 실행 결과
/*
임의의 두 정수 입력(공백 구분) : 20 30
연산자 입력(+ - * /) : *
>> 20 * 30 = 600.00
계속하려면 아무 키나 누르십시오 . . .
*/
