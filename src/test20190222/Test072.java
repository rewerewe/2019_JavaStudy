package test20190222;
/*==================================
 ■■■ 클래스와 인스턴스 ■■■
 - 클래스 설계 실습 
====================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의 합을 연산하여
// 결과값을 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리과정에서의 BufferedReader 의 readLine()을 사용하며,
// 입력 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구성할 수 있도록 한다.

// 실행 예)
// 임의의 정수(1~1000) : 1002
// 임의의 정수(1~1000) : -20
// 임의의 정수(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나 누르세요...


// 함께 풀이한 내용 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// 주요 변수 선언(사용자의 입력값을 담아둘 변수)
	int su;

	// 입력 메소드 정의 → su 가 범위가 아닐 때 메시지가 출력된다.
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("임의의 정수(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);

	}

	// 연산 메소드 정의 
	int calculate()
	{
		// 1개 이상의 값을 반환할 수 있을까? 
		// 서로 다른 데이터 타입의 값을 반환할 수 있을까? → 프리미티브 자료형에서는 불가능함, 단일값 형태로만 반환가능함 (자료구조 파트) 
		int result=0;
		
		for (int i=1; i<su; i++)
			result += i;

		return result;
	}

	
	// 결과 출력 메소드 정의 
	// >> 1 ~ 100 까지의 합 : 5050
	void print(int sum)
	{

		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", su, sum);
	}



}

// import java.io.IOException; 선언해줄 필요(x)

// main() 메소드를 포함하고 있는 외부 클래스


public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// Hap 클래스 인스턴스 생성
		Hap ob = new Hap();
		
		// 생성된 인스턴스를 통해 입력 메소드 호출 → throws IOException 처리 
		ob.input();

		// 생성한 인스턴스를 통해 연산 메소드 호출 → int 형 결과값 반환 → 받아낼 수 있도록 처리 
		int s = ob.calculate();

		// 생성한 인스턴스를 통해 출력 메소드 호출 → 매개변수 전달 
		ob.print(s);
	}
}

