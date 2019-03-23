package test20190306;
/*=====================================
 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Object Ŭ���� 
======================================*/

class Test4
{
	private int a=10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}

public class Test123
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10==9 : " + (10==9));
		//--==>> 10==9 : false

		int a = 10;
		int b = 10;
		System.out.println("a==b : " + (a==b));
		//--==>> a==b : true

		// �� ��==�� �� �����ڴ� �ǿ������� ũ�⸦ ���Ѵ�.
		
		// ũ�⸦ �������� ���ϸ�, ���� ũ��� ��������?
		System.out.println("ob1 == ob2 : " + (ob1==ob2));
		//--==>> ob1 == ob2 : false
		// ��ü�� ���� ���, ũ�⸦ ���ϴ� �� �ƴ϶� �ּҰ��� ���Ѵ�.
		// �����ϴ� �ּ��� ���� ���Ѵ�. 
		//-- ��ü(Object)���� ���ϴ� �������� ����ϴ� ��==�������ڴ� 
		//	 ũ�⸦ ���ϴ� ���� �ƴ϶� ��ü�� �ּҰ��� ��. 

		System.out.println("ob1.equals(ob2) : " + (ob1.equals(ob2)));
		//--==>> ob1.equals(ob2) : false

		// �� ��==�������ڿ� Object Ŭ������ ��equals()�� �޼ҵ�� 
		//	  ������ �������� ��ü�� �ּҰ��� ��.

		System.out.println();
		System.out.println("-------------------------");
		System.out.println();

		System.out.println("ob1            : " + ob1);
		//--==>> ob             : Test@15db9742

		System.out.println("ob1.toString() : " + ob1.toString());
		//--==>> ob1.toString() : Test@15db9742

		System.out.println("ob2            : " + ob2);
		//--==>> ob2            : Test@6d06d69c

		System.out.println("ob2.toString() : " + ob2.toString());
		//--==>> ob2            : Test@6d06d69c

		// ��Ŭ������@�ؽ��ڵ塻

		// �� �ؽ��ڵ�(hachcode)
		//	  : �ڹ� ���������� ��ü�� �����ϱ� ���� ����ϴ� ��.
		//		�޸��� �ּҰ����� �����ϸ� �ȵȴ�.

		// �� ��ü�� ������ hashcode(�ؽ��ڵ�)�� ������
		//	  hash(�ؽ��ڵ�)�� ���ٰ� ���� ��ü�� �ƴϴ�.

	}
}