package java0717_4;

import java.util.ArrayList;
import java.util.Date;

@FunctionalInterface
interface moveable{ 
	public void move();
	// method�� �ϳ��� ���� interface�� �Լ��� interface����� 
}


class A<T>{
	
	T item;
	
	@SafeVarargs
	final void get( T... add ) { // �������� -> �迭ó�� ���� �ٲ�� �ִ� ����
		// T... -> T �迭�� ũ�Ⱑ �������� �ʾ� �����Ϸ���� ���� 
	}
}


public class AnnotationStudy {
	
	@Deprecated
	static void aaa() {
		
	}

	public static void main(String[] args) {

		aaa();
		
		
		Date today = new Date();
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList();
		
//		@suppressWarnings("unused")
		today.getYear();
		

	}

}


/*
	�����ڸ� ���� �޸� - �ּ�
	
	annotation
		- �ּ��� ���� �ǹ̸� ����
		- ��ǻ�Ϳ��� �˷��ش�
		- annotation�� ���� �ʾƵ� ������ 
		- annotation�� �������� ��ǻ�Ͱ� �ش� annotation�� ������ �˾������� ������ �ð��� �������ش�
		  
		- Ư�� �ڵ���� ��ǻ�Ϳ��� ��������
		- ǥ�� , ��Ÿ , ����� annotation�� �ִ�
		
		- ǥ�� annotation
		
			@Override
				- �����Ϸ����� method�� Overriding �ϴ°��̶�� �˷���
			
			@Deprecated
				- ������ ������� ���� ����̶�� �˷���
			
			
			@SuppressWarnings("text")
				- �����Ϸ� ��� ������� �ʰ� �ϵ��� ���� ( ����� )
				- ("all") ��� ��� ����
				- ("deprecation") ������� �ʴ� ��� ��� ����
				- ("null") null�� ���õ� ��� ����
				- ("unchecked") ��Ȯ�� ���۷��̼� ��� ����
				- ("unused") ��������ʴ� �ڵ� �Ǵ� ���ʿ��� �ڵ忡 ���� ��� ����
			
			@FunctionalInterface
				- �Լ��� interface��°��� �˷���
				
			@SafeVaragrs
				- ���׸��� ���� ���������� �Ű������� ����Ҷ� ��� ��Ÿ���� �ʱ�
				
		- ��Ÿ annotation
		
			@Target
				- annotation�� �����Ҷ� ������ ��� ����
				  �Ʒ��� annotation�� ���� ���
			
			@Document
				- javadoc���� �ۼ��� ������ ����
			
			@Inherited
				- ����class���� ��ӵǵ��� �Ҷ� ���
			
			@Retention
				- annotation �Ⱓ ����
			
			@Repeatabls
				- annotation �ݺ� ����

*/


















