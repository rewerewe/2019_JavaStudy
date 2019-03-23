/*====================================
 ■■■ 정렬(Sort) 알고리즘 ■■■■
 - 함께 풀이한 해설 없음 
=====================================*/

/*
	○ 실습 문제
	사용자로부터 여러 학생의 성적 정보를 정수 형태로 입력받아 
	점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
	단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

	실행 예)
	인원 수 입력 : 5
	이름 점수 입력(1) : 나주영 90
	이름 점수 입력(2) : 남상현 80
    이름 점수 입력(3) : 유진석 85
    이름 점수 입력(4) : 윤희진 75
    이름 점수 입력(5) : 이기승 95
    
	=================
	1등 이기승 95
	2등 나주영 90
	3등 유진석 85
	4등 남상현 80
	5등 윤희진 75
	=================
	계속하려면 아무키나 누르세요...

*/

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{	
		int num; 
		
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력 : ");
			num = sc.nextInt();
		}
		while (num<=0);

		
		String[] arrName = new String[num];
		int[] arrJumsu = new int[num];
		String temp="";
		
		for (int i=0; i<arrJumsu.length; i++)
		{
			System.out.printf("이름 점수 입력(%d) : ", (i+1));
			arrName[i] = sc.next();
			arrJumsu[i] = sc.nextInt();

		}
															// 입력한 인원 수: 4
		for (int i=0; i<arrJumsu.length-1; i++)				// 0 1 2 3 
		{
			for (int j=i+1; j<arrJumsu.length; j++)			// 1 2 3 4 
			{
				// 확인 
				// System.out.print("\n i : " + i + "j " + j );

				// 자리 바꾸기 
				if (arrJumsu[i] > arrJumsu[j])
				{
					// 이름 :  문자열은 XOR연산자로 자리 바꾸기(Ⅹ) → 이름은 빈 종이컵에 담아 자리 바꾸어 주기
					temp = arrName[i];
					arrName[i] = arrName[j];
					arrName[j] = temp;
					
					// 점수 : 입력 받은 정수를 배열에 담아 두었을 때, 앞에있는 정수가 뒤에 정수보다 크다면 자리 바꾸어 주기.
					arrJumsu[i] = arrJumsu[i]^arrJumsu[j];
					arrJumsu[j] = arrJumsu[j]^arrJumsu[i];
					arrJumsu[i] = arrJumsu[i]^arrJumsu[j];
				}
			}
		}
		
		
		
		// 출력
		
			for (int i = 0; i<arrJumsu.length; i++)
			{
				System.out.print(arrName[i] + " " + arrJumsu[i] + " \n");
			}
		
		
		

	}
}