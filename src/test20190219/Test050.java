/*=========================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - �ݺ���(while) �ǽ�
===========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 10 
// 10 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ�Ű��...

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ�Ű��...

// �� �Ҽ� : 1 �Ǵ� �ڱ��ڽ��� �� �̿��� � ���ε� ���� �� ���� ��.
//			 ��, 1�� �Ҽ� �ƴ� 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ���� �� �ʱ�ȭ 

		int num;					//-- ����� �Է°��� ���� ���� 
		
		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		int n = 2;								//-- ����� �Է°��� �������
												//   ������ ������ ������ ����(1�� ���� ����) 

		boolean flag = true;					//-- �Ҽ���� �⺻ ��.�� ���� **check~~!!
		// String temp = "�Ҽ���";

		while (n < num)							// �Է� ���� �������� �� �� �������� �ݺ��Ѵ�. 
		{
			if (num % n == 0)
			{
				flag = false;					//-- �Ҽ��� �ƴϴ�
				// String temp = "�Ҽ��� �ƴϴ�";
				break;
			}

			n++;								//�������� ���� 1�� �����Ѵ�.
		}

		// ��� ���(��� ���� �����ؾ� �� �߰� Ȯ�� �� 1���� ���ο� ���� Ȯ��)
		// �Ҽ��� && 1�� �ƴϴ�.
		// �� �������� ������� �Ҽ���.
		// �׷��� ������
		// �� �������� ������� �Ҽ� �ƴϴ�. 

		if (flag==true && num != 1)				//-- �������� �Ǵ��� �� �ִ� ���¿��� �Ѵ�. �� boolean�� ���� flag �� ����
			System.out.printf("%d �� �Ҽ� \n", num);
		else 
			System.out.printf("%d �� �Ҽ��ƴ� \n", num);

		

		// ���� Ǯ���� ���� (feat. ������)

		/*

		// ���� �ν� �� �м�
		// 1. ����ڷκ��� ������ �Է¹޴´� (BufferedReader ���) 
		// 2. �޾ƿ� �����͸� ������ �Ҽ����� �ƴ��� �Ǻ�, ������� ���� ����(result) ����
		// 3. �ݺ��� ����
		

		// ����ڷκ��� ������ ���� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է� : ");
		
		// �ֿ� ���� ����
		int n;
		n= Integer.parseInt(br.readLine());
		
		String result=""; 

		if (n == 1) 
		{
			System.out.printf("%d �� �Ҽ� �ƴ�\n",n);		
		}
		else if (n != 1)
		{
			int i=2;			// ���� ������ ���� i�� ����, i ���� while������ �ݺ�, �����Ѵ�. 
				while (i < n)
				{	
					if (n % i != 0)
					{	
						result = "�Ҽ�";
						
					} else {

						result = "�Ҽ� �ƴ�";


					}

					System.out.printf( "i %d n %d result %s ",i,n,result); 

					i++;
				}
			
			
		}
		
			System.out.printf("%d �� %s\n", n, result);
			
		
		/*
		int n;	
		n= Integer.parseInt(br.readLine());
		
		int result;
		
		// �ݺ��� ���� 
		while (n <= 100)
		{
			result = (n / (n-1));

			if (result != 0 && result == 1)
			{
				System.out.printf("%d �� �Ҽ�", n);
			}
			else 
			{
				System.out.printf("%d �� �Ҽ� �ƴ�", n);
			}
			
			n++;
			
		}
		*/
	}
}

// ���� ��� 
/*
������ ���� �Է� : 11
11 �� �Ҽ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 8
8 �� �Ҽ��ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 1
1 �� �Ҽ��ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/