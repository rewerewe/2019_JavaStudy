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

public class Test019
{
	public static void main(String[] arge)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		// �� �ֿ� ���� ����
		String name;
		int kor, eng, mat, tot;


		// �� ���� �� ó��
		System.out.print("�̸�, ����, ����, ���� �Է�(��,�� ����) : ");
		//-- ������,90,80,70

		// sc = new Scanner(sc.next()).useDelimiter("���ڿ������ڿ�������,");
		// sc = new Scanner(sc.next()).useDelimiter("\\s* �� \\s* ������,");		\\s*:������ ���ڿ� 
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				 --------	             ------------						
		//			 ������,90,80,70			������ ���ڿ��� ���ڿ��� 
		//										����� ���� �����ڸ� ���� ����

		// ���.�޼ҵ��();

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// ���� ����
		tot = kor + eng + mat;


		// �� ��� ��� 
		System.out.println();
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", tot);
	}

}

// ���� ���
/*
�̸�, ����, ����, ���� �Է�(��,�� ����) : ������,80,70,80

�̸� : ������
���� : 230
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

