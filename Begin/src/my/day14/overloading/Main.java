package my.day14.overloading;

public class Main {

	public static void main(String[] args) {
		
		Member mbr = new Member();
		
		mbr.id = "leess";
		mbr.name = "이순신";
		mbr.age = 26;
		mbr.height = 185.7;
		
		System.out.println(mbr.info());
		/*
			1.아이디 : leess
			2.성명 : 이순신
			3.나이 : 26
			4.신장 : 185.7 
		*/
		
		System.out.println(mbr.info("eomjh", "엄정화", 36, 165.8));
		/*
			1.아이디 : eomjh
			2.성명 : 엄정화
			3.나이 : 36
			4.신장 : 165.8
		*/
		

	}

}
