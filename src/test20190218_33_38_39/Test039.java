package test20190218_33_38_39;


// �� ���� (2019-02-18)
// ����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾Ƽ� �̸� �Ǻ��Ͽ�
// �ҹ��ڸ� �Է¹޾��� ���... �빮�ڷ� ��ȯ�ϰ�
// �빮�ڸ� �Է¹޾��� ���... �ҹ��ڷ� ��ȯ�ϴ�
// ���α׷��� �����Ѵ�.
// ��, �Է��� ��System.in.read()�� �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���ĺ� �� ���� �Է� : A
// >> a
// ����Ϸ��� �ƹ�Ű�� ��������... 

// ���ĺ� �� ���� �Է� : c
// >> C
// ����Ϸ��� �ƹ�Ű�� ��������... 

// ���ĺ� �� ���� �Է� : 6
// >> �Է� ����-! 
// ����Ϸ��� �ƹ�Ű�� ��������... 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
		// �ֿ� ���� ���� �� ���� ó�� 

		System.out.print("���ĺ� �� ���� �Է� : ");

		// �� ������ �ƴ� �� ���ڸ� �о�;� �ϹǷ� alpah = br.readLine(); ���� �ȵ�. 
		// System.in.read()�� �ƽ�Ű ���� �о� �´�.

		// ���� �� ��ȯ
		char alpah = (char)System.in.read();

		// ���ĺ� �ƽ�Ű �� : �빮�� 65 ~ 90 / �ҹ��� 97 ~ 122
		// A �� 65  a �� 97  
		// B �� 66  b �� 98
		// C �� 67  c �� 99
		// D �� 68  d �� 100
		// ... �빮�ڿ� �ҹ����� �� ���� : 32  

		// ����� �Է°��� �빮�� �� ��, 
		if (alpah >= 65 && alpah <= 90)
		{
			// ���� ���� ������ ��� +=: a�� b��ŭ �����ش�. 
			System.out.println(">> " + (alpah += 32));
		}

		else if (alpah >= 97 && alpah <= 122)
		{		
			// ���� ���� ������ ��� -=: a�� b��ŭ ���ش�. 
			System.out.println(">> " + (alpah -= 32));
		}
		else 
		{
			// ���ĺ��� �ƴ� ��� 
			System.out.println("�Է� ����-!");
		}
	}
}

// ���� ���

/*
���ĺ� �� ���� �Է� : a
>> A
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ĺ� �� ���� �Է� : A
>> a
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/