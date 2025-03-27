package my.day04.b.For_quiz;

import java.util.Scanner;

//▣ 첫번째 정수 : 1
//▣ 두번째 정수 : 10

//>> 결과 <<
//1 부터 10 까지의 홀수의 합 : 25
//1 부터 10 까지의 짝수의 합 : 30

//-----------------------------------

//▣ 첫번째 정수 : 2
//▣ 두번째 정수 : 10

//>> 결과 <<
//2 부터 10 까지의 홀수의 합 : 24
//2 부터 10 까지의 짝수의 합 : 30


//▣ 첫번째 정수 : 2.3453
//[경고] 올바른 정수를 입력하세요!!

//▣ 첫번째 정수 : 1
//▣ 두번째 정수 : 똘똘이
//[경고] 올바른 정수를 입력하세요!!

//▣ 첫번째 정수 : 1
//▣ 두번째 정수 : 10
//>> 결과 <<
//1 부터 10 까지의 홀수의 합 : 25
//1 부터 10 까지의 짝수의 합 : 30
public class Main_quiz_3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		String str_input = sc.nextLine();
		
	
		
		
		int first_no = 0;
		int second_no = 0;
		
			for( ;; ) {
				try {
		System.out.print("▣ 첫번째 정수 :");
		first_no = Integer.parseInt(str_input);
		break;
			}catch (NumberFormatException e) { 
			System.out.println("[경고] 올바른 정수를 입력하세요!!");
		
		}
		
	
			}
	
		
				for( ;; ) {
					try {
			System.out.print("▣ 첫번째 정수 :");
			second_no = Integer.parseInt(str_input);
			break;
				}catch (NumberFormatException e) { 
				System.out.println("[경고] 올바른 정수를 입력하세요!!");
				}
				}	
				int sum_holsu = 0, sum_jjaksu = 0;
				// 홀수 누적의 합계를 저장하는 변수
				// 짝수 누적의 합계를 저장하는 변수
				int holsu = 0, jjaksu = 0 ; // 2씩 증가하는 초기치
				
				
				
				if( first_no%2 != 0 ) { // 첫번째 입력받은 값이 홀수 이라면 
					holsu = first_no; 
					jjaksu = first_no+1;
				}
				else { //첫번째 입력받은 값이 짝수 이라면 
					holsu = first_no+1;
					jjaksu = first_no;
				}
				// == 홀수 및 짝수의 합을 구한다 .
				for( ;; ) { 
					if(holsu <= second_no) {
					sum_holsu += holsu;// 1부터 11까지
					}					   // 2부터 10까지
					// 1 + 3 + 5 + 7 + 9 + 11
					if(jjaksu <= second_no) {
					sum_jjaksu += jjaksu;//1부터 11까지 
					}					 //2부터 10까지
					// 2 + 4 + 6 + 8 + 10 + 12
					
					holsu += 2; // 3 5 7 9 11
					jjaksu += 2; // 4 6 8 10 12
					
					if(holsu > second_no && jjaksu > second_no ) {
						break;
					}
					
							
				}
				
				System.out.println("\n >> 결과 <<");
				System.out.println( first_no+" 부터 " +second_no+ "까지의 홀수의 합:"+sum_holsu+ "\n" +
									+ first_no+" 부터 " +second_no+ "까지의 홀수의 합:" +sum_jjaksu);
		sc.close();
			
		System.out.println("프로그램 종료");
	}
	

}
