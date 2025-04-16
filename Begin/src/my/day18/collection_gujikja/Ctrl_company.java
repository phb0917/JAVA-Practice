package my.day18.collection_gujikja;

import java.util.List;
import java.util.Scanner;

public interface Ctrl_company extends Ctrl_common{


	
	// === 구인회사 전용메뉴 === //
	void cp_menu(Scanner sc,
				Company login_cp, 
				List<CommonMember> mbr_list,
				List<Recruit> recruit_list, 
				List<RecruitApply> rcapply_list);
	
}
