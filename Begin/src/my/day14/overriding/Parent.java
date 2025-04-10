package my.day14.overriding;

public class Parent {
	/*
    ---------------------------------------------------------------------------------------------------------------------------
	접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스       그외의영역  
	--------------------------------------------------------------------------------------------------------------------------- 
	public                                    O                    O                         O                        O  
	protected                                 O                    O                         O                        X
	없음(default)                              O                    O                         X                        X
	private                                   O                    X                         X                        X
*/
	
	
	//field 
	String id; 
	String passwd;
	String name; 
	
	//method
	protected String info1() {
		return id+" , "+ passwd;
	}
	protected String info2() {
		return "아이디 : " +id+" , 비밀번호 :  "+ passwd + " , 성명 : " + name ;
	}
	
}
