/*===============================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - switch문 실습
================================================*/

/*

○ 다중 선택문이라 하며, switch문 다음의 수식 값에 따라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

○ 형식및 구조
	switch(수식)
	{
		case 상수1: 문장1; [break;]
		case 상수2: 문장2; [break;]
					：
		[default : 문장 n+1;[break;]
	}

	switch문의 『수식』과 『case』 의 상수는
	byte, short, int, long형이어야 한다.

	case문 뒤에 『break;』이 없는 형태인 경우
	다음 case 문의 문장을 계속해서 수행하게 된다. (기본 모델)

*/

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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat;
		
		System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());

		// 총점 산출
		
		int tot = kor + eng + mat;
			
		// 평균 산출
		
		double avg = tot / 3.0;				// int avg = tot / 3; 도 가능
		char grd;							// char grd = 'F';
		
		// 등급 산출 (switch문 활용) 

		switch ((int)avg / 10)
		{
		case 10 : case 9 : grd = 'A'; break;			// 일반 모델 [break; 멈춘다 그리고 빠져나간다.]를 사용한다. 
		
		case 8 : grd = 'B'; break;
	
		case 7 : grd = 'C'; break;
		
		case 6 : grd = 'D'; break;
		
		default : grd = 'F'; break;
	
		/*
		{
		case 9 : grd = 'A'; break;		
		case 8 : grd = 'B'; break;	
		case 7 : grd = 'C'; break;		
		case 6 : grd = 'D'; break;		
		case 5 : grd = 'F'; break;		
		case 4 : grd = 'F'; break;	
		case 3 : grd = 'F'; break;		
		case 2 : grd = 'F'; break;
		case 1 : grd = 'F'; break;		
		}
		*/
		}

		System.out.println();
		System.out.printf(">> 당신의 이름은 %s입니다.\n",name);
		System.out.printf(">> 국어 점수는 %d,\n", kor);
		System.out.printf(">> 영어 점수는 %d,\n", eng);
		System.out.printf(">> 수학 점수는 %d,\n\n", mat);
		System.out.printf(">> 총점은 %d 이고, 평균은 %.2f입니다.\n", tot, avg);
		System.out.printf(">> 등급은 %c 입니다.\n", grd);


	}
}

// 실행 결과
/*
이름 입력 : 정임혜
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 정임혜 입니다.
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,

>> 총점은 240 이고, 평균은 80.00입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/