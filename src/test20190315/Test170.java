/*======================================
 ■■■ 자바의 기본 입출력 (I/O) ■■■ 
=======================================*/

// Reader Writer 실습

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import java.io.Writer;
import java.io.OutputStreamWriter;

public class Test170
{
	public void process(InputStream is)
	{
		int data;

		System.out.println("문자열 입력(종료:Ctrl+z)");

		try
		{
			// 매개별수 is 라는 바이트 기반의 입력 스트림 객체(InputStream)를
			// 문자 스트림으로 변환하여 Reader 타입의 rd (객체)에서 참조할 수 있도록 처리.
			Reader rd = new InputStreamReader(is);

			// 바이트 기반 스트림인 자바 기본 출력 스트림 객체(System.out)를
			// 문자 스트림으로 변환하여 Writer 타입의 wt (객체)에서 참조할 수 있도록 처리.
			Writer wt = new OutputStreamWriter(System.out);

			while ((data = rd.read()) != -1)
			{
				wt.write(data);	//-- 스트림 물줄기에 기록(한땀 한땀...) ▶ 반복문 아님. 
				wt.flush();		//-- 기록한 스트림을 밀어내어 내보냄
			}

		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args)
	{
		Test170 ob = new Test170();
		ob.process(System.in);

	}
}

// 실행결과
/*
문자열 입력(종료:Ctrl+z)
1234
1234
abcd
abcd
가나다라
가나다라
*/