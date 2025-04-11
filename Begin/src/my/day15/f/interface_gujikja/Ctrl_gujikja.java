package my.day15.f.interface_gujikja;

import java.util.Scanner;

public interface Ctrl_gujikja {

	
	void register(Scanner sc, CommonMember_abstract[] cmbr_arr);
	// === 구직자 로그인 === //
	Gujikja_imple login(Scanner sc, CommonMember_abstract[] cmbr_arr);
	
	// === 구직자 전용메뉴 ===
	 void gu_menu(Scanner sc, Gujikja_imple login_gu, CommonMember_abstract[] cmbr_arr, Recruit_imple[] rc_arr, RecruitApply_imple[] rcApply_arr);
	
}
