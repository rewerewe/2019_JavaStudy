package test20190218;

/*
 ���� �帧�� ��Ʈ�� (���)
 - if ~ else �ǽ�
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args)	throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n;



		System.out.print("���̽�ũ�� ���� ���� (1.���� 2.����) :");
		n = Integer.parseInt(br.readLine());

		if (n == 1)
		{
			System.out.println("���� ���̽�ũ�� ����-!");
		}
		else if (n == 2)
		{
			System.out.println("���� ���̽�ũ�� ����-!");
		}
		else 
		{
			System.out.println("���� �Ұ�-!");
		}

		
		/*

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		// O �� '0'���� �Ǵ��� '¦��', 'Ȧ��'���� ���� �ؾ� �Ѵ�. 
		if (n == 0)
		{
			System.out.println(n + " �� ��");
		}
		else if (n % 2 == 0)
		{	
			System.out.println(n + " �� ¦��");
		}
		else 
		{
			System.out.println(n + " �� Ȧ��");
		}
		
		*/

		/* // ���� ��Ȳ
		
		if (n == 0)
		{
			System.out.println(n + " �� ��");
		}
		else if (n % 2 == 0)
		{	
			System.out.println(n + " �� ¦��");
		}
		else if (n % 2 !=0)
		{
			System.out.println(n + " �� Ȧ��");
		}
		else 
		{
			System.out.println("���� �Ұ����� ��Ȳ");
		}

		*/


		/* 2) x ������

		if (n % 2 != 0)
		{
			System.out.println(n + " �� Ȧ��");
		}
		else if (n % 2 == 0)
		{	
			System.out.println(n + " �� ¦��");
		}
		else if (n == 0)
		{
			System.out.println(n + " �� ��");
		}
		*/


		/* 1) x ������ 
		
		if (n % 2 == 0)
		{
			System.out.println(n + " �� ¦��");
		}
		else if (n == 0)
		{	
			System.out.println(n + " �� ��");
		}
		else 
		{
			System.out.println(n + " �� Ȧ��");
		}

		*/
	}
}

// ���� ���
/*
���̽�ũ�� ���� ���� (1.���� 2.����) :1
���� ���̽�ũ�� ����-!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���̽�ũ�� ���� ���� (1.���� 2.����) :2
���� ���̽�ũ�� ����-!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���̽�ũ�� ���� ���� (1.���� 2.����) :3
���� �Ұ�-!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
