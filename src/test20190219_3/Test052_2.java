package test0219_3;
/*=========================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - �ݺ���(while) �ǽ�
===========================================*/

// �� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �� �������� ��ü �հ�, ¦�� �հ�, Ȧ���� ���� 
// ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 276
// >> 1 ~ 276���� ������ �� : xxxx
// >> 1	~ 276���� ¦���� �� : xxxx
// >> 1 ~ 276���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ�Ű��.... 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test052_2
{
	public static void main(String[] args) throws IOException
	{
		// �� ����
		// ����ڷκ��� ������ ������ �Է¹޾�
		// 1���� �� �������� ��ü �հ�, ¦�� �հ�, Ȧ���� ���� 
		// ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.
	
		int n;
		int p = 1;
		int sum = 0, even = 0, odd = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("������ ���� �Է� : ");
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
			// ¦��
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
