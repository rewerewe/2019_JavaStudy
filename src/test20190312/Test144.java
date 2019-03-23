package test20190312;
/*====================================
 ■■■ 예외(Exception) 처리 ■■■
=====================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144
{
	private String[] data = new String[3];

	public void proc() // qthrows IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;
		
		// 프로시저 밖으로 던지지 않고 잡아버림. 
		try
		{
			System.out.print("이름 입력[종료:Ctrl+z] : ");

			while ((str = br.readLine()) != null)
			{
				data[n++]=str;
				System.out.print("이름 입력[종료:Ctrl+z] : ");
			}	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생~!!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toStrng : " + e.toString());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		

		catch (IOException e)	// 예외도 객체. e라는 객체명을 부여해서 컨트롤 한다. 
		{
			System.out.println(e.toString());		// 예외의 toString()은 예외내용을 문자열 형태로 반환해준다. 
		}

		System.out.println("입력된 내용");
		for (String s : data)
		{	
			if (s != null)
				System.out.println(s);
		}
		System.out.println();

		
	}

	public static void main(String[] args) // throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();
		
	}
}

// 실행 내용
/*
이름 입력[종료:Ctrl+z] : 정임혜
이름 입력[종료:Ctrl+z] : 이기승
이름 입력[종료:Ctrl+z] : 김선아
이름 입력[종료:Ctrl+z] : 이지혜
예외 발생~!!!
getMessage : 3
toStrng : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace...
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test144.proc(Test144.java:27)
        at Test144.main(Test144.java:59)
입력된 내용
정임혜
이기승
김선아

계속하려면 아무 키나 누르십시오 . . .

이름 입력[종료:Ctrl+z] : 정임혜
이름 입력[종료:Ctrl+z] : 이기승
이름 입력[종료:Ctrl+z] : ^Z
입력된 내용
정임혜
이기승

계속하려면 아무 키나 누르십시오 . . .
*/