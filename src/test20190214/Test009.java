/*=========================================
���ắ���� �ڷ��� ����
- ������ �ڷ��� �ǽ� �� �׽�Ʈ : double
==========================================*/

public class Test009
{
	public static void main(String[] args)
	{
		
		// ������ ������ ������
		double a = 1/2;							// �ǿ����� �� �Ǽ��� ���ԵǾ� �־�� �Ѵ�. ������ �ִٸ� 0���� ��µ�. �� ��ȯ�Ͽ� ������ ��� ������ 0.0 ��µ�.

		System.out.println("double a :" + a);
		// =====>> double a :0.0

		double b = 1/2 + 1/2;
		System.out.println("double b : " + b);
		// =====>> double b : 0.0

		// ������ �Ǽ��� ������
		double c = 1/2.0;
		System.out.println("double c : " + c);
		// ======>> 
		/*	������ ����� �����Ͽ� �ǿ����� �� �Ǽ��� ���ԵǾ� �ִٸ� �Ǽ� ����� ������ �̷������, 
		������� �Ǽ� ���·� ����Ǿ� ��ȯ�ȴ�.		*/

		double d = 3/2 + 1/2;
		System.out.println("double d : " + d);
		// =====>> double d : 1.0

		double e = 3/2 + 1/2.0;
		System.out.println("double e : " + e);
		// =====>> double e : 1.5
	
	}
}

// ������

/*
double a :0.0
double b : 0.0
double c : 0.5
double d : 1.0
double e : 1.5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
