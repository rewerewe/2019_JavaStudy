package test20190214;
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


public class Test014_
{
	public static void main(String[] args) throws IOException
	{
		
		// �Բ� �ۼ��� �ڵ�
		
		/*

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


		// �ֿ� ���� ����
		String strName;				//-- �̸� ���� 
		int nKor, nEng, nMat, nTot	//--����, ����, ����, ���� ���� 
		
		
		*/


		
		// ���� �ۼ��� �ڵ�

		
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			// ���ڱ�� ��Ʈ�� - ����Ʈ ��� ��Ʈ�� ����.

		// ���� ���� �� �ʱ�ȭ
		String name;
        int ko, en, ma;
		
		// ���� �� ó��
		// 1) ����ڷκ��� ���� �Է¹���
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();												// readLine : ���پ� ���� - parseInt : ������ ������ ��ȯ��. 

		

		// ��� ��� 

	





	}

}