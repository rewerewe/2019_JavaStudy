package test20190304;
/*====================================
 ���� ����(Sort) �˰��� �����
 - ���� ���� ����(Bubble Sort)
=====================================*/

/*
�� �ռ� ������ Selection Sort�� Bubble Sort�� ������ ����. (�ݺ��� Ƚ���� ����)
	������, ���� Bubble Sort �� ��� �������� ������ ���� 
	�Ϲ� Bubble Sort �� Selection Sort ���� ������ ����. 

	���� ������ = 61  15  20  22  30
				  15  20  20  30  61		-- 1ȸ�� (���� �߻� true)  -- ���� ȸ�� ��
				  15  20  20  30  61		-- 2ȸ�� (���� �߻� false) -- ���� ȸ�� ��

==> 1ȸ�� ����... 2ȸ�� ����... �� �غ��Ҵ���
	2ȸ���� �����ϴ� �������� ������ ���� �Ͼ�� �ʾұ� ������ 
	���ʿ��� �߰� ����(ȸ��: �ݺ�)�� �������� �ʴ´�.
*/

public class Test104
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 33, 40};
		/*
		10, 50, 20, 33, 40		0	1			-- j
		======

		10, 50, 20, 33, 40		1	2 
			======
		
		10, 20, 50, 33, 40		2	3 
				======

		10, 20, 33, 50, 40		3	4 
					======
		
	------------------------------------ 1ȸ��	-- i 

		10, 20, 33, 40, 50		0	1 
		======
			======				1	2
				======			2	3
						
	------------------------------------ 2ȸ��

	��
	��
	��

	*/
	int pass;
	boolean flag = false;

	System.out.print("Source Data : ");
	for (int n : a)
	{
		System.out.print(n + " ");
	}
	System.out.println();

	// �Բ� Ǯ���� ���� 
	// ���� Bubble Sort ����
	
	pass = 0;
	do
	{
	
		flag = false;
		pass++;
		for (int i=0; i<a.length-pass; i++)
		{
			if (a[i] > a[i+1])
			{
				// �ڸ��ٲٱ� 
				a[i]=a[i]^a[i+1];
				a[i+1]=a[i+1]^a[i];
				a[i]=a[i]^a[i+1];
				
				flag = true;

			}
		}

	}
	while (flag);


	// ��� ���
	System.out.print("Sorted Data : ");
	for (int n : a)
	{
		System.out.print(n + " ");
	}
	System.out.println();
	
	
	// ���� Ǯ���� ����
	/* 
		for (int i=1; i<a.length; i++)			// 0 1 2 3 4
		{
			
			flag = false;

			System.out.print("\n i :" + i + " j :" );

			for (int j=0; j<a.length-i; j++)	// 1 2 3 4
			{

				System.out.print(j + " ");

				//�ڸ��ٲٱ�
				if (a[j] > a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];

					flag = true;
				}
				
			}

			if (flag)
				break;
		}
	
	*/ 
	}
}
// ���� ���
/*
Source Data : 10 50 20 33 40
Sorted Data : 10 20 33 40 50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

