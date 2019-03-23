package test20190314;
/*==================================
 ���� �÷��� (Collection) ���� 
===================================*/

/*
 �� Enumeration �� Interface �������̽�

 Collection Framework ���� 
 Enumeration �� Iterator ��� �������̽��� �ִ�
 �������� �ǹ̷δ� �ݺ�, ��ȯ �̶�� �ǹ̸� ������ ������
 � ��ü���� ������ ���� ��,
 �� ��ü���� � ������ ���� �ϳ��� �����Ͽ� ����ϱ� ����
 �������̽���� �� �� �ִ�.

	- java.util.Enumeration<E> �������̽�
	 : �� �������̽� ���� �ΰ��� �޼ҵ常 �����ϸ� 
	 ��hasMoreElements()�� �޼ҵ带 ����
	 �������̽� �ȿ� ���� ��Ұ� �ִ����� ���� ���Ǹ� �Ѵ�.
	 ���� true�� ��ȯ�Ǿ��ٸ� ���� �ε����� ��Ұ� �����Ѵٴ� �ǹ��̸�
	 ��nextElement()�� �޼ҵ�� ���� ��Ҹ� ������ ����ϸ� �Ǵ� ���̴�.

	ex) v ��� ���� �ڷᱸ���� ����� ��� ��� ���
		for (Enumeration e = v.element(); e.hasMoreElement(); )
		{
			System.out.println(e.nextElement());
		}

	- java.util.Iterator<E> �������̽�
	  : Enumeration ���� �������� ���� remove() �޼ҵ尡 �߰��� �� ���̴�.
	  	Iterator �� ������ �ִ� hasNext()�� next() �޼ҵ��
		�̸��� �ణ �ٸ� �� Enumeration �������̽��� ������ �ִ�
		hasMoreElements() �� nextElemext() ��
		��Ȯ�� ��ġ�ϴ� ����� �����Ѵ�.
		Enumeration ��� Iterator�� JDK 1.2 ���� �߰��Ͽ� ����ϴ� ������
		Enumeration �������̽��� ���� ������ ��Ҹ� ������ ����� ���� ������
		�̸� �����ϱ� ���� ���� ���� Iterator �������̽��̴�. 

*/

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class Test159
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� �ν��Ͻ� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� ��� �߰� 
		v.add("Java");
		v.add("Oracle");
		v.add("Jsp");
		v.add("Servelet");
		v.add("Spring");

		// ������ ������ ��ȯ�ϴ��� API Ȯ���غ���.

		// �� Enumeration
		Enumeration<String> e = v.elements();	// elements()�� enumeration�� ��ȯ�Ѵ�.	
		
		
		while (e.hasMoreElements())				// �ٸ� ��ҵ��� �� ������ �ֳ�? Ȯ���Ϸ� ���� ��
		{
			System.out.println(e.nextElement());	// �ִٸ� �ٸ� ��� ������ 
		}
		// Java
		// Oracle
		// Jsp
		// Servelet
		// Spring
		
		System.out.println("---------------------");

		
		// �� Iterator
		Iterator<String> it = v.iterator();
		while (it.hasNext())
		{	
			System.out.println(it.next());
		}
		// Java
		// Oracle
		// Jsp
		// Servelet
		// Spring
	}
}