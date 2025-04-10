package my.day14.overriding;

public class Child extends Parent{
	//메소드의 오버라이딩(overriding) == 메소드 재정의
	//메소드의 오버라이딩(overriding) 시 접근제한자는 부모클래스에서 정의해둔 메서드의 접근제한자와 같거나
	// 또는 허용이 더 큰 것을 해야한다.
	// 또한 메소드의 오버라이딩시 껍데기(리턴타입 메소드명(파라미터))는 똑같아야한다
	// 알맹이(내용물)는 새롭게 정의해서 만들면 된다 
	@Override //@ 를 애노테이션 ( 어노테이션) 이라고 부른다 
	protected String info2() {
		
		
	/*	
		return "1.아이디 : "+super.id+"\n"+ 
				"2.비밀번호 : "+this.passwd + "\n"+
				"3.성명 : "+ name + "\n"; */
		return "1.아이디 : "+id+"\n"+ 
		"2.비밀번호 : "+passwd + "\n"+
		"3.성명 : "+name + "\n";
	}

	
	
	
	
}
