package test20190214;
/*====================================================
	■■■ 변수와 자료형 ■■■
	- 퀴즈
	  사전에 부여된 반지름 정보를 통해
	  원의 넓이와 둘레를 구하는 프로그램을 작성한다.
		·반지름 : 10 
======================================================*/

// ※ 문제 인식 및 분석
// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 넓이 : xxxxxx
// 둘레 : xxxxxx
// 계속하려면 아무 키나 누르세요...

public class Test010
{
	public static void main(String[] args)
	{
		// 내가 풀이한 내용
		
		/*

		// 주요 변수 선언
		int a = 10;
		double b; 
		double c;

		// 연산 및 처리
		b = a * a * 3.141592;
		c = a * 2 * 3.141592;

		// 결과 출력 
		System.out.println("넓이 : " + b);
		System.out.println("둘레 : " + c);

		*/


		// 함께 풀이한 내용 

		// 주요 변수 선언
		int r = 10 ;					//--반지름
		final double PI = 3.141592;		//--원주율

		// ※ 키워드 『final』 : 변수의 상수화 (∴사용자에 의해 변경 x) → pi값 새로 정의 x ⇒ 대문자로 이름 명명 (: 암묵적 약속)
		double area, length;

		// 연산 및 처리
		// ① 넓이 연산
		// 원의 넓이 = 반지름 * 반지름 * 3.141592 → 먼저 붙여둔 후 보고 연산식 세우는 습관!
		area = r * r * PI;

		// ② 둘레 연산
		// 원의 둘레 = 반지름 * 2 * 3.141592 
		length = r * 2 * PI;

		// 결과 출력
		// 넓이 : xxxx
		// 둘레 : xxxx
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		System.out.println("넓이 : " + area + "\n둘레 :" + length);



		

	}
}