package test20190225;
/*==================================
 ■■■ 클래스와 인스턴스 ■■■
 - 생성자(Constructor)
====================================*/

public class Test076
{
	int x;

	// ※ 생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며
	//	  필요한 경우 인수를 받아들이는 것도 가능하고,
	//	  같은 이름의 메소드를 정의하는 중복 정의가 가능하지만
	//	  리턴 값(반환 값)은 가질 수 없다. 
	// ※ 생성자는 다른 일반 메소드처럼 호출될 수 없고,
	//	  『new』 연산자를 이용하여 객체를 생성하기 위해 호출되며,
	//	  각 클래스의 인스턴스인 객체를 생성한 후에 
	//    생성된 객체의 멤버를 초기화시키는 작업을 수행한다. 
	Test076()
	{
		this(500);
		// Test076(int x)를 호출하겠다. → 예상(x) main에서 호출한 것이 아니어서.
		// Q. 메소드에서 메소드 호출이 가능한가? 문법적으로 가능함.
		// ※ 생성자 내부에서 다른 생성자 호출하는 것은 가능하다.
		// 단,  ① 호출방법에는 일반적인 메소드의 호출 구문과 차이를 보인다.
		//		   호출방법이 다르다 Test076(500); → this(500) 으로 써야함. 
		// 또한,② 생성자 내부에서 가장 먼저 실행(호출) 되어야 한다. 
		
		x = 10;
		System.out.println("생성자 호출- 인자가 없는 생성자");
		System.out.println("Test076 의 x : " + x);
		//-- 이 구문 역시, println() 메소드를 호출한 것이다.  

	}

	Test076(int x)
	{
		this.x = x;
		System.out.println("생성자 호출- 인자가 하나인 생성자");
		System.out.println("Test076 의 x : " + this.x);
		// 여기서 x 로 쓰면 지역변수 int x가 출력된다.

	}


	public static void main(String[] args)
	{	
		// Test076 클래스 기반의 인스턴스 생성 
		Test076 ob1 = new Test076();
		Test076 ob2 = new Test076(100);
		// ※ 생성자는 『new』 연산자를 이용하여 객체를 생성하기 위해 호출되며,
		//    클래스 객체에 대한 인스턴스가 생성되면 이 객체는 비로소 메모를 할당받게 된다.


		System.out.println("main에서 ob1.x : " + ob1.x);
		// Test076 void 였을 때 --==>> main에서 ob1.x : 0
		// Test076 x값이 10이었을 때 --==>> 생성자 호출
		//									main에서 ob1.x : 10

		System.out.println("main에서 ob2.x : " + ob2.x);


		
	}
}

// 실행결과
/*
생성자 호출- 인자가 하나인 생성자
Test076 의 x : 500
생성자 호출- 인자가 없는 생성자
Test076 의 x : 10
생성자 호출- 인자가 하나인 생성자
Test076 의 x : 100
main에서 ob1.x : 10
main에서 ob2.x : 100
계속하려면 아무 키나 누르십시오 . . .
*/