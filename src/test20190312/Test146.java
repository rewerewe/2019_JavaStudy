package test20190312;
/*====================================
 ■■■ 예외(Exception) 처리 ■■■
=====================================*/

// Test145.java 파일과 비교~!!!
// 두 코드는 예외처리에서 비슷해보이지만 다른 구문이다.
// 그 차이를 잘 파악해둘 것. 

class Demo2
{	
	// 주요 속성 구성 
	private int value;

	// getter
	public void setValue(int value) throws Exception
	{
		if (value <= 0)
			throw new Exception("value는 0보다 작거나 같을 수 없습니다.");
			//-- 새로운 예외를 발생 시키는 것. 주의할 점은 throws 가 아닌 throw 로 생성한다. 
			//   setValue 에서 예외가 발생했으므로, 메소드 밖으로 예외를 throws 해주어야 컴파일 에러가 나지 않는다. 

		this.value = value;
	}

	// setter
	public int getValue()
	{
		return value;
	}
}


public class Test146
{
	public static void main(String[] args) // 예외처리① throws Exception
	{
		Demo2 ob= new Demo2();

		// 예외처리②
		try
		{
			ob.setValue(-10);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.print(e.toString());
		}
		
	}
}

// 실행 결과
/* 
java.lang.Exception: value는 0보다 작거나 같을 수 없습니다.계속하려면 아무 키나 누르십시오 . . .
*/
