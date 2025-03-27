package my.day04.a.For;

import java.util.Scanner;

/*
== 5개의 홀수를 입력하세요 ==
>> 1번째 정수 입력 : 11
>> 2번째 정수 입력 : 21
>> 3번째 정수 입력 : 5
>> 4번째 정수 입력 : 15
>> 5번째 정수 입력 : 31
== 입력한 5개 정수의 합계는 83 입니다.


== 5개의 정수를 입력하세요 ==
>> 1번째 정수 입력 : 10
[경고] 홀수만 입력하세요
>> 1번째 정수 입력 : 11
>> 2번째 정수 입력 : 똘똘이
[경고] 똘똘이는 올바른 정수가 아닙니다. 올바른 정수를 입력하세요!!
>> 2번째 정수 입력 : 21
>> 3번째 정수 입력 : 354325325235234532453243242
[경고] 354325325235234532453243242는 올바른 정수가 아닙니다. 올바른 정수를 입력하세요!!
>> 3번째 정수 입력 : 5
>> 4번째 정수 입력 : 15
>> 5번째 정수 입력 : 31
== 11+21+5+15+31=83 입니다.
*/
public class Main_for_5_sum_3 {

	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== 5개의 홀수를 입력하세요 ==");
		int sum = 0; // 숫자의 누적용
		int cnt = 0; // 올바른 정수를 입력했을시 카운트용 
		String temp = "";

		for(; ;) {
			String str_input = "";
			
			try { 
				
				if( cnt == 5) {
					sc.close();
					break;
				}
			
			System.out.print(">> "+(cnt+1)+" 번째 홀수 입력 : ");
			str_input = sc.nextLine();
			
			int num = Integer.parseInt(str_input);
			
			if(num%2 == 0) { // 짝수를 입력했다라면 
				System.out.println("[경고] 홀수만 입력하세요");
				continue;
			}
			cnt++;
			sum+=num;
			
			if(cnt < 5)
				 temp += str_input+"+";
				 else 
				temp += str_input+"=";
			
			
		}catch(NumberFormatException e) {
		
			System.out.println("[경고] "+str_input+"는 올바른 홀수가 아닙니다. 올바른 홀수를 입력하세요!!");
			
		}
		
		} 
		System.out.println( temp +sum+"입니다.");
sc.close();// 무한 반복문의 경우 도달하지 못하는 문은 빨간줄이 뜬다 
	System.out.println("\n >> 프로그램 종료<< ");
	}
}
	
	

