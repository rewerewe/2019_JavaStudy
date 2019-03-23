package test20190218;
/*==========================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - if문 실습 

============================================*/

// 실습 문제 

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름 입력 : 김경환 
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 김경환 입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80, 
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80 입니다.
// >> 등급은 B 입니다.
// 계속하려면 아무키나 누르세요...

// ※ 등급은 평균 점수를 기준으로 처리한다.
// 90점 ~ 100점 : A       80점 ~ 89점 : B
// 70점 ~ 79점  : C       60점 ~ 69점 : D
// 60점 미만    : F

// 80 <= avg < 90 (x)  두 개의 조건이 합쳐진 상황일 때,
// → avg >= 80 논리연산자 avg < 90 
// → avg >= 80 && avg < 90 

// ※ 주의사항 
// 1) 두 개 이상의 조건이라면, 조건은 각각 분리해서 논리연산자**로 묶어 주어야 한다. 
// 논리연산자** : 컴파일, 런타임 에러 발생하지 않기 때문에 판단을 잘해야 한다. 
// 따라서, 조건식을 구분하는 순서에 신경써야 한다.

// 2) if문에서 마지막에 else가 없어도 된다. 
// if ( )
// {
// }
// else if ( )
// {
// }


// 단, BufferedReader 의 readLinn() 메소드를 통해 입력받을 수 있도록 하며, 
// printf() 메소드를 통해 출력할 수 있도록 한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		// 주요 변수 선언
		String sName;
		int nKor, nEng, nMat; // nTot, nLel;
		// double nAvg

		// 연산 및 처리
		// 1) 안내 메시지 출력
		System.out.print("이름 입력 : ");
		// 2) 입력받은 데이터 값 변환 
		sName = br.readLine();			// readLine()은 String 타입이라 변환할 필요x

		System.out.print("국어 점수 : ");
		nKor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		nEng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 : ");
		nMat = Integer.parseInt(br.readLine());
		
		// 총점 산출
		int nTot = nKor + nEng + nMat;
		
		// 평균 산출
		double nAvg = nTot / 3;				// 나눗셈은 정수로 처리된다. double로 선언한다면 실수 기반으로 처리해야함 
		
		//  함께 풀이한 내용

		// 등급 산출			
		char grade;

		if (nAvg >= 90)
		{
			grade = 'A';
		}
		else if (nAvg >= 80)
		{
			grade = 'B';
		}
		else if (nAvg >= 70)
		{
			grade = 'C';
		}
		else if (nAvg >= 60)
		{
			grade = 'D';
		}
		else								// 에러 발생 : else의 조건문 (nAvg < 60) 없애줌. '자바가 이 상황외에 다른 경우에는 내가 출력을 못할 수도 있잖아' 라고 판단해서 보내는 에러
		{									//			↑	상충됨
			grade = 'F';					//		    ↓	
		}									// else를 '꼭' 안써도 된다. 단, 변수 선언시 초기화 해야함. 

		


		/* 내가 풀이한 내용
		
		if (nAvg >= 90)
		{
				nLel = 'A';
		}
		else if (nAvg >= 80 )
		{
				nLel = 'B';
		}
		else if (nAvg >= 70 )
		{
				nLel = 'C';
		}
		else if	(nAvg >= 60 )
		{
				nLel = 'D';
		}	
		else (nAvg < 60 );					// 에러발생 : Test031.java:135: error: not a statement else (nAvg < 60 );
		{
				nLel = 'F';
		}
		
		*/
		

		// 결과 출력 
		System.out.println();
		System.out.printf(">> 당신의 이름은 %s 입니다\n", sName);
		System.out.printf(">> 국어 점수는 %d,\n", nKor);
		System.out.printf(">> 영어 점수는 %d,\n", nEng);
		System.out.printf(">> 수학 점수는 %d,\n", nMat);
		System.out.printf(">> 총점은 %d이고, 평균은 %.1f 입니다.\n", nTot, nAvg);
		System.out.printf(">> 등급은 %c 입니다.\n", grade);


	}
}

// 실행 결과

/*
이름 입력 : 김경환
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 김경환 입니다
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,
>> 총점은 240이고, 평균은 80.0 입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/
