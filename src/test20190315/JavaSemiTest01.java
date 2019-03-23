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
		wallet.put("만원", new Money("만원", 10000, 100));
		wallet.put("오천원", new Money("오천원", 5000, 100));
		wallet.put("천원", new Money("천원", 1000, 100));
		wallet.put("오백원", new Money("오백원", 500, 100));
		wallet.put("백원", new Money("백원", 100, 100));
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

	// 고민1 : 출력 등을 위해 맵을 반복 시켜야함. 반복을 시킬 수 있는 방법은 일단 세가지가 있음.
	// HashMap → keySet으로 Set만든다음에 Set을 TreeSet으로 바꾸고 TreeSet에서 Iterator → 너무 번잡하기도 하고 Set이 TreeSet으로 안전하게 다운캐스팅 되는지 확인 필요
	// HashMap → HashMap + ArrayList → 일단 지금 해놓은 방법이긴 한데... 일단 둘이 따로 놀아서 코딩 할 때 조심해야할거 같음.
	// Hashtable → Enumeration → 간단해서 좋은데 우선 Hashtable은 HashMap보다 성능이 떨어지고 null값을 허용하지 않음
	
	// 고민2 : Key값을 String으로 만들면 정렬해서 출력할때 String기준으로 하게됨.
	//         그렇다고 Key값을 Object로 만들면 Key의 역할을 하기 힘듬(ex) map.get("key");)이런거 할때 난감함.
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
			System.out.println(temp + ", 수량: " + mapTemp.get(temp).getQty());
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
		// 지갑 테스트
		Wallet wallet1 = new Wallet();

		System.out.println(wallet1.wallet.get("만원").getQty());

		wallet1.wallet.get("만원").setQty(999);
		wallet1.setQty("만원", 200);

		System.out.println(wallet1.wallet.get("만원").getQty());

		// 빵 생성 테스트
		Bread honeyOat = new Bread("허니오트", 10);
		System.out.println(honeyOat.getName() + " 수량 : " + honeyOat.getQty());
		Bread wheat = new Bread("위트", 20);
		Bread white = new Bread("화이트", 15);
		System.out.println();
		
		// 빵 그룹 테스트
		IngredientGroup breadGroup = new IngredientGroup();
		breadGroup.add(honeyOat);
		breadGroup.add(wheat);
		breadGroup.add(white);
		breadGroup.add(new Bread("aa", 30));
		breadGroup.printAllTemp();
		System.out.println();

		// 빵 객체 접근 테스트
		System.out.println("허니오트의 수량 : " + breadGroup.getQty("허니오트"));

		// 빵 추가
		// 여러개가 중첩돼서 복잡하게 접근해야하지만
		//breadGroup.mapTemp.get("허니오트").setQty(96);
		// IngredientGroup 클래스에 메소드 만들어 놓으면 직관적으로 접근 가능
		breadGroup.setQty("허니오트", 99);

		// 빵 추가 후 다시 출력
		System.out.println("허니오트의 수량 : " + breadGroup.getQty("허니오트"));
		System.out.println();


		//////////////////// stock 저장소에 넣기///////////////////////////
		// Stock생성
		Stock stock = new Stock();
		// 야채 생성
		Vege tomato = new Vege("토마토", 20);
		Vege onion = new Vege("양파", 11);
		Vege olive = new Vege("올리브", 6);
		
		stock.bread.add(honeyOat);
		stock.bread.add(wheat);
		stock.bread.add(white);
		stock.vege.add(tomato);
		stock.vege.add(onion);
		stock.vege.add(olive);
		stock.vege.add(new Vege("abc", 10));
		stock.bread.add(new Bread("갈릭", 30));

		// stock에 야채 출력
		stock.vege.printAllTemp();
		stock.bread.printAllTemp();



	}
}