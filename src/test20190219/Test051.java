/*=========================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - 반복문(while) 실습
===========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수부터 큰 수까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10 
// 두 번째 정수 입력 : 20
// >> 10 ~ 20 까지의 합 : xxxx
// 계속하려면 아무키나....

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2
// >> 2 ~ 10까지의 합 : xxxx
// 계속하려면 아무키나....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1, n2;
		int sum = 0;

		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		sum += 
	}
}
