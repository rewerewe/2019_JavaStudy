package test20190306;
/*=====================================
 ■■■ 자바의 주요(중요) 클래스 ■■■
  - Object 클래스 
======================================*/

// ※ Test121 클래스와 비교!

// import java.lang.*;

public class Test122 // extends Object
{
	/*
	Object 멤버들 상속 
	*/
	
	// Object 클래스로부터 물려받은 toString() 메소드 재정의 
	@Override
	public String toString()
	{
		return "재정의한 toString()...";
	}

	public static void main(String[] args)
	{
		Test122 ob = new Test122();

		System.out.println("ob.toString() : " + ob.toString());
		//--==>> ob.toString() : 재정의한 toString()...
		//-- 오버라딩 되었음

		System.out.println("ob            : " + ob);
		//--==>> ob            : 재정의한 toString()...


	}
}