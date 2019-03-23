/*==================================
 ■■■ 클래스 고급 ■■■
 - 상속 (Inheritance)
==================================*/

//함께 풀이한 내용 
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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// super class
class Aclass 
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}


// sub class 
class Bclass extends Aclass 
{
	/*
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	Bclass()
	{
	}
	
	/*  Bclass의 input 메소드는 아래와 같은 상황을 만들어 준 것이다. 

	boolean input() throws IOException
	{
		정수 두 개를 입력한 상황이 아니라면			10 20 30 
				return false;

		연산자를 제대로 입력한 상황이 아니라면
				return false;

		return true;	
	}

	*/ 

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : ");		// 20 15
		String temp = br.readLine();								// "20 15" 
		 
		String[] str = temp.split("\\s");	// 구분자 → 공백  (1) temp. 으로 string 계열의 메소드 사용 가능해짐. (2) split() 구분자를 넘겨주게됨
											// 문자열을 배열 형태로 반환한다. 
		// ※ 문자열.split("구분자");
		// ex) "사과 딸기 바나나 포도 수박".split("\\s");
		//		반환 → {"사과", "딸기", "바나나", "포도", "수박"}
		// ex) "10 20 30 40".split("\\s");
		//		반환 → {"10", "20", "30", "40"}
		//---------------------------------------------->> String[] str = {"20", "15"};

		if (str.length != 2)
			return false;	// 리턴시 값의 유효성을 판단하기 위해 boolean 형 선언. 
							// 리턴은 1) 값을 반환 2) 메소드 종료 이므로 값을 반환하며 종료. 

		// ※ 이 조건문을 수행할 경우 아래에 코드들이 남아있는 상황이지만
		//	  더 이상 수행하지 않고 결과값을 반환하며 메소드는 종료된다. 
		
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char) System.in.read();

		if (op!='+' && op!='-' && op!='*' && op!='/')		// 부정에서는 아니어야 할 때, 모두 충족해야 하므로 && and여야 한다. 
			return false;
		
		return true;

		/* 
		if (op=='+' || op=='-' || op=='*' || op=='/')		// 긍정에서는 같아야 할 때, 조건 중 하나만 만족하면 되므로 || or이어야 한다. 
			return true;
		
		return false;
		*/
	}

	double calc()
	{
		double result = 0;

		switch (op)
		{
		case '+': result = x+y; break;
		case '-': result = x-y; break;
		case '*': result = x*y; break;
		case '/': result = (double)x/y; break;
		
		}

		return result;
	
	}
}


// main()메소드를 포함하고 있는 외부의 다른 클래스 
public class Test108 
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		// System.out.print(ob.input());
		if (! ob.input())	// 입력값이 유효하지 '않다면'
		{
			System.out.print("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);
		
	}
}


