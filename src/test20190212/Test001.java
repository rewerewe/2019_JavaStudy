package test20190212;

/* ===============================

■■■ 자바의 개요 및 특징 ■■■

Test001.java

==================================*/

// 단일행 주석문 처리(한 줄 주석 처리) 	→ 라인 단위 주석 처리
// 주석문 처리하면 컴파일 대상에서 제외됨


/*
여러줄
(다중행)
주석문
처리					→ 블럭 단위 주석 처리
*/

//클래스 이름은 『Test001』
//자바 프로그램의 클래스 이름은 대문자로 시작.
//자바 프로그램 시작할 때 클래스(class)와 main() 을 기본적으로 입력.
//소스 코드 저장시 클래스 이름과 동일한 파일 이름으로 저장.
//단, 이때 확장자는 『*.java』

public class Test001
{
	// main() 메소드 
	// -- 자바 인터프리터가 처음 찾는 메소드(함수)
	// 자바는 본래 컴파일러로 작동함. 컴파일러 안에 인터프린터가 있음 (인터프린터 : 한줄씩 읽고 해석함) 
	// 메인 메소드가 없으면 실행 되지 않음. 

	public static void main(String[] args)
	{
		//
		// 당분간 우리의 코딩 영역 
		//

		System.out.println("프로그램 실행 테스트");
	}
}


//실행결과
/*
프로그램 실행 테스트
*/