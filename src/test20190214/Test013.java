/* ============================================
���� �ڹ� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ��� �⺻ �����
===============================================*/

// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� : 
// - �ﰢ���� ���� �Է� :

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...


// �� �ﰢ���� ���� : �غ� * ���� / 2



// ���� Ǯ���� ����
		
/*	
import java.io.BufferedReader;						// [error] ó���� import.System.in.BufferReader�� �ۼ����� ������. 
import java.io.InputStreamReader;
import java.io.IOException;
*/


 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

													// import java.io.* ���� �ۼ��� �� ������, �������� ����. ������: java.io. ��Ű�� �ȿ� �ִ� ��� ���� �޸𸮿� �ø��� ������ 

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		
		// ���� Ǯ���� ����
	
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			// Buffer : �ӽ������� �����ϴ� ����. ������ Ÿ���� ���� ���ֱ� ���� new�� ����� ��. 
																							// System.in : �ý��ۿ� �Է� 
																							// ���� ��� ��Ʈ�� - ����Ʈ ��� ��Ʈ�� �̾��ֱ� ���� StreamReader�� ���. [error] ó���� InputSystemReader�� �ۼ�.
	
		// ���� ���� �� �ʱ�ȭ
		// int br;																			// [error] BufferedReader�� br�� �����ؼ�.
		int w, h;
		double r;


		// ����
		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");									// 1) ����ڿ��� ���� �Է¹���. 
		System.out.print("- �ﰢ���� �غ� �Է� : ");
	
		w = Integer.parseInt(br.readLine());												// 2) �Է� ���� ���� �о� ��. parseInt : ���� ��ȯ��	readLine : ����ڰ� �Է��� ���� ���پ� ����. 

		System.out.print("- �ﰢ���� ���� �Է� : ");
		h = Integer.parseInt(br.readLine());
		
		r = w * h / 2.0 ;																	// 3) ���� ���� 


		// ��� ��� 
		// System.out.println(">> �غ��� " + w + ", ���̰� "+ h + "�� �ﰢ���� ����:"+ r);
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", w, h, r); 

		*/

		

		// �Բ� Ǯ���� ����

		// �ܺηκ��� �����͸� �Է¹޵��� ó���ϱ� ���ؼ�
		// BufferedReader �ν��Ͻ� ���� 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ����

		int underLength, height;	//-- �غ��� ����
		double area;


		// ���� �� ó��
		// 1) ����ڿ��� �ȳ� �޽��� ���
		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("-�ﰢ���� �غ� �Է� : ");

		// 2) ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//    ���� undeLength�� ��Ƴ���

		underLength = Integer.parseInt(br.readLine());

		// 3) �ٽ� ����ڿ��� �ȳ� �޽��� ���
		
		System.out.print("-�ﰢ���� ���� �Է� : ");

		// 4) ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//    ���� height �� ��Ƴ���

		height = Integer.parseInt(br.readLine());

		// 5) �ﰢ���� ���̸� ���ϴ� ���� ó��
		
		area = underLength * height / 2.0 ;
		//		����		 ����    ���� 
		
		//-- �Ǽ� �ڷ����� ��������� ������ �������� 
		//	 �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//   ������ ��2���� �ƴ� �Ǽ��� ��2������ ������ ������ �����ϱ� �Ǹ�
		//   �� ������ �Ǽ� ������� ó���ȴ�.

		// ��� ���
		System.out.println();	// ����
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f%n",underLength, height, area);


		// () ����, �μ�, �Ű�����, �Ķ���ʹ� ���� ���̴�. 

	
	}
}

