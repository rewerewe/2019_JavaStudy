/*==========================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - switch�� �ǽ�

===========================================*/

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
		// �Բ� Ǯ���� ����
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int n;

		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());
		
		// �� �Ϲ� �� : break�� �����Ӱ� Ȱ���� switch ��
		/* 
		switch (n)
		{
			case 1 : System.out.println("��"); break;
			case 2 : System.out.println("�ڡ�"); break;
			case 3 : System.out.println("�ڡڡ�"); break;
			default : System.out.prntln("�Է� ����-!");
		
		}
		*/
		// �� �⺻ �� 
		switch (n)
		{
			case 3 : System.out.print("��");
			case 2 : System.out.print("��");
			case 1 : System.out.print("��\n"); break;
			default : System.out.println("�Է� ����-!");
			
		}

		switch (n)
		{
			default : System.out.println("�Է� ����-!");
			case 3 : System.out.print("��");
			case 2 : System.out.print("��");
			case 1 : System.out.print("��\n"); break;
			
		}


		// ���� Ǯ���� ���� 
		/*
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է�(1~3) : ");
		int n = Integer.parseInt(br.readLine());

		String star;
	
		// �� switch�� �Ϲݸ�
		/*
		switch (n / 3)
		{
		case 3 : star = "�ڡڡ�"; break;
		case 2 : star = "�ڡ�"; break;
		case 1 : star = "��"; break;
		}
		
		// System.out.printf("������ ���� �Է�(1~3) : %d\n", n);
		System.out.println(star);
		

		// �� switch�� �⺻��
		switch (n)
		{
		case 3 : star = "��";
		case 2 : star = "��";
		case 1 : star = "��"; break;
		default : star = "�Է� ����-!";
		}

		System.out.println(star);

		*/

		


	}
}