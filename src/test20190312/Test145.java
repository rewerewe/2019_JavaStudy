/*====================================
 ■■■ 예외(Exception) 처리 ■■■
=====================================*/

// Test146.java 파일과 비교~!!!
// 두 코드는 예외처리에서 비슷해보이지만 다른 구문이다.
// 그 차이를 잘 파악해둘 것. 

class Demo
{
	private int value;
	
	// setter
	public void setValue(int value)
	{
		if (value <= 0)
			return;			//-- 종료 → 메소드 종료 

		this.value = value;	
	}

	// getter
	public int getValue()
	{
		return value;
	}

}

public class Test145
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
		
	}
}