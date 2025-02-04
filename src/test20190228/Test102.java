package test20190228;

/*====================================
 ■■■ 정렬(Sort) 알고리즘 ■■■■
 - 선택 정렬(Selection Sort)
=====================================*/

/*
	○ 정렬
		: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

	○ 정렬의 목적
		: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
		→ 보기 좋게... 검색하기 위함

	○ 정렬의 종류
		: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬....
	
		종류는 다양하나 효율성 성능면에서 대동소이 함. 
*/

public class Test102
{
	public static void main(String[] args)
	{
	
		int[] a = {52, 42, 12, 62, 60};

		// 함께 풀이한 내용	
		/*
		int i, j;

		for (i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
		
		// 향상된 for문 → forEach 구문

		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();
		
		/* 기억합시다**
			(2자료형 3변수명 : 1꺼낼 자료)
			{ 4 컨트롤 }
			a 내가 꺼낼 자료구조. 배열에서 하나씩 모두 꺼낼거야 
			: 앞에 자료형은 a를 구성하는 자료형. 여기서는 int
			-- 0 부터 a.length 길이까지 모두 꺼낸다.는 의미 
			변수명은 내 맘대로 
		*/	


		// 내가 풀이한 내용
		/*
		// 1. if문으로 조건 확인 후 자리 바꾸기 
		
		for (int i=0; i< ??? ;i++)
		{
			for (int j=1; j< ??? ;j++ )
			{
				if (a[i]>a[j])
				{
					a[i]=a[i]^b[j]
					b[j]=a[i]^b[j]
					a[i]=a[i]^b[j]				
				}
				else
					continue;
			}
		}
		*/	
		
		





/* ------------------------------------------------- 두 값의 비교, 테스트 

		52, 42, 12, 62, 60		0	1
		==  ==
		42, 52, 12, 62, 60	
		

		42, 52, 12, 62, 60		0	2
		==		==
		12, 52, 42, 62, 60	


		12, 52, 42, 62, 60		0	3
		==			==

		12, 52, 42, 62, 60		0	4
		==				==

		--------------------------------- 1회전 
	
		12, 52, 42, 62, 60		1	2
			======
		12, 42, 52, 62, 60


		12, 42, 52, 62, 60		1	3 
			==		==

		12, 42, 52, 62, 60		1	4
			==			==
		--------------------------------- 2회전 
		
		12, 42, 52, 62, 60		2	3
				======

		12, 42, 52, 62, 60		2	4
				==		==
		--------------------------------- 3회전 

		12, 42, 52, 62, 60		3	4
					======
		--------------------------------- 4회전 

*/



	}
}
