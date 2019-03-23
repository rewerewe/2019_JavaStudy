package test20190219;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050_1
{
	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 정수 입력 : ");
		int n = Integer.parseInt(br.readLine());

		boolean isSosu = false;			 // 맨 마지막 출력에서 소수여부를 알려주는 기준

		if (n == 1) {
			isSosu = false;				// 1은 소수 아님
		} else if (n == 2) {
			isSosu = true;				// 2는 소수
		} else if (n > 2) {
			int i = 2;					// 나눌 정수
			while (i < n) {				// 입력한 값 n보다 i가 작은 숫자일때까지 반복문 실행
				if (n % i == 0) {		// n을 i로 나누어 떨어지는 순간
					// TODO 아래 주석을 풀면 콘솔 출력으로 확인 가능.
					// System.out.println(n + "%" + i + "=" + (n % i));
					break; // 소수가 아니므로 while을 더 이상 반복문은 의미가 없음.
				} else {
					isSosu = true; // 소수
				}
				i++;
			}
		}

		String result = n + "은 소수";
		if(isSosu) {
			result += " O";
		} else {
			result += " X";
		}
		System.out.println(result);

			}
}