package test20190219_help;
/*=============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - �ݺ���(while��) �ǽ�
==============================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű��...

// �� �Ҽ� : 1 �Ǵ� �ڱ��ڽ��� �� �̿��� � ���ε� ���� �� ���� ��
//			 ��, 1�� �Ҽ� �ƴ�

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test050
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ���!
		// ���� ��� �غ�
		// ������ �����ߴµ� �ڵ��� �ȵʤФ�
		/* (��)
		System.out.print("������ ���� �Է� : ");
		int n;
		n = Integer.parseInt(br.readLine());		//�Է¹޴� �� n
		//1�δ� ��� ���� �������Ƿ� i �ʱⰪ 2����
		//n������������ ��� ��(i++�̿�)�� n���� �������� �ʾƾ���
		if (n==1)//1���� ��������
		{
			System.out.println(n + " �� �Ҽ� �ƴ�");
		}
		*/
		/*
		else //1���� ��簪
		{
			int i=2;//i ���ǹ��� ���� ���� �������� �� �ʱⰪ �������� �ؾ� ��
			while (i<n) //n���������� ��� ��
			{
				if (n%i==0)
				{
					System.out.println(n + " �� �Ҽ� �ƴ�");
				}
				i++;
			}

				System.out.println(n + " �� �Ҽ�");

		}	
		*/

		/*
		while (i<n)
		{

			i++;
		}
		if (n%i==0 || n==1)		//������Է°�n�� i�� ����̰ų� 1�϶�
		{
			while (i<n)
			{
				i++;
			}
			System.out.println(n + " �� �Ҽ� �ƴ�");
		}
		else if (n%i!=0)		//������Է°�n�� i�� ����� �ƴҶ�
		{
			System.out.println(n + " �� �Ҽ�");
		}
		*/
		
		//(�ؼ�)
		int num;		//������Է°�

		System.out.print("������ ���� �Է� : ");
		num=Integer.parseInt(br.readLine());

		int n=2;		//������ ���� ������ ���� 

		boolean flag=true;	//flag����:���X �̸� ���� �ٸ� ���ΰ� ��
							//���ʱⰪ=�Ҽ�			//check~!!!
		//String temp = "�Ҽ���"; ~Test051
	
		while (n<num)
		{
			if (num%n==0)
			{
				flag = false;// ���������� ��Ҽ��ƴ�
				// temp="�Ҽ��ƴϴ�";
				break;		 // flag=false;�� ��г��� �ݺ��� ���߰� ����������
			}

			n++;

		}

		// ��� ���(��� ���� �����ؾ� �� �߰� Ȯ�� ��1���� ���� Ȯ��)
		// �Ҽ��� && 1�� �ƴϴ�
		// ���������� ����� �Ҽ���
		// �׷��� ������
		// ���������� ����� �Ҽ� �ƴϴ�

			//flag==true���ص� OK ���ʱⰪ
		if (flag==true && num!=1)
			System.out.printf("%d �� �Ҽ�~!!!\n", num);
		// if (temp=="�Ҽ���" ~) (X) ���ڿ� ����X
		// if (temp������ "�Ҽ���"��� ���ڿ��� ���ٸ�..&&num!=1)�� ���·� ����� ��
		// �Ҽ��̰� 1�� �ƴ����� �Ѵ� �����ϴ��� Ȯ���ؾ� �ϹǷ�
		// ���ڿ��� ũ�� �񱳰� �ȵǴϱ�
		else
			System.out.printf("%d �� �Ҽ� �ƴ�~!!!\n", num);

	}
}