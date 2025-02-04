package test20190218;
/*==============================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■)
 - if ~ else문 실습
===============================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 2의 배수인지, 3의 배수인지
// 2와 3의 배수인지, 2와 3의 배수가 아닌지 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 8
// >> 8 → 2의 배수-!
// 계속하려면 아무키나 누르세요...

// 임의의 정수 입력 : 9
// >> 9 → 3의 배수-!
// 계속하려면 아무키나 누르세요...

// 임의의 정수 입력 : 6
// >> 9 → 2와 3의 배수-!
// 계속하려면 아무키나 누르세요...

// 임의의 정수 입력 : 11
// >> 11 → 2와 3의 배수 아님-!
// 계속하려면 아무키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int nNum ;
		String sDou = "0";

		System.out.print("임의의 정수 입력 : ");
		nNum = Integer.parseInt(br.readLine());



	
		if (nNum % 2 == 0 && nNum % 3 == 0)			// 2와 3의 배수
		{
			sDou = "2와 3의 배수-!";
		}
		else if (nNum % 2 == 0)						// 2의 배수
		{
			sDou = "2의 배수-!";
		}
		else if (nNum % 3 == 0)						// 3의 배수
		{	
			sDou = "3의 배수-!";
		}
		else if (nNum % 2 != 0 && nNum % 3 != 0)	// 2와 3의 배수가 아니
		{
			sDou = "2와 3의 배수아님-!";
		}
		else 
			sDou = "판별이 불가능한 상황-!";
	

		/*		

		if (nNum % 2 == 0)							// 2의 배수
		{
			sDou = "2의 배수-!";
		}
		else if (nNum % 3 == 0)						// 3의 배수 
		{	
			sDou = "3의 배수-!";
		}
		else if (nNum % 2 == 0 && nNum % 3 == 0)	// 2와 3의 배수
		{
			sDou = "2와 3의 배수-!";
		}
		else if (nNum % 2 != 0 && nNum % 3 != 0)	// 2와 3의 배수가 아닐 때  
		{
			sDou = "2와 3의 배수아님-!";
		}
		else 
			sDou = "판별이 불가능한 상황-!";
	
		*/
		
		// ※ 위와 같은 상황에서는 2와 3의 배수라는(공통배수) 조건식에는
		// 만족하는 데이터가 분기될 수 없는 상황이다. check!!!
		// 따라서, 2와 3의 배수를 제일 먼저 써주어야 한다. 
		 

		 System.out.printf("%d → %s\n", nNum, sDou); 
	}
}