package my.day15.d.Interface;
//Triangle 이라는 클래스는 figure 라는 인터페이스를 inplements(구현) 한다는 말이다 
public class Rectangle implements Figure {

	@Override
	public double area(double x, double y) {
		
		return x*y;
	}

	@Override
	public double circleArea(double r) {
		return 0;
	}

}
