
/*
 �� �ǽ� ���� 
 	����ڷκ��� ��, ���� �Է¹޾� 
	�ش� �� ���� �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
	��, Caledar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

	���� ��)
	���� �Է� : 0
	���� �Է� : 2019
	�� �Է� : -2 
	�� �Է� : 16
	�� �Է� : 7 

		  [ 2019�� 7�� ]

	��  ��  ȭ  ��  ��  ��  ��
	===========================
	  	 1	 2	 3	 4	 5	 6
	 7	 8	 9	10	11	12	13
	14	15	16	17	18	19	20
	21	22	23	24	25	26	27
	28	29	30	31 
	===========================
	����Ϸ��� �ƹ�Ű�� ��������...
	
*/

public class Test138002
{
	public static void main(String[] args)
	{

// ���� Ǯ���� ���� 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class Test138
{

	public static void main(String[] args) throws IOException
	{
		Test138 ob = new Test138();
		Calendar obCal = Calendar.getInstance();
		
		int y;
		int m;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
			
		}
		while (y<=0);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<=0 || m>12);

		
		// Ȯ��
		// System.out.println(y);
		// System.out.println(m);

		//---------------------------------------------------------- ��ȿ�� ��, �� Ȯ��
		
		// �Է¹��� ���� set �� �� ���� ���� ã�� : set �Ҷ� ������ -1
		obCal.set(y, m-1, 1);
		
		//Ȯ��
		// System.out.print(obCal.get(Calendar.DAY_OF_WEEK));
		// 6 �� �ݿ���
		// �Է��� ���� 
		// System.out.println("���� : " + obCal.getActualMaximum(Calendar.DAY_OF_MONTH));
		// 31 �� 31
		
		// String[] week = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};
		

		
		// Ȯ��
		System.out.println("���� : " + obCal.get(Calendar.DAY_OF_WEEK));
		System.out.println("�迭���� :" + week[obCal.get(Calendar.DAY_OF_WEEK)-1]);

		System.out.println("������ ���� ���� : " + obCal.get(Calendar.DATE));

		// for (int i=1; obCal.getActualMaximun(Calendar.DAY_OF_WEEK); )
		// {
		// }

		// ���
		// System.out.println();
		// System.out.print("	[" + obCal.get(Calendar.YEAR) + "�� " + obCal.get(Calendar.MONTH) + "��]	"); 
		

		
		
	}
}
	}
}