package test20190219;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050_1
{
	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է� : ");
		int n = Integer.parseInt(br.readLine());

		boolean isSosu = false;			 // �� ������ ��¿��� �Ҽ����θ� �˷��ִ� ����

		if (n == 1) {
			isSosu = false;				// 1�� �Ҽ� �ƴ�
		} else if (n == 2) {
			isSosu = true;				// 2�� �Ҽ�
		} else if (n > 2) {
			int i = 2;					// ���� ����
			while (i < n) {				// �Է��� �� n���� i�� ���� �����϶����� �ݺ��� ����
				if (n % i == 0) {		// n�� i�� ������ �������� ����
					// TODO �Ʒ� �ּ��� Ǯ�� �ܼ� ������� Ȯ�� ����.
					// System.out.println(n + "%" + i + "=" + (n % i));
					break; // �Ҽ��� �ƴϹǷ� while�� �� �̻� �ݺ����� �ǹ̰� ����.
				} else {
					isSosu = true; // �Ҽ�
				}
				i++;
			}
		}

		String result = n + "�� �Ҽ�";
		if(isSosu) {
			result += " O";
		} else {
			result += " X";
		}
		System.out.println(result);

			}
}