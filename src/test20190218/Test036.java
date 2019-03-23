package test20190218;
/*===============================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - if ~ else문 실습 

 ===============================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 작성한다.

// 실행 예)
// 첫 번째 정수 입력 : 4
// 두 번째 정수 입력 : 8
// 세 번째 정수 입력 : 73

// >> 정렬 결과 : 4 8 73
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

	
		// 함께 풀이한 내용
	
	
		int a, b, c;		//-- XOR 연산자 사용자가 입력하는 임의의 정수 담을 변수
		int temp;			//-- 임시 저장변수(빈 컵) 


		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3
		//		   2 3 1 | 1 2 3 | 1 3 2 | 1 2 3
		//		   2 1 3 |       | 1 2 3 |
		//		   1 2 3

		// 앞에 숫자가 뒤에 숫자보다 클 때만 자리바꿈

		// ① 첫 번째 정수가 두 번째 정수보다 크다면...
		// 두 정수의 자리를 바꾼다. 
		// ② 두 번째 정수가 세 번째 정수보다 크다면...
		// 두 정수의 자리를 바꾼다. 
		// ③ 첫 번째 정수가 두 번째 정수보다 크다면...
		// 두 정수의 자리를 바꾼다. 

		if ( a > b )		// ① 첫 번째 정수가 두 번째 정수보다 크다면...
		{
			// 두 정수의 자리를 바꾼다.
			temp = a;
			a = b;
			b = temp;

		}
		if ( b > c )		// ② 두 번째 정수가 세 번째 정수보다 크다면...
		{
			// 두 정수의 자리를 바꾼다.
			temp = b;
			b = c;
			c = temp;
		}
		if	( a > b )
		{
			temp = a;
			a = b;
			b = temp;
		}

		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);

		/*


		// 내가 풀이한 내용 
		
		
		int n1, n2, n3 = 0;
		int sor1 = 0;
		int sor2 = 0;
		int sor3 = 0;

		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		n3 = Integer.parseInt(br.readLine());
		
		System.out.println();
		System.out.printf(">> 정렬 결과 : %d %d %d\n",sor1, sor2, sor3);

		// 연산 처리 : 정렬
		// n1 5
		// n2 10
		// n3 1

		if ( n1 > n2 && n1 > n3)			// n1이 제일 클 때
		{
			sor3 = n1;
		}
		else if ( n1 > n2 && n1 < n3)			// n1이 중간 일 때
		{
			sor2 = n1;
		}
		else if ( n1 < n2 && n1 < n3)			// n1이 제일 작을 때
		{
			sor1 = n1;
		}


		if ( n2 > n3 && n2 > n1 )			// n2이 제일 클 때 
		{
			sor3 = n2;
		}
		else if ( n2 > n3 && n2 < n1 )		// n2이 중간 일 때 
		{
			sor2 = n2;
		}
		else if ( n2 < n3 && n2 < n1 )		// n2이 제일 작을 때
		{
			sor1 = n2;
		}
		
		

		if ( n3 > n1 && n3 > n2 )		// n3이 제일 클 때 
		{
			sor3 = n3;
		}
		else if ( n3 > n1 && n3 < n2 )		// n3이 중간 일 때
		{
			sor2 = n3;
		}
		else if ( n3 < n1 && n3 < n2 )		// n3이 제일 작을 때
		{
			sor1 = n3;
		}

		*/


	}
}

// 실행 결과
/*

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 89
세 번째 정수 입력 : 68

>> 정렬 결과 : 10 68 89
계속하려면 아무 키나 누르십시오 . . .

*/