package my.day15.a.abstract_class;

public class Main {

	public static void main(String[] args) {
		
	//	Parent parent =  new Parent();
		// 추상클래스는 객체로 생성할 수없다 
		son son =new son();
		son.id = "son";
		son.passwd ="Qwer1234$";
		son.name = "아들";
		
		System.out.println(son.info());// 오버라이딩 하지않으면 고유 변수인 네임이 나오지 않는다 
		
		
		System.out.println("==========================\n");
		Daughter daughter = new Daughter();
		daughter.id = "daughter";
		daughter.passwd = "Abcd0070$";
		daughter.age = 25;
		
		System.out.println(daughter.info());	// 오버라이딩 하지않으면 고유 변수인 네임이 나오지 않는다 
		
	}

}
