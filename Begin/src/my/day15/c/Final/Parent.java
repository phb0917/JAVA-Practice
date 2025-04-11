package my.day15.c.Final;

public class Parent {
	//field 
	String id; 
	String name;
	
	// field 에 final 을 붙이면 더이상 새로운 값으로 할당 할수 없다 
	final double PI = 3.141592; // 상수변수
	
	
	//method
	void greeting() {
		System.out.println("~~~안녕하세요~~~");
	}
	// 매소드에 final 을 붙이면 자식클래스에서 매소드의 오버라이딩을 할수가 없다 
	final void rule() {
		System.out.println( " 가훈 :정직하게 삽시다");
	}
}
