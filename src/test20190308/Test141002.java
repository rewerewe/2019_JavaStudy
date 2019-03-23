/*=====================================
 ■■■ 자바의 주요(중요) 클래스 ■■■
  - Random 클래스 
======================================*/
/*

 ○ java.util.Random 클래스는 
 
 	여러 형태의 난수를 발생시켜 제공하는 클래스이다.
	Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
	0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로 
	필요한 여러 형태의 난수를 만들어내기 위해 추가적인 연산들을 수행해야 한다.
	그래서 자바는 여러 형태의 난수를 발생시켜주는
	전용 클래스인 Random 클래스를 별도로 제공하여 있다.

*/

/*  로또 번호 생성기(난수 발생 프로그램)

	프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다. (645방식)
	
	실행 예)
	2 39 40 41 42 45 
	1 2 8 16 28 42
	4 9 10 13 14 28 
	20 24 31 33 37 41
	5 7 8 11 36 40 
	계속하려면 아무키나 누르세요...

	게임상 번호가 중복되지 않는다. 
	결과는 작은 수부터 정렬되어 출력된다. 
*/

import java.util.Random;

public class Test141002
{
	public static void main(String[] args)
	{
		// 내가 풀이한 내용
		// 주요 변수 선언 
		int temp; 
		
		// Random 클래스 인스턴스 생성 
		Random rd = new Random();
		
		//int형 수배열 선언 및 초기화 
		int[] suArr = new int[6];	
		

		// suArr 배열에 난수 넣어주기
		for (int i=0; i<suArr.length; i++)
		{
				suArr[i] = rd.nextInt(45)+1;
				System.out.print(suArr[i] + " ");
		}
			
		// 중복확인
		for (int i=0; i<suArr.length; )
		{
			for (; ; )
			{
				
				if (suArr[i] == suArr[j])
				{
					// suArr[j] = 0;
				}

			}
		}
		
		
		
		// 난수가 담겨있겠지. 그럼 큰 수대로 정렬해주자. 
		for (int i=0; i<suArr.length; i++)
		{
			for (int j=1; j<suArr.length-1; i++)
			{
				if (suArr[i] > suArr[j])
				{
					temp = suArr[i]; 
					suArr[i] = suArr[j]; 
					suArr[j] = temp;
				}
			}			
		}
		
	}
}