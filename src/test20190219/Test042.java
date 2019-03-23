/*==========================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - switch�� �ǽ�
===========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
// ���� ����� ���ǻ� ���� ���·� ó���ϵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 10
// �� ��° ���� �Է�    : 28
// ������ �Է�(+ - * /) : +

// >> 10 + 28 = 38
// ����Ϸ��� �ƹ� Ű�� ��������.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("ù ��° ���� �Է�    : ");
	int num1 = Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է�    : ");
	int num2 = Integer.parseInt(br.readLine());
	
	// System.in.read() : �ƽ�Ű�ڵ� ���� �о���Ƿ�, �� ��ȯ ���ش�. 
	System.out.print("������ �Է�(+ - * /) : ");
	char cal = (char)System.in.read();
	
	// �Բ� Ǯ���� ����
	int result;
	
	switch(cal)
	{
		// swtitch���� �������� �κп��� byte, short, int, long �� ������, JDK ������ ���׷��εǸ鼭 char �� �� �ְ� ��. 
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = num1 / num2; break;
		default : return;						//--�޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
												//-- return�� �� 1) ���� ��ȯ 2) �޼ҵ� ���Ḧ �ǹ��Ѵ�. 
												
	}

	// �� ���� : 1. ���� ��ȯ
	//			 2. �޼ҵ� ���� 
	
	System.out.println();
	System.out.printf(">> %d %c %d = %d\n", num1, cal, num2, result); 



	// ���� Ǯ���� ����
	/*

	// �����ں� �ƽ�Ű�ڵ� : + 43 
	//						 - 45 
	//						 * 42
	//						 / 47

	// �ƽ�Ű�ڵ� ������ case ���� 
	switch (cal)
	{
		case 43 : System.out.printf(">> %d + %d = %d\n", num1, num2, (num1 + num2)); break;
		case 45 : System.out.printf(">> %d - %d = %d\n", num1, num2, (num1 - num2)); break;
		case 42 : System.out.printf(">> %d * %d = %d\n", num1, num2, (num1 * num2)); break;
		case 47 : System.out.printf(">> %d / %d = %d\n", num1, num2, (num1 / num2)); break;
	}
    

	// ��ȣ�� case ���� 
	/*
	switch (cal)
	{
		case '+' : System.out.printf(">> %d + %d = %d\n", num1, num2, (num1 + num2)); break;
		case '-' : System.out.printf(">> %d - %d = %d\n", num1, num2, (num1 - num2)); break;
		case '*' : System.out.printf(">> %d * %d = %d\n", num1, num2, (num1 * num2)); break;
		case '/' : System.out.printf(">> %d / %d = %d\n", num1, num2, (num1 / num2)); break;
	}
	
	*/
	

	}
}


// ���� ���
/*
ù ��° ���� �Է�    : 10
�� ��° ���� �Է�    : 90
������ �Է�(+ - * /) : +

>> 10 + 90 = 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
