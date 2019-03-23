package test20190315;
/*======================================
 ���� �ڹ��� �⺻ ����� (I/O) ���� 
=======================================*/

// Reader �ǽ� 

// Test166�� ���ؼ� ����-!!!

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test168
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in		 : �ڹ��� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ�� 
		// new InputStreamReader(System.in);
		// System.in.read()��? �� ����Ʈ ��� ��Ʈ��

		// InputStreamReader : ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ
		//					   (��ȯ��, ������, ���� ����)
		// Reader			 : ���� ��� ��Ʈ�� ��ü 
		// Reader rd = System.in; (��)
		Reader rd = new InputStreamReader(System.in);


		System.out.println("���ڿ� �Է�(����:Ctrl+z)");
	

		// read() : InputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ ��Ʈ��)
		while (   (data = rd.read()  )  != -1)
		{
			ch = (char)data;
			
			// print() : ���� ��Ʈ�� 
			System.out.print(ch);	//--==>> �����۵��� 
			/*	 
				���ڿ� �Է�(����:Ctrl+z)
				abcd
				abcd
				1234
				1234
				�����ٶ�
				�����ٶ�
				^Z
				����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/



			// write() : OuputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ ��Ʈ��)
			// System.out.write(ch);		//--==>> �ѱ� ���� 
			/* 
				���ڿ� �Է�(����:Ctrl+z)
				abcd
				abcd
				1234
				1234
				�����ٶ�
				 ??|
				^Z
				����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/
		}
	}
}