package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library { // ������class�� ������ ��ü�� ���� ������ �ϹǷ� ���׸� ���ϵ�ī�� ���
	
	private List<Rental<? extends Media>> list = new ArrayList<>(); 
	// List< classŸ��<T> > - class�� ���׸�Ÿ���� ������ T�� ��� ����
	// class�� ���׸�Ÿ���� ���ٸ� <?> ���ϵ� ī�带 �̿��� ǥ��
	
	public <T extends Media> void addRental( T item , String renter) {
		// class�� ���׸������� ���� �ʰ� method���� ����� �� �ִ� ���׸� 
		Rental<T> rental = new Rental<>( item , renter );
		list.add( rental );
		System.out.println( "�뿩 -> " + rental );
	}
	
	public void showRentalList() {
		for( Rental<? extends Media> r : list ) {
			System.out.println( r );
		}
	}
	
}
