package my.day15.e.Interface_inheritance;

public class Me_imple implements Me {

	@Override
	public void work() {
		System.out.println("보람차게 일합니다 ");
		
	}

	@Override
	public void cook() {
		
		System.out.println("맛있는 요리를 합니다");
	}

	@Override
	public void play() {
		
		System.out.println("재미나게 놀아요 ");
	}
	public void greeting() { 
		System.out.println("~~~~ me_imple 클래스에서 정의한 greeting() 메소드 호출함");
	}
	
	
	
}
