package test20190221;
/*==========================================
 ���� �޼ҵ� ���ȣ�� (��� �޼ҵ�) ���� 
===========================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	public static void showHi(int cnt)
	{
		
		System.out.println("Hi~~~");


		if (cnt == 1)		// �� cnt ���� ���� Ȯ���� ��, cnt �� ���� 
			return ;		// �޼ҵ� ���ᰡ ��ȯ��

		showHi(--cnt);		//	�� ������ --(postfix) �̹Ƿ� showHi(3)�� ȣ���� ��, showHi(3)�� �Ǿ� ���ѷ��� �߻�.  
			
		
		
	}
}