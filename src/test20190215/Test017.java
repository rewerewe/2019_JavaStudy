package test20190215;
/*========================================
 ���� �ڹ��� �⺻ ���α׷� ����
 - �ڹ��� �⺻ ����� : java.util.Scanner					// java package�� ����ִ� Scanner ��� ���赵
=========================================*/

// �� java.util.Scanner 
//	  �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	  ����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ����Ͽ�		// throws IOException �� �ۼ����� �ʾƵ� �źι��� ����.
//	  �ٸ� ������ ������ ��ȯ�� �� �ִ�. 

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		
		// �� �ֿ� ���� ���� 
		String name;					//-- �̸�
		int kor, eng, mat;				//-- ����, ����, ���� ����
		

		// �� ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� :");
		name = sc.next();									// br.readLine()�� ������ �о�Ե��� next �޼ҵ�� �ܶ��� �о� ��.

		System.out.print("���� ���� �Է� :");
		// kor = Integer.parseInt(br.readLine());
		// kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� :");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� :");
		mat = sc.nextInt();


		// �� ��� ��� 
		System.out.println("\n�̸� :" + name);
		System.out.printf("���� : %d\n", (kor+eng+mat));	// printf : ���Ĵ�� ����� ��. 
		
	}

}

// ���� ���
/*
�̸��� �Է��ϼ��� :������
���� ���� �Է� :100
���� ���� �Է� :80
���� ���� �Է� :90

�̸� :������
���� : 270
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


