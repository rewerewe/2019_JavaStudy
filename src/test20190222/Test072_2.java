/*==================================
 ���� Ŭ������ �ν��Ͻ� ����
 - Ŭ���� ���� �ǽ� 
====================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �Է� ó������������ BufferedReader �� readLine()�� ����ϸ�,
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ����(1~1000) : 1002
// ������ ����(1~1000) : -20
// ������ ����(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...


// ���� �ν� �� �м�

// Ŭ���� ���� : ������ ������ �Է¹޾� ������ ���ϱ� 
// Ŭ���� �Ӽ� : ������ ���� 
// Ŭ���� ��� : BufferedReader �Է¹ޱ�, ������ ���, ��� 

// �� n ����� + �Է�	���	
//		��			        �� 
//		��			        ��  
// �� n ���� �Ǻ� no �����
//		��	
//	 	�� yes
//		��
// �� 1~ n������ ������
//		��
// �� ��� ��� 

// ���� ���� �����Ǹ�, �ڵ�� ��ȯ�ϴ� ����.


// ���� Ǯ���� ���� 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class NumPlus
{
	int n; 
	int sum;

	void calNum() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

		do
		{
			
			System.out.print("������ ����(1~1000) : ");
			n = Integer.parseInt(br.readLine());
				
		}
		while (n > 1000 || n < 1);

	
		for (int i=1; i<=n; i++)
		{
			sum += i;
		}
		
		 
	}
	
	void print()
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", n, sum);
	}



}

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		
		NumPlus ob = new NumPlus();

		ob.calNum();

		ob.print();
	}
}