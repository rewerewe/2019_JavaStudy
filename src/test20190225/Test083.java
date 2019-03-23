/*==========================
   ■■■ 배열 ■■■ 
 - 배열의 기본적인 활용 
===========================*/

/*
	○ 과제 2019-02-25
	사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
	입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.

	단, 배열을 활용하여 구현할 수 있도록 한다. 

	실행 예)
	입력할 데이터의 갯수  : 10 
	데이터 입력(공백구분) : 45 92 75 13 2 65 25 63 90 17
	>> 가장 큰 수 → 92
	// 계속하려면 아무 키나 누르세요...
	
*/

import java.util.Scanner;

public class Test083
{
	public static void main(String[] args)
	{
		/* 
		○ 문제 인식 및 분석
		1. 사용자로부터 임의의 정수를 배열로 입력받기
		2. 임의의 정수 판별 : 가장 큰 수 찾기
		3. if 가장 큰수라면, 출력하기 
		*/
		
		// 사용자로부터 받을 값 담을 변수 num 선언 
		int num;
		int num2=0;

		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// Scanner로 입력받은 데이터 갯수를 int로 변환하여 num값에 담기 
		System.out.print("입력할 데이터의 갯수  : ");
		num = sc.nextInt();

		// 사용자로부터 받은 num1만큼 배열만들기 
		int[] arr = new int[num];

		// 반복문을 활용하여 사용자로부터 받은 데이터 배열에 담아내기 
		System.out.print("데이터 입력(공백구분) : ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		//System.out.print(arr[2]);
		
		// XOR연산자로 값을 비교하여 가장 큰 수라면 마지막 배열(배열의 맨 뒤)로 보내기 
		for (int i=0; i<arr.length-1; i++)
		{
			if (arr[i]>arr[i+1])
				{
					arr[i]=arr[i]^arr[i+1];
					arr[i+1]=arr[i+1]^arr[i];
					arr[i]=arr[i]^arr[i+1];
				}
		}
		// 마지막 배열 출력하기 
		System.out.printf("가장 큰 수 → %d\n", arr[arr.length-1]);
	} 
}