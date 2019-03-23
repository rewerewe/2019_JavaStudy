package test20190313;
/*==================================
 ���� �÷��� (Collection) ���� 
===================================*/

/*
 �� �ǽ� ����
	
	���� �ۼ����� Test158 Ŭ������ �ϼ��Ͽ� 
	���� ����� ���� ���α׷��� �����Ѵ�. 

	���� ��)

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ���� 
		>> �޴� ����(1~6) : 1

		1��° ��� �Է� : ���Ѿ� 
		1��° ��� �Է� ����-!!!
		��� �Է� ���(Y/N)? : y

		2��° ��� �Է� : ��ȫ��
		2��° ��� �Է� ����-!!!
		��� �Է� ���(Y/N) : n

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ���� 
		>> �޴� ����(1~6) : 2
		
		[���� ��ü ���]
			���Ѿ� 
			��ȫ�� 
		���� ��ü ��� �Ϸ�-!!!

		------------------------- �ٽ� ��������. 

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ���� 
		>> �޴� ����(1~6) : 3

		�˻��� ��� �Է� : ���Ѿ� 
		
		[�˻� ��� ��� ]
		�׸��� �����մϴ�. 

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ���� 
		>> �޴� ����(1~6) : 4

		������ ��� �Է� : ���ȯ

		[���� ��� ���]
		�׸��� �������� �ʾ� ������ �� �����ϴ�.


		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ���� 
		>> �޴� ����(1~6) : 5

		������ ��� �Է� : ��ȫ�� 
		������ ��� �Է� : �輱��

		[���� ��� ���]
		������ �Ϸ�Ǿ����ϴ�.

		
		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ���� 
		>> �޴� ����(1~6) : 6
		
		���α׷� ���� 
		����Ϸ��� �ƹ�Ű�� ��������....			
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;

class Menus
{
	public static final int E_ADD=1;		// ��� �߰�
	public static final int E_DISP=2;		// ��� ��� 
	public static final int E_FIND=3;		// ��� �˻�
	public static final int E_DEL=4;		// ��� ���� 
	public static final int E_CHA=5;		// ��� ���� 
	public static final	int E_EXIT=6;		//-- ���� 
}

public class Test158
{
	// �ֿ� �Ӽ� ����
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;			//-- ���� ��
	private static String con;			//-- ��� ���� 

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// 
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ 
		sel = 1; 
		con = "Y";
	}
	// �޴� ��� �޼ҵ� 
	public static void menuDisp() throws IOException
	{
		System.out.print("[�޴� ����]\n 1. ��� �߰�\n 2. ��� ���\n 3. ��� �˻�\n 4. ��� ����\n 5. ��� ����\n 6. ����\n >> �޴� ����(1~6) : ");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{
		sel = Integer.parseInt(br.readLine());
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		 switch (sel)
		 {
			case 1 : addElement();	break;
			case 2 : dispElement(); break;
			case 3 : findElement(); break;
			case 4 : delElement();	break;
			case 5 : chaElement();	break;
			case 6 : exit();		break;
		 }

	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		 System.out.printf("\n%d ��° ��� �Է� : ", vt.size()+1);
		 
		 if (vt.add(br.readLine()))
			 System.out.printf("%d ��° ��� �Է� ����-!!!\n", vt.size());
		 
		 System.out.println("��� �Է� ���(Y/N)? : ");
		 con = br.readLine();
		 
		 if (con.equals("y") || con.equals("Y"))
			addElement();

	}

	// ��� ��� �޼ҵ�
	public static void dispElement()
	{
 
		 System.out.println("[���� ��ü ���]");
		 for (Object vtall : vt)
			System.out.println("    " + vtall);
		 System.out.println();

	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		System.out.println("�˻��� ��� �Է� : ");

		if (vt.contains(br.readLine()))
		{
			System.out.println("\n[�˻� ��� ���]");
			System.out.println("�׸��� �����մϴ�.");
		}
		else
		{
			System.out.println("\n[�˻� ��� ���]");
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		}
	}

	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		System.out.println("������ ��� �Է� : ");

		
		if (vt.remove(br.readLine()))
		{
			System.out.println("\n[���� ��� ���]");
			System.out.println("�׸��� �����Ǿ����ϴ�");
		}
		else 
		{
			System.out.println("\n[���� ��� ���]");
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�. ");
		}
	}

	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		String name;
		System.out.println("������ ��� �Է� : ");
		name = br.readLine();
		
		System.out.println("������ ��� �Է� : ");
		vt.set(vt.indexOf(name), br.readLine());
	}

	// ���α׷� ���� �޼ҵ� (�ϼ�!!!)
	public static void exit()
	{
		System.out.println("\n\t ���α׷� ����-!!!");
		System.exit(-1);
	}

	public static void main(String[] args) throws IOException
	{
		
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);

		
	}

}