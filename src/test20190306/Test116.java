/*=======================================
 ���� Ŭ���� ��� ����
 - �������̽� (Interface)
=========================================*/


/* 
    ��    �ǽ� ����
        ���� ó�� ���α׷��� �����Ѵ�.
        ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�
    
    ���� ��)
    �ο� �� �Է�(1~10) : 2
    1��° �л��� �й� �̸� �Է�(���鱸��) : 1921004 �̿��� 
    ���� ���� ���� ���� �Է�   (���鱸��) : 90 100 85
    2��° �л��� �й� �̸� �Է�(���鱸��) : 1921005 ������ 
    ���� ���� ���� ���� �Է�   (���鱸��) : 85 70 65
    
    1921004 �̿���    90 100    85        275        91
                    ��    ��    ��        
    1921005 ������    85    70    65        220        73
                    ��    ��    ��    
    
    ����Ϸ��� �ƹ�Ű�� ��������...


*/


// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��


import java.util.Scanner;


class Record
{
    String hak, name;                //-- �й�, �̸�
    int kor,eng,mat;                //-- ����, ����, ���� ����
    int tot, avg;                    //-- ����, ���(���ǻ� ���� ó��)
    // ���� �о����뵵 ��� ���� �迭 grade ���� > �򰡴�� �� 3���� 
    String[] grade = new String[3];    //-- ��� �迭         
}


// �������̽�
interface Sungjuk
{
    public void set();
    public void input();
    public void print();


}


// ���� �ذ� �������� �����ؾ� �� Ŭ����
class SungjukImpl implements Sungjuk
{
    // �ο� �� �Է¹��� num, Record���� �迭 recArr ���� 
    int num;
    Record[] recArr;

   
/*	Sungjuk interface�� �����ϱ� ���� class SungjukImpl ���� implements �Ѵ�. 
	>> Sungjuk �� �޼ҵ带 �� �� �ְ� �Ǵµ�, �� �� �޼ҵ带 �Ȱ��� �����Ͽ� ���� @Override ���־�� �Ѵ�. 
*/

	@Override
    public void set() 
    {
        // �ο� �� �Է� ���� Set() �޼ҵ� �������̵�  
        // Scanner �ν��Ͻ� ���� 
        Scanner sc = new Scanner(System.in);
        
        // �ο� ���� �������·� 1~10�� �޾ƾ� �ϳ�, �ּ� 1���� ����Ǿ�� �Ѵ� >> do~ while�� ��� 
       // 0���� �۰ų� 10���� Ŭ ��, do~while���� �ݺ��ȴ�.
        do
        {
            // �ο� �� �Է� �޽��� ���, �Է¹��� ���� num�� ��´�. 
            System.out.print("�ο� �� �Է�(1~10) : "); 
            num = sc.nextInt();
        }
        while (num<0 || num>10);
        
        // �Է¹��� �ο� ����ŭ �迭 recArr ���� 
        // recArr �迭�� class Record������ ������ ������ �迭 ���·� �������. 
		// >> �迭�� �� ĭ�� class Record ���� ������ ������ �ȴ�. 
        recArr = new Record[num];


    }


    @Override
    public void input()
    {
        // �л� ���� �� ���� �Է� ���� Input() �޼ҵ� �������̵�
        // Scanner �ν��Ͻ� ���� 
        Scanner sc = new Scanner(System.in);


        // ���� �Է� �ޱ� 
        for (int i=0; i<recArr.length; i++)
        {
            // �迭 ���� 
            recArr[i] = new Record();
            
			// �л� ���� �Է� �޽��� �ȳ�, �Է� ���� ���� �迭.���� / �迭.�̸� �� ��´�.
            System.out.printf("%d ��° �л��� �й� �̸� �Է�(���鱸��) : ", (i+1));
            recArr[i].hak  = sc.next();
            recArr[i].name = sc.next();


            // �л��� ���� �����Է� �޽��� �ȳ�, �Է� ���� ���� �迭.���� / �迭.���� / �迭.���� �� ��´�.
            System.out.print("���� ���� ���� ���� �Է� (���鱸��) : ");
            recArr[i].kor = sc.nextInt();
            recArr[i].eng = sc.nextInt();
            recArr[i].mat = sc.nextInt();
        }
        


        // ����, ��� ����
        for (int i=0; i<recArr.length; i++)
        {	
			// ���� for������ �Է� �޾Ҵ� �迭.���� / �迭.���� / �迭.������ ���� �迭.�հ� �� ���, �迭.�հ� �� 3���� ���� �迭.��� �� ��´�. 
            recArr[i].tot = recArr[i].kor + recArr[i].eng + recArr[i].mat;
            recArr[i].avg = recArr[i].tot / 3;
                
        }




        // ���� ��� �Ǻ�
		// �Է� ���� �迭.���� ���� �������� ��,��,��,��,�� �� �Ǻ��Ͽ� �迭.���[0] �� ��´�.
        for (int i=0; i<recArr.length; i++)
        {
            if (recArr[i].kor >= 90)
            {
                recArr[i].grade[0] = "��";
            }
            else if (recArr[i].kor >= 80)
            {
                recArr[i].grade[0] = "��";
            }
            else if (recArr[i].kor >= 70)
            {
                recArr[i].grade[0] = "��";
            }
            else if (recArr[i].kor >= 60)
            {
                recArr[i].grade[0] = "��";
            }
            else 
            {
                recArr[i].grade[0] = "��";
            }
        }
        
        // ���� ��� �Ǻ�
		// �Է� ���� �迭.���� ���� �������� ��,��,��,��,�� �� �Ǻ��Ͽ� �迭.���[1] �� ��´�.
        for (int i=0; i<recArr.length; i++)
        {
            if (recArr[i].eng >= 90)
            {
                recArr[i].grade[1] = "��";
            }
            else if (recArr[i].eng >= 80)
            {
                recArr[i].grade[1] = "��";
            }
            else if (recArr[i].eng >= 70)
            {
                recArr[i].grade[1] = "��";
            }
            else if (recArr[i].eng >= 60)
            {
                recArr[i].grade[1] = "��";
            }
            else 
            {
                recArr[i].grade[1] = "��";
            }
        }


        // ���� ��� �Ǻ�
		// �Է� ���� �迭.���� ���� �������� ��,��,��,��,�� �� �Ǻ��Ͽ� �迭.���[3] �� ��´�.
        for (int i=0; i<recArr.length; i++)
        {
            if (recArr[i].mat >= 90)
            {
                recArr[i].grade[2] = "��";
            }
            else if (recArr[i].mat >= 80)
            {
                recArr[i].grade[2] = "��";
            }
            else if (recArr[i].mat >= 70)
            {
                recArr[i].grade[2] = "��";
            }
            else if (recArr[i].mat >= 60)
            {
                recArr[i].grade[2] = "��";
            }
            else 
            {
                recArr[i].grade[2] = "��";
            }
        }
        
    }
        
 


    @Override
    public void print()
    {
		// ��� ����� print() �޼ҵ� �������̵�
        for (int i=0; i<recArr.length; i++)
        {
            // ��� ��� 
            System.out.printf("\n %3s %3s %5d %3d %3d %5d %3d", recArr[i].hak, recArr[i].name, recArr[i].kor, recArr[i].eng, recArr[i].mat, recArr[i].tot, recArr[i].avg);
            System.out.printf("\n %18s %3s %2s", recArr[i].grade[0], recArr[i].grade[1], recArr[i].grade[2]);        
        }
        System.out.println();
    }


}//-- SungjukImpl class end 


public class Test116
{
    public static void main(String[] args)
    {
        Sungjuk ob;


        
        // ���� �ذ� �������� �ۼ��ؾ� �� ob ����
        //-- SungjukImpl �ν��Ͻ� ����
        SungjukImpl ob2 = new SungjukImpl();
        
        ob = ob2;    //-- �� ĳ���� 
        
		// �� ĳ���� �� Sungjuk�� �޼ҵ� ȣ��
        ob.set();
        ob.input();
        ob.print();
    }
}


// ���� ���
/*
�ο� �� �Է�(1~10) : 2
1 ��° �л��� �й� �̸� �Է�(���鱸��) : 2222222 ������
���� ���� ���� ���� �Է� (���鱸��) : 90 80 70
2 ��° �л��� �й� �̸� �Է�(���鱸��) : 2222223 �̱��
���� ���� ���� ���� �Է� (���鱸��) : 80
70 60


 2222222 ������    90  80  70   240  80
                   ��   ��   ��
 2222223 �̱��    80  70  60   210  70
                   ��   ��   ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/