/*=====================================================
 ■■■ 클래스와 인스턴스 ■■■
 - 생성자(Constructor)와 초기화 블럭(Initialized Block)
======================================================*/
/
public class Test078
{
	int n;
	int m;
		
	// 생성자(Constructor)
	Test078()
	{
		n=100;
		m=200;
		System.out.println("생성자 실행...");
	}
	

	// 초기화 블럭(Initialized Block) 
	{
		n=10;
		m=20;
		System.out.println("초기화 블럭 실행...");
	}

	// 변수 선언은 가능하지만, 연산 수행시 에러남.
	// 변수 선언시 초기화 가능함. 
	// {  } 블레이스 안에 연산 수행을 넣어주면 가능함 = 이 블레이스를 초기화 블럭이라 한다. 
	// 초기화 블럭이 생성자보다 먼저 실행되나, 생성자가 수행되는 내용이 더 중요하기에 나중에 실행됨. 

	// 생성자(Constructor)
	Test078(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("인자 있는 생성자 실행...");
	}


	//출력 메소드 정의
	void write()
	{
		System.out.println("n :"+ n + " m : " + m);
	}

	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();
		//--==>> 초기화 블럭 실행...
		//		 생성자 실행...
		//		 n :100 m : 200

		Test078 ob2 = new Test078(1234, 5678);
		ob2.write();
		//--==>> 초기화 블럭 실행...
		//		 인자 있는 생성자 실행...
		//		 n :1234 m : 5678
	
	}
}