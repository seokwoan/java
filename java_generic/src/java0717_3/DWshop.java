package java0717_3;

public class DWshop {

	public static void main(String[] args) {
		
		Electronics elec = new Electronics( "E12001" , "≥√¿Â∞Ì" , 1702000 , "ªÔº∫" );
		Clothing clt = new Clothing( "C12032" , "πŸ¡ˆ" , 30000 , "L" );
		
//		System.out.println( elec );
//		System.out.println( clt );
		
		ShoppingCart shop = new ShoppingCart();
		
		shop.addCart( elec , 1 );
		shop.addCart( clt , 1 );
		
		shop.showCart();

	}

}
