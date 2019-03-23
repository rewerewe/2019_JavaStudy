package test20190313;
/*==================================
 ���� �÷��� (Collection) ���� 
===================================*/

// * �˻� �� ����

import java.util.Vector;

public class Test156
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ 
	private static final String[] colors 
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� �ν��Ͻ� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� colors ��� �߰�
		for (String color : colors)
			v.add(color);

		// ���� �ڷᱸ�� v �� ��ü ��� ���
		System.out.print("��ü ��� ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==>> ��ü ��� ��� : ���� ��� �ʷ� �Ķ� ���� ����


		// "��ȫ" �� ��ġã��
		String s1 = "��ȫ";

		// indexOf()
		int i = v.indexOf(s1);
		System.out.println(s1 + "�� index ��ġ : " + i);
		System.out.println();
		//--==>> ��ȫ�� index ��ġ : -1


		// ���� Ǯ���� ���� - "���" �����ϱ� 
		String s2 = "���";
		v.remove("���");

		System.out.print("����� ������ ��ü ��� ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==>> ����� ������ ��ü ��� ��� :���� �ʷ� �Ķ� ���� ����


		// �Բ� Ǯ���� ���� - "���" �����ϱ� 
		// v.contains(s) : ���� �ڷᱸ�� v �� s �� ���ԵǾ� �ִٸ�... index Ȯ�� 
		if (v.contains(s2))
		{
			// v.indexOf(s) : ���� �ڷᱸ�� v ���� s �� �ε��� ��ġ ��ȯ(Ȯ��) 
			i = v.indexOf(s2);
			System.out.println(s2 + "�� index ��ġ " +  i);

			// �켱 ���� �ڵ带 ���� ã��... ã������ �����϶�.
			v.remove(i);
		}
		
		// ã�Ƽ� ������ �� ��ü ��� ���
		System.out.print("���� �� ��ü ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==>> ���� �� ��ü ��� : ���� �ʷ� �Ķ� ���� ����


		
		// �߰� �׽�Ʈ(���ǻ���)
		System.out.println(colors);
		//--==>> [Ljava.lang.String;@15db9742  ** ���� �ּҰ��̶�� �����ϸ� �ȵ�. �ؽ��ڵ���

		System.out.println(v);
		//--==>> [����, �ʷ�, �Ķ�, ����, ����] 
		// ���ʹ� ���� ���� ��µ�. �׷��� �� ��µ� ������ �ٸ� ���� �� ���� ����. �� �׽�Ʈ ��ü ���� ���� ������.

		// * Ȯ�ο�(�׽�Ʈ��) ���� �����ʹ�
		//	 ���� ��Ұ� �ƴϱ� ������ 
		//   �̸� Ȱ���Ͽ� ������ �����ϰų� ����ϸ� �ȵȴ�. 
	}
}