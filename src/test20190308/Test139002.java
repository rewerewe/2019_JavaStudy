
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class Test139002
{
	public static void main(String[] args) throws IOException
	{
		// ���� Ǯ���� ���� 
		// Calendar �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();
		
		
		// ���� ����, ���� �� ���� ����
		String w;
		int adays;

		// ���� �迭 ����
		String[] week = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"}; 
		
		w = week[(cal.get(Calendar.DAY_OF_WEEK)-1)];

		// ���ó�¥ ���
		System.out.println("���� ��¥ : " + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE) + " " + w);
		
		
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		adays = Integer.parseInt(br.readLine());

		cal.add(Calendar.DATE, adays);

		
		System.out.printf("%d ��  : " , adays);  
		System.out.println(cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DATE) + " " + w);
		
		

	}
}