package my.day15.d.Interface;

public class Circle implements Figure {
	// Circle 이라는 클래스는 figure 라는 인터페이스를 inplements(구현) 한다는 말이다 
	@Override
	public double area(double x, double y) {
		return 0;
	}

	@Override
	public double circleArea(double r) { // r : 정원의 반지름길이 
		return PI*r*r;
	}

	
}
