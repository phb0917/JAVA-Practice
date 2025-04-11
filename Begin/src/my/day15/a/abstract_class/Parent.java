package my.day15.a.abstract_class;


// >> 추상클래서(abstract class, 미완성 클래스) 란 최소한 1개 이상의 
// 추상 매소드를 가지는 클래스는 추상클래스로 만들어야한다 
public abstract class Parent {
	
	//field 
	String id;
	String passwd;
	String name;
	//일반메서드
	boolean login(String id, String passwd) {
		if(id == null || id.isEmpty() || passwd == null || passwd.isEmpty()) {
			return false;
		}
		else {
			if(id.equals(this.id) && passwd.equals(this.passwd)){
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	
	
	//추상메서드( abstract method, 미완성매소드)는 { } 이 없는 것
	abstract String info() ;
	
}
