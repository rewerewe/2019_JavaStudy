package test20190222;
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

// ���� Ǯ���� ���� 

import java.util.Scanner;
import java.io.IOException;

class NumCal
{	
	int a;
	int b;
	char cal;
	double result = 0;	// result �ʱ�ȭ ���ְų�, switch �� default ���ְų� 
	
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();		// �� ������ �޾ƾ� �ϹǷ� 

		System.out.print("������ ������ �Է�(+ - * /) : ");
		// cal = sc.next();
		cal = (char)System.in.read();
	}

	double calcul()
	{

		switch (cal)
		{
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
			
		}
		
		return result;
	}


	void print()
	{
		System.out.printf(">> %d %c %d = %.2f\n", a, cal, b, result);
	}


}
public class Test073_2
{
	public static void main(String[] args) throws IOException
	{
		NumCal ob = new NumCal();
		ob.input();
		double cal = ob.calcul();
		ob.print();
	}
}

// ������
/*
������ �� ���� �Է�(���� ����) : 10 20
������ ������ �Է�(+ - * /) : +
>> 10 + 20 = 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 10 20
������ ������ �Է�(+ - * /) : -
>> 10 - 20 = -10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 10 20
������ ������ �Է�(+ - * /) : *
>> 10 * 20 = 200
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 10 20
������ ������ �Է�(+ - * /) : /
>> 10 / 20 = 0.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
