package test20190212;

/*========================================

■■■ 자바 기본 프로그래밍 ■■■
- 자바 소스 코드 입력 및 컴파일 실습
- println()과 print()

=========================================*/

public class Test002
{
	public static void main(String[] args)
	{
		System.out.println("첫 번째 구문...");	//줄바꿈
		System.out.println("두 번째 구문...\n");	//줄바꿈
		System.out.print("세 번째 구문...\n");
		System.out.print("네 번째 구문...\n\n\n");

		// --『println()』메소드와 『print()』메소드의 차이는 
		//	라인 스킵(줄바꿈, 개행) 유무에 있다.
		//	『\n』을 문장열에 포함하면 라인 스킵이 가능하다.
		//	여러 번 사용하는 것도 가능하다.
		// - 컴파일 대상에서 제외되는 주석 (파일이름, 작성자, 작성일, 작성이유 주석문 처리하는 습관 필요)

		System.out.println(7);
		System.out.println('7');
		System.out.println("7");

		System.out.println(7+7);
		System.out.println('7'+'7');
		System.out.println("7"+"7");

		

	}
}