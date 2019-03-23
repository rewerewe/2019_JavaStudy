/*==========================================
 ■■■ 연산자 (Operator) ■■■
 - 비트 단위 연산자 
 - 비트 단위 연산자 중 연산 속도가 가장 빠름. 
 ===========================================*/

// 비트 shift 연산자 

public class Test026
{
	public static void main(String[] args)
	{
		int x = 128;								// int 타입이라 32비트에서 본래의 값으로 돌아옴. 

		System.out.printf("x << 3 = %d\n", x<<3);
		System.out.printf("x *  8 = %d\n", x*8);

		System.out.printf("x >> 3 = %d\n", x>>3);
		System.out.printf("x /  8 = %d\n", x/8);

		System.out.printf("x << 24 = %d\n", x<<24);
		System.out.printf("x << 25 = %d\n", x<<25);
		System.out.printf("x << 26 = %d\n", x<<26);
		System.out.printf("x << 27 = %d\n", x<<27);
		System.out.printf("x << 28 = %d\n", x<<28);
		System.out.printf("x << 29 = %d\n", x<<29);
		System.out.printf("x << 30 = %d\n", x<<30);
		System.out.printf("x << 31 = %d\n", x<<31);
		System.out.printf("x << 32 = %d\n", x<<32);
		System.out.printf("x << 33 = %d\n", x<<33);
		System.out.printf("x << 34 = %d\n", x<<34);

	}

}

/*

	128		→	00000000 00000000 00000000 10000000		// window 키 + r → calc 프로그래머용 
	
	128<<3	→	00000000 00000000 00000100 00000000


	128		→	00000000 00000000 00000000 10000000
	
	128>>3	→	00000000 00000000 00000000 00010000

				24칸 이동하면 1 음수의 최대값, 25칸~31칸 이동 잠재되어 있다가, 32칸 이동하면 본래의 값으로 출력됨. 
*/

// 실행 결과
/*
x << 3 = 1024
x *  8 = 1024
x >> 3 = 16
x /  8 = 16
x << 24 = -2147483648
x << 25 = 0
x << 26 = 0
x << 27 = 0
x << 28 = 0
x << 29 = 0
x << 30 = 0
x << 31 = 0
x << 32 = 128
x << 33 = 256
x << 34 = 512
계속하려면 아무 키나 누르십시오 . . .
*/
