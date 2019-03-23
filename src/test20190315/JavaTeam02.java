
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


class Constant
{
	// public final static int xx
}


public class JavaTeam02
{	
	public static void main(String[] args)
	{
		JavaTeam02 ob = new JavaTeam02();
		ob.process();
	}

	void process()
	{
		Scanner sc = new Scanner(System.in);

		Map<String,Integer> vendInfo = new HashMap<String,Integer>(); 
		Map<String,Integer> ingre = new HashMap<String,Integer>();
		Map<String,Integer> pos = new HashMap<String,Integer>();

		Admin admin = new Admin(vendInfo);
		Kiosk ki = new Kiosk(ingre,pos);

		int state=0; // ������ 0 , ����� 1	
		
		admin.start(); // ù ������ �����ڸ��

		while (true) // ��� ���� ����
		{
			state = sc.nextInt();

			if (state==0)
			{
				admin.start(); // �����ڸ��
			}			
			else
			{
				ki.start(); // ���Ǳ� on
			}
		}
	}
}


class Admin
{
	int selNum = 0; // 0��� 1���� 2��� 3�޴�
	Map<String,Integer> vendInfo;

	public Admin(){}	

	public Admin(Map<String,Integer> vendInfo)
	{
		this.vendInfo = vendInfo;		
	}	
	
	public void start()
	{
		
		while (true)
		{
			selNum = adminInput(); //0~3 ���� ��

			switch (selNum)
			{				
				case 0: return;
				case 1: result(); break;
				case 2: stock(); break;
				case 3: sendMenu(); break;			
			}			
		}
		
	} 
	
	public void result()
	{

	}

	public void stock()
	{

	}

	public void sendMenu()
	{
	}

	public int adminInput()
	{
		Scanner sc = new Scanner(System.in);

		int aInput; // ����� �Է� ����
		

		// ����� �Է� �ȳ���

		aInput = sc.nextInt();

		return aInput;
	}

}

class Kiosk
{
	Map<String,Integer> ingre,pos;

	public Kiosk(){};

	public Kiosk(Map<String,Integer> ingre, Map<String,Integer> pos)
	{
		this.ingre = ingre;
		this.pos = pos;
	}

	public void start()
	{
		int orderTotal = 0;

		Customer customer = new Customer();
		

		int[] orderSheet = new int[6];  // ���� ~~!

		orderSheet = Order(orderSheet,customer);
		

		// �߰��ֹ� ? 

		// orderSheet ������� ingre �ڷᱸ���� ��ᰨ�� ��ɾ� �߰�

		// �ֹ��� ��� �� orderTotal �� �ֱ�

		// pos.put(Ű��.customer.customerPay(orderTotal));

		while(true)
		{
			if (customer.payment(orderTotal))
			{
				break;
			}
			// �� ������
		}

		printReceipt();
	}

	int[] Order(int[] orderSheet,Customer customer)
	{ 
		Customer cus;
		cus = customer;
		

		int state=0; // 0�⺻�ֹ� 1�����ֹ�		 
		

		state = cus.customerInput();		

		if (state==0)
		{
			// �⺻�ֹ� �б� , int[] orderSheet �� ���
		}
		else
		{
			// �����ֹ� �б� , int[] orderSheet �� ���
		}

		return orderSheet;
	}

	void printReceipt()
	{
	}	
}

class Customer
{
	public int customerInput()
	{
		Scanner sc = new Scanner(System.in);

		int cInput; // ����� �Է� ����	

		// ����� �Է� �ȳ���

		cInput = sc.nextInt();

		return cInput;
	}	

	boolean payment(int orderTotal)
	{		
		int customerPay = customerInput(); // �� �� �Է�

		if (customerPay>=orderTotal) // �� ���� ������ true, �ƴϸ� false
		{
			return true;
		}
		else
		{
			return false;
		}		
	}	
}



