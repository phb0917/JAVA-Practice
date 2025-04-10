package my.day15.a.abstract_class;

public class Daughter extends Parent {

	int age;
	
	@Override
	String info() {
		return "1.아이디 : " + id + "\n" + 
				"2.비밀번호 : " + passwd + "\n" +
				"3.나이 : " + age + "세";
	}
}
