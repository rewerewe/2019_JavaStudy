/*====================================
 ���� ����(Sort) �˰��� �����
 - �Բ� Ǯ���� �ؼ� ���� 
=====================================*/

/*
	�� �ǽ� ����
	����ڷκ��� ���� �л��� ���� ������ ���� ���·� �Է¹޾� 
	������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
	��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

	���� ��)
	�ο� �� �Է� : 5
	�̸� ���� �Է�(1) : ���ֿ� 90
	�̸� ���� �Է�(2) : ������ 80
    �̸� ���� �Է�(3) : ������ 85
    �̸� ���� �Է�(4) : ������ 75
    �̸� ���� �Է�(5) : �̱�� 95
    
	=================
	1�� �̱�� 95
	2�� ���ֿ� 90
	3�� ������ 85
	4�� ������ 80
	5�� ������ 75
	=================
	����Ϸ��� �ƹ�Ű�� ��������...

*/

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{	
		int num; 
		
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է� : ");
			num = sc.nextInt();
		}
		while (num<=0);

		
		String[] arrName = new String[num];
		int[] arrJumsu = new int[num];
		String temp="";
		
		for (int i=0; i<arrJumsu.length; i++)
		{
			System.out.printf("�̸� ���� �Է�(%d) : ", (i+1));
			arrName[i] = sc.next();
			arrJumsu[i] = sc.nextInt();

		}
															// �Է��� �ο� ��: 4
		for (int i=0; i<arrJumsu.length-1; i++)				// 0 1 2 3 
		{
			for (int j=i+1; j<arrJumsu.length; j++)			// 1 2 3 4 
			{
				// Ȯ�� 
				// System.out.print("\n i : " + i + "j " + j );

				// �ڸ� �ٲٱ� 
				if (arrJumsu[i] > arrJumsu[j])
				{
					// �̸� :  ���ڿ��� XOR�����ڷ� �ڸ� �ٲٱ�(��) �� �̸��� �� �����ſ� ��� �ڸ� �ٲپ� �ֱ�
					temp = arrName[i];
					arrName[i] = arrName[j];
					arrName[j] = temp;
					
					// ���� : �Է� ���� ������ �迭�� ��� �ξ��� ��, �տ��ִ� ������ �ڿ� �������� ũ�ٸ� �ڸ� �ٲپ� �ֱ�.
					arrJumsu[i] = arrJumsu[i]^arrJumsu[j];
					arrJumsu[j] = arrJumsu[j]^arrJumsu[i];
					arrJumsu[i] = arrJumsu[i]^arrJumsu[j];
				}
			}
		}
		
		
		
		// ���
		
			for (int i = 0; i<arrJumsu.length; i++)
			{
				System.out.print(arrName[i] + " " + arrJumsu[i] + " \n");
			}
		
		
		

	}
}