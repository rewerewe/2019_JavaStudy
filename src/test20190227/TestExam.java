package test20190227;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TestExam
{	
	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r;
		int h;
		double result;

		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("- �ﰢ���� �غ� �Է� : ");
		r = Integer.parseInt(br.readLine());

		System.out.print("- �ﰢ���� ���� �Է� : ");
		h = Integer.parseInt(br.readLine());
        
		result = r * h / 2.0;
		
//		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
//		System.out.printf(" - �ﰢ���� �غ� �Է� : %d\n",r);
//		System.out.printf(" - �ﰢ���� �غ� �Է� : %d\n",h);
		System.out.println();
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", r, h, result);
        

	}
}