package test20190218;

/*==========================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - if �� �ǽ�
===========================================*/

// �ǽ����� 

// ����ڷκ��� ���� ������ ������ �Է¹޾�
// �Է¹��� ������ ¦������ Ȧ������ �Ǻ��Ͽ� 
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ��, BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� ó���ϰ�
// ���� if ���� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 37
// 37 �� Ȧ���Դϴ�.
// ����Ϸ��� �ƹ�Ű��...2019-02-18

// ������ ���� �Է� : 26
// 26 �� ¦���Դϴ�.
// ����Ϸ��� �ƹ�Ű��...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test030
{
	public static void main(String [] args) throws IOException
	{
		// ���۵帮�� �ν��Ͻ� ����

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		// �ֿ� ���� ����

		int a;

		// ���� �� ó��

		// �ȳ��޽��� ���
		System.out.print("������ ���� �Է� : ");

		// �Է¹��� ������ ������ ��� 
		a = Integer.parseInt(br.readLine());
		
		// �Բ� Ǯ���� ����, ��� ��� 

		if (a % 2 ==0)
			System.out.printf("%d �� ¦���Դϴ�.\n", a);	
		
		if (a % 2 !=0)
			System.out.printf("%d �� Ȧ���Դϴ�.\n", a);

		
		/* ���� Ǯ���� ���� 

		if (a % 2 ==0)
			System.out.printf("¦��");
		
		else 
			System.out.println("Ȧ��");	*/


	}
}

// ���� ��� 
/*
������ ���� �Է� : 37
37 �� Ȧ���Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 26
26 �� ¦���Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
