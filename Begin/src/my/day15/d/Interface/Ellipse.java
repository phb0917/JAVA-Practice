package my.day15.d.Interface;

public class Ellipse implements Figure {
	// Ellipse 이라는 클래스는 figure 라는 인터페이스를 inplements(구현) 한다는 말이다 
	@Override
	public double area(double x, double y) { // x : 장축의 길이 , y: 단축의 길이 
		// 타원의 면적 => PI*장축*(0.5)*단축*(0.5)
		
		return PI*x*0.5*y*0.5;
	}

	@Override
	public double circleArea(double r) {
		return 0;
	}

}
