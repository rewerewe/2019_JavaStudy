package test0219_3;
/*=========================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - 반복문(while) 실습
===========================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수까지의 전체 합과, 짝수 합과, 홀수의 합을 
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 276
// >> 1 ~ 276까지 정수의 합 : xxxx
// >> 1	~ 276까지 짝수의 합 : xxxx
// >> 1 ~ 276까지 홀수의 합 : xxxx
// 계속하려면 아무키나.... 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test052_2
{
	public static void main(String[] args) throws IOException
	{
		// ○ 과제
		// 사용자로부터 임의의 정수를 입력받아
		// 1부터 그 수까지의 전체 합과, 짝수 합과, 홀수의 합을 
		// 각각 결과값으로 출력하는 프로그램을 구현한다.
	
		int n;
		int p = 1;
		int sum = 0, even = 0, odd = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		// n = 3
		// p = 1, n = 3 -> 1 <= 3 -> sum += 1 -> p++
		// p = 2, n = 3 -> 2 <= 3 -> sum += 2 -> p++
		// p = 3, n = 3 -> 3 <= 3 -> sum += 3 -> p++
		// p = 4, n = 3 -> 4 <= 3 -> false
		while (p <= n) {
			//System.out.println("p = " + p + ", n = " + n + " \t " + p + " <= " + n + " \t sum += " + p + " \t p++");
			sum += p;
			// if n = 4, even : 2 + 4 = 6, odd : 1 + 3 = 4 
			// if n = 6, even : 2 + 4 + 6 = 12, odd : 1 + 3 + 5 = 9
			// 짝수
			if (p % 2 == 0) {
				even += p;
//				System.out.printf("p: %d, n: %d, even: %d \n", p, n, even);
			} else {
				odd += p;
			}
			p++;
		}
		
		System.out.println("sum : " + sum);
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
			
	}
}
