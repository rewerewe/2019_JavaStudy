/*===============================
 ■■■ 클래스 고급 ■■■
 - 중첩 클래스 (익명 클래스)
================================*/

/*
 ○ Anonymous 클래스(익명의 클래스, 무명 클래스)

	- awt나 안드로이드 이벤트 처리에서 일반적으로 사용
 	- 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용 
	- 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는 
	  번거로움 때문에 익명의 클래스를 생성하며 처리한다. 
 	

 ○ 형식 및 구조 
 	
	new 상위클래스의 생성자()
	{
		접근제어지시자 자료형 메소드()
		{
			// ....
		}
	};		← 반드시 세미콜론 필요함.

 ○ 물리적인 파일 구조상(탐색기 상에서)
 	클래스명$1.class 파일이 생성되면 
	$ 뒤의 숫자가 순차적으로 부여된다.

*/

// import java.lang.*;

class Test3 // extends Object
{
	/*
	.....
	........
	......
	*/

	// 하나정도 재정의해서 쓴다는 건,
	public Object getString()			// 객체 Object 를 반환한다 
	{
		// return _______; ← 자료형 : Object

		// Object ob = new Object();
		// ob.xxx();
		// ob.yyy = xxx; 
		//-- 재정의하기 위해 ob를 반환하는 것
		// return ob;
		//-- 가능하다. 

		// 가능한가?  
		// return new Object();
		//-- 객체를 생성하는 것 자체가 리턴값으로 반환되나?????

		// return new Object(){중얼중얼};

		return new Object()				// 이름 없는 객체 생성 (인스턴스 생성과 같음)
		{
			@Override
			public String toString()
			{
				return "익명의 클래스...";
			}
		};		// ← 세미콜론(미 작성시 에러발생)

	}
}


public class Test120 // extends Object 
{
	public static void main(String[] args)
	{
		// 1. 인스턴스 생성 된 것.
		// new Scanner();

		// 2. Test112는 무엇을 상속받고 있나요? ????
		// 기본적으로 extends Object 를 상속받고 있는 것. 
		// 모든 클래스의 조상클래스는 Object 이다. (== 모두 Object 를 상속받는다.)

		// 3. 모든 클래스는 lang 패키지를 import 한다. 
		// import java.lang.*;
		// 자바가 언어로써 가져야할 구문을 모두 lang 패키지가 가지고 있다. 


		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		//--==>> Test3@15db9742   → 원래의 toString 역할 : 확인하기 위해 임의로 붙이는 코드 

		System.out.println(ob2.getString());
		//--==>> 익명의 클래스... →
	}
}