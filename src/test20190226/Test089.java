/*==========================
   ■■■ 배열 ■■■ 
 - 배열과 난수 
===========================*/

// 사용자로부터 임의의 정수를 입력받아
// 그 정수의 갯수만큼 난수(1~100)를 발생시켜 배열에 담고 
// 배열에 담겨있는 데이터들 중 
// 가장 큰 값과 가장 작은 값을 선택하여 출력하는 프로그램을 구현한다.

// 실행 예)
// 발생시킬 난수의 갯수 입력 : 3
// 52 13 67 → 무작위로 발생한 정수들... → 배열에 담아내기(배열 구성) 
// 가장 큰 값 : 67, 가장 작은 값 : 13
// 계속하려면 아무키나 누르세요...

import java.util.Scanner;
import java.util.Random;

public class Test089
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 안내 메시지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();

		// size 변수에 담아낸 수 만큼의 배열방 만들기 
		// (배열 선언 및 메모리 할당)
		int [] arr = new int[size];

		// 자바에서 무작위 숫자 얻어내는 방법 
		// 1. java.math의 random()에서 만들어 내기 → 0~1 사이의 실수를 발생시킴 → 추가적인 연산 필요  
		// 2. java.util의 random()에서 만들어 내기 

		// 무작위 숫자(난수)를 발생시키기 위해서는 
		// 난주 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();

		// 테스트
		// System.out.println("발생한 난수 : " + rd.nextInt(100)); //  0~99 까지의 난수를 발생시킨다 

		// 『Random』클래스의 『nextInt()』메소드
		// 0~매개변수로 넘겨받은 정수-1 까지의 수 중 
		// 무작위 정수(난수) 1개를 발생시킨다.

		for (int i=0; i<size; i++)
		{
			arr[i] = rd.nextInt(100)+1;		// 0+1 99+1 대역대 자체가 변함. 1~100 사이의 난수 중 1개 발생~!!!
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();

		// 가장 큰 값, 가장 작은 값 확인
		// ex)
		// 86 17 79  2 25 10 42 100 56 6 

		int max, min;						//-- 최대값, 최소값
		max=min=arr[0];						//-- max=min=86
		
		// 요소는 10개지만, 비교는 9번 해야하므로 arr.length -1 
		for (int i=1; i<arr.length-1; i++)
		{
			if (max<arr[i])
				max=arr[i];
			if (min>arr[i])
				min=arr[i];
		}
		
		//결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);

	}
}

// 실행 결과
/*
발생시킬 난수의 갯수 입력 : 7
  27  69  87  21  88  76  85
가장 큰 값 : 88, 가장 작은 값 : 21
계속하려면 아무 키나 누르십시오 . . .
*/