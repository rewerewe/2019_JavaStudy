package test20190312;
/*====================================
 ���� ����(Exception) ó�� ����
=====================================*/

// Test145.java ���ϰ� ��~!!!
// �� �ڵ�� ����ó������ ����غ������� �ٸ� �����̴�.
// �� ���̸� �� �ľ��ص� ��. 

class Demo2
{	
	// �ֿ� �Ӽ� ���� 
	private int value;

	// getter
	public void setValue(int value) throws Exception
	{
		if (value <= 0)
			throw new Exception("value�� 0���� �۰ų� ���� �� �����ϴ�.");
			//-- ���ο� ���ܸ� �߻� ��Ű�� ��. ������ ���� throws �� �ƴ� throw �� �����Ѵ�. 
			//   setValue ���� ���ܰ� �߻������Ƿ�, �޼ҵ� ������ ���ܸ� throws ���־�� ������ ������ ���� �ʴ´�. 

		this.value = value;
	}

	// setter
	public int getValue()
	{
		return value;
	}
}


public class Test146
{
	public static void main(String[] args) // ����ó���� throws Exception
	{
		Demo2 ob= new Demo2();

		// ����ó����
		try
		{
			ob.setValue(-10);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.print(e.toString());
		}
		
	}
}

// ���� ���
/* 
java.lang.Exception: value�� 0���� �۰ų� ���� �� �����ϴ�.����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
