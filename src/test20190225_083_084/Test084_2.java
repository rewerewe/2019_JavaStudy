package test20190225_083_084;
/*==========================
   ���� �迭 ���� 
 - �迭�� �⺻���� Ȱ�� 
===========================*/

/*
	�� ���� 2019-02-25
	����ڷκ��� �л� ���� �Է¹ް�, �� ��ŭ�� ����(��������)�� �Է¹޾�
	��ü �л� ������ ��, ���, ������ ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
	��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

	���� ��)
	�л� �� �Է� : 5 
	1�� �л��� ���� �Է� : 90
	2�� �л��� ���� �Է� : 82
	3�� �л��� ���� �Է� : 64
	4�� �л��� ���� �Է� : 36
	5�� �л��� ���� �Է� : 98

	>> �� : 370
	>> ��� : 74
	>> ���� : 
	90 : -16.0
	82 : -8.0
	64 : 10.0
	36 : 38.0
	98 : -24.0
	����Ϸ��� �ƹ�Ű�� ��������... 
*/

import java.util.Scanner;

public class Test084_2 {
	public static void main(String[] args) {
		/*
		 * �� ���� �ν� �� �м� 1. ����ڷκ��� �л����� �迭�� �Է¹ޱ� 2. �Է� ���� �л� �� ��ŭ ���� �Է� �ޱ� 3. �Է¹��� ������ ��,
		 * ���, ���� �����ϱ� 4. ����ϱ�
		 */

		// ����ڷκ��� �Է� ���� ���� ���� stu, ���� ���� sum, ����� ���� avg ���� ����
		int studentCount;
		int studentScoreSum = 0;
		double studentScoreAvg = 0.0;

		// ����ڷκ��� �л� �� �Է� �ޱ�
		System.out.print("�л� �� �Է� : ");
		Scanner sc = new Scanner(System.in);
		// �Է� ���� �л� �� stu ������ ���
		studentCount = sc.nextInt();

		// �Է� ���� stu ����ŭ �迭�� ���̸�(����) �����
		int[] grade = new int[studentCount];

		// ����ڷκ��� ���� �Է� �޾� �迭�� ���
		for (int i = 0; i < grade.length; i++) {
			System.out.printf("%d�� �л��� ���� �Է� : ", i + 1);
			grade[i] = sc.nextInt();
		}

		// �� ���ϱ�
		for (int i = 0; i < grade.length; i++) {
			studentScoreSum += grade[i];
		}

		// ��� ���ϱ�
		studentScoreAvg = studentScoreSum / studentCount;

		// ��� ���
		// ��, ���, ���� ���
		System.out.printf("\n>> �� : %d", studentScoreSum);
		System.out.printf("\n>> ��� : %.2f", studentScoreAvg);
		System.out.println("\n>> ���� :");
		for (int i = 0; i < grade.length; i++) {
			int score = grade[i];
			double gap = studentScoreAvg - score;
			System.out.println(score + " : " + gap);
		}
		
		sc.close();
	}
}