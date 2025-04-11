package my.day15.d.Interface;

public class Main {

	public static void main(String[] args) {

	Triangle tri = new Triangle();
		Rectangle rt = new Rectangle();
		
		System.out.println("밑변 4,높이 5인 삼각형의 넓이 => " + tri.area(4, 5));
		System.out.println("가로 4,세로 5인 사각형의 넓이 => " + rt.area(4, 5));
		
		System.out.println("\n==========================================\n");
		
		//>> 다형성(polymorphism) << 
		// 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입을 다루는 기술 .
		//특정한 인터페이스로 구현된 클래스의 객체는 특정한 인터페이스의  타입으로 받을 수 있다는 것이 다형성이다  
		
		Figure fg1 = new Triangle();
		Figure fg2 = new Rectangle();
		Figure fg3 = new Circle();
		Figure fg4 = new Ellipse();
		
		
		System.out.println("밑변 4,높이 5인 삼각형의 넓이 => " + fg1.area(4, 5));
		System.out.println("가로 4,세로 5인 사각형의 넓이 => " + fg2.area(4, 5));
		System.out.println("반지름 4인 원의 넓이  => " + fg3.circleArea(4));
		System.out.println("장축이 5 ,단축이 4인 타원의 넗이 => " + fg4.area(5, 4));
		System.out.println("\n====================================================\n");
		
		
		Figure[] fgarr = new Figure[4];
		fgarr[0] = new Triangle();
		fgarr[1] = new Rectangle();
		fgarr[2] = new Circle();
		fgarr[3] = new Ellipse();
		
		
		for(Figure fg : fgarr) {
			if( fg instanceof Circle) {
				System.out.println(fg.circleArea(4));
			}
			else {
				System.out.println(fg.area(4, 5));
			}
		
			fg.today();
		}//end for
		System.out.println("\n====================================================\n");
		
		for(Figure fg : fgarr) {
			System.out.println(fg.zone(4, 4));
			fg.today();
		}//end for
		System.out.println("\n==============================================\n");
		
		System.out.println("가로 5,세로 4, 높이가 10인 삼각형의 넓이 => " + Figure.volume_rectangle(5, 4, 10));
		//가로 5,세로 4, 높이가 10인 삼각형의 넓이 => 200.0
		System.out.println("장축 5 단축 4, 높이가 10인 원기둥의 넓이 => " + Figure.volume_ellipse(5, 4, 10));
		//장축 5 단축 4, 높이가 10인 원기둥의 넓이 => 157.0796
		
		
		
		
	}//end void

}
