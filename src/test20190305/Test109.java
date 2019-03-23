/*==================================
     ■■■ 클래스 고급 ■■■
	 - 상속(Inheritance)
==================================*/

/*
※ 메소드 오버라이딩(Method Overriding)의 특징

   - 메소드 이름, 리턴 타입, 파라미터 수나 타입이 완전히 일치해야 한다.
   - 반드시 상속 관계가 있어야 한다.
 
   - 재정의된 하위 클래스의 메소드 접근제어지시자는
     상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	 예를 들어, 상위 클래스 메소드의 접근제어지시자가 『protected』인 경우
	 하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
	 접근제어지시자는 『protected』또는 『public』이어야 한다.

   - 『static』,『final』,『private』메소드는 오버라이딩(Overriding)할 수 없다.
     즉, 상위 클래스의 메소드가 가지고 있는 기존 예외 사항에
	 새로운 Exception을 추가하는 것은 불가능하다는 것이다.
*/

// 상위 클래스, 부모 클래스, super class
class SuperTest03
{
	private int a=5;
	protected int b=10;
	public int c=20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 하위 클래스, 자식 클래스, sub class
class SubTest03 extends SuperTest03
{
	/*
	protected int b=10;
	public int c=20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
	*/
	
	protected int b = 100;

	public void print()
	{
		// System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		// System.out.println(b);  // == this.b
		// System.out.println(super.b);

		System.out.println("Sub print() 메소드 : " + b + " : " + c);
		//--==>> Sub print() 메소드 : 100 : 20
		//--  슈퍼 클래스(SuperTest03)에서 선언된 변수 a에는 접근할 수 없다.
		// → private변수이기 때문에...
		
		System.out.println("Sub print() 메소드 : " + super.b + " : " + c);
		//--==>> Sub print() 메소드 : 10 : 20
		//-- 슈퍼 클래스(SuperTest03)에서 선언된 변수 b에 접근하기 위해서는
		//    『super』키워드를 사용하면 가능하다.

		System.out.println("Sub print() 메소드 : " + c);
		System.out.println("Sub print() 메소드 : " + this.c);
		System.out.println("Sub print() 메소드 : " + super.c);
		//--==>> Sub print() 메소드 : 20
		//       Sub print() 메소드 : 20
		//       Sub print() 메소드 : 20
		//-- 슈퍼 클래스(SuperTest03)에서 선언된 변수 c에 접근하는 데에는
		//   아무런 제약과 제한이 없다.
	}
	
	@Override
	public void write()
	{
		System.out.println("Sub write() 메소드 : " + b + " : " + c);
		//--==>> Sub write() 메소드 : 100 : 20
		//-- 슈퍼클래스(SuperTest03)에서 선언된 변수 a에 접근할 수 없다.
		// → private변수이기 때문에...
		//    또한, 이 때 접근한 변수 b는 부모로부터 물려받은 b가 아닌
		//    자신의 변수 b인것을 확인할 수 있다.

	}
}

// main()메소드를 포함하고 있는 외부의 다른 클래스
public class Test109
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest03) 인스턴스 생성
		SubTest03 ob = new SubTest03();
		
		ob.print();

		ob.write();

		System.out.println("--------------------------------- 구분선");
		
		((SuperTest03)ob).write();
		//--==>> Sub write() 메소드 : 100 : 20
		// 부모클래스로 형변환을 했어도 이미 write()메서드는 완전히 재정의 되어있는 상태여서 부모클래스의 write()를 불러오지 못함
		// 하지만 변수의 경우 재정의가 아니기 때문에 형변환해서 불러오는게 가능(슈퍼 부름 이라고 부름)
		// 부모클래스로 형변환할때 괄호 조심.
		System.out.println(ob.b);
		//--==>> 100
		System.out.println( ((SuperTest03)ob).b );
		//--==>> 10
		// ※ 슈퍼 부름
		// ※ 메소드와 변수를 꼭 구분하여 정리할 것

	}	
}