package test20190219_help;
/*=============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - �ݺ���(while��) �ǽ�
==============================================*/

// �۽ǽ� ����
// 1���� 100���� ������ ���� ���ϵ�
// 10�� ����� �� ������ ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 1~10������ �� : xx
// 1~20������ �� : xx
// 1~30������ �� : xx
//			:
// 1~100������ �� : xx
// ����Ϸ���... 

public class Test047
{
	public static void main(String[] args)
	{
		/*
		//(��)
		int n=0;
		int sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9, sum10;
		sum1=sum2=sum3=sum4=sum5=sum6=sum7=sum8=sum9=sum10=0;

		while (n<=100)
		{
			if (n<=10)
			{
				sum1 += n;
			}
			if (n<=20)
			{
				sum2 += n;
			}
			if (n<=30)
			{
				sum3 += n;
			}
			if (n<=40)
			{
				sum4 += n;
			}
			if (n<=50)
			{
				sum5 += n;
			}
			if (n<=60)
			{
				sum6 += n;
			}
			if (n<=70)
			{
				sum7 += n;
			}
			if (n<=80)
			{
				sum8 += n;
			}
			if (n<=90)
			{
				sum9 += n;
			}
			if (n<=100)
			{
				sum10 += n;
			}
			n++;

		}

		System.out.println("1~10������ �� : " + sum1);
		System.out.println("1~20������ �� : " + sum2);
		System.out.println("1~30������ �� : " + sum3);
		System.out.println("1~40������ �� : " + sum4);
		System.out.println("1~50������ �� : " + sum5);
		System.out.println("1~60������ �� : " + sum6);
		System.out.println("1~70������ �� : " + sum7);
		System.out.println("1~80������ �� : " + sum8);
		System.out.println("1~90������ �� : " + sum9);
		System.out.println("1~100������ �� : " + sum10);
		*/

		
		//(�ؼ�)
		int n=1;
		int sum=0;
		/*
		while (n<=100)
		{
			sum += n;

			if (n%10==0)
			{
			System.out.printf("1~%d������ �� : %d%n", n, sum);
			}
			n++;
		}
		*/
		// 1���� 100
		while (n<=100)
		{
			sum += n;
			//if (n%10==0)
			System.out.printf("1~%d������ �� : %d%n", n, sum);
			n++;
		}

		/*
		//�ٸ���� Ǯ�� - while�� ��ø���� if���� �ذ�
		int n=0;
		int m=10;
		int sum=0;

		while (m<=100)
		{
			while (n<m)
			{
				n++; //n:1�� ����
				sum+=n;				
			}
			//n ���� ���� �� ����� ����ϰ�
			System.out.printf("1~%d������ �� : %d%n", m, sum); 
			// �� �Ŀ� m:10�� ����
			m+=10;
		}
		*/

	}
}

//���� ���
/*
1~10������ �� : 55
1~20������ �� : 210
1~30������ �� : 465
1~40������ �� : 820
1~50������ �� : 1275
1~60������ �� : 1830
1~70������ �� : 2485
1~80������ �� : 3240
1~90������ �� : 4095
1~100������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/