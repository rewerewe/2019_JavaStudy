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


// 문제 인식 및 분석

// 클래스 내용 : 임의의 정수를 입력받아 누적합 구하기 
// 클래스 속성 : 임의의 정수 
// 클래스 기능 : BufferedReader 입력받기, 누적합 계산, 출력 

// ① n 물어보기 + 입력	←←	
//		↓			        ↑ 
//		↓			        ↑  
// ② n 범위 판별 no →→→→
//		↓	
//	 	↓ yes
//		↓
// ③ 1~ n까지의 누적합
//		↓
// ④ 결과 출력 

// 논리가 말로 정리되면, 코드로 변환하는 연습.


// 내가 풀이한 내용 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class NumPlus
{
	int n; 
	int sum;

	void calNum() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

		do
		{
			
			System.out.print("임의의 정수(1~1000) : ");
			n = Integer.parseInt(br.readLine());
				
		}
		while (n > 1000 || n < 1);

	
		for (int i=1; i<=n; i++)
		{
			sum += i;
		}
		
		 
	}
	
	void print()
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, sum);
	}



}

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		
		NumPlus ob = new NumPlus();

		ob.calNum();

		ob.print();
	}
}