package test20190314;
/*==================================
 ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

// 리스트에는 동일한 데이터를 넣어도 괜찮다.

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

class Demo1
{
	// 전체 출력 메소드
	public void printList(List<String> lists)
	{
		System.out.println("\nLists ---------------------");
		for (String s : lists)
			System.out.print(s + " ");
		
		System.out.println();
	}

	// 역순 출력 메소드
	public void printReverseList(List<String> lists)
	{
		System.out.println("\nReversed Lists -----------");

		ListIterator<String> it = lists.listIterator(lists.size());
		while (it.hasPrevious())
		{
			String s = it.previous();
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	// 시작하는 문자열 검색메소드
	public void searchList(List<String> lists, String searchValue)
	{
		Iterator<String> it = lists.iterator();
		
		System.out.println("\n『" + searchValue + "』로 시작하는 문자열--------------");
		while (it.hasNext())
		{
			String s = it.next();
			// 『s.startsWith(searchValue)』
			// 가장 앞 글자(문자열)가 searchValue 인가?
			// 맞다면... 출력한다. 아니라면... 출력하지 않는다. 
			// startsWith 는 String 의 메소드이다. 
			if (s.startsWith(searchValue))
				System.out.print(s + " ");

		}
		System.out.println();
	}
	
	// 검색 (시작인덱스 ~ 끝인덱스)
	List<String> searchList(List<String> lists, int start, int end)
	{
		// 위에 시작하는 문자열을 찾는 메소드처럼 Iterator 를 쓸 수 있나?
		// 매개변수로 받은 lists 의 sublist()를 쓰겠다. 
		return lists.subList(start, end);
	}

	
	// 삭제 (시작인덱스 ~ 끝인덱스)
	void removeItems(List<String> lists, int start, int end)
	{
		lists.subList(start, end+1).clear();
	}
	
}

public class Test161
{
	public static void main(String[] args)
	{
		String[] data
			= {"우리나라", "대한민국", "우리건설", "대한제국", "대형마트"};

		Demo1 demo = new Demo1();

		// 관찰 : 아래 세가지 vector, arraylist, linkedlist는 List 의 하위클래스라 같은 형식으로 저장, 출력된다. 

		/*
		※ ArrayList 와 비교하여 LinkedList 의 장단점
		   - 장점
		   	 · 자료의 삽입과 삭제가 용이하다.
			 · 리스트 내에서 자료의 이동이 필요하지 않다. 
			 · 사용 후 기억 장소의 재사용이 가능하다.
		 	 · 연속적인 기억 장소의 할당이 필요하지 않다.
		   - 단점 
		     · 포인터의 사용으로 인해 저장 공간의 낭비가 있다.
			 · 알고리즘이 복잡하다. 
			 · 특정 자료의 탐색 시간이 많이 소요된다. 
		*/

		Vector<String> v = new Vector<String>();
		ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> link = new LinkedList<String>();

		for (String s : data)
		{
			v.add(s);
			list.add(s);
			link.add(s);
		}

		 
		// 기본 전체 출력 
		demo.printList(v);
		demo.printList(list);
		demo.printList(link);
		/*
		// 역순 전체 출력 
		demo.printReverseList(v);
		demo.printReverseList(list);
		demo.printReverseList(link);


		// 검색 후 출력 
		demo.searchList(v, "대");
		demo.searchList(list, "대형");
		demo.searchList(link, "대한");

		//--==>> 『대』로 시작하는 문자열--------------
		//		 대한민국 대한제국 대형마트

		//--==>> 『대형』로 시작하는 문자열--------------
		//		 대형마트

		//--==>> 『대한』로 시작하는 문자열--------------
		//		 대한민국 대한제국
		*/

		List<String> sub = demo.searchList(list, 1, 3);
		demo.printList(sub);

	}
}