package test20190218;
/*=======================================
 ���� ������ (Operator) ����
 - ���� ������ == ���� ������ 
=========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... ��������, ������� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader �� readLine()�� Ȱ���ϰ�
// ������ ���� �����ڸ� Ȱ���� �� �ֵ��� �Ѵ�.repglfd';;'fd;'pegdgfdfsdfds

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 2011
// 2011�� �� ���
// ����Ϸ��� �ƹ� Ű��...

// �� ������ �Ǻ� ����												//	�� ��������(�޷�, ������) ���ø����̼ǿ� �� �ʿ���. 
// ������ 4�� ����̸鼭 100�� ����� �ƴϰų�						//	��¥ ��Ʈ�� �ϱ� ���ؼ��� �˾ƾ� �ϴ� ����. 
// 400�� ����̸� ����-!											//	4�⿡ �ѹ����� ������ �´�. 
// �׷��� ������ ���-!												//	100�⿡ �ѹ����� ������ ����.
																	//	(�׷����� ���ڶ�) 400�⿡ �ѹ����� ������ �´�. 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
	/* �Բ� Ǯ���� ����

	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

	int year;
	String strResult;

	System.out.print("������ ���� �Է� : ");
	year = Integer.parsInt(br.readLine());

	(year % 4 == 0 && year % 100 == 0 || year % 400 == 0) ? "����" : "���";

	System.out.printf("%d�� �� %s\n", year, strResult); */




	// BufferedReader �ν��Ͻ� ����
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

	// �ֿ� ���� ����
	int n;
	String strResult;


	// ���� �� ó��
	// 1) ����ڷκ��� �����͸� �Է� �޴´�.
	System.out.print("������ ���� �Է� : ");
	n = Integer.parseInt(br.readLine());

	// 2) �Է¹��� �����Ͱ� ��������, ������� �Ǻ��Ѵ�.

	strResult = (n % 4 == 0) ? "����" : "���";
	
	// ��� ��� 
	System.out.println(n + " �� " + strResult);	


	}

}

// ���� ��� 
/*

������ ���� �Է� : 2000
2000 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 2011
2011 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
