package test20190308;
/*=====================================
 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - StringBuffer Ŭ���� 
======================================*/

/*
 �� StringBuffer Ŭ������
 	���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
	String Ŭ������ ���� ���ڿ� ���̴��� ������ �Ұ���������
	StringBuffer Ŭ������ ���ڿ��� ����� ��
	���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִٴ� ���̴�.

	��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
	��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
	���� ������ ���� ũ���� �ٲ� �� �ִ� ����� �����ϴ� ���̴�.

	����, JDK 1.5 ���ĺ��ʹ�
	���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
	StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
	���� ū �������� multi-thread unsafe��� ���̴�.
	��, Syncronization�� ���� ������ 
	StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
	StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�. 

*/
import java.util.Scanner;

public class Test133
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");
		
		System.out.println(sb1 == sb2);			//--==>> false
		System.out.println(sb1.equals(sb2));	//--==>> false ??	// Object �� equals : String Buffer �� equals �� �������̵� ���� �ʾ���. ���⼭ equals �� �ؽ� �ּҸ� ���ϴ� object�� equals ��. 

		System.out.println(sb1.toString().equals(sb2.toString()));  // String �� equals : String Buffer �� �״�� toString �� �������̵� ����. �ؽ��ּҸ� �ִ°� �ƴϰ� String Value ���� �ش�. 
		//--==>> true																	  �׷��� String ���� toString()���� �ٲ۴��� �ű⼭ String �� equls�� ���� ���� ���� �� �ִ�. 
		
		Object sb = new Object();
		sb.toString();
		System.out.println("Object : " + sb.toString());

		StringBuffer sb3 = new StringBuffer();
		//-- �⺻���� Buffer ũ��� 16 
		//-- StringBuffer �⺻ ������ ȣ�� ��(�ν��Ͻ� ���� ����)
		//	 �⺻������ �����Ǵ� ���� ũ��� ��16��

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 16
		// capacity : �����ؼ� ��ȭ�� �� �ִ� �뷮 


		////////////////////////////////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> ��

		sb3.append("seoul");		// sb += "seoul";
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");
		//-- sb3 �� "seoul" �� append(�߰�) �ϰڴ�

		System.out.println(sb3);
		//--==>> seoulkorea�츮������ѹα�

		System.out.println(sb3.toString());
		//--==>> seoulkorea�츮������ѹα�

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34
		//-- �ȿ� ��� ���빰�� ��������, �ڵ����� �뷮�� ������. 


		///////////////////////////////////////////////////////////////////////////////
		
		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE
		// String�� toUpperCase()

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle

		// System.out.println(sb3.toUpperCase());
		// System.out.println(sb3.toLowerCase());
		//--==>> cannot find symbol �������� ����
		
		Scanner sc = new Scanner(System.in);
		String temp3 = sb3.toString();
		//--
		String a = "asdfr";
		StringBuffer b = new StringBuffer("asdqwe");
		Integer c = new Integer(42);

		System.out.println("a.toString() : " + a.toString());
		System.out.println("b.toString() : " + b.toString());
		System.out.println("c.toString() : " + c.toString());
		System.out.println("sc.toString() : " + sc.toString());
		//--==>> temp3 : seoulkorea�츮������ѹα�


		System.out.println(temp3.toUpperCase());
		System.out.println(temp3.toLowerCase());
		System.out.println(sb3.toString().toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�
		//		seoulkorea�츮������ѹα�
		//		SEOULKOREA�츮������ѹα�

		// seoulKorea�츮������ѹα�
		
		// �� ��� ���ڿ�(sb3) �� seoul ���ڿ� �տ�
		//	���ѱ����̶�� ���ڿ� �߰�
		sb3.insert(0, "�ѱ�");
		System.out.println("seoul �տ� ���ѱ��� �߰� : " + sb3.toString());
		//--==>> seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�

		// �ѱ�seoulKorea�츮������ѹα�
		
		// �� ��� ���ڿ�(sb3) �� seoul ���ڿ� �ڿ�
		//	��������̶�� ���ڿ� �߰�
		//	��, ��� ���ڿ��� �ε����� ���� Ȯ������ ����...
		
		// step 1 
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoulkorea�츮������ѹα�

		// step 2
		// sb3.insert("���");
		// System.out.println("seoul �ڿ� ������� �߰� : " + sb3.toString());
		//--==>> seoul �ڿ� ������� �߰� : �ѱ�seoul���korea�츮������ѹα�

		// step 3
		// sb3.indexOf("seoul");
		// System.out.println(sb3.indexOf("seoul"));
		//--==>> 2

		// step 4
		// sb3.insert(sb3.indexOf("seoul"), "���");
		// System.out.println(sb3.toString());
		//--==>> �ѱ����seoulkorea�츮������ѹα�

		// step 5
		// sb3.insert(sb3.indexOf("seoul")+5, "���");
		// System.out.println(sb3.toString());
		//--==>> �ѱ����seoul���korea�츮������ѹα�

		// step 6
		// sb3.insert(sb3.indexOf("seoul")+("seoul"�� ����), "���");
		//System.out.println(sb3.toString());
		 
		// step 7
		sb3.insert(sb3.indexOf("seoul")+"seoul".length(), "���");
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoul���korea�츮������ѹα�


		// �� ���츮���󡻹��ڿ� ����
		// sb3.delete(14, 18);
		System.out.println(sb3);
		//--==>> �ѱ�seoul���korea���ѹα�
		
		/* 
		sb3.indexOf("�츮����");
		System.out.println(sb3.indexOf("�츮����"));	//-- 14
		
		sb3.indexOf("�츮����");
		System.out.println(sb3.replaceAll("�츮����", " "));
		*/
		
		sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println(sb3);
		//--==>> �ѱ�seoul���korea���ѹα�


		// �� ��� ���ڿ�����(sb3) 
		//	 ��korea�� ���� ���ڿ� ���� (korea ����)
		//sb3.delete(sb3�� "korea"���ڿ�������ġ, sb3�� �� );
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==> �ѱ�seoul���


		// �� ��� ���ڿ�����(sb3) 
		//	 ������� ���� ���ڿ� ���� (��� ����)
		sb3.delete(sb3.indexOf("���"), sb3.length());
		System.out.println(sb3);
		//--==> �ѱ�seoul


		/////////////////////////////////////////////////////////////////////////////////////


		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34
		//-- ����ũ��� �ڵ����� �þ�� �ص�, �ڵ����� �پ���� �ʴ´�.


		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==>> ���ڿ��� ���� : 7

		// �� ���� ũ�� ���� �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���... 
		sb3.trimToSize();
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 7




		


		








		

	}
}