package test20190218;
/*==========================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - if�� �ǽ� 

============================================*/

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

// 80 <= avg < 90 (x)  �� ���� ������ ������ ��Ȳ�� ��,
// �� avg >= 80 �������� avg < 90 
// �� avg >= 80 && avg < 90 

// �� ���ǻ��� 
// 1) �� �� �̻��� �����̶��, ������ ���� �и��ؼ� ��������**�� ���� �־�� �Ѵ�. 
// ��������** : ������, ��Ÿ�� ���� �߻����� �ʱ� ������ �Ǵ��� ���ؾ� �Ѵ�. 
// ����, ���ǽ��� �����ϴ� ������ �Ű��� �Ѵ�.

// 2) if������ �������� else�� ��� �ȴ�. 
// if ( )
// {
// }
// else if ( )
// {
// }


// ��, BufferedReader �� readLinn() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�, 
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		// �ֿ� ���� ����
		String sName;
		int nKor, nEng, nMat; // nTot, nLel;
		// double nAvg

		// ���� �� ó��
		// 1) �ȳ� �޽��� ���
		System.out.print("�̸� �Է� : ");
		// 2) �Է¹��� ������ �� ��ȯ 
		sName = br.readLine();			// readLine()�� String Ÿ���̶� ��ȯ�� �ʿ�x

		System.out.print("���� ���� : ");
		nKor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		nEng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		nMat = Integer.parseInt(br.readLine());
		
		// ���� ����
		int nTot = nKor + nEng + nMat;
		
		// ��� ����
		double nAvg = nTot / 3;				// �������� ������ ó���ȴ�. double�� �����Ѵٸ� �Ǽ� ������� ó���ؾ��� 
		
		//  �Բ� Ǯ���� ����

		// ��� ����			
		char grade;

		if (nAvg >= 90)
		{
			grade = 'A';
		}
		else if (nAvg >= 80)
		{
			grade = 'B';
		}
		else if (nAvg >= 70)
		{
			grade = 'C';
		}
		else if (nAvg >= 60)
		{
			grade = 'D';
		}
		else								// ���� �߻� : else�� ���ǹ� (nAvg < 60) ������. '�ڹٰ� �� ��Ȳ�ܿ� �ٸ� ��쿡�� ���� ����� ���� ���� ���ݾ�' ��� �Ǵ��ؼ� ������ ����
		{									//			��	�����
			grade = 'F';					//		    ��	
		}									// else�� '��' �Ƚᵵ �ȴ�. ��, ���� ����� �ʱ�ȭ �ؾ���. 

		


		/* ���� Ǯ���� ����
		
		if (nAvg >= 90)
		{
				nLel = 'A';
		}
		else if (nAvg >= 80 )
		{
				nLel = 'B';
		}
		else if (nAvg >= 70 )
		{
				nLel = 'C';
		}
		else if	(nAvg >= 60 )
		{
				nLel = 'D';
		}	
		else (nAvg < 60 );					// �����߻� : Test031.java:135: error: not a statement else (nAvg < 60 );
		{
				nLel = 'F';
		}
		
		*/
		

		// ��� ��� 
		System.out.println();
		System.out.printf(">> ����� �̸��� %s �Դϴ�\n", sName);
		System.out.printf(">> ���� ������ %d,\n", nKor);
		System.out.printf(">> ���� ������ %d,\n", nEng);
		System.out.printf(">> ���� ������ %d,\n", nMat);
		System.out.printf(">> ������ %d�̰�, ����� %.1f �Դϴ�.\n", nTot, nAvg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);


	}
}

// ���� ���

/*
�̸� �Է� : ���ȯ
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� ���ȯ �Դϴ�
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80.0 �Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
