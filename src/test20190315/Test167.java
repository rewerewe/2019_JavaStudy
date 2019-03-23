package test20190315;
/*======================================
 ■■■ 자바의 기본 입출력 (I/O) ■■■ 
=======================================*/

// OutputStream 실습
 
import java.io.OutputStream;
import java.io.IOException;

public class Test167
{
	public static void main(String[] args) throws IOException
	{
		// System.in : 자바의 표준 입력 스트립(객체)
		// System.out : 자바의 표준 출력 스트림(객체)
		OutputStream out = System.out;

		// in 자체가 객체 
		// Stream 은 물줄기 >> 어떤걸 띄우느냐 >> 스트림에 기록한다, 라고 표현한다. 

		// buffer : flush를 꼭 사용해주어야 함. 
		//			10으로 흐르던 데이터를 buffer가 다 채워지면 원래대로 10만큼 흐름. 스트림에 버퍼가 있다면 데이터를 계속 담아둘 수 있음.
		//  동영상은 초당 @ 프레임이 넘어가야 플레이 되는데, 
		// flush  : 스트림에서 훅 밀어주는 역할을 함.
		// close  : 스트림 수도꼭지를 잠금. 리소스 반납. 
		

		// 배열 구성
		byte[] ch = new byte[3];
		ch[0] = 65;		// A
		ch[1] = 97;		// a
		ch[2] = 122;	// z

			
		out.write(ch);			//-- 밖으로 내보낼 변수를 스트림에 기록 

		out.flush();			//-- 기록된 스트림을 내보내는 기능을 수행.
								//	 지금은 Buffer 를 활용하지 않고 있는 상황이기 때문에 
								//	 생략이 가능한 코드.
								//	 (Buffered 되어 있는 Stream 일 경우 생략 불가)

		out.close();			//-- 출력 스트림(물줄기)에 대한 리소스 반납
								// out스트림을 (수도꼭지를) 잠가버린 상황)

		System.out.println("절대적인 신뢰도를 갖고 있는 구문-!!!");
		// 작성한 이후 구문은  
	}
}
