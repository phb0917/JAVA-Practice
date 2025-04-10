package my.day11;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company extends CommonMember{
	// gujikja 클래스는 commonmember 클래스에 생성되어진 field 및 method 밎 기본생성자를 상속 받아온다 
	// commonmember 클래스는 gujikja 클래스의 부모 클래스가 되어지고 ,
	// gujikja 클래스는 commonmember 클래스의 자식클래스가 되어진다.	
	
	//field 생성
	//field 의 캡슐화 (encapulation == 은닉화)
	private String business_number; //사업자 등록번호
	private String job_type; // 회사의 직종( 제조업, 서비스업, it,.....) 
	private long seed_money; // 자본금
	
	static int count; // company 객체(인스턴스)의 개수를 알아오려는 용도

	
	//기본생성자 생략됨
		/*	public Company () {
			super();
								}*/

	//method 생성 
	//field 의 캡슐화 (encapulation == 은닉화) 되어진 field 를 메소드를 통해 접근하도록 만들기//
	//getter, setter 하기 
	public String getBusiness_number() {
		return business_number;
	}

	public void setBusiness_number(String business_number) {
		// 사업자등록번호는 오로지 숫자로만 들어와야 하며
	      // 첫글자는 0 이 들어올 수 없다.
	      // 또한 사업자 등록번호의 길이는 10글자가 되어야 한다.
		
		// >> 정규표현식(Regular Expression)이란? <<
		// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
		
		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
		Pattern p = Pattern.compile("^[1-9][0-9]{9}$");
		// ^ 은 시작을 의미한다.
		// $ 는 끝을 의미한다.
		// [] 는 글자 1개가 들어오는 것을 의미한다.
		// [1-9] 는 글자 1개가 들어오는데 1부터 9까지만 가능하다 
		// [0-9] 는 글자 1개가 들어오는데 0부터 9까지만 가능하다
		// [0-9]{9} 는 0부터 9까지만 가능한 것이 9번 들어와야한다
		Matcher m = p.matcher(business_number);
		
		// == 3. 판별하도록 한다. == //
		if(m.matches()) {
			this.business_number = business_number;
		}
		else {
			System.out.println("[경고] 사업자등록번호는 숫자로 10자리만 가능합니다 단 첫글자는 0 안됩니다\n"); 
		}
		
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		if(job_type == null || job_type.isBlank()) {
			System.out.println("[경고] 회사직종군은 공백이 아닌 글자로 입력하셔야 합니다 ");
		}
		else {
			this.job_type = job_type;
		}
		
		
	}

	public long getSeed_money() {
		return seed_money;
	}

	public void setSeed_money(long seed_money) {
		if(seed_money <= 0) {
			System.out.println("[경고] 자본금은 0보다 커야 합니다 ");
		}
		else {
		
		this.seed_money = seed_money;
		}
	}

	public String getcompanyInfo() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.getId()+"\t"); 
		sb.append(super.getPasswd()+"\t");
		sb.append(super.getName()+"\t");
		sb.append(super.getRegister_day().substring(0,10)+"\t");
		sb.append(getBusiness_number()+"\t");
		sb.append(getJob_type()+"\t");
		
		
		
		
		
		sb.append(new DecimalFormat("#,###").format(getSeed_money())+
				"원\n");
		return sb.toString();
	
		
		
	}
		public String getInfo() {
								                     		
			return 			super.getName() + "\t" // 회사명 
							+ job_type + "\t" 		//		업종 
							+ business_number + "\t"  //사업자등록번호 
							+ new DecimalFormat("#,###").format(seed_money)+"원" ; //자본금
			
	
		}
	
	
	
	}

	 
	
	
	
	
	






