/*==========================
   ���� �迭 ����
 - �迭�� ����� �ʱ�ȭ 
 - �迭�� �⺻���� Ȱ�� 
===========================*/

// �� �ǽ� ����
// ������ ���ڵ��� ����ִ� �迭�� ���� �����͵� ��
// ¦���� ��Ҹ� ��� ����ϰ�,
// 3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� �����Ѵ�.

// �� �迭�� �����ϴ� ������ ���� ���� 
//	  �� 4 7 9 1 3 2 5 6 8 

// ���� ��)
// �迭 ��� ��ü ���
// 4 7 9 1 3 2 5 6 8
// ¦�� ������ ���
// 4 2 6 8 
// 3�� ��� ������ ���
// 9 3 6 


public class Test080
{
	public static void main(String[] args)
	{

		// �Բ� Ǯ���� ���� 
		/* ��� �� 
		int[] arr= new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		// ��� �� �� ���� ������ n-1�� 		
		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};
	
		System.out.println(arr);
		//--==>> [I@15db9742
		//	 �� �Ϲ����� ������ ��� ������ ����ϴ� ����(���)���δ�
		//		�迭�� ��� �����͵��� ����� �� ����.
		/*
		System.out.println("�迭 ��� ��ü ���");
		for (int i=0; i<9; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/
		// �迭�� ���̰� 9�̱� ������ ���� i<=8 ���� i<9�� ���� ���� ����.
		// ����� �迭�̶��, �迭 ���迡 �ִ� ����,�޼ҵ带 �� �� �ִ�.  

		// �� �迭 arr�� ����(���� ����) Ȯ��
		//	  arr.length
		
		System.out.println("�迭 arr �� ���� : " + arr.length);

		System.out.println("�迭 ��� ��ü ���");
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		System.out.println("¦�� ������ ���");
		for (int i=0; i<arr.length; i++)
		{	
			/* 
			if (i%2==0) //-- i�� ¦�����... �� ¦����° �ش��ϴ� ��Ҷ��...
			{
				System.out.print(arr[i]+ " ");
			}
			//--==>> 4 9 3 5 8
			*/
			if (arr[i]%2==0) //-- i��°�� �ش��ϴ� �� ���� ¦�����... 
			{
				System.out.print(arr[i]+ " ");
			}		
		}
		System.out.println();

		System.out.println("3�� ��� ������ ���");
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]%3==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		// ���� Ǯ���� ���� 
		/*
		// �迭 ���� �� �޸� �Ҵ� 
		// int[] arr = new int[9];
		
		int[] arr = new int[9];
		arr[0] = 4; 
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;

			  

		// �迭 ��� 
		// ��ü ���
		System.out.println("�迭 ��� ��ü ���");
		
		for (int i=0; i<=8; i++)
		{
			System.out.print(arr[i] + " ");
		
		}

		// ¦�� ��� 
		System.out.println();
		System.out.println("¦�� ������ ���");
		for (int i=0; i<=8; i++)
		{
			if (arr[i]%2==0)
			{
				System.out.print(arr[i]+ " ");
			}
		}

		//3�� ��� ���
		System.out.println();
		System.out.println("3�� ��� ������ ���");
		for (int i=0; i<=8; i++)
		{
			if(arr[i]%3==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		*/
	}
}

// ���� ���
/*
[I@15db9742
�迭 arr �� ���� : 9
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
9 3 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/


