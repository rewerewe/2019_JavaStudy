
/*======================
 ■■■ 배열 ■■■
 - 배열의 복사 
=======================*/

/*
	○ 실습 문제

	임의의 배열(a,b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
	단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
	또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

	ex) 임의의 두 배열 
	int[] a = {2, 3, 7, 10, 11}
	int[] b = {3, 6, 10, 14}

	실행 예)
	첫 번째 배열 요소를 입력하세요(공백 구분) :
	두 번째 배열 요소를 입력하세요(공백 구분) :
	2 3 7 10 11 6 14
	계속하려면 아무키나 누르세요...

문자열 형태로 입력 받자. 

*/

import java.util.Scanner;

public class Test099
{
	public static void main(String[] args)
	{
		// 내가 풀이한 내용 ①
		
		int[] copy1,copy2;
		
		int[] num1 = {1, 3, 5, 6, 7, 8, 9, 10};
		int[] num2 = {2, 3, 6, 8, 9, 17};

		int n;

		
			// 배열 num1과 num2를 copyArray 메소드 호출로 복사하겠다. 
			// copynum1, copynum2는 복사한 값
			// int[] copynum1 = copyArray(num1);
			// int[] copynum2 = copyArray(num2);
		

		copy1 = num1;
		copy2 = num2;
		
		n = copy1.length + copy2.length;


		for (int i=0; i<copy1.length; i++)
		{
			for (int j=0; j<copy2.length; j++)
			{
				if (copy1[i]==copy2[j])
				{
					copy2[j] = 0;						
				}
			}
		}

		// 출력
		
		for (int k=0; k<n; k++)
		{
		
			System.out.print(copy1[k] + " ");
			
		}

		for (int h=0; h<n; h++)
		{	
			if (copy2[h]!=0)
			{
				System.out.print(copy2[h] + " ");
			}
		}


						/*
								for (int k=0; k<copy1.length; k++)
								{
									// if (copy1[k]!=0)
									{
										System.out.print(copy1[k] + "  ");
									}
								}
								for (int h=0; h<copy2.length; h++)
								{	
									if (copy2[h]!=0)
									{
										System.out.print(copy2[h] + "  ");
									}
								}
						*/
	}


						/*
							public static int[] copyArray(int[] num)
							{
								int[] temp = new int [num.length]	//-- num1 배열방만큼 배열방을 생성하겠다.

								for (int i=0; i<num.length; i++)
								{
									temp[i] = num[i]				//-- num1 원본 배열에 담겨있는 요소를 temp에 담아내겠다. 
								}

								return temp;
								
							}
						*/
}

