package test20190306;
/*===============================
 ■■■ 클래스 고급 ■■■
 - 중첩 클래스 (내부 클래스)
================================*/

// 외부 클래스(outer)
class InnerOuterTest
{
	static int a=10;
	int b=20;

	// 내부 클래스(inner)
	class InnerNested
	{
		int c=30;
		
		// ▶ inner 의 write() 메소드 
		void write()
		{
			System.out.println("inner의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}
	
	// ▶ outer 의 write() 메소드 
	void write()
	{
		System.out.println("outer의 write()...");
		InnerNested ob1 = new InnerNested();
		ob1.write();
	}
}

// main()메소드를 포함하고 있는 외부의 다른 클래스 
public class Test119
{
	public static void main(String[] args)
	{
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();

		// InnerNested ob3 = InnerNested();
		//-- 에러 발생

		// InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//-- 에러 발생 

		// ※ 중첩 내부 클래스와는 달리 외부 클래스의 인스턴스(객체)를 
		//	  사용하지 않고 단독으로 내부 클래스의 인스턴스 생성하는 것은 불가능 하다. 
		//	  
		// 
		// static은 단독으로 외부에서 객체 생성이 가능하나.
		
		// ※ Test117 클래스와 비교해서 볼 것.
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();

		// ??????

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();

		// ???????????????

	}
}
// 실행결과
/*
outer의 write()...
inner의 write()...
a : 10
b : 20
c : 30
inner의 write()...
a : 10
b : 20
c : 30
inner의 write()...
a : 10
b : 20
c : 30
계속하려면 아무 키나 누르십시오 . . .
*/