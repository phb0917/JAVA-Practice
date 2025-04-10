package my.day15.a.abstract_class;


// >> 추상클래서(abstract class, 미완성 클래스) 란 최소한 1개 이상의 
// 추상 매소드를 가지는 클래스를 말한다 
public abstract class Parent {
	
	String id;
	String passwd;
	
	
	//추상메서드( abstract method, 미완성매소드)는 { } 이 없는 것
	abstract String info() ;
	
}
