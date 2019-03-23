package test20190308;
/*=====================================
 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calendar Ŭ���� 
======================================*/

/*
 �� �ǽ� ����
 	������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
	Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
	��, Calendar Ŭ������ Ȱ���Ͽ� ó���Ѵ�.

	���� ��)
	���� ��¥ : 2019-3-8 �ݿ���
	�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

	=========[Ȯ�ΰ��]===========
	200�� �� : 2019-xx-xx x����
	==============================
	����Ϸ��� �ƹ�Ű�� ��������...
*/

import java.util.Scanner;
import java.util.Calendar;

public class Test139
{
	public static void main(String[] args) 
	{
		// �Բ� Ǯ���� ���� 
		Scanner sc = new Scanner(System.in);

		// Calendar Ŭ���� �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;			//-- ����ڷκ��� �Է¹��� ���� 
		int y, m, d, w;		//-- ��, ��, ��, ����
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ������ ��, ��, ��, ���� Ȯ��(�������� : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH);
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		// ������ ��, ��, ��, ���� Ȯ�ΰ�� ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " "  + week[w-1] + "����");

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu < 1);

		// �� �� ���ϱ� ����
		now.add(Calendar.DATE, nalsu);

		// ��� ���
		System.out.println();
		System.out.println("=========[Ȯ�ΰ��]===========");
		System.out.printf("%d �� : %tF %tA\n", nalsu, now, now);
		// %d 
		// %t : ��¥Ÿ��(�ð�Ÿ��)�� ��� �ɼ� ����. DATE Ÿ���̾�� ��. 
		// %t + �빮�� F A �� String �� System.out.format ������ ����� �� ����. 
		// �߰��� ã�ƺ��� ���� �ٿ��� �ʱ�� �����ص� ��. 
		System.out.println("==============================");



	}
}
// ���� ���
/*
���� ��¥ : 2019-2-8 �ݿ���
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

=========[Ȯ�ΰ��]===========
200 �� : 2019-09-24 ȭ����
==============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/