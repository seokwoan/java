package javasutdy0626;

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

		Scanner word = new Scanner(System.in);
		
		String name1, name2, part1, part2;
		float money1, money2;
		
		System.out.print("�̸��� �Է��ϼ���");
		name1 = word.next();
		System.out.print("�Ҽ� �μ��� �Է��ϼ���");
		part1 = word.next();
		System.out.print("�� �޿����� �Է��ϼ���");
		money1 = word.nextFloat();
		System.out.print("�̸��� �Է��ϼ���");
		name2 = word.next();
		System.out.print("�Ҽ� �μ��� �Է��ϼ���");
		part2 = word.next();
		System.out.print("�� �޿����� �Է��ϼ���");
		money2 = word.nextFloat();
		
		double realMoney1 ,realMoney2;
		// ����ȯ 
		// float f = 3f; 3�� intŸ���ε� float�� ���� floatŸ������ Ÿ���� ���� 
		// ūŸ�� = ����Ÿ��; �� ��쿡 �ڵ����� ūŸ������ ����
		// ����Ÿ�� = ūŸ��; �� ��� �ڵ����� ����ȵ�
		// ������ �������ټ� ���� ����Ÿ�� = (�ٲ�Ÿ��) (ūŸ��); �����ϰ��� �ϴ� Ÿ���� �տ� �־ ������ Ÿ���� �����Ŵ
		// �Ǽ� - ������ ���� �Ǽ�>������ ������踦 ���� ������ ������ ���� ���ڿ����� �Ұ���
		realMoney1 = money1 * 0.92 ;
		realMoney2 = money2 - money2 *0.08 ;
		
		System.out.printf( "ù��° ����\n �̸� : %s �ҼӺμ� : %s �� ���ɾ� : %.0f�� \n�ι�° ����\n "
				+ "�̸� : %s �ҼӺμ� : %s �� ���ɾ� : %.0f�� " , name1, part1, realMoney1, name2, part2, realMoney2  );
		
		//test
	}

}













