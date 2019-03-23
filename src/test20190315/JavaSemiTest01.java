package test20190315;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

class Money
{
	private String name;
	private int value;
	private int qty;
	
	Money()
	{}

	Money(String name, int value, int qty)
	{
		this.name = name;
		this.value = value;
		this.qty = qty;
	}

	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	void setValue(int value)
	{
		this.value = value;
	}
	int getValue()
	{
		return value;
	}
	void setQty(int qty)
	{
		this.qty = qty;
	}
	int getQty()
	{
		return qty;
	}
}

class Wallet
{
	HashMap<String, Money> wallet = new HashMap<String, Money>();
	
	{
		wallet.put("����", new Money("����", 10000, 100));
		wallet.put("��õ��", new Money("��õ��", 5000, 100));
		wallet.put("õ��", new Money("õ��", 1000, 100));
		wallet.put("�����", new Money("�����", 500, 100));
		wallet.put("���", new Money("���", 100, 100));
	}

	void setQty(String name, int qty)
	{
		wallet.get(name).setQty(qty);
	}

}

class Ingredient
{
	private String name;
	private int qty; // quantity
	
	Ingredient()
	{}

	Ingredient(String name, int qty)
	{
		this.name = name;
		this.qty = qty;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}

	void setQty(int qty)
	{
		this.qty = qty;
	}

	int getQty()
	{
		return qty;
	}
}

class Bread extends Ingredient
{
	Bread()
	{}
	Bread(String name, int qty)
	{
		super(name, qty);
	}
}
class Vege extends Ingredient
{
	Vege()
	{}
	Vege(String name, int qty)
	{
		super(name, qty);
	}
}
class Cheese extends Ingredient
{}
class Sauce extends Ingredient
{}
class Extra extends Ingredient
{
	private int price;
	void setPrice(int price)
	{
		this.price = price;
	}
	int getPrice()
	{
		return price;
	}
}
class Side extends Ingredient
{
	private int price;
	void setPrice(int price)
	{
		this.price = price;
	}
	int getPrice()
	{
		return price;
	}
}

class IngredientGroup
{	

	// ���1 : ��� ���� ���� ���� �ݺ� ���Ѿ���. �ݺ��� ��ų �� �ִ� ����� �ϴ� �������� ����.
	// HashMap �� keySet���� Set��������� Set�� TreeSet���� �ٲٰ� TreeSet���� Iterator �� �ʹ� �����ϱ⵵ �ϰ� Set�� TreeSet���� �����ϰ� �ٿ�ĳ���� �Ǵ��� Ȯ�� �ʿ�
	// HashMap �� HashMap + ArrayList �� �ϴ� ���� �س��� ����̱� �ѵ�... �ϴ� ���� ���� ��Ƽ� �ڵ� �� �� �����ؾ��Ұ� ����.
	// Hashtable �� Enumeration �� �����ؼ� ������ �켱 Hashtable�� HashMap���� ������ �������� null���� ������� ����
	
	// ���2 : Key���� String���� ����� �����ؼ� ����Ҷ� String�������� �ϰԵ�.
	//         �׷��ٰ� Key���� Object�� ����� Key�� ������ �ϱ� ����(ex) map.get("key");)�̷��� �Ҷ� ������.
	HashMap<String, Ingredient> mapTemp = new HashMap<String, Ingredient>();
	ArrayList<String> listTemp = new ArrayList<String>();

	void add(Ingredient obj)
	{
		mapTemp.put(obj.getName(), obj);
		listTemp.add(obj.getName());
	}

	int getQty(String name)
	{
		return (mapTemp.get(name)).getQty();
	}

	void setQty(String name, int qty)
	{
		(mapTemp.get(name)).setQty(qty);
	}

	void printAllTemp()
	{
		Iterator it = listTemp.iterator();
		while (it.hasNext())
		{	
			String temp = (String)it.next();
			System.out.println(temp + ", ����: " + mapTemp.get(temp).getQty());
		}
		System.out.println();
	}
}

class Stock
{
	IngredientGroup bread = new IngredientGroup();
	IngredientGroup vege = new IngredientGroup();
}

public class JavaSemiTest01
{
	public static void main(String[] args)
	{	
		// ���� �׽�Ʈ
		Wallet wallet1 = new Wallet();

		System.out.println(wallet1.wallet.get("����").getQty());

		wallet1.wallet.get("����").setQty(999);
		wallet1.setQty("����", 200);

		System.out.println(wallet1.wallet.get("����").getQty());

		// �� ���� �׽�Ʈ
		Bread honeyOat = new Bread("��Ͽ�Ʈ", 10);
		System.out.println(honeyOat.getName() + " ���� : " + honeyOat.getQty());
		Bread wheat = new Bread("��Ʈ", 20);
		Bread white = new Bread("ȭ��Ʈ", 15);
		System.out.println();
		
		// �� �׷� �׽�Ʈ
		IngredientGroup breadGroup = new IngredientGroup();
		breadGroup.add(honeyOat);
		breadGroup.add(wheat);
		breadGroup.add(white);
		breadGroup.add(new Bread("aa", 30));
		breadGroup.printAllTemp();
		System.out.println();

		// �� ��ü ���� �׽�Ʈ
		System.out.println("��Ͽ�Ʈ�� ���� : " + breadGroup.getQty("��Ͽ�Ʈ"));

		// �� �߰�
		// �������� ��ø�ż� �����ϰ� �����ؾ�������
		//breadGroup.mapTemp.get("��Ͽ�Ʈ").setQty(96);
		// IngredientGroup Ŭ������ �޼ҵ� ����� ������ ���������� ���� ����
		breadGroup.setQty("��Ͽ�Ʈ", 99);

		// �� �߰� �� �ٽ� ���
		System.out.println("��Ͽ�Ʈ�� ���� : " + breadGroup.getQty("��Ͽ�Ʈ"));
		System.out.println();


		//////////////////// stock ����ҿ� �ֱ�///////////////////////////
		// Stock����
		Stock stock = new Stock();
		// ��ä ����
		Vege tomato = new Vege("�丶��", 20);
		Vege onion = new Vege("����", 11);
		Vege olive = new Vege("�ø���", 6);
		
		stock.bread.add(honeyOat);
		stock.bread.add(wheat);
		stock.bread.add(white);
		stock.vege.add(tomato);
		stock.vege.add(onion);
		stock.vege.add(olive);
		stock.vege.add(new Vege("abc", 10));
		stock.bread.add(new Bread("����", 30));

		// stock�� ��ä ���
		stock.vege.printAllTemp();
		stock.bread.printAllTemp();



	}
}