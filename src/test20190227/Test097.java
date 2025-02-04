package test20190227;
/*=======================================
 ■■■ 배열 ■■■
 - 배열의 복사  : Test098.java와 비교~!!!
========================================*/

/*
	배열 변수의 복사는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.
	주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법.
								(배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사)
	데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로 
								원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법. 
*/



// 주소값 복사


public class Test097
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};		//-- 배열 원본
		int[] copys;							//-- 복사본으로 만들 배열

		int temp;								//-- 실습 진행(테스트)를 위한 임시 변수 

		// check~!!!
		copys = nums;							//-- 복사 

		temp = nums[0];

		nums[0] = 1500;

		for (int i=0; i<copys.length; i++)
		{	
			System.out.printf("%d\t", copys[i]);
		}
		System.out.println();

		System.out.println("temp : " + temp);
		
	}

	//  실행결과
	/*결과 출력
	
	1500    20      30      40      50
	temp : 10
	계속하려면 아무 키나 누르십시오 . . .*/

	
}