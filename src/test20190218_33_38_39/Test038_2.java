package test20190218_33_38_39;


// �� ���� (2019-02-18)
// ����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾�
// �̸� �Ǻ��Ͽ� �Է¹��� ���ĺ��� ������ ��츸
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ��ҹ��ڸ� ��� ������ �� �ֵ��� ó���Ѵ�.
// ����, ���ĺ� �̿��� ���ڰ� �ԷµǾ��� ���
// �Է� ������ ���� ������ ����ڿ��� �ȳ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���ĺ� �� ���� �Է� : A
// >> ���� OK-!
// >> ����Ϸ��� �ƹ�Ű�� ��������...

// ���ĺ� �� ���� �Է� : e
// >> ���� OK-!
// >> ����Ϸ��� �ƹ�Ű�� ��������...

// ���ĺ� �� ���� �Է� : B
// >> ���� Ok-!
// >> ����Ϸ��� �ƹ�Ű�� ��������...

// ���ĺ� �� ���� �Է� : 1
// >> �Է� ����-!
// >> ����Ϸ��� �ƹ�Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("���ĺ� �� ���� �Է� : ");
		System.out.println(System.in.read());
		char alpah = (char)System.in.read();
		if ((alpah > 64 && alpah < 91) || (alpah > 96 && alpah < 123))
		{
			if(alpah == 'a' || alpah == 'e' || alpah == 'i' || alpah == 'o' || alpah == 'u' 
				|| alpah == 'A' || alpah == 'E' || alpah == 'I' || alpah == 'O' || alpah == 'U') {
				System.out.println("���� OK-!");
			} else {
				System.out.println("���� OK-!");
			}
		} else {
			System.out.println("���ĺ��� �ƴմϴ�.");
		}
	}
}

// ���� ���
/*
���ĺ� �� ���� �Է� : A
���� OK-!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ĺ� �� ���� �Է� : a
���� OK-!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ĺ� �� ���� �Է� : k
���� OK-!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ĺ� �� ���� �Է� : ��
�Է� ����-!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

