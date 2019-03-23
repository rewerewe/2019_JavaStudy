/*
 - switch�� �ǽ�
*/

// �� �ǽ� ����
// 1 ���� 3 ������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
// �Է¹��� ������ŭ ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ������ ������� ������ �� �ֵ��� �Ѵ�.

// �� switch ���� �Ϲ� ���� Ȱ���Ѵ�. (== Break;�� ��~~�� ����Ѵ�.)
// �� switch ���� �⺻ ���� Ȱ���ϵ�,
//	��break���� �� �ѹ��� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է�(1~3) : 1
// �� 
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է�(1~3) : 7
// �Է� ����-!
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է�(1~3) : ");
		int n = Integer.parseInt(br.readLine());

		String star;
	
		// �� switch�� �Ϲݸ�
		/*
		switch (n / 3)
		{
		case 1 : star = "�ڡڡ�"; break;
		case 2 : star = "�ڡ�"; break;
		default : star = "��"; break;
		}
		
		// System.out.printf("������ ���� �Է�(1~3) : %d\n", n);
		System.out.println(star);
		*/

		// �� switch�� �⺻��
		switch (n)
		{
		case 3 : star = "��";
		case 2 : star = "��";
		case 1 : star = "��"; break;
		default : star = "�Է� ����-!";
		}

		System.out.println(star);


	}
}