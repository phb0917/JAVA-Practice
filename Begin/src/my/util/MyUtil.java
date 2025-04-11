package my.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public abstract class MyUtil {

	/*
	  myutil 클래스를 추상클래스로 만드는 이유는 
	  myutil 클래스에는 오로지 static 매소드만 생성할 예정이므로 
	  외부에서 myutil 클래스를 사용하여 객체 생성을 못하게하기 위함이다 
	  
	  stactiㅊ 매소드는 인스턴스 생성없이 클래스명 만으로 사용가능하다 
	 */
	
	// myutil 클래스를 추상클래스가 아닌 일반 클래스 사용한다라면 
	// 아래와 같이 기본생성자에 접근제한자를 private 으로 해주면 된다 ;
	//기본생성자 
	//private myutil() {]
	
	
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
// 주민번호 7자리를 입력받아서 만나이를 구해주는메소드 생성
	public static int age(String jubun) throws Exception {
		// 숫자로만 이루어지지 않았으므로 
	
		int age = 0;
		try {
			if(jubun.length() != 7 || !(jubun.endsWith("1")||jubun.endsWith("2")||jubun.endsWith("3")||jubun.endsWith("4"))) {
				throw new Exception();
			}
			
			Integer.parseInt(jubun); // jubun 이 " 안녕하세요하하" 이라면 
									// 숫자로만 이루어지지 않았으므로 
			// 입력받은 주번이 "9803321" 와 같이 달력에 존재하지 않는 주민번호라면 
			String yymmdd = jubun.substring(0,6);
			String str =("1".equals(jubun.substring(6)) || "2".equals(jubun.substring(6)))? "19":"20";
			String birthday = str+ yymmdd; // "19980332
			// birthday 가 실제로 유효한 날짜인지 검사하기 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			sdf.setLenient(false);
			sdf.parse(birthday);
			//여기에 도달하는 경우는 입력받은 jubun 이 올바른 주민번호 일때만 도달한다 
			// 이제 올바른 주민번호 이므로 "만 나이"를 구한다 
			// 올해 생일이 오늘 날짜보다 뒤에 나오면 ==> 현재년도 - 태어난년도 -1 이다 
			// 그렇지 않으면 					 ==> 현재년도 - 태어난년도 이다 
			
			//현재년도 
			sdf =new SimpleDateFormat("yyyy");// SimpleDateFormat 을 년도만으로 변경
			int current_year = Integer.parseInt(sdf.format(new Date())); // 현재 년도를 뽑아 int 타입으로 만들어 current_year 에 저장 
			//태어난년도
			str = ("1".equals(jubun.substring(6)) ||"2".equals(jubun.substring(6)))? "19":"20"; //만약 주민번호 7번째 자리가 1또는 2라면 str에 19를 저장하고 그외라면 20을 저장
			int birth_year = Integer.parseInt(str +jubun.substring(0,2));
			//올해생일
			
			String str_current_birthday = current_year + jubun.substring(2,5);
			// "19980301" "20000301" 
			sdf = new SimpleDateFormat("yyyyMMdd");
			
			Date current_birthday = sdf.parse(str_current_birthday);
			
			if(current_birthday.after(new Date())) {
				age = current_year - birth_year - 1;// 현재년도 - 태어난년도 - 1 
				
			}
			else {
				age = current_year - birth_year; // 현재년도 - 태어난년도
			}
		}catch (NumberFormatException e ) {
			throw new Exception();
		}catch (ParseException e) {
			throw new Exception();
		}
		return age;
	}
	//=== 주민번호 7자리를 입력받아서 올바른 주민번호 인지 아닌지 검사해주는 메소드 생성 ===
	public static boolean isCheckJubun(String jubun) {
		
			//입력받은 주민번호의 글자가 7글자가 아니라면
			if(jubun.length() != 7 ) {
				return false;
			}
			try {
			Integer.parseInt(jubun); // jubun 이 " 안녕하세요하하" 이라면 
			}catch(NumberFormatException e ) {
				return false;// 숫자로만 이루어지지 않았을 경우 return false
			
			} 
			// 주민번호 마지막 글자는 1또는 2또는 3또는 4만 가능하므로
			switch (jubun.substring(6)) {
			case "1":
			case "2":
			case "3":
			case "4":
				break;

			default: //주민번호 마지막 글자가 1또는 2또는 3또는 4가 아닌경우 
				return false;
			}//end switch
			
			// 입력받은 주번이 "9803321" 와 같이 달력에 존재하지 않는 주민번호라면 
			String yymmdd = jubun.substring(0,6);
			String str =("1".equals(jubun.substring(6)) || "2".equals(jubun.substring(6)))? "19":"20";
			String birthday = str+ yymmdd; // "19980332
			// birthday 가 실제로 유효한 날짜인지 검사하기 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			sdf.setLenient(false);
			try {
			sdf.parse(birthday);
			}catch (ParseException e) {
			 return false;
		}
		return true; // 모든 조건이 충족했을때 트루를 주고 마침 
		
	}
	
	// 날짜 비교하기
	/* 
	 *
    >> Date 클래스에서 제공하는 compareTo() 메소드 <<
    
       date1.compareTo(date2);
    
         date1 날짜와 date2 날짜가 동일하면 0을 반환하고,
         date1 날짜가 date2 날짜 보다 이전 날짜인 경우 -1을 반환하고, 
         반대로 date1 날짜가 date2 날짜 보다 이후 날짜인 경우 경우 1을 반환한다. 
 */
	public static int Date_comparison(String str_date1, String str_date2 ) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		try {
		Date date1= sdf.parse(str_date1);
		Date date2 = sdf.parse(str_date2);
		
		return date1.compareTo(date2); // -1 또는 0또는 1
		
		} catch (ParseException e) {
			e.printStackTrace();
			return 2;
			
		}
		
	
	}// end static
	
	

}	

