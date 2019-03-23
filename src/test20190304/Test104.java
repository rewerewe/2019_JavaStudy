package test20190304;
/*====================================
 ■■■ 정렬(Sort) 알고리즘 ■■■■
 - 향상된 버블 정렬(Bubble Sort)
=====================================*/

/*
※ 앞서 공부한 Selection Sort나 Bubble Sort의 성능은 같다. (반복의 횟수로 추정)
	하지만, 향산된 Bubble Sort 는 대상 데이터의 구조에 따라 
	일반 Bubble Sort 나 Selection Sort 보다 성능이 좋다. 

	원본 데이터 = 61  15  20  22  30
				  15  20  20  30  61		-- 1회전 (스왑 발생 true)  -- 다음 회전 ○
				  15  20  20  30  61		-- 2회전 (스왑 발생 false) -- 다음 회전 Ⅹ

==> 1회전 수행... 2회전 수행... 을 해보았더니
	2회전을 수행하는 과정에서 스왑이 전혀 일어나지 않았기 때문에 
	불필요한 추가 연산(회전: 반복)을 수행하지 않는다.
*/

public class Test104
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 33, 40};
		/*
		10, 50, 20, 33, 40		0	1			-- j
		======

		10, 50, 20, 33, 40		1	2 
			======
		
		10, 20, 50, 33, 40		2	3 
				======

		10, 20, 33, 50, 40		3	4 
					======
		
	------------------------------------ 1회전	-- i 

		10, 20, 33, 40, 50		0	1 
		======
			======				1	2
				======			2	3
						
	------------------------------------ 2회전

	Ⅹ
	Ⅹ
	Ⅹ

	*/
	int pass;
	boolean flag = false;

	System.out.print("Source Data : ");
	for (int n : a)
	{
		System.out.print(n + " ");
	}
	System.out.println();

	// 함께 풀이한 내용 
	// 향상된 Bubble Sort 구현
	
	pass = 0;
	do
	{
	
		flag = false;
		pass++;
		for (int i=0; i<a.length-pass; i++)
		{
			if (a[i] > a[i+1])
			{
				// 자리바꾸기 
				a[i]=a[i]^a[i+1];
				a[i+1]=a[i+1]^a[i];
				a[i]=a[i]^a[i+1];
				
				flag = true;

			}
		}

	}
	while (flag);


	// 결과 출력
	System.out.print("Sorted Data : ");
	for (int n : a)
	{
		System.out.print(n + " ");
	}
	System.out.println();
	
	
	// 내가 풀이한 내용
	/* 
		for (int i=1; i<a.length; i++)			// 0 1 2 3 4
		{
			
			flag = false;

			System.out.print("\n i :" + i + " j :" );

			for (int j=0; j<a.length-i; j++)	// 1 2 3 4
			{

				System.out.print(j + " ");

				//자리바꾸기
				if (a[j] > a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];

					flag = true;
				}
				
			}

			if (flag)
				break;
		}
	
	*/ 
	}
}
// 실행 결과
/*
Source Data : 10 50 20 33 40
Sorted Data : 10 20 33 40 50
계속하려면 아무 키나 누르십시오 . . .
*/

