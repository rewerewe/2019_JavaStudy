package test0219_3;
/*=========================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - �ݺ���(while) �ǽ�
===========================================*/

// �� ����
// ����ڷκ��� ���ϴ� ��(������)�� �Է¹޾� 
// �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶�� 
// ���α׷��� �����ع��� �� �ֵ��� ó���Ѵ�.

// ���� ��)
// ���ϴ� ��(������) �Է� : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//   �� 
// 7 * 9 = 63 
// ����Ϸ��� �ƹ�Ű��...

// ���ϴ� ��(������) �Է� : 11
// 1���� 9������ ������ �Է� �����մϴ�.
// ����Ϸ��� �ƹ�Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum = -1, dan = 1;

		System.out.print("���ϴ� ��(������) �Է� : ");
		inputNum = Integer.parseInt(br.readLine());
		
		/*
		while (dan <= 9)
		{
			// 1, 2, 3, ..., 9
			if (0 < inputNum && inputNum > 10) {
				result = inputNum * dan;
				// 7 * 1 = 7
				// 7 * 2 = 14
				System.out.printf("%d * %d = %d \n", inputNum, dan, result);
			} else {
				System.out.println("1���� 9������ ������ �Է� �����մϴ�.");
			}
		}
		*/

		// 1, 2, 3, ..., 9
		if (0 < inputNum && inputNum < 10) {
			while (dan <= 9) {
				// 7 * 1 = 7
				// ...
				// 7 * 9 = 63
				System.out.printf("%d * %d = %d \n", inputNum, dan, inputNum * dan);
				dan++;
			}
		} else {
			System.out.println("1���� 9������ ������ �Է� �����մϴ�.");
		}
	}
}


