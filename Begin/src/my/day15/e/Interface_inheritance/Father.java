package my.day15.e.Interface_inheritance;

public interface Father {

	
	void work();
	
	
	
	default void greeting() {
		System.out.println(">> Father 인테페이스에서 정의한 default 메소드 greeting() 호출함 ");
	}
}
