/*======================
 ���� �迭 ����
 - �迭�� ���� 
=======================*/

/*
	�� �ǽ� ����

	������ �迭(a,b)�� ����ִ� ���ڵ��� �������� ����ϴ� ���α׷��� �����Ѵ�.
	��, �ߺ��� ���ŵ� ������ �������� ����� �� �ֵ��� �Ѵ�.
	����, �迭 ���� ������ ������� ó���� �� �ֵ��� �Ѵ�.

	ex) ������ �� �迭 
	int[] a = {2, 3, 7, 10, 11}
	int[] b = {3, 6, 10, 14}

	���� ��)
	2 3 7 10 11 6 14
	����Ϸ��� �ƹ�Ű�� ��������...

���ڿ� ���·� �Է� ����. 

*/

public class Test099002
{
	public static void main(String[] args)
	{

		// �迭 ���� �� �Ҵ� 
		int[] num1 = {2, 4, 5, 6, 7, 10};
		int[] num2 = {1, 4, 7, 33, 10};
		
		//--==>> 2 4 5 6 7 10 1 33 
		arrSum(num1,num2);
		
	
	}

	public static void arrSum(int[] num1, int[] num2)
	{
		int m=0; 

		// 1. num1[] �� num2[] �� ��ġ�� ���� ���� ã�� 
		for (int i=0; i<num1.length; i++)
		{
			for (int j=0; i<num2.length; j++)
			{
				if (num1[i]==num2[j])
					m += 1;
			}
		}
		//�׽�Ʈ
		System.out.print(m);
		//--==>> m==3
		
		/*

		// 2. num1[] �� num2[]���� ��ġ�� ����ŭ ������ �� �迭�� ����� 
		int[] temp = new int [(num1.length+num2.length)-m];

		//--==> temp[8]
		
		// 3. �� �迭�濡 �� �־��ֱ�
		for (int i=0; i<temp.length; i++)
		{
			temp[i] = num1[i];
		}
		//--==>> 2 4 5 6 7 10 

		*/

	}
}






/*
public class Test099002 
{
    public static void main(String[] args) 
	{
        //�迭 ���� �� �Ҵ�
        int[] A = {2,3,7,10,11,18,20,21};
        int[] B = {3,6,10,14,17};

        //A�� B �迭�� ��� ��ü ���
        for (int i = 0; i<A.length; i++) {
            System.out.printf("%d ", A[i]);
         }
        for (int i = 0; i<B.length; i++) {
            System.out.printf("%d ", B[i]);
         }
        System.out.println();

        //A�� B �迭�� ��� ���. �ߺ� ����.
        for (int i = 0; i<A.length; i++) {
            System.out.printf("%d ", A[i]);
         }
        for (int i = 0; i<B.length; i++) {
            boolean flag = false;
            for (int k = 0; k<A.length; k++) {
                if(B[i] == A[k]) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
            //if (flag)
            //   continue; ��� �ص� ������ ���(�ߺ� ���ŵǰ� ��µ�)

                System.out.printf("%d ", B[i]);
         }
        System.out.println();
    }

}

*/

