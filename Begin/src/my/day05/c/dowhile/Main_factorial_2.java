package my.day05.c.dowhile;

import java.util.Scanner;

// === 입사문제 === //
/*
   ▣ 알고 싶은 팩토리얼 수 입력 => 5엔터
   >> 결과 : 5! = 120 
   >> 또 할래?[Y/N] => y
   
   5! ==> 5*4*3*2*1
   7! ==> 7*6*5*4*3*2*1
   
   ▣ 알고 싶은 팩토리얼 수 입력 => 0엔터
   >> [경고] 자연수만 입력하세요!!
   
   ▣ 알고 싶은 팩토리얼 수 입력 => -5엔터
   >> [경고] 자연수만 입력하세요!!
   
   ▣ 알고 싶은 팩토리얼 수 입력 => 1.25엔터
   >> [경고] 정수만 입력하세요!!
   
   ▣ 알고 싶은 팩토리얼 수 입력 => 똘똘이엔터
   >> [경고] 정수만 입력하세요!!
   
   ▣ 알고 싶은 팩토리얼 수 입력 => 4엔터
   >> 결과 : 4! = 24
   >> 또 할래?[Y/N] => s엔터
   >> [경고] Y 또는 N 만 입력하세요!!
   >> 또 할래?[Y/N] => n엔터
   
   >>> 프로그램 종료 <<<
*/
public class Main_factorial_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		outer: 
		do { 
			try { 
		System.out.println("▣ 알고 싶은 팩토리얼 수 입력 ==>");	
		int num = Integer.parseInt(sc.nextLine());
		if(num <0) {
			System.out.println(">> [경고] 자연수만 입력하세요!!");
			continue;
			// continue 를 만나면 아래로 내려가지 않고 do ~ while 조건식으로 다시 들어간다 
		}
		long factorial = 1;
		/* for 사용해 구하기
		 		for(int i=num; i>0; i-- ) {
				factorial *= i; // factorial 은 factoral = factorial *i 와 같다 
			}*/
			
		//while 문 사용하여 구하기
		/*	int temp = num;
			while (!(temp == 0)) {
			factorial *= temp--;
			}*/
		//do while 문 사용하여 구하기
		int temp = num;
		do {
			factorial *=temp;
			
		} while (temp >0);
		
		
		
		System.out.print( ">> 결과 : " +num +"!" + "= " +" " +factorial+ "    " );
		
		do {
			System.out.println(">> 또 할래?[Y/N] =>");
			String yn = sc.nextLine();
			if ( "y".equalsIgnoreCase(yn)) break;
			else if("n".equalsIgnoreCase(yn)) break outer;
			else System.out.println(">> [경고] Y 또는 N 만 입력하세요!!");
		} while (true);
		
		
			}catch (NumberFormatException e) {
				System.out.println(">> [경고] 정수만 입력하세요!!");
			}
	        
		
		} while (true);
		
		
	sc.close();
	System.out.println("프로그램 종료");
		
		
		
 
	}//end of main

}
