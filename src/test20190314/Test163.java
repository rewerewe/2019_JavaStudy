/*==================================
 ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

/*

 Set → HashSet, TreeSet
 - 순서 없음
 - 중복 허용하지 않는 구조(기본) 

 ○ TreeSet<E> 클래스

 	java.util.TreeSet<E> 클래스는 
	Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬된다. 
	- HashSet이 훨 빠름. 그래서 TreeSet은 특별한 경우 아니면 잘 안씀. 

 */

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

// VO	→ Value Object			: 데이터 속성들로 구성. getter setter
// DTO	→ Data Transfer Object : 메소드 위주의 클래스 	
// DAO  → Data Access Object
//-- 어떤 걸로 선언하느냐에 따라, 클래스 설계관계가 달라진다. 

class GradeVO
{
	// 주요 속성 구성
	private String hak;
	private String name;
	private int kor, eng, mat;

	// 생성자(사용자 정의 생성자 → 매개변수 없는 생성자)
	GradeVO()
	{
	}

	// 생성자(사용자 정의 생성자 → 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// getter / setter 구성
	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getHak()
	{
		return hak;
	}


	void setName(String name)
	{
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}


	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getKor()
	{
		return kor;
	}


	void setEng(int eng)
	{
		this.eng = eng;
	}
	
	int getEng()
	{
		return eng;
	}


	void setMat(int mat)
	{
		this.mat = mat;
	}

	int getMat()
	{
		return mat;
	}


	// 추가 메소드 정의
	int getTot()
	{
		return kor + eng + mat;
	}

}

//<T> 제네릭 표현으로 어떤 것을 받을지 모른다는 표현. 
class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// 학번 기준 
		// - 는 minus 개념이 아니라 객체 순서로 이해하세요
		// 빼는 이유는 1, 0, -1 이 나오는 거에 따라 정렬이 이루어지기 때문이다. 
		// 수학에서 크기 비교할 때 많이 쓰는 방법. 
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//-- 숫자모양으로 되어있는 문자열이라 형변환 가능 

		/* 크기 비교 로직 
			a - b → 0
			a - b → 음수
			a - b → 양수 	*/

		// 총점 기준
		// return s1.getTot() - s2.getTot();		//-- 오름차순 
		// return s2.getTot() - s1.getTot();		//-- 내림차순 

		// 이름 기준
		// s1.equals(s2)
		// compareToIgnoreCase(s1, s2);
		// return s1.getName() - s2.getName;
		return s1.getName().compareTo(s2.getName());
		 

	}
}

public class Test163
{
	public static void main(String[] args)
	{	
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();
		
		// TreeSet 자료구조 set에 요소 추가 → add()
		set.add("포켓몬스터");
		set.add("디지몬");
		set.add("원피스");
		set.add("은하철도999");
		set.add("뽀로로");
		set.add("이누야샤");
		set.add("텔레토비");
		set.add("카드캡터체리");
		set.add("업");
		set.add("짱구는못말려");
		set.add("인사이드아웃");
		set.add("도라에몽");
		set.add("이상한나라의폴");
		set.add("니모를찾아서");

		// Iterator 를 활용하여 Set 요소 전체 출력

		Iterator<String> it = set.iterator();
		// iterator 는 for each 가 아닌 while 로 있는지 없는지 확인해야한다.
		/* 
		for (String str : set)
			System.out.print(str + " ");
		System.out.println();
		*/  

		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
		//--==>> 니모를찾아서 도라에몽 디지몬 뽀로로 업 원피스 
		//		 은하철도999 이누야샤 이상한나라의폴 인사이드아웃 
		//		 짱구는못말려 카드캡터체리 텔레토비 포켓몬스터

		// Tree 자료구조 인스턴스 생성 (x)
		// TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//-- 이렇게 인스턴스를 생성하여, 클래스를 TreeSet에 담지 못한다.
		
		// Tree 자료구조 인스턴스 생성. 단, 학번 기준으로 정렬 
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		set2.add(new GradeVO("16", "조수연", 90, 80, 70));
		set2.add(new GradeVO("21", "윤희진", 80, 70, 60));
		set2.add(new GradeVO("02", "한승원", 100, 100, 100));
		set2.add(new GradeVO("24", "권홍비", 12, 23, 34));
		set2.add(new GradeVO("10", "곽한얼", 50, 50, 50));

		// Treeset은 정렬 해야함.  → 어떤 기준으로 비교해야함. 또 데이터는 저장할 때 정렬이 이뤄짐. 필요한 경우 자리바꿈을 해가며 저장함 
		// 그래서 오류 발생 → ClassCastException : java.lang.Comparable
		// 결론 : 클래스를 TreeSet에 담지 못한다. 

		
		// set2 자료구조 전체 요소 출력
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n", vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(), vo.getMat(), vo.getTot());
		}
		System.out.println();
		// 정렬 : 학번 기준
		//      02     한승원  100  100  100    300
		//		10     곽한얼   50   50   50    150
		//		16     조수연   90   80   70    240
		//		21     윤희진   80   70   60    210
		//		24     권홍비   12   23   34     69

		// 정렬 : 총점 기준 (오름차순)
		// 24     권홍비   12   23   34     69
		// 10     곽한얼   50   50   50    150
		// 21     윤희진   80   70   60    210
		// 16     조수연   90   80   70    240
		// 02     한승원  100  100  100    300

		// 정렬 : 총점 기준 (내림차순)    
		// 02     한승원  100  100  100    300
		// 16     조수연   90   80   70    240
		// 21     윤희진   80   70   60    210
		// 10     곽한얼   50   50   50    150
		// 24     권홍비   12   23   34     69

		// 정렬 : 이름 기준
		// 10     곽한얼   50   50   50    150
		// 24     권홍비   12   23   34     69
		// 21     윤희진   80   70   60    210
		// 16     조수연   90   80   70    240
		// 02     한승원  100  100  100    300




	
	
	}
}
