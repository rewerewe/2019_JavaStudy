package test20190313;
/*==================================
 ���� �÷��� (Collection) ���� 
===================================*/

/*
	 // Vector v = new Vector();
	 
	 Q. �� ���ʹ� ��ϱ��?
		- ����ִ� Vector �ڷᱸ�� ����

	// Vector v = new Vector(8);

	Q. �� ���ʹ� ��ϱ��?
		- 8���� �ʱ� element�� ���� Vector �ڷᱸ�� ����
		  8���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

	// Vertor v = new Vector(3, 5);
		- 3���� �ʱ� elements�� ���� Vector �ڷᱸ�� ����
		  3���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) 5�� ����(Ȯ��)�ȴ�. 

�� ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ�... �� 
������Ƽ�� �ڷ����� ��Ƴ��� ���� �����ϴ�.
�� ���� ��� �� ������ ������ Ȯ��  (Check~~!)

*/

import java.util.Vector;
import java.util.Iterator;

// MyVector Ŭ���� ���� �� Vector Ŭ���� ���
class MyVector extends Vector<Object>
{
		
		/*
		... ���� Vector ��� ��� 
		*/
	

		// ������
		MyVector()
		{
			// Vecotr(���� Ŭ����) ������ ȣ��
			super(1,1);
			//-- ù ��° ���� : �־��� �뷮
			//   �� ��° ���� : ������
		}

		void addInt(int i)
		{
			addElement(new Integer(i));
		}
		
		void addFloat(float f)
		{
			addElement(new Float(f));
		}
		
		void addString(String s)
		{
			addElement(s);
		}

		void addCharArray(char[] a)
		{
			addElement(a);
		}

		void write()
		{	
			/*
			Iterator<Object> it = this.iterator();
			while (it.hasNext())
			{
				System.out.println(it.next());
			}
			*/

			Object o;
			int length = size();

			System.out.println("���� ��� ���� : " +length);
			//--==>>
		

			for (int i=0; i<length; i++)
			{
				o = elementAt(i);			// �ڵ����� ��ĳ���� �Ȱ���. 

				// ��instanceof�� ������
				//-- ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ�� 

				if (o instanceof Integer)
				{
					System.out.println("������ : " + o);
				}
				else if (o instanceof Float)
				{
					System.out.println("�Ǽ��� : " + o);
				}
				else if (o instanceof String)
				{
					System.out.println("���ڿ��� : " + o.toString());
				}
				else if (o instanceof char[])
				{
					// System.out.println("���ڹ迭 : " + o);				//-- �ؽ��ڵ� 
					// System.out.println("���ڹ迭 : " + o.toString());	//-- �ؽ��ڵ� 
					
					/*
					("���ڹ迭" + o.toArray());
					*/

					/*
					// ���Ǯ�� : ������ 
					String chr = new String(char[] o);
					System.out.println("���ڹ迭 : " + chr);
					*/

					// �Բ� Ǯ���� ���� ��
					// o �� ��Ҹ� ������ char �̰�, ��� ��Ҹ� ����� ��� for������ �ذ��Ѵ�. 
					// �� ��, o�� ��Ҵ� char[] �� ����ȯ ���־�� ��.
					/*
					System.out.print("���ڹ迭 : ");
					for (char ch : (char[]) o)
						System.out.print(ch);
					System.out.println();
					*/

					System.out.println("���ڹ迭 : " + String.copyValueOf((char[]) o));
					//								  --------     		  ----------
					//              					 |			���ڹ迭�� ����, o �� ����ȯ  
					//                  �޼ҵ� ȣ���ؼ� ������ ��ü.�޼ҵ��() �ϵ���
					//					String �� �޼ҵ带 ������ ��ü ������ ���ص� 
					//					String �� �ִ� �޼ҵ� ��� �� �˷���� �Ѵ�.... ���.

					//--==>> ���� ��� ���� : 4
					//		 ������ : 5
					//		 �Ǽ��� : 3.14
					//		 ���ڿ��� : �ȳ��ϼ���
					//		 ���ڹ迭 : study
					
				}
				else
				{
					System.out.println("Ÿ�� Ȯ�� �Ұ�");
				}
			}
		}
	
}

public class Test154
{
	public static void main(String[] args)
	{
		// MyVector Ŭ���� �ν��Ͻ� ����
		MyVector v = new MyVector();

		// �ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s  = new String("�ȳ��ϼ���");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);			//-- ���� �ڷᱸ���� ���� ����
		v.addFloat(real);			//-- ���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);				//-- ���� �ڷᱸ���� ���ڿ� ����
		v.addCharArray(letters);	//-- ���� �ڷᱸ���� ���� �迭 ���� 
	
		v.write();
	}
}
