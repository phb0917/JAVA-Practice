package my.day18.collection_gujikja;

import java.util.List;
import java.util.Scanner;

public interface Ctrl_gujikja extends Ctrl_common{


	
	// === 구직자 전용메뉴 === //
	void gu_menu(Scanner sc,
				Gujikja login_gu, 
				List<CommonMember> mbr_list,
				List<Recruit> recruit_list, 
				List<RecruitApply> rcapply_list);
	
	
	
}
