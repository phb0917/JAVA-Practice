package my.day15.e.Interface_inheritance;

public class Main {

	public static void main(String[] args) {
		
	Me_imple me1 =new Me_imple();
	
	me1.work(); // 보람차게 일합니다 
	me1.cook();// 맛있는 요리를 합니다
	me1.play();//재미나게 놀아요 
	
	System.out.println("\n===================================\n");
	Me me2 =new Me_imple();
	
	me2.work(); // 보람차게 일합니다 
	me2.cook();// 맛있는 요리를 합니다
	me2.play();//재미나게 놀아요 
	
	System.out.println("\n===================================\n");
	Father me3 =new Me_imple();
	
	me3.work(); // 보람차게 일합니다 
	
	System.out.println("\n===================================\n");
	Mother me4 =new Me_imple();
	
	me4.cook(); // 맛있는 요리를 합니다
	
	System.out.println("=============================================");
	
	Me me5 = new Me_imple();
	
	me5.greeting();
	// ~~~~ me_imple 클래스에서 정의한 greeting 메소드 호출함()
	// @@@ me 인터페이스에서 정의한 default 매소드 greenting() 호출함
	// father 인터페이스 에서 정의 default 매소드 greeting() 호출함
	
	//매소드명이 똑같을 경우 우선순위 
	// 클래스 > 
	
	}

}
