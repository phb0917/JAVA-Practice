package my.day15.a.abstract_class;

public class Daughter extends Parent {

	int age;
	// 부모클래스인 parent 클래스에 추상메소드 (미완성메소드) 를 반드시 재정의(오버라이딩) 해야한다 
	@Override
	String info() {
		return "1.아이디 : " + id + "\n" + 
				"2.비밀번호 : " + passwd + "\n" +
				"3.성명 : " + name +"\n"
				+ "4.나이 : " + age;
		
	}
	}

