package test20190220_60_61_62_63;
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
 *******
  *****
   ***
    *
*/


public class Test063_2 {
	public static void main(String[] args) {

/*
��ǥ(i,j)�� ���� �� ����ϱ�
    123456789  
  1	    *
  2	   ***
  3	  *****
  4	 *******
  5	*********
  6	 *******
  7	  *****
  8	   ***
  9	    *
*/
		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				if (j == 1) {
					if (i == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 2) {
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

				if (j == 6) {
					if (2 <= i && i <= 8) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 7) {
					if (3 <= i && i <= 7) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 8) {
					if (4 <= i && i <= 6) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				if (j == 9) {
					if (i == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}