/*==========================
   ■■■ 배열 ■■■
 - 배열의 선언과 초기화 
 - 배열의 기본적인 활용 
===========================*/

// ○ 실습 문제
// 임의의 숫자들이 들어있는 배열의 숫자 데이터들 중
// 짝수인 요소만 골라서 출력하고,
// 3의 배수인 요소만 골라서 출력하는 프로그램을 구현한다.

// ※ 배열을 구성하는 임의의 숫자 구성 
//	  → 4 7 9 1 3 2 5 6 8 

// 실행 예)
// 배열 요소 전체 출력
// 4 7 9 1 3 2 5 6 8
// 짝수 선택적 출력
// 4 2 6 8 
// 3의 배수 선택적 출력
// 9 3 6 


public class Test080
{
	public static void main(String[] args)
	{

		// 함께 풀이한 내용 
		/* 방법 ① 
		int[] arr= new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		// 방법 ② → 방의 갯수는 n-1개 		
		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};
	
		System.out.println(arr);
		//--==>> [I@15db9742
		//	 ※ 일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는
		//		배열에 담긴 데이터들을 출력할 수 없다.
		/*
		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<9; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/
		// 배열의 길이가 9이기 때문에 따라서 i<=8 보다 i<9로 쓰는 편이 낫다.
		// 대상이 배열이라면, 배열 설계에 있는 변수,메소드를 쓸 수 있다.  

		// ※ 배열 arr의 길이(방의 갯수) 확인
		//	  arr.length
		
		System.out.println("배열 arr 의 길이 : " + arr.length);

		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		System.out.println("짝수 선택적 출력");
		for (int i=0; i<arr.length; i++)
		{	
			/* 
			if (i%2==0) //-- i가 짝수라면... → 짝수번째 해달하는 요소라면...
			{
				System.out.print(arr[i]+ " ");
			}
			//--==>> 4 9 3 5 8
			*/
			if (arr[i]%2==0) //-- i번째에 해당하는 그 값가 짝수라면... 
			{
				System.out.print(arr[i]+ " ");
			}		
		}
		System.out.println();

		System.out.println("3의 배수 선택적 출력");
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]%3==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		// 내가 풀이한 내용 
		/*
		// 배열 선언 및 메모리 할당 
		// int[] arr = new int[9];
		
		int[] arr = new int[9];
		arr[0] = 4; 
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;

			  

		// 배열 출력 
		// 전체 출력
		System.out.println("배열 요소 전체 출력");
		
		for (int i=0; i<=8; i++)
		{
			System.out.print(arr[i] + " ");
		
		}

		// 짝수 출력 
		System.out.println();
		System.out.println("짝수 선택적 출력");
		for (int i=0; i<=8; i++)
		{
			if (arr[i]%2==0)
			{
				System.out.print(arr[i]+ " ");
			}
		}

		//3의 배수 출력
		System.out.println();
		System.out.println("3의 배수 선택적 출력");
		for (int i=0; i<=8; i++)
		{
			if(arr[i]%3==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		*/
	}
}

// 실행 결과
/*
[I@15db9742
배열 arr 의 길이 : 9
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
9 3 6
계속하려면 아무 키나 누르십시오 . . .


*/


