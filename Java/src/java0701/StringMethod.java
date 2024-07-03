package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {

		// �ڹٿ��� ���ڿ��� ����Ϸ��� String Ŭ������ ����ؾ� �Ѵ�. 
		// String Ŭ������ ���������� char �⺻������Ÿ���� �迭�� �����ǵ��� �Ǿ��ִ�.
		// char Ÿ������ ������ �迭�� ���� �迭�� ������ �Ѵ�.
		// ���α׷����� ���Ǵ� �������� 70%������ ���ڿ� �������̴�.
		// ���ڿ� ���� method�� ���� �� �ݵ�� �������Ѵ�. 
		
		// ���ڿ� �����͸� �����ϴ� ���
		String word = "i like banana";
		
		// Ŭ������ ������� ������ ����������
		
		// ���ڿ� �� - ���� ���ڿ��ΰ�?
		// equals
		System.out.println( "equals : " + ( word.equals("i like orange") ) );
		
		// ���ڿ� ���� ����
		System.out.println( "contains : " + (word.contains("banana") ) );
		System.out.println( "indexOf : " + (word.indexOf("orange")) );
		
		// ���ڿ� ��ġ�� 
		System.out.println( word + " ��ġ��" );
		System.out.println( word.concat("��ġ�� ") );
		
		// Ư�� ���� �Ǵ� ���ڿ� ��ġã��
		System.out.println( word.indexOf('b') );
		System.out.println( word.lastIndexOf( 'a' ) ) ; // �ڿ��� ã��
		
		// ���ڿ����� ���� ���� ����
		System.out.println( word.charAt(5) );
		// word.charAt( index )
		// �ڹٿ��� ���ڸ� �Է¹޴� method�� ����
		// ���ڿ��� �Է¹پ� charAt�� ���ϴ� ���ڸ� ������
		
		Scanner sc = new Scanner(System.in);
		
		// Ű����� ���� �Է� �ޱ�
		System.out.print( "���ĺ� �ϳ� �Է� : " );
		char alp = sc.nextLine().charAt(0);
		// nextLine���� �Է¹ް� charAt(0)���� �Է��� ���ڸ� ������ ������ ���ڴ� charŸ������ ����
		System.out.println( "�Է��� ���� : " + alp );
		
		// �����ڵ��߿��� �⺻ �����ڵ�� �ƽ�Ű�ڵ��̴�.
		// �ƽ�Ű�ڵ�ǥ�� �� 128�� ���� 
		// �ƽ�Ű�ڵ忡�� 65�� �빮�� A, 97�� �ҹ��� a
		// ��� �ƴ� ���ڴ� �����ڵ�ǥ�� ��� 
		char ch = '��'; // 10���� ���ڸ� ������ �����ڵ�ǥ�� ���ؼ� ���ڷ� �����
		System.out.println( ch+4 );
		
		
		// ���ڿ��� ����
		System.out.println( "���ڿ� ���ڼ� : " + word.length() ); 
		// string class�� length�� method�̹Ƿ� length() �� ����Ѵ�
		
		// �빮�� �ҹ��� ��ȯ
		String �빮�� = word.toUpperCase();
		String �ҹ��� = word.toLowerCase();
		
		System.out.println( �빮�� );
		System.out.println( �ҹ��� );
		
		// ���� ����
		String word2 = "  i hate java ";
		// �հ� ���� ������ ������ �� ���� ���ڿ� ��� ������ ���� �Ұ�
		System.out.println( word2 );
		System.out.println( word2.trim() );
		
		
		// �� method�� ���� ���� ���Ǵ� �͵�
		// equals(������ġ) , contains 
		
		// ���ڿ� ����
		
		System.out.println( Arrays.toString(word.split(" ") ) );
		//  split(" ") -> ������ �������� ���ڿ��� ������ �迭�� ����
		// 0�� index - i , 1�� index - like , 2�� index - banana
//		String name = "�̼���@������@������@";
		
//		String[] names = name.split("@");
//		System.out.println( Arrays.toString(names) );
//		System.out.println( names[1] );
		
		// ���ڿ� �ڸ���(����)
		System.out.println( word.substring(2) );
		System.out.println( word.substring(6) );
		// word.substring(index) -> index���� ������ index���� ǥ��
		System.out.println( word.substring( 2 , 6 ) );
		// word.substring( ����index , ����index ) -> ����index���� ����index ������ ǥ��
		// ���� index�� 6�̸� 5�� index������ ǥ��
		
		
		// ���ڿ� ��ȯ
		String �ǻǻ� = "�ƺ��� ����� �� �ǻǻ� ������ �Ⱦ��൵ �ǻǻ� ������ �ݰ��ٰ� �ǻǻ�";
		
		String ���� = �ǻǻ�.replace( "�ǻǻ�" , "�׻׻�" );
		// replace( �ٲ� �ؽ�Ʈ , �ٲ�� �ؽ�Ʈ ); �ٲ� �ؽ�Ʈ ���θ� �ٲ���
		System.out.println( ���� );
		
		���� = ����.replaceAll( "�׻׻�" , "�ѿ��" );
		// replaceAll( �ٲ� �ؽ�Ʈ , �ٲ�� �ؽ�Ʈ ); �ٲ� �ؽ�Ʈ ���θ� �ٲ���
		System.out.println( ���� );
		
		// replace, replaceAll�� ����� ���̰� ����.
		
		// replaceAll������ ����ǥ���� ��밡��
		
		/*
		 ����ǥ���� 
		 ^ - ���ڿ��� ����
		 $ - ���ڿ��� ����
		 . - ������ �ѹ���
		 * - �� ���ڰ� �־ ���ų� ( *�� -> ���� ������ �ܾ� )
		 + - �� ���ڰ� �ϳ� �̻�
		 ? - �� ���ڰ� ���ų� �ϳ� ����
		 [] - ������ �����̳� ������ ��Ÿ��
		 {} - Ƚ�� �Ǵ� ����
		 () - �Ұ�ȣ�� ���ڸ� �ϳ��� ���ڷ� �ν�
		 | - ���� �ȿ��� or ���� ����
		 \s - ���鹮��
		 \S - ���鹮�ڰ� �ƴ� ������ ����
		 \w - ���ĺ��̳� ����
		 \W - ���ĺ��̳� ���ڸ� ������ ����
		 \d - ����
		 \D - ���ڸ� ������ ��� ����  
		 
		 ���ڿ����� ���ڸ� ���� -> replace( "[0-9]" , "" );
		 ����ó - ^010-\d{4}-\d{4}$
		       ���ڿ� ���� 010 - \d(����){�ڸ���} - \d(����){�ڸ���}
		 �ѱ۸� �ۼ� Ȯ�� - ^[��-�H]
		 
		 */
		
		String a = "abc73jd82kd74j";
		System.out.println( a.replaceAll( "[\\D]" , "" ) );
		// ���ڿ����� Ư�����ڸ� ����Ϸ��� \�� ����ؾ��� ����ǥ���Ŀ��� \*�� ����Ϸ���
		// \�� ����ϰ� "[\\*]"���� �Է��ؾ� ��� ����
		
		//Integer.parseInt
		
		String str = "�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�.";
		String name;
		int age;
		
		name = str.substring( str.indexOf("[")+1 , str.indexOf("]") );
		String temp = str.substring( str.lastIndexOf("[")+1 , str.lastIndexOf("]") );
		age = Integer.parseInt(temp);

		System.out.println( name );
		System.out.println( age );

		
	}

}
