package my.day15.a.abstract_class;

public class son extends Parent {
	
	String name;
	
	@Override
	String info() {
		return "1.아이디 : " + id + "\n" + 
				"2.비밀번호 : " + passwd + "\n" +
				"3.성명 : " + name ;
		
	}
}
