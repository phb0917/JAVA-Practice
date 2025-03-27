package my.day04.b.For_quiz;

import java.util.Scanner;

/*
>> 글자를 입력하세요 : Abz3쌍a0# $ T
총글자수 : 12
대문자개수:2   대문자:A,T  
소문자개수:3   소문자:b,z,a 
숫자개수:2      숫자:3,0  
한글개수:1      한글:쌍   
공백개수:2
특수문자개수:2   특수문자:#,$  
*/
public class Main_quiz_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(">> 글자를 입력하세요 :");
		String str_input = sc.nextLine();
		
		
		int length = str_input.length();// 문자열의 길이를 알려주는것 
		int upper_cnt = 0 , lower_cnt= 0, digit_cnt= 0, hangul_cnt=0, space_cnt=0,secial_cnt= 0;
		String upper_str = "", lower_str = "",digit_str="",hangul_str="", secial_str="";
		
		for(int i=0; i<length; i++) { 
		char ch = str_input.charAt(i);
		
		if(Character.isUpperCase(ch)) { //대문자인지 검사  
			upper_cnt++;
			if(upper_cnt == 1) { 
				upper_str += ch;
				
			}
			else {
				upper_str += ","+ch;
			}
		}
		else if(Character.isLowerCase(ch)) { //소문자인지 검사  
			lower_cnt++;
			if(lower_cnt == 1) { 
				lower_str += ch;
				
			}
			else {
				lower_str += ","+ch;
			}
		}
		else if(Character.isDigit(ch)) {  //숫자인지 검사  
			digit_cnt++;
			if(digit_cnt == 1) { 
				digit_str += ch;
				
			}
			else {
				digit_str += ","+ch;
			}
		}
		else if('가' <= ch && ch <= '힣') { //한글인지 검사  
			hangul_cnt++;
			if(hangul_cnt == 1) { 
				hangul_str += ch;
				
			}
			else {
				hangul_str += ","+ch;
			}
		
		}
		else if( ch == ' ') { //공백인지 검사  
			space_cnt++;
			
		}
		else { 
			secial_cnt++;
			if(secial_cnt == 1) {  //특수인지 검사  
				secial_str += ch;
				
			}
			else {
				secial_str += ","+ch;
			}
		}
		}
		
		System.out.println("총글자수 : " + length);
		System.out.println("대문자개수 : " + upper_cnt + "\t 대문자 : " + upper_str);
		System.out.println("소문자개수 : " + lower_cnt + "\t 소문자 : " + lower_str);
		System.out.println("숫자개수 : " + digit_cnt   + "\t 숫자 : " + digit_str);
		System.out.println("한글개수 : " + hangul_cnt  + "\t 한글 : " + hangul_str);
		System.out.println("공백개수 : " + space_cnt);
		System.out.println("특수문자개수 : " + secial_cnt + "\t 특수문자 :" + secial_str);
		
	}// end of  main(String[] args)

}
