package test20190219_help;
/*=============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - �ݺ���(while��) �ǽ�
==============================================*/

// 1���� 100���� ������ �� : 5050
// 1���� 100���� ¦���� �� : 2550
// 1���� 100���� Ȧ���� �� : 2500
// ����Ϸ���...

public class Test046
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		int n=0;
		int dec=0;
		int even=0;
		int odd=0;
		
		// int dec, even, odd;
		// dec=even=odd=0;
		// 0�� odd�� ����, odd�� even�� ����, even�� dec�� ���� �� odd,even,dec ���0
		
		// ���� �� ó��
		while (n<=100)
		{

			/* (��) Ʋ���� - ���� ���ǽĿ� ��� ó������
					�ذ� : if�� ���X while���� �ٷ�
			if (?)
			{
				n += n;
			}
			*/


			//����
			dec += n;
			//¦��
			if (n%2==0)
			{
				even += n;
				
			}
			//Ȧ��
			else if (n%2!=0)
			{
				odd += n;
			}
			/*
			//�Ǻ��Ұ�
			else
			{
				System.out.println("�Ǻ� �Ұ�");
				return;
			}
			*/

			n++;
		}
		// ��� ���
		System.out.println("1���� 100���� ������ �� : " + dec);
		System.out.println("1���� 100���� ¦���� �� : " + even);
		System.out.println("1���� 100���� Ȧ���� �� : " + odd);
		
	}
}