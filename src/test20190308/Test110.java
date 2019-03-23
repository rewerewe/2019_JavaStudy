package test20190308;
/*==================================
     ���� Ŭ���� ��� ����
	 - �߻� Ŭ����(Abstract)
==================================*/

/*
	�� �߻� Ŭ����(abstract)��
	   ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
	   ���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
	   �޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

	�� ���� �� ����
	   [��������������] abstract class Ŭ������   // [ ] �� ���������ϴٴ� ��
	   {
			[��������������] abstact �ڷ��� �޼ҵ��([�Ű�����], ...);  //  �ڿ� �����ݷ� ��°� ����
	   }

	�� Ư¡
	   Ŭ������ ��� �ϳ� �̻��� �߻�޼ҵ带 ������ ��
	   �� Ŭ������ Ŭ���� �̸� �տ� ��abstact�� Ű���带 �ٿ�
	   �߻� Ŭ������ ����ؾ� �ϸ�
	   �߻� Ŭ������ ������ ��쿡��
	   �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
	   �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
	   ��ü�� ������ �� ���� ���̴�.

	   ��, �߻� Ŭ������ ���������� ������ �� ���� ������
	   ����� ���ؼ��� �����ϸ�
	   �߻�Ŭ�������� ��ӹ��� ���� Ŭ����������
		�ݵ�� �߻� �޼ҵ带 �������̵�(Overriding) �ؾ��Ѵ�.

	�� ��abstract��Ű�����
	   Ŭ������ �޼ҵ忡���� ����� �� ������
	   ��� ������ ���� ���������� ��� �Ұ��ϴ�.

*/

// �߻� Ŭ����(abstract)
abstract class SortInt
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	
	// �߻� �޼ҵ�(abstract)
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	
	// compare() �޼ҵ�� ũ�� �� �޼ҵ�
	// ��final��Ű����� ���� �� Ŭ����(SortInt)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������ �� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];

		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	// swap()�޼ҵ�� �ڸ� �ٲ� �޼ҵ�
	// ��final��Ű����� ���� �� Ŭ����(SortInt)�� ��ӹ޴� Ŭ��������
	// ��� �� �޼ҵ常ŭ�� Overriding �ؼ� ������� ���ƶ�
	// ��� �ǹ� ����
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}

// SortInt(�߻� Ŭ����)�� ��ӹ��� Ŭ���� �� �߻� Ŭ���� �� �߻� �޼ҵ� ������ �� �Ϲ� ���� Ŭ����
public class Test110 extends SortInt
{
	/*
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}

	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];

		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	*/

	int i, j;

	static int[] data = {7, 10, 3, 8, 7};


	// �Բ� Ǯ���� ����
	//--------------------------------------------------
	
	// �� ĭ ä���ֱ�
	
	@Override
	// protected abstract void sorting() �� abstract �� �� ���� 
	protected void sorting()
	{
		// Selection Sort 
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				if (compare(i,j) > 0)			// ũ���(���� ����)
					swap(i,j);
				
			}

			// �߰�
			System.out.print((i+1) + "Round Data : ");
			for (int n : data)
				System.out.print(n + " ");
			System.out.println();
			
		}
	
	}


	//--------------------------------------------------

	public static void main(String[] args)
	{
		// SortInt ob = new SortInt();
		Test110 ob = new Test110();
		ob.sort(data);



		System.out.print("Source Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();
	}
}

// ���� ���
/* 
1Round Data : 3 10 7 8 7
2Round Data : 3 7 10 8 7
3Round Data : 3 7 7 10 8
4Round Data : 3 7 7 8 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/