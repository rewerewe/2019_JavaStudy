package test20190308;
/*=====================================
 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Random Ŭ���� 
======================================*/
/*

 �� java.util.Random Ŭ������ 
 
 	���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
	Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
	0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ� 
	�ʿ��� ���� ������ ������ ������ ���� �߰����� ������� �����ؾ� �Ѵ�.
	�׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
	���� Ŭ������ Random Ŭ������ ������ �����Ͽ� �ִ�.

*/

/*  �ζ� ��ȣ ������(���� �߻� ���α׷�)

	���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�. (645���)
	
	���� ��)
	2 39 40 41 42 45 
	1 2 8 16 28 42
	4 9 10 13 14 28 
	20 24 31 33 37 41
	5 7 8 11 36 40 
	����Ϸ��� �ƹ�Ű�� ��������...

	���ӻ� ��ȣ�� �ߺ����� �ʴ´�. 
	����� ���� ������ ���ĵǾ� ��µȴ�. 
*/

import java.util.Random;
import java.util.Arrays;


class Lotto
{
	// �Բ� Ǯ���� ����
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6��
	private int[] num = new int[6];

	// getter
	public int[] getNum()
	{
		return num;
	}
	
	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		int cnt=0;
		Random rd = new Random();
		int n;

		jump: 
		
		while (cnt<6)						// cnt �� 0 1 2 3 4 5 	
		{
			n = rd.nextInt(45) + 1;			// 1~ 45 
			
			// �迭�� ���� ��� ����, �ߺ����� �ִ��� Ȯ�� 
			for (int i=0; i<cnt; i++)		// ������ �� cnt �ΰ�? 
			{
				if (num[i] == n)
					continue jump;			// num[0], num[1], num[2]... �� ����ִ� ���ڸ� ���Ͽ� ������ �ٽ� �ݺ��ϰڴ�. 
				
			}

			num[cnt++] = n;	
		}

		sorting();
		
	}

	// ���� �޼ҵ�
	private void sorting()
	{
		Arrays.sort(num);
	}
}



public class Test141
{
	public static void main(String[] args)
	{
		// Lotto Ŭ���� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5����
		for (int i=1; i<=5; i++)
		{
			lotto.start();
			
			//��� ���
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();	// ����
		}
	}
}