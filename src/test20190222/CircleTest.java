package test20190222;

/*################################################
■■■ 클래스와 인스턴스 ■■■ 
################################################*/

//실습 문제
//원의 넓이와 둘레 구하기

//원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
//(클래스 명 : CircleTest) ---> CircleTest.java

//원의 넓이 = 반지름 + 반지름 * 3.141592
//원의 둘레 = 반지름 * 2 * 3.141592

//예
//반지름 입력 : XXX

//>>반지름이 XXX인 원의
//>>넓이 : XXX.xx
//>>둘레 : XXX.xx
//종료

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest {

	final double PI = 3.141592;		//final은 자료형 같이 써줌
 	int r;
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  -> 할 수는 있으나 바람직하지 않음.  메모리 할당이 커지므로 --> 어떻게 코딩을 할지 모르기 때문에 비효율적

	void input() throws IOException		//여기서도 던지고 밖에서도 던져야 완전히 던진것.
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	
	double calArea()
	{
		return r*r*PI;
	}
	
	double calLength()
	{		
		return r*2*PI;
	}
	
	void print(double area, double length)
	{	
		System.out.printf("\n>>반지름이 %d인 원의\n",r);
		System.out.printf(">>넓이 : %.2f\n",area);
		System.out.printf(">>둘레 : %.2f\n",length);
	}
}

