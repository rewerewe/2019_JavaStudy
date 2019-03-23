package test20190225;
/*==========================
   ■■■ 배열 ■■■ 
 - 배열의 배열(2차원 배열)
===========================*/

/*
	○실습 문제
	배열의 배열(다차원 배열)을 활용하여 
	다음과 같은 데이터 요소를 취하는 배열(5x5)을 구성하고 
	그 결과를 출력하는 프로그램을 구현한다.

	실행 예)
     ★
	 :
	 1	 2	 3	 4	 5		→ i=0
	 2	 3	 4	 5	 6		→ i=1
	 3	 4	 5	 6	 7		→ i=2
	 4	 5	 6	 7	 8		→ i=3
	 5	 6	 7	 8	 9		→ i=4
	계속하려면 아무키나 누르세요....

*/

public class Test087
{
	public static void main(String[] args)
	{
		// 함께 풀이한 내용
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int [5][5];

		int n;
		for (int i=0; i<arr.length; i++)
		{
			n = i + 1;		     //-- i를 관찰해서 i에서 1만큼 증가한 값을 넣어 준다. 관찰해서 규칙을 찾는 연습.. 반복문 알고리즘에 접근하게 됩니다..
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			
			System.out.println();
		}

		// 내가 풀이한 내용 
		/*

		int[][] arr = new int[5][5];

		// 배열의 배열 초기화 
		for (int i=0; i<arr.length; i++)	// i → 0 1 2 3 4 → 0부터 배열의 길이만큼 증가하고 있다. 	
		{
			for (int j=0; j<arr[i].length; j++)		// j → 0 1 2 3 4 → 0 부터 arr[i]의 배열 길이(5)만큼 증가하고 있다. 	
			{
				arr[i][j] = (i+j)+1;
			}
		}

		// 배열의 배열 결과 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		*/

	}
}
