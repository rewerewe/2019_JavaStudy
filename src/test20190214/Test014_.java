package test20190214;
/*========================================
자바의 기본 프로그래밍
- 변수와 자료형
- 자바의 기본 입출력 : BufferedReader
==========================================*/

// 사용자로부터 이름과 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 한승원
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ===[결과]===
// 이름 : 한승원
// 총정 : 240
// ============
// 계속하려면 아무 키나 누르세요...


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/* 내가 작성한 코드
import java.io.BufferedReader;
import java.io.InputStreamReader; */


public class Test014_
{
	public static void main(String[] args) throws IOException
	{
		
		// 함께 작성한 코드
		
		/*

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


		// 주요 변수 선언
		String strName;				//-- 이름 변수 
		int nKor, nEng, nMat, nTot	//--국어, 영어, 수학, 총점 변수 
		
		
		*/


		
		// 내가 작성한 코드

		
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			// 문자기반 스트림 - 바이트 기반 스트림 연결.

		// 변수 선언 및 초기화
		String name;
        int ko, en, ma;
		
		// 연산 및 처리
		// 1) 사용자로부터 값을 입력받음
		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();												// readLine : 한줄씩 읽음 - parseInt : 정수형 값으로 변환함. 

		

		// 결과 출력 

	





	}

}