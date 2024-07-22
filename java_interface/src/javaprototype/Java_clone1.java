package javaprototype;

import java.util.ArrayList;
import java.util.List;

public class Java_clone1 {

	public static void main(String[] args) {
		
		Employees emps = new Employees();
		emps.loadData();
		
		Employees emp1 = (Employees) emps.clone();
		Employees emp2 = (Employees) emps.clone();
		
		List<String> list1 = emp1.getEmpList();
		list1.add( "John" );
		List<String> list2 = emp2.getEmpList();
		list2.remove( "Pankaj" );
		
		System.out.println( emps.getEmpList() );
		System.out.println( list1 );
		System.out.println( list2 );
	}
	

}

class Employees implements Cloneable{
	private List<String> empList;
	
	public Employees() {
		empList = new ArrayList<String>();
	}
	
	public Employees( List<String> list ) {
		this.empList = list;
	}
	
	public void loadData() {
		empList.add( "Pankaj" );
		empList.add( "Raj" );
		empList.add( "David" );
		empList.add( "Lisa" );
	}
	
	public List<String> getEmpList(){
		return empList;
	}
	
	@Override
	public Object clone() {
		List<String> temp = new ArrayList<String>();
		for( String e : this.empList ) {
			temp.add(e);
		}
		
		return new Employees( temp );
	}
	
	
}


