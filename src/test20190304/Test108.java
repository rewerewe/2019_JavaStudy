/*==================================
 ���� Ŭ���� ��� ����
 - ��� (Inheritance)
==================================*/

//�Բ� Ǯ���� ���� 
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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// super class
class Aclass 
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}


// sub class 
class Bclass extends Aclass 
{
	/*
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	Bclass()
	{
	}
	
	/*  Bclass�� input �޼ҵ�� �Ʒ��� ���� ��Ȳ�� ����� �� ���̴�. 

	boolean input() throws IOException
	{
		���� �� ���� �Է��� ��Ȳ�� �ƴ϶��			10 20 30 
				return false;

		�����ڸ� ����� �Է��� ��Ȳ�� �ƴ϶��
				return false;

		return true;	
	}

	*/ 

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : ");		// 20 15
		String temp = br.readLine();								// "20 15" 
		 
		String[] str = temp.split("\\s");	// ������ �� ����  (1) temp. ���� string �迭�� �޼ҵ� ��� ��������. (2) split() �����ڸ� �Ѱ��ְԵ�
											// ���ڿ��� �迭 ���·� ��ȯ�Ѵ�. 
		// �� ���ڿ�.split("������");
		// ex) "��� ���� �ٳ��� ���� ����".split("\\s");
		//		��ȯ �� {"���", "����", "�ٳ���", "����", "����"}
		// ex) "10 20 30 40".split("\\s");
		//		��ȯ �� {"10", "20", "30", "40"}
		//---------------------------------------------->> String[] str = {"20", "15"};

		if (str.length != 2)
			return false;	// ���Ͻ� ���� ��ȿ���� �Ǵ��ϱ� ���� boolean �� ����. 
							// ������ 1) ���� ��ȯ 2) �޼ҵ� ���� �̹Ƿ� ���� ��ȯ�ϸ� ����. 

		// �� �� ���ǹ��� ������ ��� �Ʒ��� �ڵ���� �����ִ� ��Ȳ������
		//	  �� �̻� �������� �ʰ� ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�. 
		
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char) System.in.read();

		if (op!='+' && op!='-' && op!='*' && op!='/')		// ���������� �ƴϾ�� �� ��, ��� �����ؾ� �ϹǷ� && and���� �Ѵ�. 
			return false;
		
		return true;

		/* 
		if (op=='+' || op=='-' || op=='*' || op=='/')		// ���������� ���ƾ� �� ��, ���� �� �ϳ��� �����ϸ� �ǹǷ� || or�̾�� �Ѵ�. 
			return true;
		
		return false;
		*/
	}

	double calc()
	{
		double result = 0;

		switch (op)
		{
		case '+': result = x+y; break;
		case '-': result = x-y; break;
		case '*': result = x*y; break;
		case '/': result = (double)x/y; break;
		
		}

		return result;
	
	}
}


// main()�޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ���� 
public class Test108 
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		// System.out.print(ob.input());
		if (! ob.input())	// �Է°��� ��ȿ���� '�ʴٸ�'
		{
			System.out.print("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);
		
	}
}


