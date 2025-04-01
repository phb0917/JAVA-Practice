package my.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MyUtil {

	// === 현재시각을 알려주는 static 메소드를 생성한다. === //
	public static String current_time() { 
		// current_time() 메소드는 실행되어진 결과값을 String 타입으로 만들어서 return 시켜주는 것이다.
		
		Date now = new Date(); // 현재시각
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdfmt.format(now);
	}// end of public static String current_time()---------------

	// == 랜덤한 인증키 만들기(소문자 3개 숫자 4개  == 
	public static String certification_key() {
		
		Random rndom = new Random();
		// 처음얼마부터 마지막얼마까지 랜덤한 정수
		// ==> rndom.nextInt(마지막수 - 처음수 + 1) + 처음수;
		
		String certification_code = "";
		
		for(int i=0; i<3; i++) { // 랜덤한 소문자 3개 구하기
			certification_code += (char) (rndom.nextInt('z' - 'a' + 1) + 'a');
		}
		
		for(int i=0; i<4; i++) { // 랜덤한 숫자(0~9) 4개 구하기 
			certification_code += rndom.nextInt(9 - 0 + 1) + 0;
		}
		
		for(int i=0; i<3; i++) { // 랜덤한 대문자 3개 구하기 
			certification_code += (char) (rndom.nextInt('Z' - 'A' + 1) + 'A');
		}
		
		return certification_code;
	}// end of public static String certification_key()-----------------


	// == 비밀번호가 규칙에 맞는지 틀리는지 알려주는 static 메소드 생성하기 == //
	/*
	   비밀번호 규칙은 비밀번호의 길이는 8글자 이상 15글자 이하이어야 하고,
	   또한 비밀번호는 영문대문자, 영문소문자, 숫자, 특수기호가 혼합되어야만 한다.
	   우리는 규칙에 맞으면 true 를 리턴해주고, 규칙에 틀리면 false 를 리턴하도록 만든다.  
	*/
	public static boolean isCheckPasswd(String passwd) {
		
		// passwd ==> null
		// passwd ==> Ab3$
		
		if(passwd == null)
			return false;
		
		// 예를 들어서
		// 입력받은 passwd 가 Ab3$ 이라면
		// 입력받은 passwd 가 Ab3$sdfdsfsdf12SDFDSFSF3123$%@#$ 이라면
		if(passwd.length() < 8 || passwd.length() > 15)
			return false;
		
		// 이제부터는 입력받은 passwd 의 글자수가 8글자 이상 15글자 이하인 경우이다.
		// 예를들어서
		// 입력받은 passwd 가 C5d#하하호호 이라면  C5d#하하s@! 이라면
		// 또는 
		// 입력받은 passwd 가 C5dawxab 이라면   c5dawxab# 이라면
		// 입력받은 passwd 가 C5dawxab@ 이라면  c5dawxab#T 이라면
		
		boolean find_upper = false; // 영문대문자 발견유무
		boolean find_lower = false; // 영문소문자 발견유무
		boolean find_digit = false; // 숫자 발견유무
		boolean find_special = false; // 특수문자 발견유무
		
		for(int i=0; i<passwd.length(); i++) {
			// 암호에 한글이 들어가 있는지 알아본다.
			char ch = passwd.charAt(i);
			
			if('가'<= ch && ch<='힣') return false;
			
			if(Character.isUpperCase(ch))       find_upper = true;   // 영문대문자 발견
			else if(Character.isLowerCase(ch))  find_lower = true;   // 영문소문자 발견
			else if(Character.isDigit(ch))      find_digit = true;   // 숫자 발견
			else                                find_special = true; // 특수문자 발견
		}// end of for-----------------------
		
		return find_upper && find_lower && find_digit && find_special;
	}// end of public static boolean isCheckPasswd(String passwd)---------
	public static String deleteSpace(String str) {
		String result = "";
			if(str == null)
				return null;
			else {//입력받은 str 값이 "     lee    ss     " 라면 
				for(int i=0; i<str.length(); i++) {
						char ch = str.charAt(i);
						if(ch != ' ') {
							
						}
			
			
			
		}
				return result;
		}
		}

}	

