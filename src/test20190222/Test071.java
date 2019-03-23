package test20190222;
/*==================================
 ■■■ 클래스와 인스턴스 ■■■
===================================*/

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592
// 반지름은 정수형으로 입력 받는다

// 실행 예)
// 반지름 입력 : xxxx

// >> 반지름이 xxx인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무키나 누르세요...

import java.io.IOException;

public class Test071
{
	// throws IOException 써주지 않으면 에러 발생 → 
	// input 메소드 예외 (강의장 수류탄) 던지면 → main() (건물) 로 떨어짐 → main() 밖으로 다시 던져주어야 함. 
	public static void main(String[] args) throws IOException
	{
		// double (변수 선언시 '파란색'은 공간을 만들겠다고 이해하면 됨) 
		// circle 인스턴스 생성 = 클래스명이 와야 한다. 
		CircleTest cc = new CircleTest();
		
		// 입력 메소드 호출
		cc.input();

		// calArea(넓이) 메소드 호출
		double area = cc.calArea();

		// calLength(둘레) 메소드 호출
		double length = cc.calLength();

		// 넓이, 둘레 출력 메소드 호출
		cc.print(area, length);
		
	}
}