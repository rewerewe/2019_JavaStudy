package test20190304;
/*===========================
 ■■■ 클래스 고급 ■■■	
 - 상속(Inheritance)
===========================*/

/*
	 ○ 상속(Inheritance)이란
	 	새로 설계(생성)하고자 하는 클래스가
		이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
		이미 설계된 클래스의 일부분이나 전체 구조를
		공유할 수 있도록 하는 기능을 의미한다.

		즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
		고수준의 재사용성(reusability)을 확보하고 
		객체 간의 관계를 구성함으로써
		객체 지향의 또 다른 큰 특징 중 하나인 『다형성』의 문법적 토대가 된다.

		상속은 기존 프로그램의 클래스 내용을 공유함으로써
		중복된 코드들을 재작성할 필요 없이
		반복적이고 세부적인 작업을 처리하지 않기 때문에
		프로그램을 작성하는 시간을 절약할 수 있고
		유지보수를 편리하게 할 수 있으며,
		프로그램 길이도 짧아지게 된다.

		또한 이미 작성된 프로그램들은 앞서 테스트되었기 때문에
		오류를 줄일 수 있어 현재 작성중인 프로그램에만 전념할 수 있다.

		※ 주의할 점
		자바는 다.중.상.속.을 지원하지 않기 때문에 
		두개 이상의 클래스에서 상속받을 수 없다. 
		즉, 단일상속만 허용한다.(자식의 입장에서 한 명의 아버지)
*/

// 부모 클래스, 상위 클래스, Super Class, 기초 클래스, Base class (Test106입장에서 )
class SuperTest01
{
	// 클래스 설계 중 상속을 염두해두었다면 protected 로 선언해주면 좋음.
	// 『protected』 : 상속받는 클래스, 동일 패키지에서 접근 가능한 접근제어지시자
	protected double area;

	// 생성자 - 사용자 정의 생성자(부모 클래스 생성자)
	SuperTest01()
	{
		System.out.println("Super Class...");
	}

	void write(String title)
	{
		System.out.println(title + " - " + area);
	}

}



// 자식 클래스, 하위 클래스, Sub Class, 유도 클래스, Derived class (SuperTest01입장에서 )

// ※ 『extends』 : 상속 문법 적용.
// 자바는 단일 상속만 지원되며, 다중 상속은 허용하지 않는다.	
public class Test106 extends SuperTest01	//, SuperTest02, SuperTest03 → 불가능 
{

	// SuperTest01의 코드...(복붙 효과) 

	// 생성자 - 사용자 정의 생성자(자식 클래스 생성자)
	Test106()
	{
		// SuperTest01();	→ 생성자에서 생성자 호출 (가장 먼저 실행되어야 한다.)
		//					→ 이렇게 호출할수 없음. this(10)
		// super();			→ this일 때 class로 치환하듯이, super일때 포함하는 클래스를 찾아서 extends의 부모 클래스로 치환 
		System.out.println("Sub class...");
	}
	
	public void circle()
	{
		int r = 10;
		area = r * r * 3.141592;			// Test106에서 area 를 선언하지 않았지만, 부모 클래스에서 불러온다는 의미. 
		write("원");
	}
	
	public void rect()
	{
		int w = 20, h = 5;
		super.area = (double) w * h;		// 부모클래스에서 불러올 때 메소드 앞에 super를 써줌 
		super.write("사각형");
	}

	public static void main(String[] args)
	{
		// 자식 클래스(Test106)의 인스턴스 생성
		Test106 ob = new Test106();
		//--==>> Super Class...
		//		 Sub class...

		ob.circle();
		//--==>> 원 - 314.1592

		ob.rect();
	
	}
}
