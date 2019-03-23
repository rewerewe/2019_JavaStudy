package test20190225;
/*==========================
   ���� �迭 ���� 
 - �迭�� �⺻���� Ȱ�� 
===========================*/

/*
	�� �ǽ� ���� 
	����ڷκ��� �ο� ���� �Է¹ް� 
	�̷��� �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹޾�
	�Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�. 

	��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
	
	���� ��)
	�Է� ó���� �л� �� �Է�(��, 1~10): 3
	�̸� ��ȭ��ȣ �Է�[1](���鱸��) : ���Ѿ� 010-1111-1111
	�̸� ��ȭ��ȣ �Է�[2](���鱸��) : ��ȫ�� 010-2222-2222
	�̸� ��ȭ��ȣ �Է�[3](���鱸��) : ���ȯ 010-3333-3333
	----------------------
	��ü �л� �� : 3��
	----------------------
	�̸�	��ȭ��ȣ
	���Ѿ�	010-1111-1111
	��ȫ��	010-2222-2222
	���ȯ	010-3333-3333
	----------------------
	����Ϸ��� �ƹ�Ű�� ��������. 
*/

import java.util.Scanner;

public class Test082
{
	public static void main(String[] args)
	{
		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ����ڰ� �Է��ϴ� �л����� ��Ƶ� ���� 
		int memCount = 0;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10);

		// �׽�Ʈ 
		//System.out.println("����ڰ� �Է��� �ο� �� : " + memCount);

		// �̸� ���� �迭 ���� �� �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] names = new String[memCount];

		// ��ȭ��ȣ ���� �迭 ���� �� �Է¹��� �ο��� ��ŭ�� �迭�� ����
		// ��ȭ��ȣ�� �� String Ÿ������ �ޱ� 
		String[] tels = new String[memCount];

		// �ݺ����� Ȱ���Ͽ� ������� �Է� �����͸� �迭�� ��Ƴ���
		for (int n=0; n<memCount; n++)	// memCount == names.length == tels.length
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���鱸��) : ", n+1);
			// ���Ѿ� 010-1111-1111 
			// ������ �濡 �����͸� ��� ���� �迭�� ����ߴ�.
			names[n] = sc.next();
			tels[n] = sc.next();

		}

		// ���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("--------------------");
		System.out.printf("��ü �л� �� : %d\n", memCount);
		System.out.println("--------------------");
		System.out.println("�̸�	��ȭ��ȣ");

		for (int m=0; m<memCount; m++)
			System.out.printf("%3s %14s\n", names[m], tels[m]);
		System.out.println("--------------------");

/*
//���� Ǯ���� ���� 
	�� ���� �ν� �� �м� 
	1) �ο� �� �Է¹ޱ� - ��ĳ�� 
	2) �ο����� 1~10  no �� 1) �ٽ� �Է� �ޱ� 
			�� �Է¹��� �ο� �� = �迭 ũ�� 	
			�� yes
	3) �̸�, ��ȭ��ȣ ��� 


	int arrNum;
	String name="";
	String tel="";
	
	do
	{
		System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
		Scanner sc1 = new Scanner(System.in);
		arrNum = sc1.nextInt();

	}
	while (arrNum<0 || arrNum>10);


	for (int i=1; i<=arrNum; i++)
	{
		System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���鱸��) :" , i);
		Scanner sc2 = new Scanner(System.in);
		name = sc2.next();
		tel = sc2.next();
	}

	// ��� ��� 
	System.out.print("-------------------");
	System.out.printf("\n��ü �л� �� : %d\m", arrNum);
	System.out.print("-------------------");
	System.out.printf("�̸�	��ȭ��ȣ\n %s %s", name, tel);
	System.out.print("-------------------");
	
*/
	}
}

// ���� ���
/*
�Է� ó���� �л� �� �Է�(��, 1~10) : 2
�̸� ��ȭ��ȣ �Է�[1](���鱸��) : ������ 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���鱸��) : ������ 010-1111-1111

--------------------
��ü �л� �� : 2
--------------------
�̸�    ��ȭ��ȣ
������  010-1111-1111
������  010-1111-1111
--------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
