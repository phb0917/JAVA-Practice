package my.day14.overriding;

public class Main {

	public static void main(String[] args) {
		
	Child child =new Child();
	
	child.id ="leess";
	child.passwd = "Qwer1234$";
	child.name = "이순신";
	System.out.println(child.info1());
	// leess , Qwer1234$
	
	System.out.println("=========================================");
	System.out.println(child.info2());
	//아이디 : leess , 비밀번호 :  Qwer1234$ , 성명 : 이순신
	
	//1.아이디 : leess 
	//2.비밀번호 : Qwer1234$
	//3.성명 : 이순신 
	
	
	System.out.println("=========================================");
	Parent parent=new Parent();
	
	parent.id ="leess";
	parent.passwd = "Qwer1234$";
	parent.name = "이순신";
	
	
	System.out.println(parent.info2());
	
	}
	

}
