package test20190312;
/*====================================
 ■■■ 예외(Exception) 처리 ■■■
 - 다른 예외 다시 던지기 
=====================================*/

public class Test148 {
	public int getValue(int value) throws Exception // ⓑ 유형의 파란 폭탄 던지기
	{
		int a = 0;

		try {
			a = getData(-2);
			// --ⓐ 유형의 빨간 폭탄 잡아내기

		} catch (Exception e) {
			// ⓐ 유형의 빨간 폭탄 처리
			System.out.println("printStackTrace.....(getValue)");
			e.printStackTrace();

			// (다시) 예외 발생 → ⓑ 유형의 파란 폭탄
			throw new Exception("value가 음수입니다.");
		}

		return a;

	}

	public int getData(int data) throws Exception {

		if (data < 0)
			throw new Exception("data가 0보다 작습니다.");
		// -- 예외발생. ⓐ 유형의 빨간 폭탄

		return data + 10;
	}

	public static void main(String[] args) {
		Test148 ob = new Test148();

		try {
			// ⓑ 유형의 파란 폭탄 잡아내기
			int a = ob.getValue(-2);
			System.out.println("a : " + a);
		} catch (Exception e) {
			// ⓑ 유형의 파란 폭탄 처리
			System.out.println("printStackTrace..........(main)");
			e.printStackTrace();
		}

	}
}