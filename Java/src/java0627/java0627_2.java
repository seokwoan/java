package java0627;

import java.util.Scanner;

public class java0627_2 {

	public static void main(String[] args) {
		
		// ���ǹ� if(����), switch(���α׷�����)
		// �ݺ��� for, while, do~while
		
		
		
		
		
		
		
		// ���� �հ� ���� - �հ�(60���̻�), ���հ�(60���̸�)
		
		int score = 72;
		if( score >= 60 ) {
			System.out.println( "�հ�" );
		}
		else if( score < 60 ) {
			System.out.println( "���հ�" );
		}
		
		// if~else - ���ǽ��� ��, ������ ���� ����Ǵ� ������ �ٸ����
		// �ϳ��� ���ǿ� �ΰ��� ������ �ִ� ��쿡 if~else ������ �ۼ�
		
		// ���� ���� ��� A(90���̻�), B(80���̻�), C(70���̻�), D(������ - 70���̸�)
		
		score = 89;
		if( score >= 90 ) {
			System.out.println( "A" );
		}
		else if( score >= 80 /*����� 2�����̸� else�� ������ �ʿ� ���� */ ) { // ù ���ǽĿ��� 90�̸����� �ɷ��� 90�̸��� ������ �߰��� �ʿ䰡 ����
			System.out.println( "B" );
		}
		else if( score >= 70 ){ // ����� 3���� ���ǽ��� 2���� �ʿ�   
			System.out.println( "C" ); //  
		}
		else {
			System.out.println( "D" );
		}
		
		

		//  switch - ���������� case�� �����Ͽ�  case�� ��ġ�ϴ� ���� ��� �ߵ��Ǵ� ���ǹ�
		
		// ������ ������ �����. ����Ű�� w, a, s, d�̰�
		// pŰ�� �Ͻ�����, oŰ�� ����ϱ�, i�� ó������ �ٽý���
		// ctrl+s�� ���ӽ����̶�� �Ѵٸ�
		/*
		  switch(Ű���尪){
		  	case 'a' :
		  	case 'w' :
		  	case 's' : 
		  	case 'd' :
		  	case 'p' : 
		  	case 'o' : 
		  	case 'i' : 
		  	case 'ctrl':
		  		switch(Ű2){
		  			case 's' : 
		  		}
		  }
		 
		
		// ���α׷��� �޴� ����
		
		// switch(menu){
		// 		case "open" :
		//		case "save" :
		//		case "build" : 
		//		case "git" :
		//		case "exit" :
		// }
	
			
		// ���ǽ� == �����ڰ� ���ȴٸ� switch�� �ۼ��ϴ°��� ����غ���.
		
		 
		*/
		
		String button = "����";
		switch(button) {
			case "����" :
				System.out.println("���� ����");
				break;
			case "�ڵ� ����" : // �Ϻη� break�� ���� �ʴ� ��쵵 ����
			case "����" :
				System.out.println("���� ����");
				break;
			case "����" :
				System.out.println("���� ����");
		}	
		
			
		
		// ���ο� ������ ���̸� Ű����� �Է��ϼ���. (������ �������)
		// ���� �Ǵ� ������ ���̰� ũ�ٸ� ���簢��
		// ���ο� ������ ���̰� ���ٸ� ���簢���̶�� ����ϼ���.
		// switch������ (  if�� ���� ���� ����)
		
		Scanner cm = new Scanner(System.in);
		int width = 0 , height = 0;
		
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		width = cm.nextInt();
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		height = cm.nextInt();
		int minus = width - height; // 10 - 5 -> 5 , 5 - 8 -> -3

		switch ( minus ) { // switch���� ()�� �� ������Ÿ�԰� ���� ������Ÿ���� case�� ������ �����Ѵ�.
			case 0 : 
				System.out.println("���簢��");
				break;
			default :
				System.out.println("���簢��");
		}
		
		// switch������ default�� �ѹ��� ��� 
		// switch�� ���� ���� case�� ��ġ�ϴ°� ���ٸ� default ����
		// �־��� case�� ��ġ�ϴ°� �ϳ��� ������ default�� �����ϰ� ���� 
		// default�� switch���� �������� �ۼ�
		
		
	}

}