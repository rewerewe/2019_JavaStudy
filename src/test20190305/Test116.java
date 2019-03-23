package test20190305;
/*=======================================
 ���� Ŭ���� ��� ����
 - �������̽� (Interface)
=========================================*/

/* 
	��	�ǽ� ����
		���� ó�� ���α׷��� �����Ѵ�.
		��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�
	
	���� ��)
	�ο� �� �Է�(1~10) : 2
	1��° �л��� �й� �̸� �Է�(���鱸��) : 1921004 �̿��� 
	���� ���� ���� ���� �Է�   (���鱸��) : 90 100 85
	2��° �л��� �й� �̸� �Է�(���鱸��) : 1921005 ������ 
	���� ���� ���� ���� �Է�   (���鱸��) : 85 70 65
	
	1921004 �̿���	90 100	85		275		91
					��	��	��		
	1921005 ������	85	70	65		220		73
					��	��	��	
	
	����Ϸ��� �ƹ�Ű�� ��������...

*/

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��

import java.util.Scanner;

class Record
{
	String hak, name;				//-- �й�, �̸�
	int kor,eng,mat;				//-- ����, ����, ���� ����
	int tot, avg;					//-- ����, ���(���ǻ� ���� ó��)
	String[] grade = new String[3];	//-- ��� �迭 		
}

// �������̽�
interface Sungjuk
{
	public void set();
	public void input();
	public void print();

}

// ���� �ذ� �������� �����ؾ� �� Ŭ����
class SungjukImpl implements Sungjuk
{
	// �ο� �� �Է¹��� num, Record���� �迭 recArr, String�� greArr ���� 
	int num;
	Record[] recArr;

	@Override
	public void set() 
	{
		// Scanner �ν��Ͻ� ���� 
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			num = sc.nextInt();
		}
		while (num<0 || num>10);
		
		// �Է¹��� �ο� ����ŭ �迭 recArr ���� 
		recArr = new Record[num];

	}

	@Override
	public void input()
	{
		
		// Scanner �ν��Ͻ� ���� 
		Scanner sc = new Scanner(System.in);

		// ���� �Է� �ޱ� 
		for (int i=0; i<recArr.length; i++)
		{
			// �迭 ���� 
			recArr[i] = new Record();
			
			System.out.printf("%d ��° �л��� �й�(3�ڸ�) �̸� �Է�(���鱸��) : ", (i+1));
			recArr[i].hak  = sc.next();
			recArr[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է� (���鱸��) : ");
			recArr[i].kor = sc.nextInt();
			recArr[i].eng = sc.nextInt();
			recArr[i].mat = sc.nextInt();
		}
		

		// ����, ��� ����
		for (int i=0; i<recArr.length; i++)
		{
			recArr[i].tot = recArr[i].kor + recArr[i].eng + recArr[i].mat;
			recArr[i].avg = recArr[i].tot / 3;
				
		}


		// ���� ��� �Ǻ�
		for (int i=0; i<recArr.length; i++)
		{
			if (recArr[i].kor >= 90)
			{
				recArr[i].grade[0] = "��";
			}
			else if (recArr[i].kor >= 80)
			{
				recArr[i].grade[0] = "��";
			}
			else if (recArr[i].kor >= 70)
			{
				recArr[i].grade[0] = "��";
			}
			else if (recArr[i].kor >= 60)
			{
				recArr[i].grade[0] = "��";
			}
			else 
			{
				recArr[i].grade[0] = "��";
			}
		}
		
		// ���� ��� �Ǻ�
		for (int i=0; i<recArr.length; i++)
		{
			if (recArr[i].eng >= 90)
			{
				recArr[i].grade[1] = "��";
			}
			else if (recArr[i].eng >= 80)
			{
				recArr[i].grade[1] = "��";
			}
			else if (recArr[i].eng >= 70)
			{
				recArr[i].grade[1] = "��";
			}
			else if (recArr[i].eng >= 60)
			{
				recArr[i].grade[1] = "��";
			}
			else 
			{
				recArr[i].grade[1] = "��";
			}
		}

		// ���� ��� �Ǻ�
		for (int i=0; i<recArr.length; i++)
		{
			if (recArr[i].mat >= 90)
			{
				recArr[i].grade[2] = "��";
			}
			else if (recArr[i].mat >= 80)
			{
				recArr[i].grade[2] = "��";
			}
			else if (recArr[i].mat >= 70)
			{
				recArr[i].grade[2] = "��";
			}
			else if (recArr[i].mat >= 60)
			{
				recArr[i].grade[2] = "��";
			}
			else 
			{
				recArr[i].grade[2] = "��";
			}
		}
		
	}
		
 

	@Override
	public void print()
	{
		for (int i=0; i<recArr.length; i++)
		{
			// ��� ��� 
			System.out.printf("\n %3s %3s %5d %3d %3d %5d %3d", recArr[i].hak, recArr[i].name, recArr[i].kor, recArr[i].eng, recArr[i].mat, recArr[i].tot, recArr[i].avg);
			System.out.printf("\n %14s %3s %2s", recArr[i].grade[0], recArr[i].grade[1], recArr[i].grade[2]);		
		}
		System.out.println();
	}

}//-- SungjukImpl class end 

public class Test116
{
	public static void main(String[] args)
	{
		Sungjuk ob;

		
		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		//-- SungjukImpl �ν��Ͻ� ����
		SungjukImpl ob2 = new SungjukImpl();
		
		ob = ob2;	//-- �� ĳ���� 
		
		ob.set();
		ob.input();
		ob.print();
	}
}

// ���� ���
/*
�ο� �� �Է�(1~10) : 2
1 ��° �л��� �й�(3�ڸ�) �̸� �Է�(���鱸��) : 222 ������
���� ���� ���� ���� �Է� (���鱸��) : 90 80 70
2 ��° �л��� �й�(3�ڸ�) �̸� �Է�(���鱸��) : 222 �̱��
���� ���� ���� ���� �Է� (���鱸��) : 80
70 60

 222 ������    90  80  70   240  80
              ��   ��   ��
 222 �̱��    80  70  60   210  70
              ��   ��   ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/