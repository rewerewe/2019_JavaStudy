package test20190304;
/*==================================
 ���� Ŭ���� ��� ����
 - ��� (Inheritance)
==================================*/
// ���� Ǯ���� ���� 
/*	
	�� �ǽ� ����
	������ ���� ���α׷��� �����Ѵ�.
	��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

	���� ��)
	������ �� ���� �Է�(���� ����) : 20 15
	������ �Է�(+ - * / ) : - 
	>> 20 - 15 = 5 
	����Ϸ��� �ƹ�Ű�� ��������...

*/

import java.util.Scanner;
import java.io.IOException;

// �θ� Ŭ���� 
class Aclass_2 
{
	 protected int x, y;
	 protected char op;

	Aclass_2()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// �ڽ� Ŭ���� 
class Bclass_2 extends Aclass_2 
{ 
	double result;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}

	double cal()
	{
		switch (op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = x / y; break;
		}

		return result;	
	}

}


public class Test108002
{
	public static void main(String[] args) throws IOException
	{
		Bclass_2 ob = new Bclass_2();

		ob.input();
		double result = ob.cal();
		ob.write(result);		
	}
}

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 20 30
������ �Է�(+ - * /) : *
>> 20 * 30 = 600.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
