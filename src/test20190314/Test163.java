/*==================================
 ���� �÷��� (Collection) ���� 
===================================*/

/*

 Set �� HashSet, TreeSet
 - ���� ����
 - �ߺ� ������� �ʴ� ����(�⺻) 

 �� TreeSet<E> Ŭ����

 	java.util.TreeSet<E> Ŭ������ 
	Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ���ĵȴ�. 
	- HashSet�� �� ����. �׷��� TreeSet�� Ư���� ��� �ƴϸ� �� �Ⱦ�. 

 */

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

// VO	�� Value Object			: ������ �Ӽ���� ����. getter setter
// DTO	�� Data Transfer Object : �޼ҵ� ������ Ŭ���� 	
// DAO  �� Data Access Object
//-- � �ɷ� �����ϴ��Ŀ� ����, Ŭ���� ������谡 �޶�����. 

class GradeVO
{
	// �ֿ� �Ӽ� ����
	private String hak;
	private String name;
	private int kor, eng, mat;

	// ������(����� ���� ������ �� �Ű����� ���� ������)
	GradeVO()
	{
	}

	// ������(����� ���� ������ �� 5���� �Ű������� ���� ������)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// getter / setter ����
	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getHak()
	{
		return hak;
	}


	void setName(String name)
	{
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}


	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getKor()
	{
		return kor;
	}


	void setEng(int eng)
	{
		this.eng = eng;
	}
	
	int getEng()
	{
		return eng;
	}


	void setMat(int mat)
	{
		this.mat = mat;
	}

	int getMat()
	{
		return mat;
	}


	// �߰� �޼ҵ� ����
	int getTot()
	{
		return kor + eng + mat;
	}

}

//<T> ���׸� ǥ������ � ���� ������ �𸥴ٴ� ǥ��. 
class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// �й� ���� 
		// - �� minus ������ �ƴ϶� ��ü ������ �����ϼ���
		// ���� ������ 1, 0, -1 �� ������ �ſ� ���� ������ �̷������ �����̴�. 
		// ���п��� ũ�� ���� �� ���� ���� ���. 
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//-- ���ڸ������ �Ǿ��ִ� ���ڿ��̶� ����ȯ ���� 

		/* ũ�� �� ���� 
			a - b �� 0
			a - b �� ����
			a - b �� ��� 	*/

		// ���� ����
		// return s1.getTot() - s2.getTot();		//-- �������� 
		// return s2.getTot() - s1.getTot();		//-- �������� 

		// �̸� ����
		// s1.equals(s2)
		// compareToIgnoreCase(s1, s2);
		// return s1.getName() - s2.getName;
		return s1.getName().compareTo(s2.getName());
		 

	}
}

public class Test163
{
	public static void main(String[] args)
	{	
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();
		
		// TreeSet �ڷᱸ�� set�� ��� �߰� �� add()
		set.add("���ϸ���");
		set.add("������");
		set.add("���ǽ�");
		set.add("����ö��999");
		set.add("�Ƿη�");
		set.add("�̴��߻�");
		set.add("�ڷ����");
		set.add("ī��ĸ��ü��");
		set.add("��");
		set.add("¯���¸�����");
		set.add("�λ��̵�ƿ�");
		set.add("���󿡸�");
		set.add("�̻��ѳ�������");
		set.add("�ϸ�ã�Ƽ�");

		// Iterator �� Ȱ���Ͽ� Set ��� ��ü ���

		Iterator<String> it = set.iterator();
		// iterator �� for each �� �ƴ� while �� �ִ��� ������ Ȯ���ؾ��Ѵ�.
		/* 
		for (String str : set)
			System.out.print(str + " ");
		System.out.println();
		*/  

		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
		//--==>> �ϸ�ã�Ƽ� ���󿡸� ������ �Ƿη� �� ���ǽ� 
		//		 ����ö��999 �̴��߻� �̻��ѳ������� �λ��̵�ƿ� 
		//		 ¯���¸����� ī��ĸ��ü�� �ڷ���� ���ϸ���

		// Tree �ڷᱸ�� �ν��Ͻ� ���� (x)
		// TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//-- �̷��� �ν��Ͻ��� �����Ͽ�, Ŭ������ TreeSet�� ���� ���Ѵ�.
		
		// Tree �ڷᱸ�� �ν��Ͻ� ����. ��, �й� �������� ���� 
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		set2.add(new GradeVO("16", "������", 90, 80, 70));
		set2.add(new GradeVO("21", "������", 80, 70, 60));
		set2.add(new GradeVO("02", "�ѽ¿�", 100, 100, 100));
		set2.add(new GradeVO("24", "��ȫ��", 12, 23, 34));
		set2.add(new GradeVO("10", "���Ѿ�", 50, 50, 50));

		// Treeset�� ���� �ؾ���.  �� � �������� ���ؾ���. �� �����ʹ� ������ �� ������ �̷���. �ʿ��� ��� �ڸ��ٲ��� �ذ��� ������ 
		// �׷��� ���� �߻� �� ClassCastException : java.lang.Comparable
		// ��� : Ŭ������ TreeSet�� ���� ���Ѵ�. 

		
		// set2 �ڷᱸ�� ��ü ��� ���
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n", vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(), vo.getMat(), vo.getTot());
		}
		System.out.println();
		// ���� : �й� ����
		//      02     �ѽ¿�  100  100  100    300
		//		10     ���Ѿ�   50   50   50    150
		//		16     ������   90   80   70    240
		//		21     ������   80   70   60    210
		//		24     ��ȫ��   12   23   34     69

		// ���� : ���� ���� (��������)
		// 24     ��ȫ��   12   23   34     69
		// 10     ���Ѿ�   50   50   50    150
		// 21     ������   80   70   60    210
		// 16     ������   90   80   70    240
		// 02     �ѽ¿�  100  100  100    300

		// ���� : ���� ���� (��������)    
		// 02     �ѽ¿�  100  100  100    300
		// 16     ������   90   80   70    240
		// 21     ������   80   70   60    210
		// 10     ���Ѿ�   50   50   50    150
		// 24     ��ȫ��   12   23   34     69

		// ���� : �̸� ����
		// 10     ���Ѿ�   50   50   50    150
		// 24     ��ȫ��   12   23   34     69
		// 21     ������   80   70   60    210
		// 16     ������   90   80   70    240
		// 02     �ѽ¿�  100  100  100    300




	
	
	}
}
