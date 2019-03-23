package test20190215;
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


public class Test014
{
	public static void main(String[] args) throws IOException
	{
		
		// 함께 작성한 코드
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


		// 주요 변수 선언
		String strName;				//-- 이름 변수 
		int nKor, nEng, nMat, nTot;	//--국어, 영어, 수학, 총점 변수 

		// 추가 변수 선언
		String strTemp;

		// 연산 및 처리 
		// 이름을 입력하세요 :
		System.out.print("이름을 입력하세요 : ");		

		// ·사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strName = br.readLine();			// 변환할 필요없이 (parseInt x) 적은 내용 그대로 

		// 사용자에게 안내 메시지 출력 (국어점수 입력 안내)
		System.out.print("국어 점수 입력 : ");

		// 사용자가 입력한 값(외부데이터를) 변수에 담아내기
		strTemp = br.readLine();			//--문자열 임시 저장
		nKor = Integer.parseInt(strTemp);	//--임시저장 데이터 형 변환 후 
											//-- 국어 점수 변수에 담아내기

		// 사용자에게 안내 메시지 출력(영어 점수 입력 안내)
		System.out.print("영어 점수 입력 : ");

		// 사용자가 입력한 값(외부데이터를) 변수에 담아내기
		strTemp = br.readLine();			//--문자열 임시 저장
		nEng = Integer.parseInt(strTemp);	//--임시저장 데이터 형 변환 후 
											//-- 국어 점수 변수에 담아내기

		// 사용자에게 안내 메시지 출력(영어 점수 입력 안내)
		System.out.print("수학 점수 입력 : ");

		// 사용자가 입력한 값(외부 데이터를)을 변수에 담아내기
		strTemp = br.readLine();			//--문자열 임시 저장
											//-- (기존 영어점수에 덮어쓰기)
		nMat = Integer.parseInt(strTemp); //--임시 저장 데이터 형 변환 후 
		// 수학점수 변수에 담아내기
		// 총점 산출하기
		nTot = nKor + nEng + nMat;


		//결과 출력 
		//System.out.println();
		System.out.println("\n===[결과]==="); //-- \n개행부터 하고 
		System.out.println("이름 : " + strName);
		System.out.println("총점 : " + nTot);
		System.out.println("==============");
		
		
		
		// 내가 작성한 코드

		/*  

		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			// 문자기반 스트림 - 바이트 기반 스트림 연결.

		// 변수 선언 및 초기화
		String name;
        int ko, en, ma;
		
		// 연산 및 처리
		// 1) 사용자로부터 값을 입력받음
		System.out.print("이름을 입력하세요 : ");
		name = Integer.parseInt(br.readLine());												// readLine : 한줄씩 읽음 - parseInt : 정수형 값으로 변환함. 

		
		// 결과 출력 

		*/

	}

}

// 실행 결과
/*
이름을 입력하세요 : 정임혜
국어 점수 입력 : 100
영어 점수 입력 : 80
수학 점수 입력 : 70

===[결과]===
이름 : 정임혜
총점 : 250
==============
계속하려면 아무 키나 누르십시오 . . .
*/