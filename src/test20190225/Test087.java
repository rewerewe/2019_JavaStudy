package test20190225;
/*==========================
   ���� �迭 ���� 
 - �迭�� �迭(2���� �迭)
===========================*/

/*
	�۽ǽ� ����
	�迭�� �迭(������ �迭)�� Ȱ���Ͽ� 
	������ ���� ������ ��Ҹ� ���ϴ� �迭(5x5)�� �����ϰ� 
	�� ����� ����ϴ� ���α׷��� �����Ѵ�.

	���� ��)
     ��
	 :
	 1	 2	 3	 4	 5		�� i=0
	 2	 3	 4	 5	 6		�� i=1
	 3	 4	 5	 6	 7		�� i=2
	 4	 5	 6	 7	 8		�� i=3
	 5	 6	 7	 8	 9		�� i=4
	����Ϸ��� �ƹ�Ű�� ��������....

*/

public class Test087
{
	public static void main(String[] args)
	{
		// �Բ� Ǯ���� ����
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int [5][5];

		int n;
		for (int i=0; i<arr.length; i++)
		{
			n = i + 1;		     //-- i�� �����ؼ� i���� 1��ŭ ������ ���� �־� �ش�. �����ؼ� ��Ģ�� ã�� ����.. �ݺ��� �˰��� �����ϰ� �˴ϴ�..
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			
			System.out.println();
		}

		// ���� Ǯ���� ���� 
		/*

		int[][] arr = new int[5][5];

		// �迭�� �迭 �ʱ�ȭ 
		for (int i=0; i<arr.length; i++)	// i �� 0 1 2 3 4 �� 0���� �迭�� ���̸�ŭ �����ϰ� �ִ�. 	
		{
			for (int j=0; j<arr[i].length; j++)		// j �� 0 1 2 3 4 �� 0 ���� arr[i]�� �迭 ����(5)��ŭ �����ϰ� �ִ�. 	
			{
				arr[i][j] = (i+j)+1;
			}
		}

		// �迭�� �迭 ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		*/

	}
}
