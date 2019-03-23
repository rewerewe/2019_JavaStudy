package test20190222;

/*################################################
���� Ŭ������ �ν��Ͻ� ���� 
################################################*/

//�ǽ� ����
//���� ���̿� �ѷ� ���ϱ�

//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ����������(������) �����Ѵ�.
//(Ŭ���� �� : CircleTest) ---> CircleTest.java

//���� ���� = ������ + ������ * 3.141592
//���� �ѷ� = ������ * 2 * 3.141592

//��
//������ �Է� : XXX

//>>�������� XXX�� ����
//>>���� : XXX.xx
//>>�ѷ� : XXX.xx
//����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest {

	final double PI = 3.141592;		//final�� �ڷ��� ���� ����
 	int r;
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  -> �� ���� ������ �ٶ������� ����.  �޸� �Ҵ��� Ŀ���Ƿ� --> ��� �ڵ��� ���� �𸣱� ������ ��ȿ����

	void input() throws IOException		//���⼭�� ������ �ۿ����� ������ ������ ������.
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	
	double calArea()
	{
		return r*r*PI;
	}
	
	double calLength()
	{		
		return r*2*PI;
	}
	
	void print(double area, double length)
	{	
		System.out.printf("\n>>�������� %d�� ����\n",r);
		System.out.printf(">>���� : %.2f\n",area);
		System.out.printf(">>�ѷ� : %.2f\n",length);
	}
}

