package test20190312;
/*==================================
 ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	// 정적 문자열 배열 선언 및 초기화 
	private static final String[] colors 
		= {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public static void main(String[] args)
	{
		// Queue 자료구조 생성
		Queue<String> qu = new LinkedList<String>();
		//-- ※ Queue 인터페이스 기반의 인스턴스를 생성하기 위해서는 
		//	 new 연산자를 이용하여 Queue 인터페이스를 implements 한 
		//	 하위 클래스의 생성자를 호출해야 한다.

		// qu 라는 Queue 자료구조에 데이터 입력
		// 내가 쓴 구문 String col = qu.offer();

		for (String color : colors)
		{	
			qu.offer(color);
		}


		// qu 라는 Queue 자료구조의 모든 데이터 출력
		// ○○ ○○ ○○ ○○ ○○

		while (qu.peek() != null)
			System.out.print(qu.poll() + " ");
		System.out.println();
		//--==>> 검정 노랑 초록 파랑 빨강 연두
		
	}

}