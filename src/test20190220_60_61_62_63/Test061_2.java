package test0220_60_61_62_63;
/*=================================================================
 ���� ���� �帧�� ����� (���) ����
 - �ݺ��� (for��) �ǽ�
 - ����� �ǽ�
�� �������� �ݺ��� ���·� ��� : ��ø(����, ����) �ݺ���
==================================================================*/

// �� ����
// ������ ���� ������ ��µ� �� �ֵ���
// �ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

/*
    *
   ***
  *****
 *******
*********
*/

public class Test061_2 {
	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 9; i++) {
				if (j == 1) {
					if (i == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 2) {
//					if (i == 4 || i == 5 || i == 6) {
//					if (3 < i && i < 7) {
					if (4 <= i && i <= 6) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 3) {
					if (3 <= i && i <= 7) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 4) {
					if (2 <= i && i <= 8) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}