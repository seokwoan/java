package java0626;

import java.util.Scanner;

public class javainput2 {

	public static void main(String[] args) {
		
		/* �ڵ� �ۼ��ϱ��� �ؾ����� - �����ľ�, �䱸���׵���
		 ���ڿ� - " " ū����ǥ�� ǥ���Ͽ� �ۼ��Ѵ�. 
		 ���ڿ��� String Ŭ����Ÿ���� ����ؾ� �Ѵ�.
		 
		 ����2. 
		 ���� �̸�, �ҼӺμ���, �� �޿����� Ű���带 ���� �Է¹޴´�.
		 ������ 8%�� ����. �� ���ɾ��� �������� ���
		 �̸�, �μ�, �� ���ɾ��� ����ϼ���.
		 �θ��� ������ ���� ����ϼ���.
		*/

//		Scanner word = new Scanner(System.in);
//		
//		String name1, name2, part1, part2;
//		int money1, money2;
//		float tax = 0.08f;
//		System.out.print("�̸��� �Է��ϼ���");
//		name1 = word.next();
//		System.out.print("�Ҽ� �μ��� �Է��ϼ���");
//		part1 = word.next();
//		System.out.print("�� �޿����� �Է��ϼ���");
//		money1 = word.nextInt();
//		System.out.print("�̸��� �Է��ϼ���");
//		name2 = word.next();
//		System.out.print("�Ҽ� �μ��� �Է��ϼ���");
//		part2 = word.next();
//		System.out.print("�� �޿����� �Է��ϼ���");
//		money2 = word.nextInt();
//		
//		int realMoney1 ,realMoney2;
//		// ����ȯ 
//		// float f = 3f; 3�� intŸ���ε� float�� ���� floatŸ������ Ÿ���� ���� 
//		// ūŸ�� = ����Ÿ��; �� ��쿡 �ڵ����� ūŸ������ ����
//		// ����Ÿ�� = ūŸ��; �� ��� �ڵ����� ����ȵ�
//		// ������ �������ټ� ���� ����Ÿ�� = (�ٲ�Ÿ��) (ūŸ��); �����ϰ��� �ϴ� Ÿ���� �տ� �־ ������ Ÿ���� �����Ŵ
//		// �Ǽ� - ������ ���� �Ǽ�>������ ������踦 ���� ������ ������ ���� ���ڿ����� �Ұ���
//		realMoney1 = (Int) (money1 - (money1*tax)) ;
//		realMoney2 = money2 - (money2 *tax) ;
//		
//		System.out.printf( "ù��° ����\n �̸� : %s �ҼӺμ� : %s �� ���ɾ� : %.0f�� \n�ι�° ����\n "
//				+ "�̸� : %s �ҼӺμ� : %s �� ���ɾ� : %.0f�� " , name1, part1, realMoney1, name2, part2, realMoney2  );
		
		Scanner sc = new Scanner(System.in);
		
		String name="0", dept="";
		int money = 0;
		int salary = 0;
		float tax = 0.08f;
		// 
		
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("�μ� : ");
		dept = sc.nextLine();
		
		System.out.print("�� �޿� : ");
		money = sc.nextInt();
		// Integer.parseInt(sc.nextLine()); nextLine���� ���� �Է¹ް� �Է¹��� ���� Integer.parseInt�� ������ ��ȯ�� 
		
		
		salary = (int)(money - (money*tax)) ;
		
		System.out.println("�̸� : "+name +" �μ� : "+dept+" ���ɾ� : "+salary);
		
		sc.nextLine(); // ���� �̸� �Է��� �ϱ� ���� nextLine 77���� �ּ�
	
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		// �����ϸ� �̸��� �ǳʶٰ� �μ��� �Է��ϰԵ�
		// Ű����� �Էµ� Ű�� �Է¹��ۿ� ����ǰ� ram���� ����
		// �� �޿����� �Է°��� ���ʹ� ���ڷ� ������ �Ұ����� ram�� ������ ������� �ʰ� ���ۿ� ��������
		// ���ۿ� �����ִ� ����Ű(\n)�� ������ �۵��� .nextLine();�� ����ǰ� 
		// ����Ű�� �ԷµǸ� Scanner�� �۵��� ���߰Ե�
		// scanner�� �۵��� ���� �������� ���� �Է°����� �Ѿ�Եǹ�
		// ���� �Է� ���� ���ڿ��� �Է� ������ �߻��ϴ� ����
		// ������ �ذ��ϱ� ���ؼ� ����Ű�� ���� ������ nextLine();�� ����� ���۸� �����
		// int( ���� Ȥ�� �Ǽ� )������ ������ next, nextLine�� �߻��ϴ� �����̹Ƿ�
		// ���۸� ����� nextLine�� �ʿ��ϴ�. 72�� nextLine
		// next�� ���Ͱ��� �Ȱ������� ���ܵιǷ� next �������� nextLine�� �ʿ��ϴ�.
		
		System.out.print("�μ� : ");
		dept = sc.nextLine();
		
		System.out.print("�� �޿� : ");
		money = sc.nextInt();
		
		salary = (int)(money - (money*tax)) ;
		
		System.out.println("�̸� : "+name +" �μ� : "+dept+" ���ɾ� : "+salary);
		
		/*
		next
		  
		  
		  
		*/
		
	}

}