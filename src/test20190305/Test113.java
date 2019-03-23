package test20190305;
/*=======================================
 ���� Ŭ���� ��� ����
 - �������̽� (Interface)
=========================================*/

// �������̽�
interface ADemo
{
	public void write();
}

// �������̽�
interface BDemo
{
	public void print();
}

// Ŭ����
// class DemoImpl
//
// �� �������̽��� �����ϴ� �߻� Ŭ����
class DemoImpl_2 implements ADemo, BDemo
{
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带 �������̵�(Overriding)�� �� 
	// ��@Override�� ������̼�(annotation)�� ����� �� ����.
	// JDK 1.6 ���ĺ��� ���� ������ �����̴�.
	// ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵�(Overriding) �� ������
	// JDK 1.5������ ��@Override�� ������̼�(annotation) ����� �����ϴ�. 
	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ�...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ�...");
	}
}

public class Test113
{
	public static void main(String[] args)
	{
		// �����ұ�? 
		// ADemo ob = new ADemo();
		// ���� �߻� : �������̽� �� �ν��Ͻ� ���� �Ұ� 

		// �����ұ�?
		// BDemo ob = new BDemo();
		// ���� �߻� : �������̽� �� �ν��Ͻ� ���� �Ұ�

		// �����ұ�? 
		// ADemo, BDemo �������̽� ����(implements)�� Ŭ����(�� DemoImpl) ����� �ν��Ͻ� ���� 
		DemoImpl_2 ob1 = new DemoImpl_2();
		// ���� �߻� : ���� DemoImpl�� �߻�Ŭ���� �� �Ϲ� Ŭ������ ��ȯ �� ���� ����. (��, �������̵� �ؾ���)

		ob1.write();
		ob1.print();
		//--==>> ADemo �������̽� �޼ҵ�...
		//		 BDemo �������̽� �޼ҵ�...

		ADemo ob2 = new DemoImpl_2();		//-- �� ĳ����
		BDemo ob3 = new DemoImpl_2();		//-- �� ĳ���� 

		// ob2.print();	//--==>> ���� �߻�
		// ob3.write();	//--==>> ���� �߻� : ���� Ŭ���� �޼ҵ��.

		((BDemo)ob2).print();
		((ADemo)ob3).write();
		//--==>> BDemo �������̽� �޼ҵ�...
		//		 ADemo �������̽� �޼ҵ�...
		
		// �� DemoImpl Ŭ������ ADemo, BDemo �� �������̽��� 
		//	  ��� �����߱� ������ �����ϴ�.
		//	  ���� Ŭ������ �� �������̽� �� �ϳ��� 
		//	  ������ ��Ȳ�̶�� ó���� �� ���� �����̴�. 

		((DemoImpl)ob3).write();	//-- �ٿ� ĳ����
		//--==>> ADemo �������̽� �޼ҵ�...

	
	}
}
// ���� ���
/*
ADemo �������̽� �޼ҵ�...
BDemo �������̽� �޼ҵ�...
BDemo �������̽� �޼ҵ�...
ADemo �������̽� �޼ҵ�...
ADemo �������̽� �޼ҵ�...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/