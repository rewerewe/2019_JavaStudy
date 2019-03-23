package test20190221;
/*==========================================
 ■■■ 메소드 재귀호출 (재귀 메소드) ■■■ 
===========================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	public static void showHi(int cnt)
	{
		
		System.out.println("Hi~~~");


		if (cnt == 1)		// ② cnt 값을 먼저 확인한 후, cnt 값 감소 
			return ;		// 메소드 종료가 반환됨

		showHi(--cnt);		//	① 증감식 --(postfix) 이므로 showHi(3)를 호출할 때, showHi(3)이 되어 무한루프 발생.  
			
		
		
	}
}