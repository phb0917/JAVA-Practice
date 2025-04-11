package my.day15.b.polymorphism;

public class Main {

	//>> 다형성(polymorphism) << 
	// 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입을 다루는 기술 .
	// 자식클래스로 생성되어진 객체를 부모 클래스 타입으로 받을 수 있다는 것이 다형성이다  
	
	public static void main(String[] args) {
		
	// Animal an = new Animal(); // 안됨 오류 
	//  미완성 클래스(== 추상 클래스  == abstract class)를 사용하여 객체(인스턴스)를 생성할 수 없다.!!
		
		Animal[] ani_arr = new Animal[5];
		//미완성 클래스는 스스로 객체 생성(인스턴스화)은 불가하지만
		//일반적인 자식클래스로 생성된 객체를 저장하는 용도로 사용가능하다 !!
		
	Dog dog = new Dog();
	//Animal an1 = new Dog();// 가능 >> 다형성
	//ani_arr[0] = new Dog();// 가능 >> 다형성
	dog.setName("뽀삐");
	dog.setBirth_year(2024);
	dog.setWeight(3);
	ani_arr[0] = dog;
	
	
	Cat cat = new Cat();
	   //   Animal ani2 = new Cat();  // 가능  ==> 다형성
	   //   ani_arr[1] = new Cat();   // 가능  ==> 다형성
	      cat.setName("톰");
	      cat.setBirth_year(2021);
	      cat.setColor("검정");
	      ani_arr[1] = cat;
	
	
	Duck duck = new Duck();
	   //   Animal ani3 = new Duck();  // 가능  ==> 다형성
	   //   ani_arr[2] = new Duck();   // 가능  ==> 다형성
	      duck.setName("도널드");
	      duck.setBirth_year(2023);
	      duck.setPrice(5000);
	      
	      ani_arr[2] = duck;
	      
	      //==========================================================/
	      for(int i=0; i<ani_arr.length; i++) {
	    	  if(ani_arr[i] != null) {
	    		  ani_arr[i].view_info();
	    	  }
	    	  
	      }// end for 
	      
	      /*
	        ====== 강아지 정보 =====
	        1. 성명 :뽀삐 
	        2. 생년 : 2024년
	        3. 몸무게 : 3kg
	        
	        ====== 고양이 정보 =====
	        1. 성명 : 톰 
	        2. 생년 : 2021년
	        3. 몸무게 : 검정
	        
	        ====== 오리 정보 ======
	        1. 성명 : 도널드 
	        2. 생년 : 2023년
	        3. 가격 : 5000원
	        
	        
	   
	       */
	      
	      System.out.println("\n====================================\n");
	      
	    
	      for(int i=0; i<ani_arr.length; i++) {
	    	  if(ani_arr[i] != null) {
	    		  ani_arr[i].action();
	    	  }
	      }
	      
	      for(Animal an :ani_arr) {
	    	  if(an != null) {
	    		  an.action();
	    	  }
	      }
	      /*
	        [강아지 뽀삐가 빠르게 달립니다 ]
	        [고양이 톰은 점프를 합니다] 
	        [오리 토널드는 물가에서 헤엄을 칩니다 ]
	       */
	}//end main

}
