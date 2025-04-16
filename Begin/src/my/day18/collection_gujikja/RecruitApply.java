package my.day18.collection_gujikja;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RecruitApply  {

	// field
	private int recruitApply_no;  // 지원번호
	private Recruit rc;           // 채용공고 
	private Gujikja gu;           // 구직자
	private String apply_motive;  // 지원동기
	private String register_day;  // 등록일자 
	
	static int count;  // recruitApply_no  필드의 값을 1씩 증가 하려는 용도 
	
	// 기본생성자
	public RecruitApply() {
		recruitApply_no = 2001 + count;  // 지원번호는 2001 부터 시작함.
	 /*	
		Date now = new Date(); // 현재시각
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		register_day = sdf.format(now);
	*/
	 // 또는
		register_day = new SimpleDateFormat("yyyyMMdd").format(new Date());
	}

	// method
	public int getRecruitApply_no() {
		return recruitApply_no;
	}
	
	public Recruit getRc() {
		return rc;
	}

	public void setRc(Recruit rc) {
		
		if(rc != null) {
			this.rc = rc;	
		}
		else {
			System.out.println("[경고] 채용에 응모하려면 반드시 채용공고를 입력하세요!!\n");
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
			System.out.println("[경고] 채용에 응모하려면 반드시 구직자정보를 입력하세요!!\n");
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
			System.out.println("[경고] 입사지원동기는 필수로 입력해야 합니다.!!\n");
		}
		
	}

	public String getRegister_day() {
		return register_day;
	}
	
	
}
