package my.day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RecruitApply {
	//field 
	private int recruitapply_no; //응모번호
	private Recruit rc; // 채용공고
	private Gujikja gu;	// 구직자 
	private String apply_motive; //지원동기
	private String register_day;  //등록일자
	
	static int count; // recruitapply 객체 (인스턴스) 의 개수를 알아보는 용도 
	//기본 생성자

	public RecruitApply() {
		recruitapply_no = 2001 +count; // 응모번호는 2001 부터 시작
		
	/*	Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		register_day = sdf.format(now);  */
		// 또는 
		
		register_day = new SimpleDateFormat("yyyyMMdd").format(new Date());
		
	}
	//method
	public int getrecruitapply_no() {
		return recruitapply_no;
	}
	
	public Recruit getRc() {
		return rc;
	}

	public void setRc(Recruit rc) {
		if(rc != null) {
			this.rc = rc;
		}
		else {
			System.out.println("[경고] 채용에 응모하려면 반드시 채용공고를 입력하세요");
		}
	}

	public Gujikja getGu() {
		return gu;
	}

	public void setGu(Gujikja gu) {
		if(gu != null) {
			this.gu = gu;
		}
		else {
			System.out.println("[경고] 채용에 응모하려면 반드시 구직자를 입력하세요");
		}
	}

	public String getApply_motive() {
		return apply_motive;
	}

	public void setApply_motive(String apply_motive) {
		if(apply_motive != null && !apply_motive.isBlank()) {
			this.apply_motive = apply_motive;
		}
		else {
			System.out.println("[경고] 채용에 응모하려면 반드시 지원동기를 입력하세요");
		}
	}

	public String getRegister_day() {
		return register_day;
	}

	
	
	
	
}//end class
