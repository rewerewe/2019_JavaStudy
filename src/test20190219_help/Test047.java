package test20190219_help;
/*=============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
==============================================*/

// ○실습 문제
// 1부터 100까지 정수의 합을 구하되
// 10의 배수가 될 때마다 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 1~10까지의 합 : xx
// 1~20까지의 합 : xx
// 1~30까지의 합 : xx
//			:
// 1~100까지의 합 : xx
// 계속하려면... 

public class Test047
{
	public static void main(String[] args)
	{
		/*
		//(나)
		int n=0;
		int sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9, sum10;
		sum1=sum2=sum3=sum4=sum5=sum6=sum7=sum8=sum9=sum10=0;

		while (n<=100)
		{
			if (n<=10)
			{
				sum1 += n;
			}
			if (n<=20)
			{
				sum2 += n;
			}
			if (n<=30)
			{
				sum3 += n;
			}
			if (n<=40)
			{
				sum4 += n;
			}
			if (n<=50)
			{
				sum5 += n;
			}
			if (n<=60)
			{
				sum6 += n;
			}
			if (n<=70)
			{
				sum7 += n;
			}
			if (n<=80)
			{
				sum8 += n;
			}
			if (n<=90)
			{
				sum9 += n;
			}
			if (n<=100)
			{
				sum10 += n;
			}
			n++;

		}

		System.out.println("1~10까지의 합 : " + sum1);
		System.out.println("1~20까지의 합 : " + sum2);
		System.out.println("1~30까지의 합 : " + sum3);
		System.out.println("1~40까지의 합 : " + sum4);
		System.out.println("1~50까지의 합 : " + sum5);
		System.out.println("1~60까지의 합 : " + sum6);
		System.out.println("1~70까지의 합 : " + sum7);
		System.out.println("1~80까지의 합 : " + sum8);
		System.out.println("1~90까지의 합 : " + sum9);
		System.out.println("1~100까지의 합 : " + sum10);
		*/

		
		//(해설)
		int n=1;
		int sum=0;
		/*
		while (n<=100)
		{
			sum += n;

			if (n%10==0)
			{
			System.out.printf("1~%d까지의 합 : %d%n", n, sum);
			}
			n++;
		}
		*/
		// 1부터 100
		while (n<=100)
		{
			sum += n;
			//if (n%10==0)
			System.out.printf("1~%d까지의 합 : %d%n", n, sum);
			n++;
		}

		/*
		//다른사람 풀이 - while문 중첩으로 if없이 해결
		int n=0;
		int m=10;
		int sum=0;

		while (m<=100)
		{
			while (n<m)
			{
				n++; //n:1씩 증가
				sum+=n;				
			}
			//n 증가 끝날 때 결과문 출력하고
			System.out.printf("1~%d까지의 합 : %d%n", m, sum); 
			// 그 후에 m:10씩 증가
			m+=10;
		}
		*/

	}
}

//실행 결과
/*
1~10까지의 합 : 55
1~20까지의 합 : 210
1~30까지의 합 : 465
1~40까지의 합 : 820
1~50까지의 합 : 1275
1~60까지의 합 : 1830
1~70까지의 합 : 2485
1~80까지의 합 : 3240
1~90까지의 합 : 4095
1~100까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/