package test20190312;
/*====================================================
 ���� �÷��� �����ӿ�ũ(Collection Framework) ���� 
=====================================================*/
import java.util.Stack;

public class Test150
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ 
	private static final String[] colors 
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	// ������ 
	public Test150()
	{
		// st ��� Stack �ڷᱸ�� ����
		// ���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� ��<String>��
		Stack<String> st = new Stack<String>();	

		// st ��� Stack �ڷᱸ���� ������ ���
		// colors ��� ���ڿ� �迭 ��Ҹ� ��� ��Ƴ���
		
		/*
		st.add("����");
		st.add("���");
		st.add("�ʷ�");
		st.add("�Ķ�");
		st.add("����");
		st.add("����");
		*/

		for (String color : colors)
			st.push(color);
			// st.add(color); push�� add�� ������. 


		// ������ �߰� 
		st.push("����");

		// ������ �߰�
		st.push("��Ʈ");

		// ������ �߰� 
		// st.push(10.0);
		//--==>> ���� �߻�(������ ����)
		//-- ���׸� ǥ������ ���� �����ϰ� �ִ�
		//	 String�� �ƴ� �ٸ� �ڷ���(double)�� ���ÿ� push() �Ϸ��� �߱� ����...


		// ��� �޼ҵ� ȣ�� 
		popStack(st);


	}

	// ��� �޼ҵ�
	private void popStack(Stack<String> st)
	{
		// String col = (String)st.pop();
		// System.out.println(col);

		System.out.print("pop : ");
		while (!st.empty())
			System.out.print(st.pop() + " ");
		System.out.println();

	}


	public static void main(String[] args)
	{
		new Test150();
		// �����ڸ� public ���� ȣ�����ָ� �ȴ�. 
		
	}
}