package test20190219_help;
/*=============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
==============================================*/

// 1/2 + 2/3 + 3/4 + ... + 9/10

// 실행 예)
// 연산 결과 : xxxx		←형태?
public class Test048
{
	public static void main(String[] args)
	{
				/*int a=1;


		//(나1)
		int b=2;
		double result = a/b;

		while (b<=10)
		{
			result += result;
			a++;
			b++;
		}
		
		System.out.printf("연산 결과 : %f%n" , result);
		*/

		/*
		(나2)
		double result=0;

		while (a<=10)
		{
			a/(a+b)
			result += a/();
			a++;
		}
		System.out.printf("연산 결과 : %f%n" , result);
		*/

		//(해설)
		int n=1;
		// 1	 2	   3		   9
		// 1/2 + 2/3 + 3/4 + ... + 9/10
		// n초기값 0일때
		double sum=0;

		while (n<=9)
		{
			//증감식 구성 →최종적으로 반복문의 조건을 무너뜨리기 위한 열쇠

				//sum=n/(n+1);→덮어쓰기됨⇒마지막값만 도출됨
				//sum+=n/(n+1);
				// 단, sum+=(double)(n/(n+1)); X ⇒정수형결과.0로 더블형 만든꼴
				// 정수 기반의 나눗셈 연산은 몫을 반환하기 때문에
				// 실수 기반의 연산을 수행할 수 있도록 만들기 위해
				// 나눗셈연산자를 중심으로 피연산자 중 하나를
				// 실수형태로 만들어주는 것이 중요하다.
			sum+=(double)n/(n+1);	//or sum+=n/(double)(n+1);

			n++;			// n++ :while문 밖에 쓰면 무한루프됨



		}
		System.out.printf("연산 결과 : %f%n" , sum);
	}
			/*
			//
			int n=0;
			while (n<=8)		//조건식!
			{
				n++;
				sum+=n/(n+1);
			}
			*/
}

//실행 결과
/*
연산 결과 : 7.071032
계속하려면 아무 키나 누르십시오 . . .
*/