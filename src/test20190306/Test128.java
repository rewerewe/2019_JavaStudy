package test20190306;
/*=====================================
 ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스 
======================================*/

// API 속성 찾아보고, 다른 값 넣어서 확인해두기.

import java.math.BigDecimal;

public class Test128
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		// movePointLeft() : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println(b);
		//--==>> 123456.789123456789

		BigDecimal t1 = new BigDecimal("400.0");
		BigDecimal t2 = new BigDecimal("6.0");

		BigDecimal t3 = t1.divide(t2, 3);
		BigDecimal t4 = t1.divide(t2, 2);
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		//--==>> t3 : 66.6
		//	 	 t4 : 66.7
		

		// 나눗셈 (대체 속성 확인, ROUND_DOWN : 반올림 하지 않는다. → 절삭)

		BigDecimal c = a.divide(b,BigDecimal.ROUND_DOWN);
		//→ BigDecimal c = a.divide(b, 1); 와 동일한 구문

		System.out.println(BigDecimal.ROUND_DOWN);		//--==>> 1
        System.out.println(c);
		//--==>> 1000.000000000

		// 유효자리 : 소수점 이하 5번째 자리(두 번째 인자값 5)
		BigDecimal d = a.divide(b, 5, BigDecimal.ROUND_DOWN);
		//→ BigDecimal c = a.divide(b, 5, 1); 와 동일한 구문
		System.out.println(d);
		//--==>> 1000.00000


	}
}