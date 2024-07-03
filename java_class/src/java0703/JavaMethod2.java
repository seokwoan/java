package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member member1 = new Member( "�̼���" , 31 , "����" );
		Member member2 = new Member( "������" , 29 , "�����������" );
		Member member3 = new Member( "�念��" , 45 , "��������" );
		
//		// �¾ �⵵ 
//		Date today = new Date();
//		// Date class�� �������� ���ܵ� ĸ��ȭ -> �������� �ʿ� ���ų� ������ ����
//		System.out.println( today.getYear() + 1900 ); // ��ǻ���� ������ 1900���̱� ���� 
//		System.out.println( today.getDay() + 1 );
//		System.out.println( today.getDate() ); 
//		System.out.println( today.getMonth() + 1 ); 
//		// getYear�� ���� �׾��� ������ Date�� ��ü�� �� �ִ� class�� 2�� ���־� �������� �ʾƼ��̴�.
		
//		Calendar cal = Calendar.getInstance();
		// Calendar�� �߻�Ŭ���� - �߻�Ŭ������ ��ü�� ������ ���� 
		// �߻�Ŭ������ c��ũ�� 11�ù��⿡ A�� ����
		// �ڽ�class�� ��ü(instance)�� ������ִ� method�� �ִ�.
		
//		int year = cal.get( Calendar.YEAR );
//		int month = cal.get( Calendar.MONTH ) + 1 ; // 1������ 0�̶� +1�� ����
//		int date = cal.get( Calendar.DAY_OF_MONTH );
//		int day = cal.get( Calendar.DAY_OF_WEEK ); 
//		// Calendar�� Ŭ���� ������ ���� ���� ������
//		System.out.println( year );
//		System.out.println( month );
//		System.out.println( date );
//		System.out.println( day );
		
		
		LocalDate today = LocalDate.now();
		System.out.println( today.getYear() );
		System.out.println( today.getMonthValue() );
		System.out.println( today.getDayOfMonth() );
		System.out.println( today.getDayOfWeek() ); // ������ ����
		System.out.println( today.getDayOfWeek().getValue() ); // ������ ���ڷ� ���� �������� 1
		
		int nowYear = today.getYear();
		int birthYear1 = nowYear - member1.age;
		System.out.printf( "%s �¾�⵵ : %d\n" , member1.name , birthYear1 );
		
		// class�� instance method�� ����� ���
		member2.birthYear();
		member3.birthYear();
		
		
		// ���̰� 20���ΰ�? 30���ΰ�? 40���ΰ�? 50���ΰ�?
		DataIdenti dataIdenti = new DataIdenti(); // DataIdenti�� �з��� ���� class�� ��ü�� �ѹ��� �����ؼ� ���
		dataIdenti.ageGroup( member1.name, member1.age , member1.job );
		dataIdenti.ageGroup( member2.name, member2.age , member2.job );
		
		dataIdenti.jobGroup( member1.name , member1.job );
		dataIdenti.jobGroup( member2.name , member2.job );
		dataIdenti.jobGroup( member3.name , member3.job );
		
		// �����з� - �������� �з��� ���� ǥ��
		// ��³��� - �̼��� : 05.���� - �̸��� ����
		// 

	}

}


class Member {
	String name; //�̸�
	int age; // ����
	String job; // ����

	Member(){} // �Ű������� ���� ������ method
	
	Member( String name, int age, String job){ // �Ű������� �ִ� ������ method
		this.name = name; // this�� �ش� Ŭ������ ��ü -> ������ method�� ����ɶ� �����Ǵ� ��ü
		this.age = age;
		this.job = job;
	}
	
	// �¾ �⵵ �����ΰ� ����ϴ� method
	void birthYear(){  // instance method�� ��ü�� ���� ����ؾ���
		// static�� �پ� �־�� class�̸��� ���� ��밡��
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		int birthYear1 = nowYear - this.age; 
		// instance method�� ����� ���� ��ü�� �̿��� ����ϹǷ� �Ű������� �ƴ� this�� ���� ǥ�� 
		System.out.printf( "%s �¾�⵵ : %d\n" , this.name , birthYear1 );
	}
}

// Ư�� class������ ����ϴ� method�ΰ��� ���ؾ���
// this�� ����ϸ� class�� ��ü�� ��� ������

// ��Ʈ�ѿ� class, ��������� ���� class(method), ������ class(����)
//  Controller ,        Service 		  ,	   DTO(VO)
 

class DataIdenti{ // ���ɴ�, ���� �з� ��� ������ �з��� ���� class
	
	void ageGroup( String name , int age , String job ) { // returnŸ���� void�̹Ƿ� ���� ��� 
		
		String group = null;
		group = (age/10) + "0��"; 
		System.out.println( name + " : " + group + " , " + job );
		
	}

	void jobGroup( String name , String job ) {
		String group = null;
		switch( job ) { // if(job.equals("����")) -> �ڹٿ��� ���ڿ� �񱳴� equals! 
			case "����" : 
				group = "05.����";
				break;
			case "��������" : 
				group = "15.���"; 
				break;
			case "�����������" : 
				group = "18.�����Ǻ�";
				break;
		}
		System.out.printf( "%s : %s\n", name , group);
			
	}
	// ���� ���� �з�
	// ���� - 05.���� , �������� - 15.��� , ����������� - 18.�����Ǻ�

}

// method�� function�� ����ϴ� ����
// �迭, ���, �ܼ� ��� - �ݺ���
// �ݺ����� �ڵ带 �ۼ��Ҷ� �ݺ����� method Ȥ�� function���� ����ϸ�
// �ڵ�м��� ��������. �� �ݺ����� method ���ٷ� ����
// method�� ����ϸ� �ڵ��� ����� ��������, �������� ��������.
// �ڵ带 �ۼ��Ҷ� ����� ����, �迭�� ���� �����صδ°� ����.
// method�� ����ϸ� ����ȭ�� ���α׷����� �����ϴ�.
// �ڵ带 ���ȭ�ؼ� �ۼ��Ѵ�. -> method�� �ϳ��� ��� method�� �ٸ� ������Ʈ���� ��� ����


