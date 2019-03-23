package test20190308;
/*=====================================
 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calendar Ŭ���� 
======================================*/

/*
 
 �� Calendar Ŭ������ �߻�Ŭ�����̱� ������ ��ü�� ������ �� ����.
 (�߻� Ŭ���� : �̿ϼ��� Ŭ����)
 	
 ��, ��Calendar ob = new Calendar();�� �� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�

 �� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���
	
	1. Calendar ob1 = Calendar.getInstance();				//-- getInstance �޼ҵ�. ���� Static �޼ҵ�� ��ü�� ����.

	2. Calendar ob2 = new GregorianCalendar();				//-- �� ĳ�������� Calendar Ŭ������ �޼ҵ带 ������ �Ͽ� ����ϰ� �ִ� ����. 
																 ����Ŭ���� GregorianCalendar �� �������̵��Ͽ� �ϼ���Ŵ 
	3. GregorianCalendar ob3 = new GregorianCalendar();		//-- ���� �ν��Ͻ� ���� 

	(�� GregorianCalendar : Calendar Ŭ������ ����(�ڽ�) Ŭ����)
    calendar�� import java.util.Calendar�� �ִ�. 	
*/

// ��, ��, ��, ������ Calendar Ŭ�����κ��� ������ ��� 
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test137
{
	public static void main(String[] args)
	{
		// Calendar Ŭ���� �ν��Ͻ� ����
		Calendar rightNow = Calendar.getInstance();

		// ������ �޷�(Calendar) �ν��Ͻ��� ���� 
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� �� get()
		int y = rightNow.get(Calendar.YEAR);
		int m = rightNow.get(Calendar.MONTH)+1;	 //-- �迭�� ���� ������ ����ִ� �����̶�, get()�� ���� +1, set()�Ҷ��� -1 ���־�� ��.  
		int d = rightNow.get(Calendar.DATE);
		int w = rightNow.get(Calendar.DAY_OF_WEEK);

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>> 2019-3-7 5

		//�׽�Ʈ
		/*
		System.out.println(Calendar.SUNDAY);		//--==>> 1
		System.out.println(Calendar.MONDAY);		//--==>> 2
		System.out.println(Calendar.TUESDAY);		//--==>> 3
		System.out.println(Calendar.WEDNESDAY);		//--==>> 4
		System.out.println(Calendar.THURSDAY);		//--==>> 5
		System.out.println(Calendar.FRIDAY);		//--==>> 6
		System.out.println(Calendar.SATURDAY);		//--==>> 7 
		*/
		
		String week = "";
		switch (w)
		{
			// case 1 : week="�Ͽ���"; break;
			case Calendar.SUNDAY : week="�Ͽ���"; break;
			// case 2 : week="������"; break;
			case Calendar.MONDAY : week="������"; break;
			// case 3 : week="ȭ����"; break;
			case Calendar.TUESDAY :week="ȭ����"; break;
			// case 4 : week="������"; break;
			case Calendar.WEDNESDAY :week="������"; break;
			// case 5 : week="�����"; break;
			case Calendar.THURSDAY :week="�����"; break;
			// case 6 : week="�ݿ���"; break;
			case Calendar.FRIDAY :week="�ݿ���"; break;
			// case 7 : week="�����"; break;
			case Calendar.SATURDAY :week="�����"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--==>> 2019-3-7 �����

		///////////////////////////////////////////////////////////////////////


		// Caledar Ŭ���� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		// �޷��� ��¥ ���� �� ��set()�� �޼ҵ� Ȱ�� 
		rightNow2.set(2019, 6, 18);			//--7�� check!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 5 �� �����
		
		// ���
		System.out.print(rightNow2.get(Calendar.YEAR) + "-" + rightNow2.get(Calendar.MONTH) + "-" + rightNow2.get(Calendar.DATE) + " ");
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]); //-- ��-1�� check!!
		//--==>> 2019-6-18 �����


		///////////////////////////////////////////////////////////////////////

		System.out.println();
		
		GregorianCalendar hbd = new GregorianCalendar();
		
		hbd.set(1987, 1, 3);
		
		System.out.println(hbd.get(Calendar.DAY_OF_WEEK));
		//--==>> 3 �� ȭ����
		
		//���
		System.out.print(hbd.get(Calendar.YEAR) + "-" + hbd.get(Calendar.MONTH) + "-" + hbd.get(Calendar.DATE) + " ");
		System.out.println(week2[hbd.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 1987-1-3 ȭ����

		



		

	}
}