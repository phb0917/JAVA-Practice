package my.day05.a.multifor_1;

import java.util.Scanner;

/*>> 몇단볼래? => 8엔터

=== 8단 ===
8*1=8
8*2=16 
8*3=24
8*4=32
8*5=40
8*6=48
8*7=56
8*8=64
8*9=72 

>> 또 하시겠습니까?[Y/N] => y엔터 또는 Y엔터

>> 몇단볼래? => 1.34엔터 또는 똘똘이엔터
>>> 2단부터 9단까지만 가능합니다 <<<

>> 몇단볼래? => 345엔터
>>> 2단부터 9단까지만 가능합니다 <<<

>> 몇단볼래? => 3엔터

=== 3단 ===
3*1=3
3*2=6 
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
   
>> 또 하시겠습니까?[Y/N] => s엔터 또는 S엔터
>>> Y 또는 N 만 가능합니다!! <<<

>> 또 하시겠습니까?[Y/N] => n엔터 또는 N엔터

== 프로그램종료 ==   
*/   
public class Main_gugudan_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		outer:// 반복문 앞에 레이블이름표  레이블명이 지금은 outer로 정했다 
		for(; ;) {
		System.out.print(">> 몇단볼래? =>");
		/*
		  == 레이블을 사용하여 break ; 선언하기 ===
		 	레이블명 뒤에는 : 을 붙이며 반드시 반복문 앞에 써야한다.
		 
		 */
		
			try {
			int dan = Integer.parseInt(sc.nextLine());
		
			if (2 <= dan && dan<=9) {
				//해당하는 단 을 출력하기 
				System.out.println("=== "+ dan+"단 ===");
				for(int i = 1; i<=9; i++) {
					System.out.println(dan +"*" + (i) +"=" + dan*(i+1));
					}
				for ( ; ; ) {
				System.out.println(">> 또 하시겠습니까?[Y/N]");	
				String yn = sc.nextLine();
				if ( "n".equalsIgnoreCase(yn)) {//yn 값이 "n" 또는 "N" 이라면 그만하겠다 
					sc.close();
					break outer; // 그냥 break 는 가장 가까운 반복문 을 빠져나가는 것이다 
					// 반복문 중에 레이블 명이 outer 라로 선언되어진 반복문을 빠져나는 것이다 
					
				}
				else if ("y".equalsIgnoreCase(yn)) { 
					//yn의 값이 "y" 또는 "Y" 라면 
					break; // 그냥 break 는 가장 가까운 반복문 을 빠져나가는 것이다 
				}
				else {
					//yn 값이 "n" 또는 "N 또는 "y" 또는 "Y" 다른 글자인경우
					System.out.println(">>> Y 또는 N 만 가능합니다!! <<<");
				}
				}
				}
				
			
			else { 
				System.out.println("2단 부터 9단 까지만 가능합니다 ");
			}
				
			
			}catch (NumberFormatException e ) {
				System.out.println("2단 부터 9단 까지만 가능합니다 ");
			}
			
			}
			
		
		
		System.out.println("\n==프로그램 종료 ==");
	}// end main

}
