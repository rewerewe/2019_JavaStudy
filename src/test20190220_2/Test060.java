package test0220_2;
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

public class Test060
{
	public static void main(String[] args)
	{
					/*
					// 1. �Ϲ����� ��� - �� 5�� ��ڴ�.
						  ��� �� *****
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
										
					
					// 1-1. ��5�� + ���� + �� 5�� + ���� �� �� 25��
							��� �� *****
									*****
									*****
									*****
									*****
				
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.println();
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.println();
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.println();
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.println();
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");
					System.out.print("*");

					

					// 2. �ݺ��� ���
					// 2-1. ������ ����
					//		��� �� *************************
					
					// �� 5���� ��� ���� 5�� �ݺ��ϰڴ�. 
					for (int j = 0; j < 5; j++) 
					{
						// �� 5���� ��ڴ�. 
						for (int i = 0; i < 5; i++) 
						{
							System.out.print("*");
						}
					}

					
					// 2-2. ������ ����
					//		��� �� *****
					//				*****
					//				*****
					//				*****
					//				*****
					
					
					for (int j = 0; j < 5; j++) 
					{
						for (int i = 0; i < 5; i++) 
						{
							System.out.print("*");
						}
						System.out.println();
					}
					*/

					// 3. if�� ��� 
					//	  if������ �����̳� ���̳ĸ� ��Ʈ�� 
					//    i = ���� ����, j = ���� �ټ� 
					//    ���ڸ� ��ǥ(i,j)�� ���� �� ����ϱ�
					//    1 2 3 4 5  i
					//  1
					//  2
					//  3
					//  4
					//  5
					//  j
					
							

					// ���� ����
					for (int j = 1; j <= 5; j++) {

						// ���� ���� 
						for (int i = 1; i <= 5; i++) {
							
							// ���� ��, ù��° ������ ��
							if(j == 1) {
								
								// ���� ���ڸ��� 5���� ���� �� '����'�� ����ϰڴ�
								// i = 1, 2, 3, 4 �ڸ��� ' ' ��� 
								if(i < 5) {
									System.out.print(" ");

								//�׷��� ������ '*'�� ����ϰڴ�
								// i = 5 �ڸ��� '*' ��� 
								} else {
									System.out.print("*");
								}
							}
							// ���� ��, �ι�° ������ ��
							if(j == 2) {

								// ���� ���ڸ��� 4���� ���� �� '����'�� ����ϰڴ�
								// i = 1, 2, 3 �ڸ��� ' ' ���  
								if(i < 4) {
									System.out.print(" ");
								//�׷��� ������ '*'�� ����ϰڴ�
								// i = 4, 5 �ڸ��� '*' ��� 
								} else {
									System.out.print("*");
								}
							}

							// ���� ��, ����° ������ ��
							if(j == 3) {
								
								// ���� ���ڸ��� 3���� ���� �� '����'�� ����ϰڴ�
								// i = 1, 2 �� �� ' ' ��� 
								if(i < 3) {
									System.out.print(" ");
								// �׷��� ������ '*'�� ����ϰڴ�
								// i = 3, 4, 5 �ڸ��� '*' ���
								} else {
									System.out.print("*");
								}
							}
							// ���� ��, �׹�° ������ ��
							if(j == 4) {

								// ���� ���ڸ��� 2���� ���� �� '����'�� ����ϰڴ�
								// i = 1 �� �� ' ' ��� 
								if(i < 2) {
									System.out.print(" ");
								// �׷��� ������ '*'�� ����ϰڴ�
								// i = 2, 3, 4, 5 �ڸ��� '*' ��� 
								} else {
									System.out.print("*");
								}
							}
							// ���� ��, �ټ���° ������ ��
							if(j == 5) {
								// '*'�� 5�� ���
								System.out.print("*");
							}
						}
						// if���� ������ �����ϰڴ� 
						System.out.println();
					}

	} // end main

} // end class 

// ������
/*
    *
   **
  ***
 ****
*****
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/