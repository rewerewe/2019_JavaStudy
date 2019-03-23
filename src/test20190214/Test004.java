package test20190214;
/*=========================================
■■■ 자바의 개요 및 특징 ■■■
- 변수와 자료형
- 키워드 및 식별자
===========================================*/

public class Test004
{
	public static void main(String[] args)
	{
		// double height = 171.6;
		// int age = 27;
		// char degree = 'A';

		String name = "곽한얼";
		// String name = "권홍비";		 컴파일 에러

		/*	결과: Test004.java:16: error: variable name is already defined in method main(String[])
                String name = "권홍비";
			오류: 기본 클래스 Test004을(를) 찾거나 로드할 수 없습니다.	*/

		// 스코프 영역 안에서 변수명은 식별자. 
		
		/* 문자열을 담는 데이터 타입	
		1. 첫 문자 대문자		
		2. char 타입과 다른가?		
		3. int와 다르게 색이 있음	왜 프리미티 자료형과 구분되는지 생각. 

		객체형식으로 제공되는 클래스. 객체. 인스턴스라는 벽...

		보이는 영역(즉, main 영역 안에서)에서 선언한 변수는 보이는데, '스코프'라 한다. */

		/*
		String #name = "김경환";
		『$』와 『_ 』을 제외한 다른 특수문자는 
		변수이름으로 활용할 수 있다.
		하지만 사용가능한 이들 특수문자들 마저도 
		함부로 사용하는 것은 고려해야 한다.
		*/
		
		String _tel = "010-1111-2222";

		String 주소 = "서울시 마포구";
		
		/* 문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		실무적인 측면에서 접근한다면
		절대로 한글 단어를 변수명으로 사용해서는 안된다. */
		
		int $age = 23;
		
		// 결과 출력 
		System.out.println("name : " + name);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);
		System.out.println("$age : " + $age);

		/* 실행 결과
		name : 곽한얼
		_tel : 010-1111-2222
		주소 : 서울시 마포구
		$age : 23	*/





	}
}