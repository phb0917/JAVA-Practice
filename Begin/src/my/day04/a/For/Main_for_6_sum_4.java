package my.day04.a.For;

import java.util.Scanner;

/*
>> 누적해야할 시작 숫자 => 1
>> 누적해야할 마지막 숫자 => 10
[실행결과] 1+2+3+4+5+6+7+8+9+10=55 

>> 누적해야할 시작 숫자 => 3
>> 누적해야할 마지막 숫자 => 5
[실행결과] 3+4+5=12

>> 누적해야할 시작 숫자 => 똘똘이
[경고] 올바른 정수만 입력하세요!!
>> 누적해야할 시작 숫자 => 3
>> 누적해야할 마지막 숫자 => 345234543643643543
[경고] 올바른 정수만 입력하세요!!
>> 누적해야할 마지막 숫자 => 6
 [실행결과] 3+4+5+6=18
*/
public class Main_for_6_sum_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int start_no = 0;
		int end_no  = 0;
		for ( ;; ) {
			try {
			System.out.print(">> 누적해야할 숫자 : ");
			start_no = Integer.parseInt(sc.nextLine()); 
		
			
			
		break;
			} catch (NumberFormatException e) {
				System.out.println("[경고] 올바른 점수만 입력하세요");
			}
		}//end of for
		
		for(;;) { 
			try { 
			System.out.print(">> 누적해야할 마지막 숫자 : ");
			end_no = Integer.parseInt(sc.nextLine()); 
			if (start_no >= end_no) {
				System.out.println("[경고] 마지막값은 시작값보다 커야합니다");
			}
			else {
				break;
			}
		break;	
			}catch (NumberFormatException e) {
				System.out.println("[경고] 올바른 점수만 입력하세요");
			}
		}//end of for
		// == start_no 부터 end_no  까지 1씩 증가된 누적의 합 구하기 
		
		int sum = 0; // 누적의 합계 
		String str = ""; // 누적되어지는 문자열
		int cnt = end_no - start_no +1; // 반복의 횟수
		for(int i=0, j=start_no; i<cnt; i++,j++) {
			/*if(i< cnt-1 ) {
				str += j+"+";
			}
			else {
				str += j+"=";
			}
			*///또는
			String temp = (i<cnt-1)?"+":"=";
			str += j+temp;
			sum += j ;
			
			
		}
		System.out.println("[실행결과]" + str + sum);
		
sc.close();
System.out.println("\n =====프로그램 종료 ====");
	}//end of main(String[] args)

}
