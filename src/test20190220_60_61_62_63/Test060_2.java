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
   **
  ***
 ****
*****
*/

public class Test060_2 {
	public static void main(String[] args) {
		// 1. �Ϲ����� ���
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
		
		
		// 2. �ݺ���(Loop Statement), ������ while, for..., �ݺ����� ���� ���� : ���α׷����� �����ϰ� �ϱ� ���ؼ�.
		
		// 3-1. ������ ����
//		for (int j = 0; j < 5; j++) {
//			for (int i = 0; i < 5; i++) {
//				System.out.print("*");
//			}
//		}
		// 3-2.�� ���
		// *************************
		
		// 4-1. ������ ����
//		for (int j = 0; j < 5; j++) {
//			for (int i = 0; i < 5; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 4-2.�� ���
		// *****
		// *****
		// *****
		// *****
		// *****

		// 5. ���ǹ�(Condition Statement), ������ if, switch..., ���ǹ��� ���� ���� : ���α׷����� �ȶ��ϰ� �ϱ� ���ؼ�.
		// 6-1. if�� �����̳� ���̳ĸ� ��Ʈ��
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5; i++) {
				if(j == 1) {
					if(i < 5) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				
				if(j == 2) {
					if(i < 4) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				
				if(j == 3) {
					if(i < 3) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				
				if(j == 4) {
					if(i < 2) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				
				if(j == 5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// 6-2.�� ���
		// j == 1
		// j == 2
		// j == 3
		// j == 4
		// j == 5
		
		//    * j == 1, i == 1, ... , 5
		//   ** j == 2
		//  *** j == 3
		// **** j == 4
		//***** j == 5
	}
}