package my.day16.b.use_define_exception;

public class Product {
//public class Product extends object { 와 같은 것이다 
	// 모든 클래스의 최상위 부모 클래슨느 object 이며, 클래스 생성시 extends 를 하지 앟으면 자동적으로 extends object 가 생략된것이다 
	
	//field 
	private String prod_name;	// 제품명("새우깡","감자깡","양파링")
	private int jango; // 잔고 (100,50,150)
	
	
	// 기본 constructor
	//public product() {} 
	
	
	
	//파라미터가 있는 constructor
	public Product(String prod_name, int jango) {
		this.prod_name = prod_name;
		this.jango = jango;
	}
	 
	//method
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getJango() {
		return jango;
	}
	public void setJango(int jango) {
		this.jango = jango;
	}
	
	//제품의 정보를 보여주기 
	@Override
	public String toString() {
		return "1.제품명 : " + prod_name + "\n"
				+"2.잔고량 : " + jango + "개\n";
	}
	
	//주문받기 1
	
	public void order(int jumun_su) throws Jango_lack_Exception{
		// order(int jumun_su) 메소드는 파라미터로 들어오는 jumun_su 의 값에 따라서 
		// 사용자(개발자)가 만든 Jango_lack_Exception 익셉션을 유발 할 수 있다는 말이다.
		
		if(jango < jumun_su) {
		  throw	new Jango_lack_Exception();
		}
		else {
			System.out.println(prod_name + " 제품을 " + jumun_su + "개를 주문하셨습니다 ");
			jango -= jumun_su;
			System.out.println(toString());
			
		}
		
		
	
	}//end void 
	
	//주문받기 2
	
		public void jumun(int jumun_su) throws Jango_lack_Exception{
			// jumun(int jumun_su) 메소드는 파라미터로 들어오는 jumun_su 의 값에 따라서 
			// 사용자(개발자)가 만든 Jango_lack_Exception 익셉션을 유발 할 수 있다는 말이다.
			
			if(jango < jumun_su) {
			  throw	new Jango_lack_Exception(prod_name + "은 잔고량이 " + jango +"인데 " + jumun_su +"개 라서 잔고 부족으로 주문이 불가합니다 ");
			}
			else {
				System.out.println(prod_name + " 제품을 " + jumun_su + "개를 주문하셨습니다 ");
				jango -= jumun_su;
				System.out.println(toString());
				
			}
			
			
		
		}//end void 
}
