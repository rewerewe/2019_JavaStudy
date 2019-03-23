/*=======================================
 ■■■ 클래스 고급 ■■■
 - 인터페이스 (Interface)
=========================================*/


/* 
    ○    실습 문제
        성적 처리 프로그램을 구현한다.
        단, 인터페이스를 활용할 수 있도록 한다
    
    실행 예)
    인원 수 입력(1~10) : 2
    1번째 학생의 학번 이름 입력(공백구분) : 1921004 이원영 
    국어 영어 수학 점수 입력   (공백구분) : 90 100 85
    2번째 학생의 학번 이름 입력(공백구분) : 1921005 이재준 
    국어 영어 수학 점수 입력   (공백구분) : 85 70 65
    
    1921004 이원영    90 100    85        275        91
                    수    수    우        
    1921005 이재준    85    70    65        220        73
                    우    미    양    
    
    계속하려면 아무키나 누르세요...


*/


// 속성만 존재하는 클래스 → 자료형 활용


import java.util.Scanner;


class Record
{
    String hak, name;                //-- 학번, 이름
    int kor,eng,mat;                //-- 국어, 영어, 수학 점수
    int tot, avg;                    //-- 총점, 평균(편의상 정수 처리)
    // 과목별 학업성취도 결과 담을 배열 grade 선언 > 평가대상 이 3과목 
    String[] grade = new String[3];    //-- 등급 배열         
}


// 인터페이스
interface Sungjuk
{
    public void set();
    public void input();
    public void print();


}


// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl implements Sungjuk
{
    // 인원 수 입력받을 num, Record형의 배열 recArr 선언 
    int num;
    Record[] recArr;

   
/*	Sungjuk interface를 구현하기 위해 class SungjukImpl 에서 implements 한다. 
	>> Sungjuk 의 메소드를 쓸 수 있게 되는데, 이 때 메소드를 똑같이 선언하여 각각 @Override 해주어야 한다. 
*/

	@Override
    public void set() 
    {
        // 인원 수 입력 받을 Set() 메소드 오버라이딩  
        // Scanner 인스턴스 생성 
        Scanner sc = new Scanner(System.in);
        
        // 인원 수는 정수형태로 1~10을 받아야 하나, 최소 1번은 실행되어야 한다 >> do~ while문 사용 
       // 0보다 작거나 10보다 클 때, do~while문이 반복된다.
        do
        {
            // 인원 수 입력 메시지 출력, 입력받은 값을 num에 담는다. 
            System.out.print("인원 수 입력(1~10) : "); 
            num = sc.nextInt();
        }
        while (num<0 || num>10);
        
        // 입력받은 인원 수만큼 배열 recArr 정의 
        // recArr 배열은 class Record형에서 선언한 변수를 배열 형태로 만들었다. 
		// >> 배열의 각 칸은 class Record 에서 선언한 변수가 된다. 
        recArr = new Record[num];


    }


    @Override
    public void input()
    {
        // 학생 정보 및 점수 입력 받을 Input() 메소드 오버라이딩
        // Scanner 인스턴스 생성 
        Scanner sc = new Scanner(System.in);


        // 점수 입력 받기 
        for (int i=0; i<recArr.length; i++)
        {
            // 배열 생성 
            recArr[i] = new Record();
            
			// 학생 정보 입력 메시지 안내, 입력 받은 값을 배열.학점 / 배열.이름 에 담는다.
            System.out.printf("%d 번째 학생의 학번 이름 입력(공백구분) : ", (i+1));
            recArr[i].hak  = sc.next();
            recArr[i].name = sc.next();


            // 학생의 과목별 점수입력 메시지 안내, 입력 받은 값을 배열.국어 / 배열.영어 / 배열.수학 에 담는다.
            System.out.print("국어 영어 수학 점수 입력 (공백구분) : ");
            recArr[i].kor = sc.nextInt();
            recArr[i].eng = sc.nextInt();
            recArr[i].mat = sc.nextInt();
        }
        


        // 총점, 평균 연산
        for (int i=0; i<recArr.length; i++)
        {	
			// 앞의 for문으로 입력 받았던 배열.국어 / 배열.영어 / 배열.수학을 더해 배열.합계 에 담고, 배열.합계 를 3으로 나눠 배열.평균 에 담는다. 
            recArr[i].tot = recArr[i].kor + recArr[i].eng + recArr[i].mat;
            recArr[i].avg = recArr[i].tot / 3;
                
        }




        // 국어 등급 판별
		// 입력 받은 배열.국어 값을 기준으로 수,우,미,양,가 를 판별하여 배열.등급[0] 에 담는다.
        for (int i=0; i<recArr.length; i++)
        {
            if (recArr[i].kor >= 90)
            {
                recArr[i].grade[0] = "수";
            }
            else if (recArr[i].kor >= 80)
            {
                recArr[i].grade[0] = "우";
            }
            else if (recArr[i].kor >= 70)
            {
                recArr[i].grade[0] = "미";
            }
            else if (recArr[i].kor >= 60)
            {
                recArr[i].grade[0] = "양";
            }
            else 
            {
                recArr[i].grade[0] = "가";
            }
        }
        
        // 영어 등급 판별
		// 입력 받은 배열.영어 값을 기준으로 수,우,미,양,가 를 판별하여 배열.등급[1] 에 담는다.
        for (int i=0; i<recArr.length; i++)
        {
            if (recArr[i].eng >= 90)
            {
                recArr[i].grade[1] = "수";
            }
            else if (recArr[i].eng >= 80)
            {
                recArr[i].grade[1] = "우";
            }
            else if (recArr[i].eng >= 70)
            {
                recArr[i].grade[1] = "미";
            }
            else if (recArr[i].eng >= 60)
            {
                recArr[i].grade[1] = "양";
            }
            else 
            {
                recArr[i].grade[1] = "가";
            }
        }


        // 수학 등급 판별
		// 입력 받은 배열.수학 값을 기준으로 수,우,미,양,가 를 판별하여 배열.등급[3] 에 담는다.
        for (int i=0; i<recArr.length; i++)
        {
            if (recArr[i].mat >= 90)
            {
                recArr[i].grade[2] = "수";
            }
            else if (recArr[i].mat >= 80)
            {
                recArr[i].grade[2] = "우";
            }
            else if (recArr[i].mat >= 70)
            {
                recArr[i].grade[2] = "미";
            }
            else if (recArr[i].mat >= 60)
            {
                recArr[i].grade[2] = "양";
            }
            else 
            {
                recArr[i].grade[2] = "가";
            }
        }
        
    }
        
 


    @Override
    public void print()
    {
		// 결과 출력할 print() 메소드 오버라이딩
        for (int i=0; i<recArr.length; i++)
        {
            // 결과 출력 
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


        
        // 문제 해결 과정에서 작성해야 할 ob 구성
        //-- SungjukImpl 인스턴스 생성
        SungjukImpl ob2 = new SungjukImpl();
        
        ob = ob2;    //-- 업 캐스팅 
        
		// 업 캐스팅 후 Sungjuk의 메소드 호출
        ob.set();
        ob.input();
        ob.print();
    }
}


// 실행 결과
/*
인원 수 입력(1~10) : 2
1 번째 학생의 학번 이름 입력(공백구분) : 2222222 정임혜
국어 영어 수학 점수 입력 (공백구분) : 90 80 70
2 번째 학생의 학번 이름 입력(공백구분) : 2222223 이기승
국어 영어 수학 점수 입력 (공백구분) : 80
70 60


 2222222 정임혜    90  80  70   240  80
                   수   우   미
 2222223 이기승    80  70  60   210  70
                   우   미   양
계속하려면 아무 키나 누르십시오 . . .
*/