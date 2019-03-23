/*==========================
   ■■■ 배열 ■■■ 
 - 배열의 기본적인 활용 
===========================*/

/*
	○ 과제 2019-02-25
	사용자로부터 학생 수를 입력받고, 그 만큼의 점수(정수형태)를 입력받아
	전체 학생 점수의 합, 평균, 편차를 구하여 결과를 출력하는 프로그램을 구현한다.
	단, 배열을 활용하여 구현할 수 있도록 한다.

	실행 예)
	학생 수 입력 : 5 
	1번 학생의 점수 입력 : 90
	2번 학생의 점수 입력 : 82
	3번 학생의 점수 입력 : 64
	4번 학생의 점수 입력 : 36
	5번 학생의 점수 입력 : 98

	>> 합 : 370
	>> 평균 : 74
	>> 편차 : 
	90 : -16.0
	82 : -8.0
	64 : 10.0
	36 : 38.0
	98 : -24.0
	계속하려면 아무키나 누르세요... 
*/

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		/* 
		○ 문제 인식 및 분석
		1. 사용자로부터 학생수를 배열로 입력받기
		2. 입력 받은 학생 수 만큼 점수 입력 받기 
		3. 입력받은 점수로 합, 평균, 편차 연산하기 
		4. 출력하기 
		*/
		
		// 사용자로부터 입력 받은 값을 담을 stu, 합을 담을 sum, 평균을 담을 avg 변수 선언
		int stu;
		int sum=0;
		double avg;
		
		// 사용자로부터 학생 수 입력 받기 
		System.out.print("학생 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		// 입력 받은 학생 수 stu 변수에 담기 
		stu = sc.nextInt();
		
		// 입력 받은 stu 값만큼 배열 만들기
		int[] arr = new int[stu]; 

		// 사용자로부터 점수 입력 받아 배열에 담기 
		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);
			arr[i] = sc.nextInt();
		}

		// 합 구하기 
		for (int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}

		// 평균 구하기 
		avg = sum/stu;


		// 결과 출력
		// 합, 평균, 편차 출력 
		System.out.printf("\n>> 합 : %d", sum);
		System.out.printf("\n>> 평균 : %.2f", avg);
		System.out.println("\n>> 편차 :");
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i] + " : " +(avg - arr[i]));
		
	

		

	}
}