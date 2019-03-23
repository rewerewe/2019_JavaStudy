/* ============================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력
===============================================*/

// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 
// - 삼각형의 높이 입력 :

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxxx
// 계속하려면 아무 키나 누르세요...


// ※ 삼각형의 넓이 : 밑변 * 높이 / 2



// 내가 풀이한 내용
		
/*	
import java.io.BufferedReader;						// [error] 처음에 import.System.in.BufferReader로 작성에서 에러남. 
import java.io.InputStreamReader;
import java.io.IOException;
*/


 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

													// import java.io.* 으로 작성할 수 있으나, 권장하지 않음. →이유: java.io. 패키지 안에 있는 모든 것을 메모리에 올리기 때문에 

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		
		// 내가 풀이한 내용
	
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			// Buffer : 임시적으로 저장하는 공간. 데이터 타입을 갖게 해주기 위해 new로 만들어 줌. 
																							// System.in : 시스템에 입력 
																							// 문자 기반 스트림 - 바이트 기반 스트림 이어주기 위해 StreamReader를 사용. [error] 처음에 InputSystemReader로 작성.
	
		// 변수 선언 및 초기화
		// int br;																			// [error] BufferedReader로 br을 선언해서.
		int w, h;
		double r;


		// 연산
		System.out.println("■ 삼각형의 넓이 구하기 ■");									// 1) 사용자에게 값을 입력받음. 
		System.out.print("- 삼각형의 밑변 입력 : ");
	
		w = Integer.parseInt(br.readLine());												// 2) 입력 받은 값을 읽어 옴. parseInt : 값을 변환함	readLine : 사용자가 입력한 값을 한줄씩 읽음. 

		System.out.print("- 삼각형의 높이 입력 : ");
		h = Integer.parseInt(br.readLine());
		
		r = w * h / 2.0 ;																	// 3) 넓이 연산 


		// 결과 출력 
		// System.out.println(">> 밑변이 " + w + ", 높이가 "+ h + "인 삼각형의 넓이:"+ r);
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", w, h, r); 

		*/

		

		// 함께 풀이한 내용

		// 외부로부터 데이터를 입력받도록 처리하기 위해서
		// BufferedReader 인스턴스 생성 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언

		int underLength, height;	//-- 밑변과 높이
		double area;


		// 연산 및 처리
		// 1) 사용자에게 안내 메시지 출력
		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print("-삼각형의 밑변 입력 : ");

		// 2) 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//    변수 undeLength에 담아내기

		underLength = Integer.parseInt(br.readLine());

		// 3) 다시 사용자에게 안내 메시지 출력
		
		System.out.print("-삼각형의 높이 입력 : ");

		// 4) 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//    변수 height 에 담아내기

		height = Integer.parseInt(br.readLine());

		// 5) 삼각형의 넓이를 구하는 연산 처리
		
		area = underLength * height / 2.0 ;
		//		정수		 정수    정수 
		
		//-- 실수 자료형이 결과값으로 나오는 과정에서 
		//	 실수 기반의 연산이 필요한 상황이다.
		//   정수형 『2』가 아닌 실수형 『2』으로 나눗셈 연산을 수행하기 되면
		//   이 연산은 실수 기반으로 처리된다.

		// 결과 출력
		System.out.println();	// 개행
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f%n",underLength, height, area);


		// () 인자, 인수, 매개변수, 파라미터는 같은 말이다. 

	
	}
}

