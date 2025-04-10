package my.day14.overloading;

public class Member {

	// field
	String id;
	String name;
	int age;
	double height;
	
	// method
	String info() {
		return "1.아이디 : " + id + "\n" +
			   "2.성명 : " + name + "\n" +
			   "3.나이 : " + age + "\n" +
			   "4.신장 : " + height + "\n";
	}
	
	
	// === 메서드의 오버로딩(overloading) === //
	// ==> 메서드의 이름은 같지만 파라미터가 다르면 동일한 메서드로 취급하지 않는다.
	// ==> 접근제한자 및 리턴타입은 메서드의 오버로딩(overloading)에 관여하지 않는다.
	String info(String id, String name, int age, double height) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		
		return info();
	}
	
	String info(int age, double height, String id, String name) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		
		return info();
	}
	
	
	String info(String id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
				
		return info();
	}
	
	
	// === 생성자의 오버로딩(overloading) === //
	public Member() {
		
	}
	
	Member(String id) {
		this.id = id;
	}


	public Member(String id, String name, int age, double height) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	protected Member(int age, String name, String id, double height) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
}


