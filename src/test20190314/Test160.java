/*==================================
 ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

/*

 List → Vector, ArrayList
 - 순서 있음
 - 배열과 유사
 - 중복 허용 

 ○	Linked List 클래스 
	Linked List 는 ArrayList, Vector와 구조가 다르다. 즉, 배열구조가 다르다.
	메모리가 일렬로 있는게 아니라 다음 방의 주소를 가지고 있다.
	ArrayList : □□□□□□□□□

	LinkedList : □    □     □    
				   □     □    □
						□

	Linked List
	- 방에 들어가 있으면, 내 다음 방의 인덱스를 가지고 있다. 
	- ArrayList 보다 더 빠르다 
	- 요소가 많을 때 사용
	- ArrayList 과 달리 공간의 한켠에 주소값을 저장하고 있어 공간을 다 쓰지 못함.
	- 요소를 많이 적재하고, 자꾸 변해야 하는 값은 LinkedList 쓰는게 낫다. 그외에는 ArrayList 를 쓴다. 


 ○ ArrayList 클래스

	- ArrayList 와 Vector 클래스는 
	  List 를 크기 변경 가능한 배열로 구현한 것으로 
	  차이점을 Vector 클래스의 객체는 기본적으로 동기화되지만,
	  ArrayList 는 그렇지 않다는 점이다.

	- 비동기화 컬렉션은 동기화된 컬레션보다 더 나은 성능을 제공하며
	  스레드들이 컬렉션을 공유하지 않는 프로그램에서는 
	  일반적으로 ArrayList 를 Vector 보다 더 선호하며,
	  ArrayList 는 동기화를 고려하지 않은 Vector 처럼 동작함으로써 
	  스레드 동기회에 따르는 부담을 갖기 않기 때문에
	  Vector 보다 더 빠르게 실행된다. 
	  → 대부분 ArrayList를 사용하는데, 비용이 적게들고 빠르다. (Vector가 더 비싸다) 

	- null 을 포함한 모든 요소를 허용하며 
	  List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해 
	  내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.

	  동기화 문제..? 
*/

import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;

public class Test160
{
	public static void main(String[] args)
	{
		// ArrayList 자료구조 인스턴스 생성
		// ArrayList<String> list = new ArrayList<String>();
		// Vector<String> list = new Vector<String>();

		// 위의 두 구문은 list 를 만드는 구조. 다음과 같이도 많이 사용한다. 
		// List<String> list = new Vector<String>();
		List<String> list1 = new ArrayList<String>();

		// list1 에 요소 추가 → add()
		list1.add("어벤저스");
		list1.add("곡성");
		list1.add("바르다가사랑한얼굴들");

		// ArrayList 자료구조 인스턴스 생성
		//-- 이번 생서은... 인스턴스 생성 과정에서 list1 을 생성자에게 넘겨줌
		List<String> list2 = new ArrayList<String>(list1);		// check-!!!

		// list2 에 요소 추가 → add()
		list2.add("캡틴마블");
		

		// ArrayList 자료구조 인스턴스 생성
		List<String> list3 = new ArrayList<String>();

		// list3 에 list2 의 전체 요소 추가 → addAll();
		list3.addAll(list2);

		// "곡성" 앞에 "앤트맨과와스프" 추가 
		// ① "곡성" 찾기 → indexOf() → 위치값 인덱스 반환
		int n = list3.indexOf("곡성");
		// ② "곡성" 찾은 인덱스 위치에 "앤트맨과와스프" 투입
		list3.add(n, "앤트맨과와스프");


		// 출력 → 더미 데이터 확인
		System.out.println("====================================================");
		System.out.println(list1);
		//--==>> [어벤저스, 곡성, 바르다가사랑한얼굴들]
		System.out.println(list2);
		//--==>> [어벤저스, 곡성, 바르다가사랑한얼굴들, 캡틴마블]
		System.out.println(list3);
		//--==>> [어벤저스, 앤트맨과와스프, 곡성, 바르다가사랑한얼굴들, 캡틴마블]
		System.out.println();


		// 출력 → listIterator() 메소드를 통해 출력
		System.out.println("====================================================");
		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println("\n");
		//--==>> 어벤저스 앤트맨과와스프 곡성 바르다가사랑한얼굴들 캡틴마블
		

		// 출력 → 역순으로 출력
		System.out.println("====================================================");
		while (li.hasPrevious())
			System.out.print(li.previous() + " ");
		System.out.println();
		//--==>> 캡틴마블 바르다가사랑한얼굴들 곡성 앤트맨과와스프 어벤저스
	}
}