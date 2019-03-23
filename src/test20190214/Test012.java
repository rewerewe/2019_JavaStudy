/*=============================================
 ■■■ 자바 기본 프로그래밍 ■■■
 - 변수와 자료형
 - 자바의 기본 입출력 : BufferedReader 클래스 
===============================================*/

// 사용자로부터 반지름을 입력받아 
// 그 입력받은 반지름을 통해 
// 원의 넓이와 둘레를 구하는 프로그램을 구현한다.

// 실행 예)
// 원의 반지름 입력 :
// 넓이 : xxxx.xx
// 둘레 : xxxx.xx
// 계속하려면 아무 키나 누르세요...

package test20190214;

import java.io.BufferedReader;				// BufferedReader는 설계도대로 무언가 만들어 준다. '무언가 읽어들이는 장치'라는 의미. 
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012 
{
	public static void main(String[] args) throws IOException								// 입력,출력과 관련된 예외상황에선 내던져주세요. 
	{
		// BufferedReader 클래스 인스턴스 생성 → 컴퓨터 본체에 키보드 장착
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			// 메소드 호출 
																							// 키보드를 본체에 꽂는 행위와 같다. buffer = 임시적으로 뭔가 저장하는 공간.
																							// 좌항과 우항은 같아야 하기에 BufferedReader타입으로 선언해야한다. 그러나 BufferedReader타입 데이터가 없기 때문에 new 로 새롭게 만들어줌.
																							// 스트림(물줄기) : 문자 기반 스트림-바이트 기반 스트림 두 가지가 있다.   
		// System.out.println();	콘솔에 출력하겠다는 라이브러리.
		// System.in 				사용자로부터 키보드 입력을 받겠다는 라이브러리.
		
		// 주요 변수 선언
		int r;					//-- 반지름
		double a, b;			//-- 넓이, 둘레 

		// 연산 및 처리
		// ① 사용자에게 안내 메시지 출력
		System.out.print("원의 반지름 입력 : ");

		// ② 사용자가 입력한 값(문자열)을 → br.readline()
		//	  숫자형(정수형)으로 변환한 후 → Integer.parseInt()
		//    을 반지름 변수 r에 담아내기
		r = Integer.parseInt(br.readLine());	    // XXX TODO FIXME br.readLine()은 String이기 때문에 Integer.parseInt()를 사용하여 int 타입으로 변경해줌. ex) "3" -> 3		
													// parseInt() : 문자열(숫자형식) 형태로 있는 걸 정수 형태로 바꾸어 주는 역할
													// br.readline() 한줄씩 읽어 오겠다. 'br.' = 의미는 키보드 활용 하겠다. '.' 은 키보드 하위에, 안에 있다는 뜻이다.  
		// ③ 넓이 및 둘레 연산
		a = r * r * 3.141592;
		b = r * 2 * 3.141592;


		// 결과 출력

		// [일반]
		// System.out.println(">> 넓이 : " + a);
		// System.out.println(">> 둘레 : " + b);

		// [실수 형태]
		// System.out.printf(">> 넓이 : %f\n", a);		// 실수는 %f에 담는다. 
		// System.out.printf(">> 둘레 : %f\n", b);

		// [소수 둘째자리]
		System.out.printf(">> 넓이 : %.2f\n", a);		 
		System.out.printf(">> 둘레 : %.2f\n", b);

		//-- 『%f』 10진수 실수형을 담아내는 옵션문자 
		//-- 『%.2f』는 소수점 이하 둘째자리까지 표현하겠다는 의미의 추가 옵션  

	}
}

// 실행 결과 
/*
원의 반지름 입력 : 120
>> 넓이 : 45238.92
>> 둘레 : 753.98
계속하려면 아무 키나 누르십시오 . . .

원의 반지름 입력 : 240
>> 넓이 : 180955.70
>> 둘레 : 1507.96
계속하려면 아무 키나 누르십시오 . . .
*/
