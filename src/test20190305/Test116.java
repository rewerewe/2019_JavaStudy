package test20190305;
/*=======================================
 ■■■ 클래스 고급 ■■■
 - 인터페이스 (Interface)
=========================================*/

/* 
	○	실습 문제
		성적 처리 프로그램을 구현한다.
		단, 인터페이스를 활용할 수 있도록 한다
	
	실행 예)
	인원 수 입력(1~10) : 2
	1번째 학생의 학번 이름 입력(공백구분) : 1921004 이원영 
	국어 영어 수학 점수 입력   (공백구분) : 90 100 85
	2번째 학생의 학번 이름 입력(공백구분) : 1921005 이재준 
	국어 영어 수학 점수 입력   (공백구분) : 85 70 65
	
	1921004 이원영	90 100	85		275		91
					수	수	우		
	1921005 이재준	85	70	65		220		73
					우	미	양	
	
	계속하려면 아무키나 누르세요...

*/

// 속성만 존재하는 클래스 → 자료형 활용

import java.util.Scanner;

class Record
{
	String hak, name;				//-- 학번, 이름
	int kor,eng,mat;				//-- 국어, 영어, 수학 점수
	int tot, avg;					//-- 총점, 평균(편의상 정수 처리)
	String[] grade = new String[3];	//-- 등급 배열 		
}

// 인터페이스
interface Sungjuk
{
	public void set();
	public void input();
	public void print();

}

// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl implements Sungjuk
{
	// 인원 수 입력받을 num, Record형의 배열 recArr, String형 greArr 선언 
	int num;
	Record[] recArr;

	@Override
	public void set() 
	{
		// Scanner 인스턴스 생성 
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			num = sc.nextInt();
		}
		while (num<0 || num>10);
		
		// 입력받은 인원 수만큼 배열 recArr 정의 
		recArr = new Record[num];

	}

	@Override
	public void input()
	{
		
		// Scanner 인스턴스 생성 
		Scanner sc = new Scanner(System.in);

		// 점수 입력 받기 
		for (int i=0; i<recArr.length; i++)
		{
			// 배열 생성 
			recArr[i] = new Record();
			
			System.out.printf("%d 번째 학생의 학번(3자리) 이름 입력(공백구분) : ", (i+1));
			recArr[i].hak  = sc.next();
			recArr[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력 (공백구분) : ");
			recArr[i].kor = sc.nextInt();
			recArr[i].eng = sc.nextInt();
			recArr[i].mat = sc.nextInt();
		}
		

		// 총점, 평균 연산
		for (int i=0; i<recArr.length; i++)
		{
			recArr[i].tot = recArr[i].kor + recArr[i].eng + recArr[i].mat;
			recArr[i].avg = recArr[i].tot / 3;
				
		}


		// 국어 등급 판별
		for (int i=0; i<recArr.length; i++)
		{
			if (recArr[i].kor >= 90)
			{
				recArr[i].grade[0] = "수";
			}
			else if (recArr[i].kor >= 80)
			{
				recArr[i].grade[0] = "우";
			}
			else if (recArr[i].kor >= 70)
			{
				recArr[i].grade[0] = "미";
			}
			else if (recArr[i].kor >= 60)
			{
				recArr[i].grade[0] = "양";
			}
			else 
			{
				recArr[i].grade[0] = "가";
			}
		}
		
		// 영어 등급 판별
		for (int i=0; i<recArr.length; i++)
		{
			if (recArr[i].eng >= 90)
			{
				recArr[i].grade[1] = "수";
			}
			else if (recArr[i].eng >= 80)
			{
				recArr[i].grade[1] = "우";
			}
			else if (recArr[i].eng >= 70)
			{
				recArr[i].grade[1] = "미";
			}
			else if (recArr[i].eng >= 60)
			{
				recArr[i].grade[1] = "양";
			}
			else 
			{
				recArr[i].grade[1] = "가";
			}
		}

		// 수학 등급 판별
		for (int i=0; i<recArr.length; i++)
		{
			if (recArr[i].mat >= 90)
			{
				recArr[i].grade[2] = "수";
			}
			else if (recArr[i].mat >= 80)
			{
				recArr[i].grade[2] = "우";
			}
			else if (recArr[i].mat >= 70)
			{
				recArr[i].grade[2] = "미";
			}
			else if (recArr[i].mat >= 60)
			{
				recArr[i].grade[2] = "양";
			}
			else 
			{
				recArr[i].grade[2] = "가";
			}
		}
		
	}
		
 

	@Override
	public void print()
	{
		for (int i=0; i<recArr.length; i++)
		{
			// 결과 출력 
			System.out.printf("\n %3s %3s %5d %3d %3d %5d %3d", recArr[i].hak, recArr[i].name, recArr[i].kor, recArr[i].eng, recArr[i].mat, recArr[i].tot, recArr[i].avg);
			System.out.printf("\n %14s %3s %2s", recArr[i].grade[0], recArr[i].grade[1], recArr[i].grade[2]);		
		}
		System.out.println();
	}

}//-- SungjukImpl class end 

public class Test116
{
	public static void main(String[] args)
	{
		Sungjuk ob;

		
		// 문제 해결 과정에서 작성해야 할 ob 구성
		//-- SungjukImpl 인스턴스 생성
		SungjukImpl ob2 = new SungjukImpl();
		
		ob = ob2;	//-- 업 캐스팅 
		
		ob.set();
		ob.input();
		ob.print();
	}
}

// 실행 결과
/*
인원 수 입력(1~10) : 2
1 번째 학생의 학번(3자리) 이름 입력(공백구분) : 222 정임혜
국어 영어 수학 점수 입력 (공백구분) : 90 80 70
2 번째 학생의 학번(3자리) 이름 입력(공백구분) : 222 이기승
국어 영어 수학 점수 입력 (공백구분) : 80
70 60

 222 정임혜    90  80  70   240  80
              수   우   미
 222 이기승    80  70  60   210  70
              우   미   양
계속하려면 아무 키나 누르십시오 . . .
*/