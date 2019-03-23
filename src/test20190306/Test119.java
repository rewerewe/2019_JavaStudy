package test20190306;
/*===============================
 ���� Ŭ���� ��� ����
 - ��ø Ŭ���� (���� Ŭ����)
================================*/

// �ܺ� Ŭ����(outer)
class InnerOuterTest
{
	static int a=10;
	int b=20;

	// ���� Ŭ����(inner)
	class InnerNested
	{
		int c=30;
		
		// �� inner �� write() �޼ҵ� 
		void write()
		{
			System.out.println("inner�� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}
	
	// �� outer �� write() �޼ҵ� 
	void write()
	{
		System.out.println("outer�� write()...");
		InnerNested ob1 = new InnerNested();
		ob1.write();
	}
}

// main()�޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ���� 
public class Test119
{
	public static void main(String[] args)
	{
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();

		// InnerNested ob3 = InnerNested();
		//-- ���� �߻�

		// InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//-- ���� �߻� 

		// �� ��ø ���� Ŭ�����ʹ� �޸� �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� 
		//	  ������� �ʰ� �ܵ����� ���� Ŭ������ �ν��Ͻ� �����ϴ� ���� �Ұ��� �ϴ�. 
		//	  
		// 
		// static�� �ܵ����� �ܺο��� ��ü ������ �����ϳ�.
		
		// �� Test117 Ŭ������ ���ؼ� �� ��.
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();

		// ??????

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();

		// ???????????????

	}
}
// ������
/*
outer�� write()...
inner�� write()...
a : 10
b : 20
c : 30
inner�� write()...
a : 10
b : 20
c : 30
inner�� write()...
a : 10
b : 20
c : 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/