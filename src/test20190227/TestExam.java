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

		System.out.println("■ 삼각형의 넓의 구하기 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");
		r = Integer.parseInt(br.readLine());

		System.out.print("- 삼각형의 높이 입력 : ");
		h = Integer.parseInt(br.readLine());
        
		result = r * h / 2.0;
		
//		System.out.println("■ 삼각형의 넓의 구하기 ■");
//		System.out.printf(" - 삼각형의 밑변 입력 : %d\n",r);
//		System.out.printf(" - 삼각형의 밑변 입력 : %d\n",h);
		System.out.println();
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", r, h, result);
        

	}
}