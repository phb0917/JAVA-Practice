package my.day15.d.Interface;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface Figure {
	
		// === 인터페이스(interface)란? === //
		// field는 final변수로만 이루어지고,
	  	// 메소드는 미완성메소드(추상메소드), default 메소드, static 메소드가 허용된다.
		// 그리고 field 및 메소드의 접근제한자는 public 이 생략 되어진 것이다.
	   	// 그리고 미완성메소드(추상메소드) 는 public abstract 가 생략 되어진 것이다.
		// field 는 public final 이 생략 되어진 것이다.
	
		// 인터페이스(interface)를 구현(implements)하는 클래스에서는 
	   // 인터페이스에 존재하는 미완성메소드(추상메소드)는 반드시 overriding(재정의)를 해야 하며,
	   // default 메소드는 overriding(재정의)를 해서 사용해도 되고, 안하고 그대로 사용해도 된다.
	
	//static 메소드는 인터페이스(interface)를 구현 하는 클래스에서 
	// overriding 을 할수 없다 
	
	
	
	
	//field ==> public final 이 생략되어져 있다 
	
	
	public double PI = 3.141592;
	// 즉 public final double PI = 3.141592; 와 같다 
	
	//method 
	//1. 미완성메소드(추상메소드) 
	double area(double x, double y) ;
	// public abstract double area(double x, double y) ; 이다
	double circleArea(double r);
	//2. default 메소드  ( jdk 8 이후 부터 가능)
	default void today() { 
	String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	System.out.println("현재시각 : " + now );
	
	}
	default double zone(double x,double y) {
		return x*y;
	}
	
	
	
	//3. static 메소드	( jdk 8 이후 부터 가능)
	
	static double volume_rectangle(double x,double y, double h) { // 직육면체 부피 
									// 가로 ,세로 ,높이 
		return x*y*h;
	}

	static double volume_ellipse(double x,double y, double h) {
		return PI*x*0.5*y*0.5*h;
	}






}


