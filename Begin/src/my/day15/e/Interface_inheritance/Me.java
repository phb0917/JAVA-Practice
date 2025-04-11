package my.day15.e.Interface_inheritance;

public interface Me extends Father,Mother{
		// 자바는 인터페이스가 여러 인터페이스를 다중 상속 할수 있다 
	void play();
	
	default void greeting() {
		System.out.println(">> me 인테페이스에서 정의한 default 메소드 greeting() 호출함 ");
	
	
	
	
	
	}
}
