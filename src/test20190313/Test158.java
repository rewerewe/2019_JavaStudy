package test20190313;
/*==================================
 ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

/*
 ○ 실습 문제
	
	현재 작성중인 Test158 클래스를 완성하여 
	다음 기능을 가진 프로그램을 구현한다. 

	실행 예)

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료 
		>> 메뉴 선택(1~6) : 1

		1번째 요소 입력 : 곽한얼 
		1번째 요소 입력 성공-!!!
		요소 입력 계속(Y/N)? : y

		2번째 요소 입력 : 권홍비
		2번째 요소 입력 성공-!!!
		요소 입력 계속(Y/N) : n

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료 
		>> 메뉴 선택(1~6) : 2
		
		[벡터 전체 출력]
			곽한얼 
			권홍비 
		벡터 전체 출력 완료-!!!

		------------------------- 다시 메인으로. 

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료 
		>> 메뉴 선택(1~6) : 3

		검색할 요소 입력 : 곽한얼 
		
		[검색 결과 출력 ]
		항목이 존재합니다. 

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료 
		>> 메뉴 선택(1~6) : 4

		삭제할 요소 입력 : 김경환

		[삭제 결과 출력]
		항목이 존재하지 않아 삭제할 수 없습니다.


		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료 
		>> 메뉴 선택(1~6) : 5

		변경할 대상 입력 : 권홍비 
		수정할 대상 입력 : 김선아

		[변경 결과 출력]
		변경이 완료되었습니다.

		
		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료 
		>> 메뉴 선택(1~6) : 6
		
		프로그램 종료 
		계속하려면 아무키나 누르세요....			
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;

class Menus
{
	public static final int E_ADD=1;		// 요소 추가
	public static final int E_DISP=2;		// 요소 출력 
	public static final int E_FIND=3;		// 요소 검색
	public static final int E_DEL=4;		// 요소 삭제 
	public static final int E_CHA=5;		// 요소 변경 
	public static final	int E_EXIT=6;		//-- 종료 
}

public class Test158
{
	// 주요 속성 구성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;			//-- 선택 값
	private static String con;			//-- 계속 여부 

	// static 초기화 블럭
	static
	{
		// Vector 자료구조 생성
		vt = new Vector<Object>();

		// 
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화 
		sel = 1; 
		con = "Y";
	}
	// 메뉴 출력 메소드 
	public static void menuDisp() throws IOException
	{
		System.out.print("[메뉴 선택]\n 1. 요소 추가\n 2. 요소 출력\n 3. 요소 검색\n 4. 요소 삭제\n 5. 요소 변경\n 6. 종료\n >> 메뉴 선택(1~6) : ");
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{
		sel = Integer.parseInt(br.readLine());
	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		 switch (sel)
		 {
			case 1 : addElement();	break;
			case 2 : dispElement(); break;
			case 3 : findElement(); break;
			case 4 : delElement();	break;
			case 5 : chaElement();	break;
			case 6 : exit();		break;
		 }

	}

	// 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		 System.out.printf("\n%d 번째 요소 입력 : ", vt.size()+1);
		 
		 if (vt.add(br.readLine()))
			 System.out.printf("%d 번째 요소 입력 성공-!!!\n", vt.size());
		 
		 System.out.println("요소 입력 계속(Y/N)? : ");
		 con = br.readLine();
		 
		 if (con.equals("y") || con.equals("Y"))
			addElement();

	}

	// 요소 출력 메소드
	public static void dispElement()
	{
 
		 System.out.println("[벡터 전체 출력]");
		 for (Object vtall : vt)
			System.out.println("    " + vtall);
		 System.out.println();

	}

	// 요소 검색 메소드
	public static void findElement() throws IOException
	{
		System.out.println("검색할 요소 입력 : ");

		if (vt.contains(br.readLine()))
		{
			System.out.println("\n[검색 결과 출력]");
			System.out.println("항목이 존재합니다.");
		}
		else
		{
			System.out.println("\n[검색 결과 출력]");
			System.out.println("항목이 존재하지 않습니다.");
		}
	}

	// 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		System.out.println("삭제할 요소 입력 : ");

		
		if (vt.remove(br.readLine()))
		{
			System.out.println("\n[삭제 결과 출력]");
			System.out.println("항목이 삭제되었습니다");
		}
		else 
		{
			System.out.println("\n[삭제 결과 출력]");
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다. ");
		}
	}

	// 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		String name;
		System.out.println("변경할 대상 입력 : ");
		name = br.readLine();
		
		System.out.println("수정할 대상 입력 : ");
		vt.set(vt.indexOf(name), br.readLine());
	}

	// 프로그램 종료 메소드 (완성!!!)
	public static void exit()
	{
		System.out.println("\n\t 프로그램 종료-!!!");
		System.exit(-1);
	}

	public static void main(String[] args) throws IOException
	{
		
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);

		
	}

}