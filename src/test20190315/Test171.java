package test20190315;
/*==============================================
 ■■■ 객체 직렬화(Object Serialization) ■■■ 
===============================================*/

// 객체를 저장할 수 있나요?
//-- 저장할 수 있다. 
//-- 지금까지 객체에 저장된 변수, 데이터를 참조해 사용해왔기 때문에
//   개념적으로는 가능하다.

// '객체' 자체를 담아낸다는 건 
// 저장은 영속성을 가짐. 전송 가능. → 객체 저장의 필요성 부각시키는 시점. 
// 원격지의 디바이스 간에 객체를 저장해서 전송할 수 있는 기술 RMI(Java Remote Method Invocation)
// → PDA 가 대두되던 그 때 등장. 지금 죽은 기술됨.

// 객체를 조각내고. 조각에 넘버링. 어떻게 복원 시키는지 

/*
 ○ 객체 직렬화(Object Serialization)는
	메모리에 생성된 클래스 객체의 멤버 변수의 현재 상태를 
	그대로 보존해서 저장하거나
	네트워크를 통해 전달할 수 있는 기능으로 
	멤버 변수의 값을 보존한다거나 
	다른 네트워크에 있는 호스트에 값을 보낼 경우 사용하게 된다.

	즉, 객체 직렬화는 내용물을 바이트 단위로 변환하여
	파일 또는 네트워크를 통해 송수신(스트림)이 가능하게 만들어주는 것으로 
	이 때, 객체란 멤버 변수의 메모리 만으로 구성된 것을 말한다. (변수에 국한됨)
				  ------------------

	따라서, 메소드와 생성자는 객체 직렬화의 대상에서 제외된다. (정적변수인 Static도 제외)


 ○ 객체 직렬화의 장점
	객체 자체의 내용을 입출력 형식에 구애받지 않고 
	객체를 파일에 저장함으로써 영속성을 제공할 수 있고 
	객체 자체를 네트워크를 통해 손쉽게 교환할 수 있게 된다.

	객체 직렬화는 자바 1.1 이후에 도입되었는데
	그 이유는 RMI 와 Bean 때문이었다.
	RMI 는 원래 객체 통신을 지원해야 하기 때문에
	객체가 그대로 이동할 수 있어야 한다.
	따라서 이를 지원하기 위해서는 객체 직렬화가 필수적이었다.

	또한 <Bean> 은 설계 시 상태에 대한 정보를 저장할 때 
	이 객체 직렬화를 사용하면 편하게 객체 상태를 저장할 수 있다.

	※ RMI(Romote Method Invocation)
		서로다른 가상 기계장치에 존재하는 함수를
		호출하고 실행하는 기능을 담당한다.
		서로 다른 통신 구조에 위치한 각각의 원격 객체들 간의 
		통신 구조를 지원하는 개념으로 이해하면 좋겠다.

	※ Bean(빈)
		CS(Client 와 Server) 구조적 모델에서 서버측 구조에 해당하며
		재사용 가능한 소프트웨어 개체를 만들 수 있게 하는 컴포넌트 기술.
		작성된 개체의 공유가 가능하여 프로젝트에 쉽게 포함시킬 수 있도록 한다.
		클라이언트에게 빈이라는 프로그램 컴포넌트를 분배하는 방식으로 처리.



 ○ Serializable 인터페이스 

	- 객체 직렬화를 하기 위해 먼저 객체 직렬화가 가능하도록
	  java.io.Serializable 인터페이스를 구현해야 한다.
	  이 인터페이스는 객체 직렬화가 제공되어야 한다는 사실을 
	  JVM(자바 가상 머신)에게 알려주는 역할을 수행한다. 
	  ------------------------------------- 이 중요함.

	  또한 Object Serializable 인터페이스는 다른 인터페이스와 달리
	  구현해야 할 메소드가 없기 때문에 단지 선언만 해주면 된다.

	형식)

	①
	public class 클래스명 implements Serializable
	{
		// ...
	}

	② 
	Serializable 인터페이스를 구현한 후
	ObjectInputStram 클래스와 ObjectOutputStream 클래스를 이용하여 
	객체 단위로 입출력을 수행하게 된다.
	
	* 멤버 변수가 static 으로 선언된 경우 (즉, 클래스 변수일 경우)
	  객체 직렬화의 대상에서 제외된다.

 ○ Object Stream
	
	- java.io.ObjectInputStream
	ObjectInputStream 클래스는 ObjectOutputStream 클래스에 의해
	파일에 저장되어 있는 객체나 네트워크를 통해 전달된 객체의
	직렬화를 해제하는 기능을 제공한다. 

	단,java.io.Serializable 인터페이스와 java.io.Externalizable 인터페이스를 
	지원해주는 객체에 대해서만 사용이 가능하다. 
	즉, Serializable 인터페이스와 Externalizable 인터페이스를
	구현한 객체에서만 사용이 가능하다는 것이다.
	이 때, readObject() 메소드를 이용하여 
	스트림으로부터 직렬화된 객체를 읽을 수 있으며

	<이렇게 읽은 객체는 배열, 문자열, 각 객체 등...
	원래의 형(Type)으로 캐스팅 해주어야 한다. >

*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;


public class Test171
{
	// file 관련 Exception이 많아서 던져준다. 
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");
		// 사용자 정의 디렉토리를 확인하는 속성 

		// 확인
		// System.out.println(appDir);
		//--==>> C:\JavaStudy

		// 관련한 API Document 꼭 찾아보세요. 

		// 파일 객체 생성
		File f0 = new File(appDir, "\\data\\test.ser");
		// appDir → C:\JavaStudy
		// appDir 위치를 중심으로  "\\data\\test.ser" 를 생성하겠다는 의미.
		// 결과적으로 『C:\JavaStudy\data\test.ser』
		

		// 확인
		// System.out.println(f0.getParentFile().exists());
		//--==>> false : data\test.ser 이 존재하지 않는다 

	
		if (!f0.getParentFile().exists())		//-- 디렉터리 구성이 존재하지 않는 상황이라면...
		{
			// 디렉터리 경로를 구성하겠다. (만들겠다.) : mkdirs = make directory
			f0.getParentFile().mkdirs();
		}
		// 조건이 만족하지 않으면 실행되지 않겠지요. 


		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		// 생성한 h1 라는 Hashtable 자료구조에 요소 추가
		h1.put("5", "이승희");
		h1.put("2", "전훈의");
		h1.put("1", "진윤비");
		h1.put("4", "권홍비");
		h1.put("3", "한승원");

		// 확인
		// System.out.println(h1.get("2"));
		//--==>> 전훈의

		// 파일 전용 출력 스트림 생성
		FileOutputStream fos = new FileOutputStream(f0);
		//-- 파일 전용 출력 스트림(물줄기) 객체에 f0 라는 파일 객체를 띄우겠다...


		// 객체 전용 출력 스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- 객체 전용 출력 스트림(물줄기) 객체로 
		//	 fos 라는 파일 전용 출력 스트림을 감싸겠다...
		//	 번역 역할을 수행하게 됨. 정수기 필터처럼 ObjectOutputStream을 통하면 직렬화가 된 것.

		// 위의 개념과 동일한 구문
		// ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

		// 위의 개념과 비교해야 할 구문
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ※ ObjectOutputStream 클래스는 
		//	  객체들을 출력하는 기능을 제공하는 클래스로
		//	  출력 스트림에 출력하기 전에 내부적으로 직렬화를 수행하게 된다.
		//    자바 기본형 데이터 또는 객체들을 파일에 저장하거나
		//	  네트워크를 통해 전달하기 위해
		//	  전달할 객체를 직렬화 하는 기능을 제공하는 것이다.

		oos.writeObject(h1);		//-- 생성된 스트림객체에 내보낼 객체 기록 

		oos.close();				//-- ObjectOutputStream 리소스 반납

		fos.close();				//-- FileOutputStream 리소스 반납 


		// 내보내기 끝.


		//------------------------------------------------------------ 직렬화

		// 읽어들이기 시작.

		if (f0.exists())	// f0 파일 객체가 존재한다면...
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);
		
			// 읽어들인 객체(Object)를 캐스팅(Hashtable 이라는 원래의 타입)하여
			// h2 라는 Hashtable 자료구조에 담아내기 
			// 형변환에는 어떤 자료구조에 담아있는지 필수적으로 알아야만 하고, 그래야 객체 직렬화 할 수 있음.

			Hashtable h2 = (Hashtable)ois.readObject();

			ois.close();
			fis.close();

			//----------------------------- 여기까지 수행하면 읽어들이는 작업 끝. 


			// 읽어들인 h2 객체의 내용 확인
			String key;
			String value;

			// ※ Iterator 사용할 수 없음. check-!!!
			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				// key = (String)e.nextElement();	// key 값을 읽어들이는 과정
				// System.out.println(key);

				key = (String)e.nextElement();		// key 값을 읽어들이는 과정
				// Hashtable 의 get() 메소드는 무엇을 반환하나? 
				//-- key값을 넣으면 value 를 반환한다. 
			
				value = (String)h2.get(key);

				System.out.println(key + " → " + value);
			}
		}

	}
}

// 실행결과
/*
5 → 이승희
4 → 권홍비
3 → 한승원
2 → 전훈의
1 → 진윤비
계속하려면 아무 키나 누르십시오 . . .
*/