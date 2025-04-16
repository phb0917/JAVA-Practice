package my.day18.collection_gujikja;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public class Gujikja extends CommonMember {

	// field 생성
	// field 의 캡슐화(Encapsulation == 은닉화)
	private String jubun;  // 주민번호인데 앞자리 6자리에 + 성별을 나타내는 1자리까지만 입력한다.
                           // 예: "9506201"  "9607202"   "0006203"  "0007204"  "1106203" 
	
	// 기본생성자 생략됨!!
 	public Gujikja() {
 		super(); // super(); 은 Gujikja 클래스의 부모 클래스인 CommonMember 클래스의 기본생성자 이다.
                 // 부모클래스의 생성자는 반드시 자식클래스의 기본생성자내에서 맨 처음에 나와야 한다.!!!
 	//	System.out.println(">> Gujikja 생성자 호출 <<");
 	}
	
	
	// method 생성
	public void setJubun(String jubun) {
		
		if( MyUtil.isCheckJubun(jubun) ) {
			this.jubun = jubun;
		}
		else {
			System.out.println("[경고] 주민번호 앞에서 부터 7자리 까지 올바르게 입력하세요!!\n");
		}
		
	}

	public String getJubun() {
		return jubun;
	}
	@Override
	public void setName(String name) {
		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
		Pattern p = Pattern.compile("^[가-힣]{2,6}$");
		
		// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
		Matcher m = p.matcher(name);
		
		// == 3. 판별하도록 한다. == //
		if(m.matches()) {
			super.setName(name);
		}
		else {
			System.out.println("[경고] 성명은 공백이 없는 한글로만 이루어져야 하며 최소 2글자 이상 최대 6글자로만 되어져야 합니다.\n"); 
		}
	}

	// ==== 성별을 구해주는 메소드 생성하기 ====
	
	public String gender() {
		if(jubun.endsWith("1") || jubun.endsWith("3"))
		   return "남";
		else
		   return "여";	
	}
	
	// ==== 만나이를 구해주는 메소드는 MyUtil.age(String jubun); 을 사용하겠다. ====
	
	
	// ==== 구직자의 정보를 한줄로 리턴해주는 메소드 생성하기 ==== 
	@Override
	public String getInfo() {
		
		// eomjh	  Qwe******	    엄정화	1986-10-20	   여	 38	   2025-04-04 10:07:05
		
		StringBuilder sb = new StringBuilder();
		
	//	sb.append(super.getId()+"\t");
	//  또는
	//	sb.append(this.getId() +"\t");
	//  또는
	//	sb.append(getId() +"\t");
	//  또는	
		sb.append(super.getId()+"\t");
		
		sb.append(super.getPasswd().substring(0, 3) + "*".repeat(super.getPasswd().length() - 3) +"\t");
		sb.append(super.getName() +"\t");
		
	//	"8610202"
	//	"0106053"
		
		String str;
	/*
		if("1".equals(jubun.substring(6)) || "2".equals(jubun.substring(6)) ) {
			str = "19";
		}
		else {
			str = "20";
		}
	*/
	// 또는
		if(jubun.endsWith("1") || jubun.endsWith("2") ) {
			str = "19";
		}
		else {
			str = "20";
		}
		
		
		String birthday = str+jubun;
		// "198610202" 을 "1986-10-20" 으로 변경
		// "200106053" 을 "2001-06-05" 으로 변경
		
		birthday = birthday.substring(0, 4)+"-"+birthday.substring(4, 6)+"-"+birthday.substring(6, 8);
		sb.append(birthday+"\t");
		
		sb.append(gender()+"\t"); // 성별
		
		int age = 0;
		try {
			age = MyUtil.age(jubun);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        sb.append(age + "\t");  // 만나이		
		
        sb.append(super.getRegister_day());
		
		return sb.toString();
	}
	
	
	// ==== 로그인 되어진 구직자의 자신의 정보를 한줄로 리턴해주는 메소드 생성하기 ==== 
	public String getMyInfo() {
		
		// eomjh	  Qwer1234$	    엄정화	1986-10-20	   여	 38	   2025-04-04 10:07:05
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.getId()+"\t");
		sb.append(super.getPasswd()+"\t");
		sb.append(super.getName() +"\t");

		String str;

		if(jubun.endsWith("1") || jubun.endsWith("2") ) {
			str = "19";
		}
		else {
			str = "20";
		}

		String birthday = str+jubun;
		
		birthday = birthday.substring(0, 4)+"-"+birthday.substring(4, 6)+"-"+birthday.substring(6, 8);
		sb.append(birthday+"\t");
		sb.append(gender()+"\t"); // 성별
		
		int age = 0;
		try {
			age = MyUtil.age(jubun);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        sb.append(age + "\t");  // 만나이		
        sb.append(super.getRegister_day());
		
		return sb.toString();
	}
	
	
}












