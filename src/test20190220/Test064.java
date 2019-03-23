package test20190220;
/*====================================================
 ■■■ 실행 흐름의 컨드롤 (제어문) ■■■
 - break
=====================================================*/

// ○ 실습 문제 
// 다음과 같이 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받은 정수는 1~1000 범위 안에서만
// 가능하도록 작성한다. 

// 실행 예)
// 임의의 정수 입력 : -10
// 임의의 정수 입력 : 0 
// 임의의 정수 입력 : 2019
// 임의의 정수 입력 : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니다? (Y/N) : y

// 임의의 정수 입력 : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니다? (Y/N) : N
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		// 함께 풀이한 내용 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		// 사용자에게 입력 받을 변수 n, 누적합 s, 루프 변수 i 
		int n, s, i;

		// 계속 여부 입력값
		char ch;
		
		while (true)
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
				
			}
			// 1보다 작은 1000보다 큰 수일 때 반복한다. 
			while (n<1 || n>1000);

			// 입력 받은 수까지의 누적합 연산 
				s = 0;
				for (i=1; i<=n; i++)
				{
					s += i; 
				}

				System.out.printf("\n 1~ %d까지의 합 : %d\n", n, s);

			System.out.print("계속하시겠습니까?(Y/N) : ");
			ch = (char)System.in.read();					// y + \r +\n → NumberFormatException 발생~!!!

			// 입력값이 소문자 y 가 아니다. 입력값이 대문자 Y가 아니다. 
			// → ch != 'y'					→ ch != 'Y'
			// → 논리 연산자를 사용해야 한다. 
			
			// ch== 'y'  ||  ch=='Y'
			//			  ↓
			// ch!= 'y'  &&  ch!='Y'		// 부정은 &&로 바뀌어야 한다. 
			
			if (ch!= 'y' && ch!='Y')
			{
				// 반복문 → while (true) 을 빠져나갈 수 있는 코드 작성 필요
				// -- 위와 같은 의사표현을 했다면 
				//    그동안 수행했던 반복문을 멈추고 빠져나가야 한다. 
				break;
				// -- 멈춘다. (+ 그리고 빠져나간다.) check~!!!
			}

			// 엔터값(\r +\n)처리
			System.in.skip(2);
		
		}// end while
		

		// 실패... 내가 풀이한 내용 

		/*
		// 문제 인식 및 분석
		// 1. 사용자로부터 정수(n)를 입력 받는다. → BufferedReader
		// + 일단 한번은 메시지가 출력되어야 한다 → do~while
		// 2. 조건식 : 그 정수(n)가 1~1000이라면 1부터 그 정수까지의(1~n)까지 누적합을 구하고, 변수 sum 에 담는다.
		//	  그 정수(n)가 1~1000가 아니면 다시 메시지 입력란을 출력한다. → if(x)  do~while : 일단 한번은 출력해야 하므로 
		// 3. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		// 사용자에게 입력 받는 수 담을 변수 n, 누적합을 담을 변수 sum, 1부터 증가할 i 
		int n;
		int sum=0;
		int i=1;

		// 일단 한번은 값을 받아야 와야 한다 = do~while
		do
		{
			System.out.print("임의의 정수 입력 : ");
			n = Integer.parseInt(br.readLine());
	
		}
		while (n>0 && n<=1000);
			
			// 입력 받은 n이 1~1000라면 
			if ()
			{
				// n 까지의 누적합sum을 구한다.
				for (i=1; i<=n; i++)
				{
					
					sum += i;
				}
				
			}



		// 결과 출력
		
		System.out.printf("n=%d i=%d sum=%d \n", n, i, sum);
		*/					
	
	}// end main

}// end class

// 실행 결과
/*
임의의 정수 입력 : 0
임의의 정수 입력 : -1
임의의 정수 입력 : 2019
임의의 정수 입력 : 2000
임의의 정수 입력 : 100

 1~ 100까지의 합 : 5050
계속하시겠습니까?(Y/N) : y
임의의 정수 입력 : 1000

 1~ 1000까지의 합 : 500500
계속하시겠습니까?(Y/N) : n
계속하려면 아무 키나 누르십시오 . . .

*/
