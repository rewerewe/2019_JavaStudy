/*================================
 ���� Ŭ������ �ν��Ͻ� ����
 - Ŭ������ �ν��Ͻ� Ȱ��
=================================*/

/*
	�� �ǽ� ����
	1 ~ 3 ������ ���� ���¸� ������ �߻����� 
	����, ����, �� ���� ���α׷��� �����Ѵ�.

	��, Ŭ���� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�. 
	����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

	���ص����� �� 1:����, 2:����, 3:��

	���� ��)
	1:���� 2:1���� 3:�� �� �Է�(1~3) : 4
	1:���� 2:1���� 3:�� �� �Է�(1~3) : -12
	1:���� 2:1���� 3:�� �� �Է�(1~3) : 2
	- ����	 : ���� 
	- ��ǻ�� : �� 
	>> �º�������� : ��ǻ�Ͱ� �̰���ϴ�-!!
	����Ϸ��� �ƹ�Ű�� ��������...

*/
import java.util.Scanner;
import java.util.Random;

class Computer
{
	int ComNum()
	{	
		// ���� ���ϱ�
		Random rd = new Random();
		int comSu = rd.nextInt(3)+1;
		return comSu;
		
	}
}

class Human
{
	// ����ڷκ��� ���� �Է� �ޱ� 
	int HuNum()
	{
		int rcp;
		

		// Scanner �ν��Ͻ� ���� 
		Scanner sc = new Scanner(System.in);
		
		// �ϴ� �ѹ� ����ǰ�, ���ǿ� ���� ���� ��� �ݺ��� ���� 
		do
		{
			// �ȳ� �޽��� ��� 
			System.out.print("1:���� 2:1���� 3:�� �� �Է�(1~3) : ");
			rcp = sc.nextInt();
		}
		while (rcp<1 || rcp>3);

		System.out.print("����	 : ");
		
		return rcp;
	}

}


class RCP
{
	void result(int user, int computer)
	{
		
		if (user > computer)
				System.out.print("������ �̰���ϴ�~!!!");

			else if (user < computer)
				System.out.print("��ǻ�Ͱ� �̰���ϴ�~!!!");

			else if (user == computer)
				System.out.print("������ ��ǻ�Ͱ� �����ϴ�~!!!");
	}
}


public class Test0942
{
	public static void main(String[] args)
	{
		Computer ob1 = new Computer();
		int comsu = ob1.ComNum();
		// �׽�Ʈ 
		// System.out.println(comsu);

		Human ob2 = new Human();
		int humansu = ob2.HuNum();
		System.out.println(humansu);

		RCP ob3 = new RCP();
		ob3.result(humansu, comsu);
		

	}
}