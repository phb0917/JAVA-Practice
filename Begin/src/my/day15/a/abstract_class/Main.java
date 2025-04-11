package my.day15.a.abstract_class;

import my.util.MyUtil;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
	//	Parent parent =  new Parent();
		// 추상클래스는 객체로 생성할 수없다 
		son son =new son();
		son.id = "son";
		son.passwd ="Qwer1234$";
		son.name = "아들";
		son.address = "서울시 강남구";
		
		/*
		 	1.아이디 : son
			2.비밀번호 : Qwer1234$
			3.성명 : 아들
			4.주소 : 서울시 강남구
		 */
		
		System.out.println(son.info());// 오버라이딩 하지않으면 고유 변수인 네임이 나오지 않는다 
		
		
		System.out.println("==========================\n");
		Daughter daughter = new Daughter();
		daughter.id = "daughter";
		daughter.passwd = "Abcd0070$";
		daughter.name = "딸";
		daughter.age = 25;
		
		/*
		 
			1.아이디 : daughter
			2.비밀번호 : Abcd0070$
			3.성명 : 딸
			4.나이 : 25
		 */
		
		System.out.println(daughter.info());	// 오버라이딩 하지않으면 고유 변수인 네임이 나오지 않는다 
		
		
		System.out.println("\n===============================\n");
		
		if(son.login("son", "Qwer1234$")){
			System.out.println(">> " + son.name + "님 로그인 성공 <<");
			
		}
		else {
			System.out.println(">> 로그인 실패 << ");
		}
	
	
	
	
		if(son.login("daughter", "abcd1234$")){
			System.out.println(">> " + daughter.name + "님 로그인 성공 <<");
			
		}
		else {
			System.out.println(">> 로그인 실패 << ");
		}
	
	
	}
	
	

}
