
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

		int state=0; // 관리자 0 , 사용자 1	
		
		admin.start(); // 첫 실행은 관리자모드

		while (true) // 모드 선택 진입
		{
			state = sc.nextInt();

			if (state==0)
			{
				admin.start(); // 관리자모드
			}			
			else
			{
				ki.start(); // 자판기 on
			}
		}
	}
}


class Admin
{
	int selNum = 0; // 0모드 1정산 2재고 3메뉴
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
			selNum = adminInput(); //0~3 사이 값

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

		int aInput; // 사용자 입력 변수
		

		// 사용자 입력 안내문

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
		

		int[] orderSheet = new int[6];  // 미정 ~~!

		orderSheet = Order(orderSheet,customer);
		

		// 추가주문 ? 

		// orderSheet 기반으로 ingre 자료구조에 재료감소 명령어 추가

		// 주문액 계산 후 orderTotal 에 넣기

		// pos.put(키값.customer.customerPay(orderTotal));

		while(true)
		{
			if (customer.payment(orderTotal))
			{
				break;
			}
			// 돈 더내ㅔ
		}

		printReceipt();
	}

	int[] Order(int[] orderSheet,Customer customer)
	{ 
		Customer cus;
		cus = customer;
		

		int state=0; // 0기본주문 1쉬운주문		 
		

		state = cus.customerInput();		

		if (state==0)
		{
			// 기본주문 분기 , int[] orderSheet 에 담기
		}
		else
		{
			// 쉬운주문 분기 , int[] orderSheet 에 담기
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

		int cInput; // 사용자 입력 변수	

		// 사용자 입력 안내문

		cInput = sc.nextInt();

		return cInput;
	}	

	boolean payment(int orderTotal)
	{		
		int customerPay = customerInput(); // 낼 돈 입력

		if (customerPay>=orderTotal) // 더 많이 냇으면 true, 아니면 false
		{
			return true;
		}
		else
		{
			return false;
		}		
	}	
}



