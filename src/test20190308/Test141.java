package test20190308;
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
import java.util.Arrays;


class Lotto
{
	// 함께 풀이한 내용
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6개
	private int[] num = new int[6];

	// getter
	public int[] getNum()
	{
		return num;
	}
	
	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		int cnt=0;
		Random rd = new Random();
		int n;

		jump: 
		
		while (cnt<6)						// cnt → 0 1 2 3 4 5 	
		{
			n = rd.nextInt(45) + 1;			// 1~ 45 
			
			// 배열에 값을 담기 전에, 중복값이 있는지 확인 
			for (int i=0; i<cnt; i++)		// 범위가 왜 cnt 인가? 
			{
				if (num[i] == n)
					continue jump;			// num[0], num[1], num[2]... 에 들어있는 숫자를 비교하여 같으면 다시 반복하겠다. 
				
			}

			num[cnt++] = n;	
		}

		sorting();
		
	}

	// 정렬 메소드
	private void sorting()
	{
		Arrays.sort(num);
	}
}



public class Test141
{
	public static void main(String[] args)
	{
		// Lotto 클래스 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5게임
		for (int i=1; i<=5; i++)
		{
			lotto.start();
			
			//결과 출력
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();	// 개행
		}
	}
}