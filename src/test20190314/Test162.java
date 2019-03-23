/*==================================
 ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

/*

 Set → HashSet, TreeSet
 - 순서 없음
 - 중복 허용하지 않는 구조(기본) 

 ○ HashSet<E> 클래스

 	java.util.HashSet<E> 클래스는 
	Set 인터페이스를 구현하는 클래스로
	순서의 개념이 아니라 집합의 개념으로 이해해야 하는 자료구조이다.
	이로 인해 데이터의 중복을 허용하지 않는다.
	또한, 동기화를 지원하지 않는다.


 */

import java.util.Set;
import java.util.HashSet;

public class Test162
{
	public static void main(String[] args)
	{
		// HashSet 자료구조 인스턴스 생성
		Set<String> dog = new HashSet<String>();
		
		// dog 라는 HashSet 자료구조에 요소 추가
		dog.add("포메라니안");
		dog.add("웰시코기");
		dog.add("시바견");
		dog.add("말티즈");
		
		System.out.print("기존 데이터 Set : ");
		for (String str : dog)
			System.out.print(str + " ");
		System.out.println();
		//--==>> 기존 데이터 Set : 포메라니안 시바견 웰시코기 말티즈
		//-- 순서가 의미 없는 자료구조이기 때문에
		//	 데이터 입력 순서 → 자료구조의 요소 격납 순서와 
		//   상관없이 구성되어 있는 것을 확인 

		// 데이터(요소) 추가
		dog.add("보더콜리");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");			// ※ 중복 데이터를 추가한다고 해서 
		dog.add("진돗개");			//	  오류가 발생하는 것은 아니다. 
		dog.add("진돗개");
		dog.add("풍산개");
		dog.add("풍산개");
		dog.add("풍산개");
		dog.add("풍산개");
		dog.add("풍산개");
		dog.add("풍산개");

		System.out.print("추가 후 데이터 Set : ");
		for (String str : dog)
			System.out.print(str + " ");
		System.out.println();
		//--==>> 추가 후 데이터 Set : 진돗개 포메라니안 시바견 웰시코기 말티즈 풍산개 보더콜리

		// ※ 데이터 추가되는 순서와 상관없이 목록이 구성되어 있으며
		//	  같은 데이터가 여러번 반복되어 추가될 경우 
		//    하나만 유효한 데이터로 구성되어 있는 것을 확인할 수 있다. 
		//    (아무리 추가해도 한 번만 출력됨)




	}
}
