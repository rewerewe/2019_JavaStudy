/*===============================================
 ���� ���� �帧�� ��Ʈ��(���)����
 - if ~ else�� �ǽ�
================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ���� �� ���� �Է� �޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����͸� �� ���� ó���� �� �ֵ��� �����ϸ�
// ��XOR�� �����ڸ� Ȱ���Ͽ� ���� ó���� �� �� �ֵ��� �Ѵ�.
// Scanner ���. 

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 160 80 241

// >> ���� ��� : 80 160 241
// ����Ϸ��� �ƹ� Ű�� ��������...

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
*/

import java.util.Scanner;

public class Test037
{
	public static void main(String[] arge) // throws IOException
	{
	// �Բ� Ǯ���� ����

	Scanner sc = new Scanner(System.in);

	int a, b, c;

	System.out.print("������ �� ���� �Է�(���� ����) : ");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();

	if (a > b)
	{
		a = a^b; 
		b = b^a;
		a =a^b;
	}
	if (b > c)
	{
		a = a^b;
		b = b^a;
		a =a^b;
	}
	if (a > b)
	{
		a = a^b; 
		b = b^a;
		a =a^b;
	}

	System.out.printf(">> ���İ�� : %d %d %d \n", a, b, c);


	// ���� Ǯ���� ����
	/*
	// BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	Scanner sc = new Scanner(System.in);
	int x;
	int temp;


	System.out.print("������ �� ���� �Է�(���� ����) : ");
	// x = Integer.parseInt(br.readLine());
	x = sc.nextInt();

	x = ^

	
	System.out.printf(">> ���İ�� : %d\n",x);
	*/
		
	}
}