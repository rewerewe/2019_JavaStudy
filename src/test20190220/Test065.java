/*=========================================
 ■■■ 실행 흐름의 컨드롤 (제어문) ■■■
 - continue
===========================================*/

//홀수들의 누적합 구하기

// 실행 예)
/* 

 1 : 1
 3 : 4
 5 : 9
 7 : 16
 9 : 25
 	 ： 
 	 ：
99 : 2500
결과 : 2500

*/

public class Test065
{
	public static void main(String[] args)
	{
		int n=0, s=0;				//--n<=100에서 =를 안쓰겠다. n을 증가시키겠다.

		while (n<100)
		{
			n++;
			// 2) 조건에 만족하면 
			if(n%2==0)				// 짝수라면...
				continue;			// (뒷부분을 무시하고 +) 계속해라. check~!!! → 다시 조건 확인하러 간다. 

			// 1) 모든 수가 출력된다  
			s += n;								//--뒷부분 
			System.out.println(n + " : " + s); //--뒷부분
		}

		System.out.println("결과 : " + s);

		//내가 풀이한 내용
		/*
		int i=0;
		int sum=0;
		// 홀수 : 홀수합 += 홀수 
		// i <= 100
		for (i=1; i<=100; i++)
		{
			if (i % 2 != 0)
			{
				sum += i;
				System.out.printf("%d : %d\n", i, sum);
				
			}
		}// end for

		System.out.printf("결과 : %d\n",sum);
		*/	
	}// end main 
}// end class 