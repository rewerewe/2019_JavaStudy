package test20190220;
/*===========================================
 ■■■ 실행 흐름의 컨드롤 (제어문) ■■■
 - 반복문 (for문) 실습
============================================*/

/*
○	개요
	『for』문은 정해진 횟수만큼 반복해야 하는 경우
	유용하게 사용되어지는 반복문으로
	『while』문과 마찬가지로 반복 실행해야 하는 구문이
	조건에 만족하지 않을 경우 한 번도 수행되지 않을 수 있으며
	루프 변수의 초기값, 조건식, 증감식 등을 한 지점에서 확인할 수 있기 때문에
	가독성이 높은 반복문에 해당한다.

○ 형식 및 구조	
		
	for (수식1; 수식2; 수식3)		// 초기값, 조건식, 증감식
	{
		실행문;
	}
	·수식1은 루프 변수의 초기화를 위해 사용되며,
			  최초 단 한번만 실행된다.
	·수식2는 조건식을 나타내는 것으로 이 조건식(수식2)이 만족하면
			  루프를 반복해서 수행하게 된다.
			  『for』문의 진행 순서는 수식2가 참이면 반복문을 수행하고
			  수식3을 실행한 후 수식2의 조건식을 다시 검사하는 구조로 진행된다.
			  따라서 처음에 조건식이 거짓일 경우 『for』루프를
			  한 번도 수행하지 않게 되는 것이다.
	·수식3은 루프 변수의 재 초기화를 위해 사용되어지며,
			  반복문의 조건식을 무너뜨리는 증감식으로 처리하는 것이 일반적이다.
			  컴마(『,』)를 이용하여 여러 문장을 수행할 수도 있다. 
*/

public class Test056  
{
	public static void main(String[] args)
	{
		// 관찰

		// n : while에서 사용할 루프변수, m : for문에서 사용할 루프변수 
		int n = 1, m;

		while (n <= 10)
		{	
			System.out.println("n = " + n);
			n++;
		}

		// 개행 
		System.out.println();


		// int m=1 으로 쓸수도 있으나, for문 안에서만 사용할 수 있음 
		for (m=1; m<=10; m++)			
		{	
			System.out.println("m = " + m);
			// 증감식을 추가로 사용해 컨트롤 할 수 있다.
			// m++;
		}
	}
}

// 실행 결과
/*
n = 1
n = 2
n = 3
n = 4
n = 5
n = 6
n = 7
n = 8
n = 9
n = 10

m = 1
m = 2
m = 3
m = 4
m = 5
m = 6
m = 7
m = 8
m = 9
m = 10
계속하려면 아무 키나 누르십시오 . . .
*/
