/*================================
 ■■■ 클래스와 인스턴스 ■■■
 - 클래스와 인스턴스 활용
=================================*/

/*
	○ 실습 문제
	1 ~ 3 사이의 정수 형태를 난수를 발생시켜 
	가위, 바위, 보 게임 프로그램을 구현한다.

	단, 클래스 개념을 활용하여 처리할 수 있도록 한다. 
	또한, 배열을 활용하여 처리할 수 있도록 한다.

	기준데이터 → 1:가위, 2:바위, 3:보

	실행 예)
	1:가위 2:1바위 3:보 중 입력(1~3) : 4
	1:가위 2:1바위 3:보 중 입력(1~3) : -12
	1:가위 2:1바위 3:보 중 입력(1~3) : 2
	- 유저	 : 바위 
	- 컴퓨터 : 보 
	>> 승부최종결과 : 컴퓨터가 이겼습니다-!!
	계속하려면 아무키나 누르세요...

*/
import java.util.Scanner;
import java.util.Random;

class Computer
{
	int ComNum()
	{	
		// 난수 구하기
		Random rd = new Random();
		int comSu = rd.nextInt(3)+1;
		return comSu;
		
	}
}

class Human
{
	// 사용자로부터 숫자 입력 받기 
	int HuNum()
	{
		int rcp;
		

		// Scanner 인스턴스 생성 
		Scanner sc = new Scanner(System.in);
		
		// 일단 한번 실행되고, 조건에 맞지 않을 경우 반복문 종료 
		do
		{
			// 안내 메시지 출력 
			System.out.print("1:가위 2:1바위 3:보 중 입력(1~3) : ");
			rcp = sc.nextInt();
		}
		while (rcp<1 || rcp>3);

		System.out.print("유저	 : ");
		
		return rcp;
	}

}


class RCP
{
	void result(int user, int computer)
	{
		
		if (user > computer)
				System.out.print("유저가 이겼습니다~!!!");

			else if (user < computer)
				System.out.print("컴퓨터가 이겼습니다~!!!");

			else if (user == computer)
				System.out.print("유저와 컴퓨터가 비겼습니다~!!!");
	}
}


public class Test0942
{
	public static void main(String[] args)
	{
		Computer ob1 = new Computer();
		int comsu = ob1.ComNum();
		// 테스트 
		// System.out.println(comsu);

		Human ob2 = new Human();
		int humansu = ob2.HuNum();
		System.out.println(humansu);

		RCP ob3 = new RCP();
		ob3.result(humansu, comsu);
		

	}
}