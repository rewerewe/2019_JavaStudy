
/*======================
 ���� �迭 ����
 - �迭�� ���� 
=======================*/

/*
	�� �ǽ� ����

	������ �迭(a,b)�� ����ִ� ���ڵ��� �������� ����ϴ� ���α׷��� �����Ѵ�.
	��, �ߺ��� ���ŵ� ������ �������� ����� �� �ֵ��� �Ѵ�.
	����, �迭 ���� ������ ������� ó���� �� �ֵ��� �Ѵ�.

	ex) ������ �� �迭 
	int[] a = {2, 3, 7, 10, 11}
	int[] b = {3, 6, 10, 14}

	���� ��)
	ù ��° �迭 ��Ҹ� �Է��ϼ���(���� ����) :
	�� ��° �迭 ��Ҹ� �Է��ϼ���(���� ����) :
	2 3 7 10 11 6 14
	����Ϸ��� �ƹ�Ű�� ��������...

���ڿ� ���·� �Է� ����. 

*/

import java.util.Scanner;

public class Test099
{
	public static void main(String[] args)
	{
		// ���� Ǯ���� ���� ��
		
		int[] copy1,copy2;
		
		int[] num1 = {1, 3, 5, 6, 7, 8, 9, 10};
		int[] num2 = {2, 3, 6, 8, 9, 17};

		int n;

		
			// �迭 num1�� num2�� copyArray �޼ҵ� ȣ��� �����ϰڴ�. 
			// copynum1, copynum2�� ������ ��
			// int[] copynum1 = copyArray(num1);
			// int[] copynum2 = copyArray(num2);
		

		copy1 = num1;
		copy2 = num2;
		
		n = copy1.length + copy2.length;


		for (int i=0; i<copy1.length; i++)
		{
			for (int j=0; j<copy2.length; j++)
			{
				if (copy1[i]==copy2[j])
				{
					copy2[j] = 0;						
				}
			}
		}

		// ���
		
		for (int k=0; k<n; k++)
		{
		
			System.out.print(copy1[k] + " ");
			
		}

		for (int h=0; h<n; h++)
		{	
			if (copy2[h]!=0)
			{
				System.out.print(copy2[h] + " ");
			}
		}


						/*
								for (int k=0; k<copy1.length; k++)
								{
									// if (copy1[k]!=0)
									{
										System.out.print(copy1[k] + "  ");
									}
								}
								for (int h=0; h<copy2.length; h++)
								{	
									if (copy2[h]!=0)
									{
										System.out.print(copy2[h] + "  ");
									}
								}
						*/
	}


						/*
							public static int[] copyArray(int[] num)
							{
								int[] temp = new int [num.length]	//-- num1 �迭�游ŭ �迭���� �����ϰڴ�.

								for (int i=0; i<num.length; i++)
								{
									temp[i] = num[i]				//-- num1 ���� �迭�� ����ִ� ��Ҹ� temp�� ��Ƴ��ڴ�. 
								}

								return temp;
								
							}
						*/
}

