package my.day06.a.random;

import java.util.Random;

import my.util.MyUtil;

public class Main_random_1 {

	public static void main(String[] args) {
		
		// === 랜덤한 정수를 뽑아내는 첫번째 방법
        // 1. Math.random() 메소드를 사용하여 랜덤한 정수를 뽑아내기
		/*
		    java.lang.Math.random() 메소드는
		    0.0 이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는 메소드이다.
		    즉, 0.0 <= 임의의 난수(실수) < 1.0 
		*/
		double random = Math.random();
		System.out.println("random => " + random);
		/*
		    random => 0.7705881000543194
		    random => 0.24785305145541336
		    random => 0.4269497189515762 
		    random => 0.20624117150723698
		*/
		
		// === 1 부터 10까지 중 랜덤한 정수를 얻고자 한다.
		/*
		    랜덤한정수 = (int)(Math.random()*구간범위) + 시작값;
		    
		    (int)(Math.random()*(10-1+1)) + 1 ==>  (int)(0.0*(10)) + 1  ==>  0 + 1 => 1
		    (int)(Math.random()*(10-1+1)) + 1 ==>  (int)(0.7705881000543194*(10)) + 1  ==>  7 + 1 => 8           
		    (int)(Math.random()*(10-1+1)) + 1 ==>  (int)(0.24785305145541336*(10)) + 1 ==>  2 + 1 => 3
		    (int)(Math.random()*(10-1+1)) + 1 ==>  (int)(0.4269497189515762*(10)) + 1 ==>  4 + 1 => 5 
		    (int)(Math.random()*(10-1+1)) + 1 ==>  (int)(0.20624117150723698*(10)) + 1 ==>  2 + 1 => 3 
		    (int)(Math.random()*(10-1+1)) + 1 ==>  (int)(0.99999999999999999*(10)) + 1 ==>  9 + 1 => 10 
		*/
		
		// === 2 부터 5까지 중 랜덤한 정수를 얻고자 한다.
		/*
		    랜덤한정수 = (int)(Math.random()*구간범위) + 시작값;
		    
		    (int)(Math.random()*(5-2+1)) + 2 ==>  (int)(0.0*(4)) + 2  ==>  0 + 2 => 2
		    (int)(Math.random()*(5-2+1)) + 2 ==>  (int)(0.7705881000543194*(4)) + 2  ==>  3 + 2 => 5           
		    (int)(Math.random()*(5-2+1)) + 2 ==>  (int)(0.24785305145541336*(4)) + 2 ==>  0 + 2 => 2
		    (int)(Math.random()*(5-2+1)) + 2 ==>  (int)(0.4269497189515762*(4)) + 2 ==>  1 + 2 => 3 
		    (int)(Math.random()*(5-2+1)) + 2 ==>  (int)(0.20624117150723698*(4)) + 2 ==>  0 + 2 => 2 
		    (int)(Math.random()*(5-2+1)) + 2 ==>  (int)(0.99999999999999999*(4)) + 2 ==>  3 + 2 => 5 
		*/
		
		System.out.println("1 부터 10까지의 랜덤한 정수 : " + ( (int)(random*(10-1+1)) + 1 ));
		System.out.println("2 부터 5까지의 랜덤한 정수 : " + ( (int)(random*(5-2+1)) + 2 ));
		
		System.out.println("a 부터 z 까지 중 랜덤한 소문자 : " + (char) ( (int)(random*('z'-'a'+1)) + 'a' ) );
		System.out.println("A 부터 Z 까지 중 랜덤한 대문자 : " + (char) ( (int)(random*('Z'-'A'+1)) + 'A' ) );
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		// === 랜덤한 정수를 뽑아내는 두번째 방법
		// 2. Random 클래스를 사용하여 랜덤한 정수를 뽑아내기
		//    보안상 Math.random() 보다는 new Random(); 을 사용하는 것이 보안상 더 안전하다.!!!!!
		
		Random rndom = new Random();
		
		// 처음얼마부터 마지막얼마까지 랜덤한 정수
		// ==> rndom.nextInt(마지막수 - 처음수 + 1) + 처음수;
		
		System.out.println("1 부터 10까지의 랜덤한 정수 : " + (rndom.nextInt(10 - 1 + 1) + 1) );
		System.out.println("2 부터 5까지의 랜덤한 정수 : " + (rndom.nextInt(5 - 2 + 1) + 2) );
		
		System.out.println("a 부터 z 까지 중 랜덤한 소문자 : " + (char)(rndom.nextInt('z' - 'a' + 1) + 'a') );
		System.out.println("A 부터 Z 까지 중 랜덤한 대문자 : " + (char)(rndom.nextInt('Z' - 'A' + 1) + 'A') );
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("인증키 : " + MyUtil.certification_key());
		// 인증키 : tuc5409BPB
		
	}// end of main(String[] args)-----------------------------------

}




