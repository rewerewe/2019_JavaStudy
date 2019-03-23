package test20190313;
/*==================================
 ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

/*
	 // Vector v = new Vector();
	 
	 Q. 이 벡터는 몇개일까요?
		- 비어있는 Vector 자료구조 생성

	// Vector v = new Vector(8);

	Q. 이 벡터는 몇개일까요?
		- 8개의 초기 element를 가진 Vector 자료구조 생성
		  8개가 모두 채워지게 되면(모자라게 되면) 자동으로 확장된다.

	// Vertor v = new Vector(3, 5);
		- 3개의 초기 elements를 가진 Vector 자료구조 생성
		  3개가 모두 채워지게 되면(모자라게 되면) 5개 증가(확장)된다. 

※ 벡터는 데이터 요소로서 정수형, 실수형, 문자열... 등 
프리미티브 자료형을 담아내는 것이 가능하다.
→ 접근 방법 → 데이터 안정성 확보  (Check~~!)

*/

import java.util.Vector;
import java.util.Iterator;

// MyVector 클래스 설계 → Vector 클래스 상속
class MyVector extends Vector<Object>
{
		
		/*
		... 기존 Vector 멤버 상속 
		*/
	

		// 생성자
		MyVector()
		{
			// Vecotr(슈퍼 클래스) 생성자 호출
			super(1,1);
			//-- 첫 번째 인자 : 주어진 용량
			//   두 번째 인자 : 증가량
		}

		void addInt(int i)
		{
			addElement(new Integer(i));
		}
		
		void addFloat(float f)
		{
			addElement(new Float(f));
		}
		
		void addString(String s)
		{
			addElement(s);
		}

		void addCharArray(char[] a)
		{
			addElement(a);
		}

		void write()
		{	
			/*
			Iterator<Object> it = this.iterator();
			while (it.hasNext())
			{
				System.out.println(it.next());
			}
			*/

			Object o;
			int length = size();

			System.out.println("벡터 요소 갯수 : " +length);
			//--==>>
		

			for (int i=0; i<length; i++)
			{
				o = elementAt(i);			// 자동으로 업캐스팅 된거임. 

				// 『instanceof』 연산자
				//-- 처리해야 하는 대상의 객체 타입 확인 

				if (o instanceof Integer)
				{
					System.out.println("정수형 : " + o);
				}
				else if (o instanceof Float)
				{
					System.out.println("실수형 : " + o);
				}
				else if (o instanceof String)
				{
					System.out.println("문자열형 : " + o.toString());
				}
				else if (o instanceof char[])
				{
					// System.out.println("문자배열 : " + o);				//-- 해시코드 
					// System.out.println("문자배열 : " + o.toString());	//-- 해시코드 
					
					/*
					("문자배열" + o.toArray());
					*/

					/*
					// 기승풀이 : 생성자 
					String chr = new String(char[] o);
					System.out.println("문자배열 : " + chr);
					*/

					// 함께 풀이한 내용 ①
					// o 의 요소를 꺼내면 char 이고, 모든 요소를 출력은 향상 for문으로 해결한다. 
					// 이 때, o의 요소는 char[] 로 형변환 해주어야 함.
					/*
					System.out.print("문자배열 : ");
					for (char ch : (char[]) o)
						System.out.print(ch);
					System.out.println();
					*/

					System.out.println("문자배열 : " + String.copyValueOf((char[]) o));
					//								  --------     		  ----------
					//              					 |			문자배열을 리턴, o 의 형변환  
					//                  메소드 호출해서 쓰려면 객체.메소드명() 하듯이
					//					String 의 메소드를 쓰려면 객체 생성은 안해도 
					//					String 에 있는 메소드 라는 걸 알려줘야 한다.... 충격.

					//--==>> 벡터 요소 갯수 : 4
					//		 정수형 : 5
					//		 실수형 : 3.14
					//		 문자열형 : 안녕하세요
					//		 문자배열 : study
					
				}
				else
				{
					System.out.println("타입 확인 불가");
				}
			}
		}
	
}

public class Test154
{
	public static void main(String[] args)
	{
		// MyVector 클래스 인스턴스 생성
		MyVector v = new MyVector();

		// 주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s  = new String("안녕하세요");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);			//-- 벡터 자료구조에 정수 저장
		v.addFloat(real);			//-- 벡터 자료구조에 실수 저장
		v.addString(s);				//-- 벡터 자료구조에 문자열 저장
		v.addCharArray(letters);	//-- 벡터 자료구조에 문자 배열 저장 
	
		v.write();
	}
}
