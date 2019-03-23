package test0220_2;
/*=================================================================
 ■■■ 실행 흐름의 컨드롤 (제어문) ■■■
 - 반복문 (for문) 실습
 - 별찍기 실습
 ※ 여러가지 반복문 형태로 출력 : 중첩(이중, 삼중) 반복문  
==================================================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/

public class Test063
{
	public static void main(String[] args)
	{
	/*

		// 2. 반복문 사용
		// 2-1. 개행이 없음
	    //		결과 → *************************
					
		// 별 5개씩 찍는 것을 5번 반복하겠다. 
		for (int j = 0; j < 5; j++) 
		{
			// 별 5개를 찍겠다. 
			for (int i = 0; i < 5; i++) 
			{
				System.out.print("*");
			}
		}

					
		// 2-2. 개행을 더함
		//		결과 → *****
		//				*****
		//				*****
		//				*****
		//				*****
					
					
		for (int j = 0; j < 5; j++) 
		{
			for (int i = 0; i < 5; i++) 
			{
				System.out.print("*");
			}
		System.out.println();
		}
	
	*/

		// 세로 별수 
		for (int j = 1; j <= 9; j++) 
		{
			// 가로 별수
			for (int i = 1; i <= 9; i++) 
			{
				// 세로 줄, 첫번째 라인일 때
				if (j == 1) 
				{
					// 3. if문 사용 
					//	  if문으로 공백이냐 별이냐를 컨트롤 
					//    i = 가로 별수, j = 세로 줄수 
					//    별자리 좌표(i,j)에 따라 별 출력하기
					//    1 2 3 4 5 6 7 8 9  i
					//  1
					//  2
					//  3
					//  4
					//  5
					//  j

					// 가로 별자리가 5일 때 '*'을 출력하겠다
					//	i = 5 자리에 '*' 출력
					if (i == 5) 
					{
						System.out.print("*");

					// 그렇지 않으면 ' ' 출력
					// i = 1, 2, 3, 4, 6, 7, 8, 9 자리에 ' ' 출력 
					} else {
						System.out.print(" ");
					}
				}

				// 세로 줄, 두번째 라인일 때
				if (j == 2) 
				{
					// 가로 별자리가 4~6일 때 '*'을 출력하겠다
					//	i = 4, 5, 6 자리에 '*' 3개 출력
					if (4 <= i && i <= 6) 
					{
						System.out.print("*");
					
					// 그렇지 않으면 ' ' 출력
					// i = 1, 2, 3, 7, 8, 9 자리에 ' ' 출력 
					} else {
						System.out.print(" ");
					}
				}

				// 세로 줄, 세번째 라인일 때
				if (j == 3) 
				{
					// 가로 별자리가 3~7일 때 '*'을 출력하겠다
					//	i = 3, 4, 5, 6, 7 자리에 '*' 5개 출력
					if (3 <= i && i <= 7) {
						System.out.print("*");

					// 그렇지 않으면 ' ' 출력
					// i = 1, 2, 8, 9 자리에 ' ' 출력 
					} else {
						System.out.print(" ");
					}
				}
				
				// 세로 줄, 네번째 라인일 때
				if (j == 4) 
				{
					// 가로 별자리가 2~8일 때 '*'을 출력하겠다
					//	i = 2, 3, 4, 5, 6, 7, 8 자리에 '*'  7개 출력
					if (2 <= i && i <= 8) {
						System.out.print("*");

					// 그렇지 않으면 ' ' 출력
					// i = 1, 2, 8, 9 자리에 ' ' 출력 
					} else {
						System.out.print(" ");
					}
				}
				
				// 세로 줄, 다섯번째 라인일 때
				if (j == 5) {
					System.out.print("*");
				}

				// 세로 줄, 여섯번째 라인일 때
				if (j == 6) 
				{
					// 삼각형 반복
					// 가로 별자리가 2~8일 때 '*'을 출력하겠다
					//	i = 2, 3, 4, 5, 6, 7, 8 자리에 '*'  7개 출력
					if (2 <= i && i <= 8) {
						System.out.print("*");

					// 그렇지 않으면 ' ' 출력
					// i = 1, 9 자리에 ' ' 출력 
					} else {
						System.out.print(" ");
					}
				}
				// 세로 줄, 일곱번째 라인일 때
				if (j == 7) {

					// 가로 별자리가 3~7일 때 '*'을 출력하겠다
					//	i = 3, 4, 5, 6, 7 자리에 '*' 5개 출력
					if (3 <= i && i <= 7) {
						System.out.print("*");

					// 그렇지 않으면 ' ' 출력
					// i = 1, 2, 8, 9 자리에 ' ' 출력 
					} else {
						System.out.print(" ");
					}
				}

				// 세로 줄, 여덟번째 라인일 때
				if (j == 8) 
				{
					// 가로 별자리가 4~6일 때 '*'을 출력하겠다
					//	i = 4, 5, 6 자리에 '*' 3개 출력
					if (4 <= i && i <= 6) 
					{
						System.out.print("*");

					// 그렇지 않으면 ' ' 출력
					// i = 1, 2, 3, 7, 8, 9 자리에 ' ' 출력 
					} else {
						System.out.print(" ");
					}
				}

				// 세로 줄, 아홉번째 라인일 때
				if (j == 9) 
				{
					// 가로 별자리가 5일 때 '*'을 출력하겠다
					//	i = 5 자리에 '*' 1개 출력
					if (i == 5) 
					{
						System.out.print("*");

					// 그렇지 않으면 ' ' 출력
					// 	i = 1, 2, 3, 4, 6, 7, 8, 9 자리에 ' ' 출력 
					} else {
						System.out.print(" ");
					}
				}
			}
			// 개행 
			System.out.println();
		}
	}
}

// 실행 결과
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/

