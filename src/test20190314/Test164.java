/*==================================
 ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

/*

 Map → HashTable, HashMap

  - java.util.Map 인터페이스는 키(key)를 값(value)에 매핑(mapping)하며,
	동일한 키를 등록할 수 없고 유일해야 하며, 
	각 키는 한 개의 값만을 매핑해야 한다.
	즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다. 


 ○ HashTable<K, V> 클래스
 	
	- 해시테이블 구조를 객체 모델링화 한 클래스로
	  검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.

	- 해시테이블이랑 키(key)와 그에 상응하는 데이터(value)로 
	  구분된 데이터 구조이다.

	- 데이터를 저장하고, 검색하기 위해서 키로 접근하며,
	  이 구조에서는 키 값을 부여하면 데이터가 변환된다.

	- 또한, Hashtable 클래스는 Key 또는 Value의 값으로 null을 허용하지 않는다. 

 */

import java.util.Hashtable;

public class Test164
{
	private static final String[] names = {"이재준", "김정규", "이원영", "김성희", "김경환", "임나래"};

	private static final String[] tels = {"010-9118-5974", "010-4780-3733", "010-9170-3896", "010-1111-1111", "010-2317-7455", "010-2684-4905"};

	public static void main(String[] args)
	{
		// Hashtable 자료구조 인스턴스 생성
		// Hashtable <key, value> 두 개의 제네릭을 쓴다. 
		// key로 value를 컨트롤 하는데 특화되어 있는 구조. 
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht 라는 Hashtable 자료구조에 배열(names, tels)에 담겨있는 
		// 데이터를 요소로 추가하기(담아내기) → put(k, v)
		// ex) ht.put("홍길동", "010-1111-1111");
		//			  -------   ---------------
		//				key          value

		for (int i=0; i<names.length; i++)
		{
			ht.put(names[i], tels[i]);
		}

		// ht 라는 해시테이블의 요소 중 값을... key를 이용하여 검색 
		String findName1 = "김정규";
		String str = ht.get(findName1);		// get(키) → 값
		if (str != null)
		{
			System.out.print(findName1 + " 전화번호 : " + str);
		}
		System.out.println();
		//--==>> 김정규 전화번호 : 010-4780-3733

		// hr 라는 해시테이블 자료구조에... key 가 존재하는지의 여부 확인
		// → containsKey()
		String findName2 = "진윤비";
		if (ht.containsKey(findName2))
			System.out.print(findName2 + " 데이터가 존재합니다.");
		else
			System.out.print(findName2 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 진윤비 데이터가 존재하지 않습니다.
		
		String findName3 = "임나래";
		if (ht.containsKey(findName3))
		{
			System.out.print(findName3 + " 데이터가 존재합니다.");
		}
		else
			System.out.print(findName3 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//		 임나래 데이터가 존재합니다.


		// ht 라는 해시테이블 자료구조에... value 가 존재하는지의 여부 확인
		// → contains()
		String findTel1 = "010-9170-3896";
		if (ht.contains(findTel1))
		{
			System.out.println(findTel1 + " 데이터가 존재합니다.");
		}
		else
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 010-9170-3896 데이터가 존재합니다.

		String findTel2 = "010-1234-1234";
		if (ht.contains(findTel2))
		{
			System.out.println(findTel2 + " 데이터가 존재합니다.");
		}
		else
			System.out.println(findTel2 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 010-1234-1234 데이터가 존재하지 않습니다.

		// ht 라는 해시테이블 자료구조에서 
		// 『이재준』 데이터 삭제 → remove()
		ht.remove("이재준"); 

		// 삭제 (→ remove() 이후 key 가 존재하는지 확인
		if(ht.containsKey("이재준"))
			System.out.println("재준이가 존재합니다. ");
		else
			System.out.println("재준이 어디갔어?");
		System.out.println();
		//--==>> 재준이 어디갔어?


		// 삭제 (→ remove() 이후 value 가 존재하는지 확인
		if (ht.contains("010-9118-5974"))
			System.out.println("010-9118-5974 가 존재합니다." );
		else 
			System.out.println("010-9118-5974 가 존재하지 않습니다.");
		System.out.println();
		//--==>> 010-9118-5974 가 존재하지 않습니다.

		//-- key와 연관된 value도 같이 삭제되니 주의


		// null 입력 시도
		// ht.put(null, null);				//-- key, value 모두 null → NullPointerException 발생 (Ⅹ)
		// ht.put("조현우", null);			//-- value 가 null		  → NullPointerException 발생 (Ⅹ)
		// ht.put(null, "010-2222-2222");	//-- key 가 null		  → NullPointerException 발생 (Ⅹ)

		// 중복된 key 값 입력
		ht.put("김정규", "010-9999-9999");
		
		System.out.println(ht.get("김정규"));
		//--==>> 010-9999-9999
		//		 기존 "010-4780-3733" 에서 "010-9999-9999"로 변경되었음을 확인
		//		 → 덮어쓰기


		// 중복된 value 값 입력
		ht.put("이기승", "010-9170-3896");

		System.out.println(ht.get("이기승"));
		System.out.println(ht.get("이원영"));
		//--==>> 010-9170-3896
		//		 010-9170-3896
		//-- 기존 데이터에 아무런 영향을 미치지 않음. 
		//   → 이기승과 이원영의 전화번호가 같은 상태로 구성. 


		
	}
}