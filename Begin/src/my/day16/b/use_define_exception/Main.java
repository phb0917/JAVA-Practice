package my.day16.b.use_define_exception;

public class Main {

	public static void main(String[] args) {
		
		Product p1 = new Product("새우깡", 100);
		p1.setProd_name("새우깡");
		p1.setJango(100);
		
		Product p2 = new Product("감자깡", 50);
		Product p3 = new Product("양파링", 150);
		
		Product[] prod_arr = new Product[3];
		prod_arr[0] = p1;
		prod_arr[1] = p2;
		prod_arr[2] = p3;
		
		for(Product prod : prod_arr) {
			System.out.println(prod);
			//System.out.println(prod.toString());
			
		}//end for
	/*my.day16.use_define_exception.Product@3ac42916
		my.day16.use_define_exception.Product@47d384ee
		my.day16.use_define_exception.Product@2d6a9952 
		to string 를 오라라이드 안했을 경우
		1.제품명 : 새우깡
		2.잔고량 : 100개
		
		1.제품명 : 감자깡
		2.잔고량 : 50개
		
		1.제품명 : 양파링
		2.잔고량 : 150개  한경우 */

	
	System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	
	try {
		prod_arr[0].order(80);
	} catch (Jango_lack_Exception e) {
		
		e.printStackTrace();
	}
	System.out.println("\n=========================================\n");
	try {
		prod_arr[0].order(40);
	} catch (Jango_lack_Exception e) {
		
		//e.printStackTrace();
		System.out.println("예외메세지 :" +e.getMessage());
		
		//예외메세지 :>> 잔고량이 주문량 보다 적으므로 주문이 불가합니다 <<
	}
	
	try {
		prod_arr[2].jumun(200);
	} catch (Jango_lack_Exception e) {
		
		//e.printStackTrace();
		System.out.println("예외메세지 :" +e.getMessage());
	}
	
	
	
	}

}
