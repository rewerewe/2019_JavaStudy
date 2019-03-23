package test20190225;
/*==========================
   ■■■ 배열 ■■■
 - 배열의 선언과 초기화 
 - 배열의 기본적인 활용 
===========================*/

/*
	○ 실습 문제
	『char』 자료형의 배열을 만들어 알파벳 대문자를 채우고 
	채워진 배열의 전체 요소를 출력하는 프로그램을 구현한다.

	실행 예)
	A B C D.... W X Y Z
	계속하려면 아무키나 누르세요....

*/

public class Test081
{
	public static void main(String[] args)
	{



		// ① 내가 풀이한 내용 
		char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X','Y', 'Z'};


		// ③ 함께 풀이한 내용! 
		char[] arr3 = new char[26];
		for (int i=0, ch=65; i<arr3.length; i++, ch++)
			arr3[i] = (char)ch;

		for (int i=0; i<arr3.length; i++)
			System.out.print(arr3[i] + " ");
		
		System.out.println();

	}
}

// 실행 결과
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/