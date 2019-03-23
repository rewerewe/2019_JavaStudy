/*================================================
 ■■■ 메소드 중복정의(Method Overloading) ■■■
 - 메소드 오버로딩이 가능한 형태와 불가능한 형태 
=================================================*/

public class Test096
{
	public static void main(String[] args)
	{	
		print();
		print(10);
		print('a');
		print(10, 20);
		print(10, 3.14);
		print(3.14, 10);
		double result = print(3.14);
		print(3.14);
	}

	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}					//--(X)
	public static void print(char c){}					//--(△) 자동 형변환 규칙 check~!!!
	public static void print(int i, int j){}
	public static void print(int i, double j){}			//--(△) 자동 형변환 규칙 check~!!!
	public static void print(double d, int i){}			//--(△) 자동 형변환 규칙 check~!!!
	public static double print(double d){return 3.14;}  
	//public static void print(double d){}				//--(X) 자바는 처음에 print(3.14) 이렇게 인식하기 때문에 

}
