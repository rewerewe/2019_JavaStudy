package test20190219_help;
/*=============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - �ݺ���(while��) �ǽ�
==============================================*/

// ���� ��)
// ���� ��� : xxx

// 1 * 2 * 3 * 4 * ... * 10

public class Test049
{
	public static void main(String[] args)
	{
		
		int n=1;
		int result=1;

		while (n<=10)
		{
			result*=n;
			n++;
		}

		System.out.println(result);

		/*
		//�ؼ�
		int n=0, result=0;		//check~!!!
								//�������� ���� ���� 1�� �ʱ�ȭ
		while (n<10)
		{
			n++; //++n;�̾ �ȵ�
			result *= n;
		}
		System.out.println(result);
		*/

	}

}

//���� ���
/*
3628800
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/