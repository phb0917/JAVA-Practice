package my.day15.f.interface_gujikja;

import java.util.Scanner;

public interface Ctrl_company {

	// == 구인회사 회원가입 == //
	void register(Scanner sc, CommonMember_abstract[] cmbr_arr);
	
	// === 구인회사 로그인 === //
	Company_imple login(Scanner sc, CommonMember_abstract[] cmbr_arr);
	
	// === 구인회사 전용메뉴 === //
	void cp_menu(Scanner sc, Company_imple login_cp, CommonMember_abstract[] cmbr_arr, Recruit_imple[] rc_arr, RecruitApply_imple[] rcApply_arr); 
	
}
