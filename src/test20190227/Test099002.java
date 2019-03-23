/*======================
 ■■■ 배열 ■■■
 - 배열의 복사 
=======================*/

/*
	○ 실습 문제

	임의의 배열(a,b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
	단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
	또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

	ex) 임의의 두 배열 
	int[] a = {2, 3, 7, 10, 11}
	int[] b = {3, 6, 10, 14}

	실행 예)
	2 3 7 10 11 6 14
	계속하려면 아무키나 누르세요...

문자열 형태로 입력 받자. 

*/

public class Test099002
{
	public static void main(String[] args)
	{

		// 배열 선언 및 할당 
		int[] num1 = {2, 4, 5, 6, 7, 10};
		int[] num2 = {1, 4, 7, 33, 10};
		
		//--==>> 2 4 5 6 7 10 1 33 
		arrSum(num1,num2);
		
	
	}

	public static void arrSum(int[] num1, int[] num2)
	{
		int m=0; 

		// 1. num1[] 과 num2[] 중 겹치는 수의 갯수 찾기 
		for (int i=0; i<num1.length; i++)
		{
			for (int j=0; i<num2.length; j++)
			{
				if (num1[i]==num2[j])
					m += 1;
			}
		}
		//테스트
		System.out.print(m);
		//--==>> m==3
		
		/*

		// 2. num1[] 과 num2[]에서 겹치는 수만큼 제외한 빈 배열방 만들기 
		int[] temp = new int [(num1.length+num2.length)-m];

		//--==> temp[8]
		
		// 3. 빈 배열방에 값 넣어주기
		for (int i=0; i<temp.length; i++)
		{
			temp[i] = num1[i];
		}
		//--==>> 2 4 5 6 7 10 

		*/

	}
}






/*
public class Test099002 
{
    public static void main(String[] args) 
	{
        //배열 선언 및 할당
        int[] A = {2,3,7,10,11,18,20,21};
        int[] B = {3,6,10,14,17};

        //A와 B 배열의 요소 전체 출력
        for (int i = 0; i<A.length; i++) {
            System.out.printf("%d ", A[i]);
         }
        for (int i = 0; i<B.length; i++) {
            System.out.printf("%d ", B[i]);
         }
        System.out.println();

        //A와 B 배열의 요소 출력. 중복 제거.
        for (int i = 0; i<A.length; i++) {
            System.out.printf("%d ", A[i]);
         }
        for (int i = 0; i<B.length; i++) {
            boolean flag = false;
            for (int k = 0; k<A.length; k++) {
                if(B[i] == A[k]) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
            //if (flag)
            //   continue; 라고 해도 동일한 결과(중복 제거되고 출력됨)

                System.out.printf("%d ", B[i]);
         }
        System.out.println();
    }

}

*/

