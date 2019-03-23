/*
 ���� �帧�� ��Ʈ��(���)
 - if ~ else �ǽ� 
 */

 // �ǽ� ����
 // ������ �� ������ �����ڸ� �Է¹޾� 
 // �ش� �������� ó�� ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�	: 10
// �� ��° ���� �Է�	: 14
// ������ �Է�(+ - * /) : +

// >> 10 + 14 = 24
// ����Ϸ��� �ƹ�Ű��....

// ---------------------------------
// ù ��° ���� �Է�	: 5
// �� ��° ���� �Է�	: 3
// ������ �Է�(+ - * /) : /

// >> 5 / 3 = 1
// ����Ϸ��� �ƹ�Ű��....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034 
{
	public static void main(String[] args) throws IOException
	{
	// ��� ��
	/*
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	int a, b, result = 0;
	char op;

	System.out.print("ù ��° ���� �Է� : ");
	a = Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է� : ");
	b = Integer.parseInt(br.readLine());
	
	System.out.print("������ �Է�(+ - * /) : ");		
	op = (char)System.in.read();					//-- �ڵ� �� ��ȭ ��Ģ�� ��߳��� ������ ������־�� ��. 
	

	if (op == '+')
	{
		result = a + b;
	}
	else if (op == '-')
	{
		result = a - b;
	}
	else if (op == '*')
	{		
		result = a * b;
	}
	else if (op == '/')
	{
		result = a / b;
	}

	System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);

	*/

	// ��� �� 	
	/*

	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	int a, b;
	char op;
	int temp;

	System.out.print("ù ��° ���� �Է� : ");
	a = Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է� : ");
	b = Integer.parseInt(br.readLine());
	
	System.out.print("������ �Է�(+ - * /) : ");
	// op = Integer.parseInt(br.readLine());
	// op = br.readLine(); -- String op ���� ��. 
	// temp = (char)System.in.read();		
	op = (char)System.in.read();					//-- �ڵ� �� ��ȭ ��Ģ�� ��߳��� ������ ������־�� ��. 
	
	// '1234' �� Integer.parseInt(); �� 1234
	// 'ABCD' �� Integer.parseInt(); �� (x)

	if (op == '+')
	{
		System.out.printf("\n>> %d + %d = %d", a, b, (a + b));
	}
	else if (op == '-')
	{
		System.out.printf("\n>> %d - %d = %d", a, b, (a - b));
	}
	else if (op == '*')
	{
		System.out.printf("\n>> %d * %d = %d", a, b, (a * b));
	}
	else if (op == '/')
	{
		System.out.printf("\n>> %d / %d = %d", a, b, (a / b));
	}
	else 
	{
		System.out.print("�Է� ������ ������ �����մϴ�.");
	}

	*/

	// ��� ��
	

	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	int a, b, op; 

	System.out.print("ù ��° ���� �Է� : ");
	a = Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է� : ");
	b = Integer.parseInt(br.readLine());

	System.out.print("������ �Է�(+ - * /) : ");
	op = System.in.read();
	
	// �׽�Ʈ(Ȯ��)
	System.out.prinln("op : " + op);
	//-- + �� op : 43
	//   - �� op : 45
	//   * �� op : 42
	//   / �� op : 47

	if (op == 43)	// +
	{
		System.out.printf("\n>> %d + %d = %d", a, b, (a + b));
	}
	else if (op == 45)	// - 
	{
		System.out.printf("\n>> %d - %d = %d", a, b, (a - b));
	} 
	else if (op == 42)	// *
	{
		System.out.printf("\n>> %d * %d = %d", a, b, (a * b));
	}
	else if (op == 47)	// / 
	{
		System.out.printf("\n>> %d / %d = %d", a, b, (a / b));
	}
	else 
	{
		System.out.print("�Է� ������ ������ �����մϴ�.");
	}






	// ���� Ǯ���� ���� ��
	
	/* 
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	int nNum1, nNum2;
	int nTot = 0;
	char cal;


	System.out.print("ù ��° ���� �Է� : ");
	nNum1 = Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է� : ");
	nNum2 = Integer.parseInt(br.readLine());

	System.out.print("������ �Է�(+ - * /) :");
	cal = (char)System.in.read();

	if (cal == 43)
	{
		nTot = nNum1 + nNum2;
	}
	else if (cal == 45)
	{
		nTot = nNum1 - nNum2;
	}
	else if (cal == 42)
	{
		nTot = nNum1 * nNum2;
	}
	else if (cal == 47)
	{
		nTot = nNum1 / nNum2;
	}
	*/



	/* ���� Ǯ���� ���� ��

	if (cal == '+')
	{
		cal2 = nNum1 + nNum2;
	}
	else if (cal == '-')
	{
		cal2 = nNum1 - nNum2;
	}
	else if (cal == '*')
	{
		cal2 = nNum1 * nNum2;
	}
	else if (cal == '/')
	{
		cal2 = nNum1 / nNum2;
	}
	

	System.out.println();
	System.out.printf("%d %c %d = %d\n", nNum1, cal, nNum2, nTot);

	*/

	}
}

// ���� ���

/* ��� ��

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 14
������ �Է�(+ - * /) : +

>> 10 + 14 = 24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

--------------------------------------

ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 3
������ �Է�(+ - * /) : /

>> 5 / 3 = 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/


/* ��� ��

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 14
������ �Է�(+ - * /) : +

>> 10 + 14 = 24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

--------------------------------------

ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 3
������ �Է�(+ - * /) : /

>> 5 / 3 = 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/