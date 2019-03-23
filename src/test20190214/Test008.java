/*=========================================
■■■ 변수와 자료형 ■■■
- 변수와 자료형 실습 및 테스트 : char
char 타입 : 아스키코드 값을 가진 정수형이다. 
==========================================*/

public class Test008 
{
	public static void main(String[] args)
	{
	// 주요 변수 선언
	char ch1, ch2, ch3;
	int a;


	// 연산 및 처리
	ch1 = 'A';
	ch2 = '\n';		// --개행
	ch3 = '대';
	a=ch1;
	a=(int)'A';			// 내부적으로 65라는 아스키코드가 있기 때문에. 자동 형변환 규칙에도 위배되지 않는다. (int)를 써줌으로써 명시적 형변환으로 알려줄 수도 있다. 


	// 결과 출력
	System.out.println("ch1 : " + ch1);
	System.out.println("ch2 : " + ch2);
	System.out.println("ch3 : " + ch3);
	System.out.println("a : " + a);


	}
}

//실행 결과 

/*
ch1 : A
ch2 :

ch3 : 대
a : 65
계속하려면 아무 키나 누르십시오 . . .

*/
