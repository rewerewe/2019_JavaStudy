public class Test023
{
	public static void main(String[] arge)
	{
	
		int a = 13, b = 7;
		int c, d, e;

		c = a & b;
		d = a | b;
		e = a ^ b;

		System.out.printf("a & b = %d\n", c);
		System.out.printf("a | b = %d\n", d);
		System.out.printf("a ^ b = %d\n", e);

	}

}

/*

  a = 13	→ 00001101
& b = 7		→ 00000111
------------------------
			   00000101 → 5

  a = 13	→ 00001101
| b = 7		→ 00000111
------------------------
			   00001111 → 1+2+4+8 → 15

  a = 13	→ 00001101
^ b = 7		→ 00000111
------------------------
			   00001010 → 2+8 → 10

*/

// 실행 결과 
/*
a & b = 5
a | b = 15
a ^ b = 10
계속하려면 아무 키나 누르십시오 . . .
*/