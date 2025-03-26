package my.day03.c.calcurator;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

/*
▣ 첫번째 정수 입력 => 10   100000000000    똘똘이
▣ 두번째 정수 입력 => 4    500000000000    헤헤헤
▣ 사칙연산을 선택하세요(+ - * /) : + - * /   # 우하하 7 
10 + 4 = 14
10 - 4 = 6
10 * 4 = 40
10 / 4 = 2.5
10 / 0 
*/

public class Main_calcurator_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double calc_result = 0.0;
		String str_input = "";
		try {
		
			System.out.println("첫번째 정수 입력 =>");
			str_input = sc.nextLine();
			int num1 = Integer.parseInt(str_input);// 문자열을 정수로 형변환 시킨다 
												   // 10
												   // 10000000000 x
												   // 돌돌이 
			
			System.out.println("두번째 정수 입력 =>");
			str_input = sc.nextLine();
			int num2 = Integer.parseInt(str_input);
			
			
			
			System.out.println("사칙연산을 선택하세요(+ - * /) : ");// + - *
															   // # x
			
			String operator = sc.nextLine();
			
		/*if("+".equals(operator)) {
		calc_result =num1 + num2;
			}
		else if("-".equals(operator)) {
			calc_result =num1 - num2;
			}	
				
		else if("*".equals(operator)) {
			 calc_result =num1 * num2;	
				}
		else if("/".equals(operator)) {
			 calc_result = (double)num1 / num2;	
	
				}
		
		else { 
			System.out.println("[경고] 사칙연산 선택은 + - * / 만 입력하세요 ");
			sc.close();
			return;
		}*/
			
			switch (operator) { // switch( 변수) 에서 변수에 들어올 수 있는 타입은 
			                    // byte,short,int,char,string 만 가능하다 
			case "+": //operator 값이 "+" 와 같으면 
				calc_result = num1+ num2;
				break; // switch 문을 빠져나가라 
			case "-":
				calc_result = num1 - num2;
				break;
			case "*":
				calc_result = num1 * num2;
				break;
			case "/":
				calc_result = (double)num1 / num2;
				break;
			default: 
				// 사칙연산 선택시 + - * / 를 제외한 다른 것을 입력한 경우 
				System.out.println("[경고] 사칙연산 선택은 + - * / 만 입력하세요");
				sc.close();
				return; // 종료
			} // end of switch(operator)
		String result = "";
		
		
		/*	if("/".equals(operator) && num2== 0) {
			  result = " 0 으로 나눌수 없습니다 ";
			}
		
		
		else if("/".equals(operator)) { 
			 result= num1 + operator + num2 + "=" + calc_result;
		
			
		}
			else  {
				result = num1 + operator + num2 + "=" +(int)calc_result;
			}
		
		result = num1 + operator + num2 + "=" +calc_result;
*/		
		
		switch (operator) {
		case "/":
			 if(num2==0) { 
				 result = ">>> 0으로 나눌 수 없습니다 <<<";
				 		 
			 }
			 else if( num2!= 0 && num1%num2 == 0)
				 result = num1 + operator + num2 + "=" + (int)calc_result;
			 
			
				 else {
				 result = num1 + operator + num2 + "=" + calc_result;
			 }
			break; // switch 문을 빠져나간다 

		default:
			result = num1 + operator + num2 + "=" +(int)calc_result;
			break; // switch 문을 빠져나간다 
		}//end of switch (operator -------
		
		
		System.out.println(result);
			
			
			
		} catch (NumberFormatException e) {
			System.out.println(">>> "+str_input+" 은 올바른 데이터가 아닙니다. 올바른 정수를 입력하세요 <<< ");
		}
			
		sc.close();	
			
			
			
			
			
			
		}//end of main(string[] args) -----------------------------
}


