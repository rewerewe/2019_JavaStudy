package test20190312;
/*====================================
 ���� ����(Exception) ó�� ����
=====================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144
{
	private String[] data = new String[3];

	public void proc() // qthrows IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;
		
		// ���ν��� ������ ������ �ʰ� ��ƹ���. 
		try
		{
			System.out.print("�̸� �Է�[����:Ctrl+z] : ");

			while ((str = br.readLine()) != null)
			{
				data[n++]=str;
				System.out.print("�̸� �Է�[����:Ctrl+z] : ");
			}	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("���� �߻�~!!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toStrng : " + e.toString());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		

		catch (IOException e)	// ���ܵ� ��ü. e��� ��ü���� �ο��ؼ� ��Ʈ�� �Ѵ�. 
		{
			System.out.println(e.toString());		// ������ toString()�� ���ܳ����� ���ڿ� ���·� ��ȯ���ش�. 
		}

		System.out.println("�Էµ� ����");
		for (String s : data)
		{	
			if (s != null)
				System.out.println(s);
		}
		System.out.println();

		
	}

	public static void main(String[] args) // throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();
		
	}
}

// ���� ����
/*
�̸� �Է�[����:Ctrl+z] : ������
�̸� �Է�[����:Ctrl+z] : �̱��
�̸� �Է�[����:Ctrl+z] : �輱��
�̸� �Է�[����:Ctrl+z] : ������
���� �߻�~!!!
getMessage : 3
toStrng : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace...
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test144.proc(Test144.java:27)
        at Test144.main(Test144.java:59)
�Էµ� ����
������
�̱��
�輱��

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�̸� �Է�[����:Ctrl+z] : ������
�̸� �Է�[����:Ctrl+z] : �̱��
�̸� �Է�[����:Ctrl+z] : ^Z
�Էµ� ����
������
�̱��

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/