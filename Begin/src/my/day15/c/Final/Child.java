package my.day15.c.Final;

public class Child extends Parent{

	@Override
	void greeting() {
		System.out.println( " hi hello");
		
	}
	
	// final 매소드는 매소드오버라이딩을 할수없으므로 오류가 난다  
	/*@Override
	void rule() {
		System.out.println( " 가훈 : 즐겁게 살자");
	}*/
	
	
}
