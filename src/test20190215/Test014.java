package test20190215;
/*========================================
�ڹ��� �⺻ ���α׷���
- ������ �ڷ���
- �ڹ��� �⺻ ����� : BufferedReader
==========================================*/

// ����ڷκ��� �̸��� ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : �ѽ¿�
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// ===[���]===
// �̸� : �ѽ¿�
// ���� : 240
// ============
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


/* ���� �ۼ��� �ڵ�
import java.io.BufferedReader;
import java.io.InputStreamReader; */


public class Test014
{
	public static void main(String[] args) throws IOException
	{
		
		// �Բ� �ۼ��� �ڵ�
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


		// �ֿ� ���� ����
		String strName;				//-- �̸� ���� 
		int nKor, nEng, nMat, nTot;	//--����, ����, ����, ���� ���� 

		// �߰� ���� ����
		String strTemp;

		// ���� �� ó�� 
		// �̸��� �Է��ϼ��� :
		System.out.print("�̸��� �Է��ϼ��� : ");		

		// ������ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();			// ��ȯ�� �ʿ���� (parseInt x) ���� ���� �״�� 

		// ����ڿ��� �ȳ� �޽��� ��� (�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// ����ڰ� �Է��� ��(�ܺε����͸�) ������ ��Ƴ���
		strTemp = br.readLine();			//--���ڿ� �ӽ� ����
		nKor = Integer.parseInt(strTemp);	//--�ӽ����� ������ �� ��ȯ �� 
											//-- ���� ���� ������ ��Ƴ���

		// ����ڿ��� �ȳ� �޽��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// ����ڰ� �Է��� ��(�ܺε����͸�) ������ ��Ƴ���
		strTemp = br.readLine();			//--���ڿ� �ӽ� ����
		nEng = Integer.parseInt(strTemp);	//--�ӽ����� ������ �� ��ȯ �� 
											//-- ���� ���� ������ ��Ƴ���

		// ����ڿ��� �ȳ� �޽��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// ����ڰ� �Է��� ��(�ܺ� �����͸�)�� ������ ��Ƴ���
		strTemp = br.readLine();			//--���ڿ� �ӽ� ����
											//-- (���� ���������� �����)
		nMat = Integer.parseInt(strTemp); //--�ӽ� ���� ������ �� ��ȯ �� 
		// �������� ������ ��Ƴ���
		// ���� �����ϱ�
		nTot = nKor + nEng + nMat;


		//��� ��� 
		//System.out.println();
		System.out.println("\n===[���]==="); //-- \n������� �ϰ� 
		System.out.println("�̸� : " + strName);
		System.out.println("���� : " + nTot);
		System.out.println("==============");
		
		
		
		// ���� �ۼ��� �ڵ�

		/*  

		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			// ���ڱ�� ��Ʈ�� - ����Ʈ ��� ��Ʈ�� ����.

		// ���� ���� �� �ʱ�ȭ
		String name;
        int ko, en, ma;
		
		// ���� �� ó��
		// 1) ����ڷκ��� ���� �Է¹���
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = Integer.parseInt(br.readLine());												// readLine : ���پ� ���� - parseInt : ������ ������ ��ȯ��. 

		
		// ��� ��� 

		*/

	}

}

// ���� ���
/*
�̸��� �Է��ϼ��� : ������
���� ���� �Է� : 100
���� ���� �Է� : 80
���� ���� �Է� : 70

===[���]===
�̸� : ������
���� : 250
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/