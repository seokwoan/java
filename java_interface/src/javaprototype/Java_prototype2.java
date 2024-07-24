package javaprototype;

import java.util.Arrays;

public class Java_prototype2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		int[] scores = { 90, 80, 70 };
		Person original = new Person( "John" , scores );
		Person clone = (Person) original.clone(); // clone�� ��ȯŸ���� ObjectŸ���̹Ƿ� ���� ����ȯ
		
		System.out.println( original.toString() );
		System.out.println( clone.toString() );
		System.out.println();
		
		
		clone.setName( "jane" );
		clone.getScores()[0] = 100; // clone�� scores 0�� �ε����� ���� 100 ����
		
		System.out.println( original.toString() );
		System.out.println( clone.toString() );
		// String Ÿ���� name�� Ŭ�и� ��ȭ�Ǿ��� scores�� 0�� �ε����� �������ΰ� Ŭ�� ��� ����
	}

}

class Person implements Cloneable{
	
	private String name;
	private int[] scores;
	
	public Person( String name, int[] scores ) {
		this.name = name;
		this.scores = scores;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person cloned = (Person) super.clone();
		cloned.scores = this.scores.clone();
		return cloned;
	}
	
	
	
	@Override
	public String toString() {
		return name + " : " + Arrays.toString(scores);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	
}
