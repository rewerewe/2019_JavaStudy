/*=====================================
 ■■■ 주민등록 유효성 검사 ■■■
======================================*/

/*
	○ 주민등록번호 검증 공식
		
		① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

			123456-1234567	(→ 주민번호)
			****** ******
			234567 891234	(→ 각 자리에 곱해질 수)

		② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

			ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
				* * * * * *   * * * * * *
				2 3 4 5 6 7   8 9 2 3 4 5
			--------------------------------
			→ 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12+ 6 + 4 + 15 + 
			
			== 217

			== 133 	

		③ 더해진 결과물을 11로 나누어 『나머지』를 구한다
				  19 → 몫
				-----
		 	11 | 217
				 11
				-----
				 107
				  99
				-----
				   8 → 나머지
		
		④ 11에서 나머지를 뺀 결과값을 구한다
		   만약, 결과값이 두 자리라면 10으로 나눈다.		
			
			11-8

		
		⑤	④번째 에서 처리한 연산 결과가 주민번호를 구성하는 마지막 숫자와 
			일치하는지 비교한다.
							일치
			11-8 연산 결과 3 == 주민번호 마지막 숫자 3
		
		※ 마지막 숫자와 같은 경우 유효한 주민등록번호
	
		실행 예)
		주민번호 입력(xxxxxx-xxxxxxx) : 123456-12345678 → 입력갯수 초과 
		>> 입력 오류~~!!
		계속하려면 아무키나 누르세요...

		주민번호 입력(xxxxxx-xxxxxxx) : 123456-123456 → 입력갯수 부족
		>> 입력 오류~~!!
		계속하려면 아무키나 누르세요...

		주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252085 → 유효한 주민번호
		>> 정확한 주민번호!

		주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252085 → 유효하지 않은 주민번호
		>> 잘못된 주민번호~!!

		문자열.length() → 문자열의 길이 반환
		문자열.substring() → 문자열 추출 
	*/	

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 클래스 인스턴스 생성 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받은 주민번호
		String str;

		// 곱해지는 수 배열 구성
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//                             : 
		//				   check~!!! 하이픈 자리수 맞추기 위해 0 추가 

		// 곱셈 연산 후 누적합
		int tot = 0;

		// 사용자에게 안내 메시지 출력 및 주민번호 입력받기
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length() != 14)
		{	
			System.out.println(">> 입력 오류~!!!");
			return;
		}

		// 확인
		// System.out.println(">> 자릿수 적합~!!!");

		for (int i=0; i<chk.length; i++)			// i → 0 1 2 3 4 5 6 7 8 9 10 11 12
		{

			if (i==6)
				continue;
			
			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));					// str.substring(0, 1) 부터 추출할거라, 1씩 증가할 i로 대체 
																						// 추출 → 형변환 → 누적합 반복하지만 i가 6일때 
																						// 즉, 하이픈일 때 에러 발생됨 → if문으로 컨트롤 해줌. 
		}
		
		//----- 여기까지 수행하면 1과 2를 모두 끝낸 상황이며
		//		규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		//		변수 tot 에 담겨 있는 상태가 된다. 

		int su = 11 - (tot % 11);
		//            ---------- 나머지 구하기 
		//       ---------------

		// 확인
		// System.out.print(su);

		// 최종 결과 출력 이전에 추가 연산 필요~!!!
		// → su 에 대한 연산 결과가 두 자리로 나올 경우
		//	  주민번호 마지막 자릿수와 비교할 수 없는 상황
		
		// su 변수의 재초기화 
		su = su % 10;	// su %= 10;

		//----- 여기까지 수행하면 3과 4를 모두 끝낸 상황이며
		//		최종 연산 결과는 변수 su 에 담겨있는 상황이 된다. 

		// 최종 결과 출력
		if (su == Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> 정확한 주민번호 입니다!");
		}
		else 
		{
			System.out.println(">> 잘못된 주민번호 입니다~!!!");
		}




		//--------------------------------------------------------------------- 테스트 

		//테스트 
		// String strTemp = "동해물과 백두산이 마르고 닳도록";
		// System.out.println(strTemp.length());
		//--==>> 17

		// 테스트 
		// System.out.println("남산위의 저 소나무".length());
		//--==>> 10 (공백 포함)
		
		// 테스트
		// System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3,5));
		//--==>> de 		 :
		//               index 0
		// substring(index, index-1)
	
		
		// 테스트 
		// System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3,50));
		//--==>> java.lang.StringIndexOutOfBoundsException

		// 테스트 
		// System.out.println("봄이오니졸려죽겠네".substring(4,9));
		//--==>> 졸려죽겠네
		
		// 테스트
		// System.out.println("졸려도좀참자".substring(3));  // → 매개별수 하나만 쓸 때는 뒤부터 index 값만큼 뽑아 줌. 
		//--==>> 좀참자

		// 테스트
		// System.out.println("졸려도좀참자".substring(3, "졸려도좀참자".length()));
		//--==>> 좀참자
		//		 좀참자
	}

}

// 실행 결과
/*
주민번호 입력(xxxxxx-xxxxxxx) : 880222-2047510
>> 잘못된 주민번호 입니다~!!!
계속하려면 아무 키나 누르십시오 . . .

주민번호 입력(xxxxxx-xxxxxxx) : 880222-20471500
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .

주민번호 입력(xxxxxx-xxxxxxx) : 880222-204751
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .

주민번호 입력(xxxxxx-xxxxxxx) : 871103-2047510
>> 정확한 주민번호 입니다!
계속하려면 아무 키나 누르십시오 . . .
*/
