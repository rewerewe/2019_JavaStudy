package test20190218;
/*===============================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - if ~ else�� �ǽ� 

 ===============================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �ۼ��Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 4
// �� ��° ���� �Է� : 8
// �� ��° ���� �Է� : 73

// >> ���� ��� : 4 8 73
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

	
		// �Բ� Ǯ���� ����
	
	
		int a, b, c;		//-- XOR ������ ����ڰ� �Է��ϴ� ������ ���� ���� ����
		int temp;			//-- �ӽ� ���庯��(�� ��) 


		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3
		//		   2 3 1 | 1 2 3 | 1 3 2 | 1 2 3
		//		   2 1 3 |       | 1 2 3 |
		//		   1 2 3

		// �տ� ���ڰ� �ڿ� ���ں��� Ŭ ���� �ڸ��ٲ�

		// �� ù ��° ������ �� ��° �������� ũ�ٸ�...
		// �� ������ �ڸ��� �ٲ۴�. 
		// �� �� ��° ������ �� ��° �������� ũ�ٸ�...
		// �� ������ �ڸ��� �ٲ۴�. 
		// �� ù ��° ������ �� ��° �������� ũ�ٸ�...
		// �� ������ �ڸ��� �ٲ۴�. 

		if ( a > b )		// �� ù ��° ������ �� ��° �������� ũ�ٸ�...
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = a;
			a = b;
			b = temp;

		}
		if ( b > c )		// �� �� ��° ������ �� ��° �������� ũ�ٸ�...
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = b;
			b = c;
			c = temp;
		}
		if	( a > b )
		{
			temp = a;
			a = b;
			b = temp;
		}

		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);

		/*


		// ���� Ǯ���� ���� 
		
		
		int n1, n2, n3 = 0;
		int sor1 = 0;
		int sor2 = 0;
		int sor3 = 0;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n3 = Integer.parseInt(br.readLine());
		
		System.out.println();
		System.out.printf(">> ���� ��� : %d %d %d\n",sor1, sor2, sor3);

		// ���� ó�� : ����
		// n1 5
		// n2 10
		// n3 1

		if ( n1 > n2 && n1 > n3)			// n1�� ���� Ŭ ��
		{
			sor3 = n1;
		}
		else if ( n1 > n2 && n1 < n3)			// n1�� �߰� �� ��
		{
			sor2 = n1;
		}
		else if ( n1 < n2 && n1 < n3)			// n1�� ���� ���� ��
		{
			sor1 = n1;
		}


		if ( n2 > n3 && n2 > n1 )			// n2�� ���� Ŭ �� 
		{
			sor3 = n2;
		}
		else if ( n2 > n3 && n2 < n1 )		// n2�� �߰� �� �� 
		{
			sor2 = n2;
		}
		else if ( n2 < n3 && n2 < n1 )		// n2�� ���� ���� ��
		{
			sor1 = n2;
		}
		
		

		if ( n3 > n1 && n3 > n2 )		// n3�� ���� Ŭ �� 
		{
			sor3 = n3;
		}
		else if ( n3 > n1 && n3 < n2 )		// n3�� �߰� �� ��
		{
			sor2 = n3;
		}
		else if ( n3 < n1 && n3 < n2 )		// n3�� ���� ���� ��
		{
			sor1 = n3;
		}

		*/


	}
}

// ���� ���
/*

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 89
�� ��° ���� �Է� : 68

>> ���� ��� : 10 68 89
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/