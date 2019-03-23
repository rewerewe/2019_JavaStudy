/*===============================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - switch�� �ǽ�
================================================*/

/*

�� ���� ���ù��̶� �ϸ�, switch�� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���Ĺ� ����
	switch(����)
	{
		case ���1: ����1; [break;]
		case ���2: ����2; [break;]
					��
		[default : ���� n+1;[break;]
	}

	switch���� �����ġ��� ��case�� �� �����
	byte, short, int, long���̾�� �Ѵ�.

	case�� �ڿ� ��break;���� ���� ������ ���
	���� case ���� ������ ����ؼ� �����ϰ� �ȴ�. (�⺻ ��)

*/

// �ǽ� ���� 

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸� �Է� : ���ȯ 
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ���ȯ �Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80, 
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80 �Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ�Ű�� ��������...

// �� ����� ��� ������ �������� ó���Ѵ�.
// 90�� ~ 100�� : A       80�� ~ 89�� : B
// 70�� ~ 79��  : C       60�� ~ 69�� : D
// 60�� �̸�    : F

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat;
		
		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		// ���� ����
		
		int tot = kor + eng + mat;
			
		// ��� ����
		
		double avg = tot / 3.0;				// int avg = tot / 3; �� ����
		char grd;							// char grd = 'F';
		
		// ��� ���� (switch�� Ȱ��) 

		switch ((int)avg / 10)
		{
		case 10 : case 9 : grd = 'A'; break;			// �Ϲ� �� [break; ����� �׸��� ����������.]�� ����Ѵ�. 
		
		case 8 : grd = 'B'; break;
	
		case 7 : grd = 'C'; break;
		
		case 6 : grd = 'D'; break;
		
		default : grd = 'F'; break;
	
		/*
		{
		case 9 : grd = 'A'; break;		
		case 8 : grd = 'B'; break;	
		case 7 : grd = 'C'; break;		
		case 6 : grd = 'D'; break;		
		case 5 : grd = 'F'; break;		
		case 4 : grd = 'F'; break;	
		case 3 : grd = 'F'; break;		
		case 2 : grd = 'F'; break;
		case 1 : grd = 'F'; break;		
		}
		*/
		}

		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n",name);
		System.out.printf(">> ���� ������ %d,\n", kor);
		System.out.printf(">> ���� ������ %d,\n", eng);
		System.out.printf(">> ���� ������ %d,\n\n", mat);
		System.out.printf(">> ������ %d �̰�, ����� %.2f�Դϴ�.\n", tot, avg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grd);


	}
}

// ���� ���
/*
�̸� �Է� : ������
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� ������ �Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,

>> ������ 240 �̰�, ����� 80.00�Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/