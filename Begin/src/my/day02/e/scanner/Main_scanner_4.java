package my.day02.e.scanner;

import java.util.Scanner;

/*
1. 첫번째 정수 입력 : 10
2. 두번째 정수 입력 : 20
>> 10 + 20 = 30
--------------------------------------------------------

1. 첫번째 정수 입력 : 똘똘이
>> [경고] 똘똘이는 정수가 아닙니다. 모두 정수를 입력해주세요!!

--------------------------------------------------------

1. 첫번째 정수 입력 : 10
2. 두번째 정수 입력 : 똘똘이
>> [경고] 똘똘이는 정수가 아닙니다. 모두 정수를 입력해주세요!!
--------------------------------------------------------

1. 첫번째 정수 입력 : 234324532523532532432446343454354353245532
>> [경고] 234324532523532532432446343454354353245532는 정수가 아닙니다. 모두 정수를 입력해주세요!!
*/
public class Main_scanner_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str_input = "";
		try { 
		System.out.print("1. 첫번째 정수 입력 :");
		
		sc.nextLine(); // 문자열 반환 "10"
		str_input = sc.nextLine(); 
		
		int num1 = Integer.parseInt(str_input);
		
System.out.print("2. 두번째 정수 입력 :");
		
        sc.nextLine(); // 문자열 반환 "10"
		str_input = sc.nextLine();
		int num2 = Integer.parseInt(str_input);
		
		System.out.println(">> "+num1+" + "+num2+" =" +(num1+num2));
		} catch(NumberFormatException e)
		{System.out.println("경고 " + str_input + "는 정수가 아닙니다. 모두 정수를 입력해주세요" );	
		
		
		sc.close();
		}
		
		

		
		
		
		
		
		
		
	}

}
