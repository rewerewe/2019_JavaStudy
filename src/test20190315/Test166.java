package test20190315;
/*======================================
 ���� �ڹ��� �⺻ ����� (I/O) ���� 
=======================================*/

// ����Ʈ ��� ��Ʈ�� �� ���� ��� ��Ʈ������ �д´ٸ� ����. ������ �ѱ�.

import java.io.IOException;


public class Test166
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");
		



		// read() : InputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ ��Ʈ��)
		while (   (data = System.in.read()  )  != -1)
		{
			ch = (char)data;
			
			// print() : ���� ��Ʈ�� 
			// System.out.print(ch);
			/*	--==>> �ѱ� ���� 
				���ڿ� �Է�(����:Ctrl+z)
				abcd
				abcd
				1234
				1234
				�����ٶ�
				�Ƣ�������?��?
				^Z
				����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/



			// write() : OuputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ ��Ʈ��)
			System.out.write(ch);
			/* --==>> ���� �۵���
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

		}
	}
}