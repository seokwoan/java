package java0717_3;

public class DWshop {

	public static void main(String[] args) {
		
		Electronics elec = new Electronics( "E12001" , "�����" , 1702000 , "�Ｚ" );
		Clothing clt = new Clothing( "C12032" , "����" , 30000 , "L" );
		
//		System.out.println( elec );
//		System.out.println( clt );
		
		ShoppingCart shop = new ShoppingCart();
		
		shop.addCart( elec , 1 );
		shop.addCart( clt , 1 );
		
		shop.showCart();

	}

}
