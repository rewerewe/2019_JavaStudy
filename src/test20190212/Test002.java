package test20190212;

/*========================================

���� �ڹ� �⺻ ���α׷��� ����
- �ڹ� �ҽ� �ڵ� �Է� �� ������ �ǽ�
- println()�� print()

=========================================*/

public class Test002
{
	public static void main(String[] args)
	{
		System.out.println("ù ��° ����...");	//�ٹٲ�
		System.out.println("�� ��° ����...\n");	//�ٹٲ�
		System.out.print("�� ��° ����...\n");
		System.out.print("�� ��° ����...\n\n\n");

		// --��println()���޼ҵ�� ��print()���޼ҵ��� ���̴� 
		//	���� ��ŵ(�ٹٲ�, ����) ������ �ִ�.
		//	��\n���� ���忭�� �����ϸ� ���� ��ŵ�� �����ϴ�.
		//	���� �� ����ϴ� �͵� �����ϴ�.
		// - ������ ��󿡼� ���ܵǴ� �ּ� (�����̸�, �ۼ���, �ۼ���, �ۼ����� �ּ��� ó���ϴ� ���� �ʿ�)

		System.out.println(7);
		System.out.println('7');
		System.out.println("7");

		System.out.println(7+7);
		System.out.println('7'+'7');
		System.out.println("7"+"7");

		

	}
}