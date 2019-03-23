public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");							// \n  개행

		// 서식 출력 메소드
		System.out.printf("12345678901234567890");	
		System.out.printf("12345678901234567890\n");		// \n  개행
		System.out.printf("12345678901234567890%n");		// %n  개행
		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		 
		//--==>> AAABBBCCC
		//		 1234567890123456789012345678901234567890
		//		 12345678901234567890
		//		 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);			// 오른쪽부터 10칸 확보 
		System.out.printf("%010d\n", 123);

		
		//--==>> 123
		//		         123		숫자는 오른쪽 정렬, 오른쪽부터 10칸 생성됨.
		//	      0000000123		오른쪽부터 10칸 생성되고, 빈칸은 0으로 채워짐. 
 
 		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>> +365
		//		 +365

		System.out.printf("%d\n",+365);
		//--==>> 365

		//System.out.printf("%-d\n", 365);			//-- 음수 표기시 런타임 에러 발생

		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		//--==>> -365
		//		 -365

		System.out.printf("%(d\n", -365);			//부호와 절대치. 수입과 지출을 나타낼 때 많이 사용됨.
		System.out.printf("%(d\n", 365);
		//--==>> (365)
		//		 365

		// System.out.printf("%d\n", 'A');			//-- 런타임 에러 발생
		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", 'ABCD');		//-- 컴파일 에러 발생
		System.out.printf("%s\n", "ABCD"); 
		//--==>> A
		//		 ABCD

		System.out.printf("%h\n", 365);				// 16진수
		System.out.printf("%o\n", 24);				// 8진수
		//--==>> 16d
		//		 30

		System.out.printf("%s\n", "true");
		System.out.printf("%b\n", true);
		//--==>> true
		//		 true

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236);
		System.out.printf("%8.2f\n", 123.236);		// 오른쪽부터 8칸 확보 후, 공백 출력 
		System.out.printf("%2.2f\n", 123.1234);		// 실제 표현해야하는 값보다 칸이 적으면, 본래값 출력
		//--==>> 123.230000
		//		 123.23
		//		 123.24
		//		 123.24
		//		 123.12

	}
}