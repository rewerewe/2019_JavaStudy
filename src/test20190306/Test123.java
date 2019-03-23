package test20190306;
/*=====================================
 ■■■ 자바의 주요(중요) 클래스 ■■■
  - Object 클래스 
======================================*/

class Test4
{
	private int a=10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}

public class Test123
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10==9 : " + (10==9));
		//--==>> 10==9 : false

		int a = 10;
		int b = 10;
		System.out.println("a==b : " + (a==b));
		//--==>> a==b : true

		// ※ 『==』 비교 연산자는 피연산자의 크기를 비교한다.
		
		// 크기를 기준으로 비교하면, 둘의 크기는 같은가요?
		System.out.println("ob1 == ob2 : " + (ob1==ob2));
		//--==>> ob1 == ob2 : false
		// 객체를 비교할 경우, 크기를 비교하는 게 아니라 주소값을 비교한다.
		// 참조하는 주소의 값을 비교한다. 
		//-- 객체(Object)들을 비교하는 과정에서 사용하는 『==』연산자는 
		//	 크기를 비교하는 것이 아니라 객체의 주소값을 비교. 

		System.out.println("ob1.equals(ob2) : " + (ob1.equals(ob2)));
		//--==>> ob1.equals(ob2) : false

		// ※ 『==』연산자와 Object 클래스의 『equals()』 메소드는 
		//	  동일한 개념으로 객체의 주소값을 비교.

		System.out.println();
		System.out.println("-------------------------");
		System.out.println();

		System.out.println("ob1            : " + ob1);
		//--==>> ob             : Test@15db9742

		System.out.println("ob1.toString() : " + ob1.toString());
		//--==>> ob1.toString() : Test@15db9742

		System.out.println("ob2            : " + ob2);
		//--==>> ob2            : Test@6d06d69c

		System.out.println("ob2.toString() : " + ob2.toString());
		//--==>> ob2            : Test@6d06d69c

		// 『클래스명@해시코드』

		// ※ 해시코드(hachcode)
		//	  : 자바 내부적으로 객체를 구분하기 위해 사용하는 것.
		//		메모리의 주소값으로 생각하면 안된다.

		// ※ 객체가 같으면 hashcode(해시코드)가 같지만
		//	  hash(해시코드)가 같다고 같은 객체는 아니다.

	}
}