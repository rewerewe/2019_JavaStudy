/*==================================
 ���� Ŭ������ �ν��Ͻ� ����
 - Ŭ���� ���� �ǽ� 
====================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������ �Է�(+ - * /)	  :  +
// >> 10 + 5 = 15 
// ����Ϸ��� �ƹ�Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �� �ֿ� �Ӽ� ���� 
	int su1, su2;
	char op;

	// �� �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /)    : ");
		op = (char)System.in.read();
	}

	// �� �޼ҵ� ����(��� : ����) 
	int cal()
	{
		int result;
		
		switch (op)
		{

			case '+' : result = su1 + su2; break;
			case '-' : result = su1 - su2; break;
			case '*' : result = su1 * su2; break;
			case '/' : result = su1 / su2; break;
			default "
		
		}

		return result;
	}

	// �� �޼ҵ� ����(��� : ���)
	// >> 10 + 5 = 15
	void print(int r)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, r);
	}

	
}

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// Calculate Ŭ���� ����� �ν��Ͻ� ���� 
		Calculate ob = new Calculate();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� 
		ob.input();
		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int result = ob.cal();
		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ�� 
		ob.print(result);
	}
}