package my.day15.d.Interface;

import java.util.Date;

public class Triangle implements Figure{
// Triangle 이라는 클래스는 figure 라는 인터페이스를 inplements(구현) 한다는 말이다 
	@Override
	public double area(double x, double y) {
		
		return x*y*0.5;
	}

	@Override
	public double circleArea(double r) {
		return 0;
	}

	@Override
	public void today() {
		Date now = new Date(); // 현재시각 
		System.out.println("[현재시각] :" + String.format("%tF %tp %tT %tp %tZ", now,now,now,now,now));
	}

	
	
	
	
	
	
	
	
	
}
