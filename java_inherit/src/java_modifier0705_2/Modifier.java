package java_modifier0705_2;

public class Modifier {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setTitle( "JAVA �Ӽ�" );
		book.setAuthor( "������" );
		book.setPage( 786 );
		System.out.println( book.getTitle() );
		
		Book book2 = new Book( "JAVA,��, ������" , "�̺���" , 564 );
		System.out.println( book2 ); 
		// object�� toString�� overriding�ؼ� ������ �ߴٸ� ��½� methodȣ���� ���ص� �۵�
		
	}

}



/*
Ŭ����
	- ����, method 
	- instance , class
	- ������method
	- instance����, class����
	- overloading
	- overriding
	- ���
	- ������
	- ������
	- �߻�ȭ
	- �������̽�
	- ����class( �͸�class, ����class)
	- ������

�÷���	
	- �ڷᱸ���� �˰���
	- collection, List, Map, Set
	- ArrayList, Vector, LinkedList
	- Queue, stack, HashSet, TreeSet
	- HashMap, treeMap ���
		
���׸�
�ֳ����̼�
��Ʈ��
������ 		

-- �ڹ� �⺻ ���� �� -- 

-> JSP - ���尴ü, M(model-������)V(view)C(control)����
-> �����������ӿ�ũ - ��������Ʈ
-> MVC ���� -> ������ ���θ�����Ʈ
-> ������Ʈ(��) - team



*/
