package Control;

import Service.SelectDrink;

import java.util.TreeMap;

import Service.Kiosk;

public class MainControl {

	public static void main(String[] args) {

		System.out.println( "=== DW 카페 주문 키오스크 ===\n" );
		System.out.println( "=== 화면을 터치하지 마세요 ===\n" );
		
		Kiosk kiosk = new SelectDrink();
		// package가 다르면 import를 해줘야함
		
//		kiosk.action();
		
		TreeMap< Integer , String > tree = new TreeMap<>();
		// TreeMap< key타입 , value타입 > 변수명 = new TreeMap<>();
		
		tree.put( 20 , "자두" );
		tree.put( 53 , "사과" );
		tree.put( 9 , "수박" );
		tree.put( 33 , "참외" );
		tree.put( 5 , "토마토" );
		
		System.out.println( tree );
		// TreeMap은 key값으로 정렬되서 출력
		// 정렬과 검색에 사용
		
		System.out.println( tree.headMap(21) );
		// .headMap(key) - 입력한 key보다 작은 key의 값을 구함 - 미만
		System.out.println( tree.tailMap(20) );
		// .tailMap(key) - 입력한 key보다 큰 key의 값을 구함 - 이상
		System.out.println( tree.floorKey(15) );
		// .floorKey - 입력한 key와 똑같은 key값을 찾음 없으면 가장 가까운 작은값
		System.out.println( tree.floorKey(33) );
	
		System.out.println( tree.floorEntry(15) );
		// .floorEntry - 입력한 key와 똑같은 값의 key와 value 없으면 가장 가까운 작은값
	
		System.out.println( tree.subMap( 10 , 40 ) );
		// .subMap( key1 , key2 ) - key1과 key2 사이의 key값
		
		System.out.println( tree.lowerKey(25) );
		// .lowerKey(key) - 입력한 key값에 가장 가까운 작은 key값 - 미만
		
		System.out.println( tree.higherKey(40) );
		// .higherKey(key) - 입력한 key값에 가장 가까운 큰 key값 - 초과

	}

}
