package my.day15.b.polymorphism;

import java.text.DecimalFormat;

public class Duck extends Animal {
	// Duck 만 가지는 field 를 정의 (추상화)
	private int price;

	
	// Duck 만 가지는 method 를 정의 (추상화)
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price > 0 ) {
		this.price = price;
		}
	}
	// 매소드의 오버라이딩(매서드의 재정의) 
	@Override
	protected void view_info() {
		System.out.println("==== 오리 정보 =====\n"
				+ "1. 성명 : " + super.getName()  + "\n"
				+ "2. 생년 : " + super.getBirth_year() + "년\n"
				+ "3. 가격 : " +new DecimalFormat("#,###").format(price) + "원\n" );
		
	}
	@Override
	protected void action() {
		System.out.println("오리 " + super.getName() + "는 물가에서 헤엄을 칩니다 ");
	}
}
