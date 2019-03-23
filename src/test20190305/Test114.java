package test20190305;
/*=======================================
 ���� Ŭ���� ��� ����
 - �������̽� (Interface)
=========================================*/

// �������̽�
interface Demo_2
{
	public void write();
	public void print();
}

// Demo �������̽��� �����ϴ� �߻� Ŭ���� 
abstract class DemoImpl_3 implements Demo_2
{
	@Override
	public void write()
	{
		System.out.println("wrtie() �޼ҵ� ������...");
	}

	// public void print();
}


// �߻� Ŭ������ ��ӹ޴� �߻� Ŭ����  
// abstract class DemoImplSub extends DemoImpl
//		��
// �߻� Ŭ������ ��ӹ޴� �Ϲ� Ŭ���� 
class DemoImplSub extends DemoImpl_3
{
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}

public class Test114
{
	public static void main(String[] args)
	{
		// Demo ob1 = new Demo();				//-- �������̽� �� �ν��Ͻ� �����Ұ� 
		//DemoImpl ob2 = new DemoImpl();		//-- �߻�Ŭ���� �� �ν��Ͻ� �����Ұ� 
		
		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		//--==> wrtie() �޼ҵ� ������...
		//		print() �޼ҵ� ������...
	}
}

// ���� ���
/*
wrtie() �޼ҵ� ������...
print() �޼ҵ� ������...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/