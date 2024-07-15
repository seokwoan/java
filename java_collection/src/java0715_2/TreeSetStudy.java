package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {

		TreeSet<Integer> tree= new TreeSet<>();
		tree.add( 34 );
		tree.add( 45 );
		tree.add( 20 ); 
		tree.add( 9 );
		tree.add( 40 );
		tree.add( 15 );
		tree.add( 48 );
		tree.add( 2 );
		tree.add( 11 );
		tree.add( 39 );
		tree.add( 40 );
		
		System.out.println( tree );
		// 순차적으로 저장되지 않고 오름차순으로 정렬되어 출력됨
		// root -> 가장 처음 저장되는 데이터는 무조건 root에 들어감
		// root에 들어간 데이터를 가지고 저장할 곳을 정함 -> 큰값은 오른쪽, 작은값은 왼쪽으로 붙임
		// 45는 34보다 크니까 오른쪽으로 들어감
		
		System.out.println( tree.first() );
		// HashSet과 마찬가지로 get() method로 데이터를 하나씩 불러올 수 없다.
		// .first() -> 정렬한 값중 첫번째 값이 나옴
		System.out.println( tree.last() );
		// .last() -> 정렬한 값중 마지막 값이 나옴
		
		System.out.println( tree.higher( 20 ) );
		// 입력값보다 큰 수중 가장 가까운수 
		
		System.out.println( tree.lower( 19 ) );
		// 입력값보다 작은 수중 가장 가까운수
		
		System.out.println( tree.headSet(35) );
		// 입력값보다 작은 모든 값을 가져옴
		
		System.out.println( tree.tailSet(30) );
		// 입력값보다 큰 모든 값을 가져옴
		
		System.out.println( tree.subSet( 9 , 39) );
		// 두개의 입력값 사이의 값을 가져옴 -> 앞의 숫자는 포함, 뒤의 숫자는 미포함
		// 9는 가져오고 39는 못가져옴
		
		
		
		
		// 문자열일 경우
		TreeSet<String> word = new TreeSet<>();
		word.add( "이순신" );
		word.add( "문익점" );
		word.add( "장보고" );
		word.add( "김유신" );
		word.add( "정도전" );
		word.add( "박팽년" );
		word.add( "성상문" );
		word.add( "마골피" );
		word.add( "나훈아" );
		
		System.out.println( word );
		
		System.out.println( word.higher( "아" ) );
		// 사전적 순서에의해 출력
		
		System.out.println( word.headSet( "라면" ) );
		
		System.out.println( word.subSet( "나" , "자" ) );
		
		System.out.println( word.subSet( "ㄴ" , "ㅈ" ) );
		// 자음만으로는 한글 검색이 불가 데이터 값을 가져오지 못함
		
		
		// 90점 이상 - 상위 10%, 70점 이상 - 상위 30%
		// 40점 이상 - 상위 80%
		
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); 
		rank.add(70);
		rank.add(40);
		
		// 나의 점수를 입력하여 상위 몇프로인지 출력
		
		System.out.println( "점수를 입력하세요 : " );
		Integer my = sc.nextInt();
		sc.nextLine();
		
//		if( rank.higher(my) == null ) {
//			System.out.println( "상위 10%" );
//		}
//		else if( rank.higher(my) == 90 ) {
//			System.out.println( "상위 30%" );
//		}
//		else if( rank.higher(my) == 70 ){
//			System.out.println( "상위 80%" );
//		}
		
		
		switch( rank.lower(my+1) ) {
			case 90 :
				System.out.println( "상위 10%" );
				break;
			case 70 : 
				System.out.println( "상위 30%" );
				break;
			case 40 : 
				System.out.println( "상위 80%" );
		}
		
		
		
		
		
		
		
		// 내 점수를 입력하고 나보다 점수가 높은 사람들 출력
		
		TreeSet<String> score = new TreeSet<>();
		
		score.add( "89점 이순신" );
		score.add( "67점 김유신" );
		score.add( "45점 문익점" );
		score.add( "98점 한석봉" );
		score.add( "72점 박문수" );
		score.add( "81점 김춘추" );
		score.add( "59점 이성계" );
		score.add( "32점 정약용" );
		
		System.out.println( "점수를 입력하세요 : " );
		String myScore = sc.nextLine();
		
		
		
		System.out.println( score.tailSet( myScore) );
		
	
	}	

}

/*
	Tree 구조를 이용하여 값을 저장시키는 TreeSet
	LinkedList처럼 주소를 가지고 값을 이어줌
	자바에서 사용되는 tree구조는 이진 tree구조 - 하위 node를 최대 2개를 가짐
	부모 - 형제 - 자식으로 표현되는 tree구조를 가지는 언어도 있음
		- 데이터를 순차적으로 저장하지 않음
		- 중복 허용하지 않음
		- 이진트리를 사용하기 때문에 데이터가 정렬되어 출력된다.
		- 범위검색 또는 데이터 중복방지 및 정렬에 용이하다.
		
	

*/