package my.day17.a.collection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Member {

	private String id;
	private String passwd;
	private String name;
	private String jubun;
	
	public Member() {}
	
	public Member(String id, String passwd, String name, String jubun) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.jubun = jubun;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJubun() {
		return jubun;
	}
	
	public void setJubun(String jubun) {
		this.jubun = jubun;
	}
	
	
	// ======================================= //
	
	public String gender() {
				
	    return switch (jubun.substring(6)) {
			case "1", "3" -> "남";
		    default -> "여";
		};
		
	}// end of public String gender()-------------- 
	
	
	public int age() {
		
		int age = 0;
		
	/*	
		Date now = new Date(); // 현재시각
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyyMMdd");
		String str_now = sdfmt.format(now);  // "20250414"
	*/
	//  또는	
		String str_now = new SimpleDateFormat("yyyyMMdd").format(new Date()); // "20250414"
		
		// 올해생일
		String str_now_birthday = str_now.substring(0, 4) + jubun.substring(2, 6);
		// "20250910"
		
		// 만나이 ==> 현재년도 - 태어난년도
		// 만나이 ==> 현재년도 - 태어난년도 - 1
		
		// 현재년도
		int now_year = Integer.parseInt(str_now.substring(0, 4));
		
		int centry = switch(jubun.substring(6)) {
		    case "1","2" -> 1900;
		    default -> 2000;
		};
		
		// 태어난년도
		int birth_year = centry + Integer.parseInt(jubun.substring(0, 2));
		
		try {
			Date now_birthday = new SimpleDateFormat("yyyyMMdd").parse(str_now_birthday);
			Date now = new SimpleDateFormat("yyyyMMdd").parse(str_now);
			
			if(now_birthday.after(now)) {
				// 올해생일이 현재날짜 보다 이후이라면
				// 만나이 ==> 현재년도 - 태어난년도 - 1
				age = now_year - birth_year - 1;
			}
			else {
				// 올해생일이 현재날짜 포함한 이전 이라면
				// 만나이 ==> 현재년도 - 태어난년도
				age = now_year - birth_year;
			}
		} catch(Exception e) { }
		
		return age;
		
	}// end of public int age()---------------------
	
	
	public String getInfo() {

		return "=== "+name+"님의 회원정보 ===\n"
			 + "1. 아이디 : "+id+"\n"
			 + "2. 암호 : "+passwd+"\n"
			 + "3. 성명 : "+name+"\n"
			 + "4. 성별 : "+gender()+"\n"
			 + "5. 만나이 : "+age()+"\n";
	}
	
	
	public void print_info() {
		System.out.println(getInfo());
	}
	
	
}
