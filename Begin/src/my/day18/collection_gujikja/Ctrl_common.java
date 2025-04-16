package my.day18.collection_gujikja;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface Ctrl_common {

	
	// == 구직자(Gujikja) 객체와 기업회원(Company) 객체를 
	   //     List<CommonMember> mbr_list 및 Map<String, CommonMember> mbr_map 에 저장시키는 
	   //    static 메소드 == // \
	static void add(CommonMember mbr,List<CommonMember> mbr_list, Map<String, CommonMember> mbr_map) {
		if(mbr.getType() == 1) {// 구직자가 저장되는 경우 
			Gujikja gu  = (Gujikja) mbr;
			if(gu.getId() != null && gu.getPasswd() != null && gu.getName() != null && gu.getJubun() != null) {
				
				mbr_list.add(gu);
				mbr_map.put(gu.getId()+"_gu", gu); // "_gu" 를 추가한 이유는 구직자와 회사의 id 값이 동일할 경우 Map의 덮어 쓰기 방지를 하기 위함이다 
				System.out.println("[\""+gu.getName()+ "\"님 구직자 회원으로 가입 성공함] \n ");
			}
			else {
				System.out.println("[구직자 회원으로 가입 실패함]\n");
			}
			
		}
		if(mbr.getType() == 2) { // 구인회사가 저장되는 경우 
			Company cp = (Company) mbr;
			if(cp.getId() != null && cp.getPasswd() != null && cp.getName() != null && cp.getBusiness_number() != null
					&& cp.getJob_type() != null &&cp.getSeed_money() > 0) {
				mbr_list.add(cp);
				mbr_map.put(cp.getId()+"_cp", cp); // "_cp" 를 추가한 이유는 구직자와 회사의 id 값이 동일할 경우 Map의 덮어 쓰기 방지를 하기 위함이다  
				System.out.println("[\""+cp.getName()+ "\"님 기업 회원으로 가입 성공함] \n ");
			}
			else {
				System.out.println("[기업 회원으로 가입 실패함]");
			}
			
		}
		
	}//end void
	
	
	// 시작 화면 (메인메뉴)를 보여주는 메소드 생성하기 
	// 시작화면(메인 메뉴)은 overriding 할 필요가 없는 것이라서 static 메서드로 생성한다 
	static void main_menu() {
		System.out.println("\n === 메인메뉴 ===\n"
		                + "1.구직자 회원가입   2.구인회사 회원가입   3.구직자 로그인   4.구인회사 로그인\n"
		                + "5.프로그램 종료\n");  
		System.out.print("▷ 메뉴번호 선택 : ");
	}// end of void main_menu()---------------------
	
	// == 구직자(Gujikja) 및 기업회원(Company) 회원가입 시
	   //    Gujikja 클래스 또는 Company 클래스의 field 의 요구사항에 모두 맞으면
	   //    List<CommonMember> mbr_list 및 
	   //    Map<String, CommonMember> mbr_map 에 저장시켜주는  메소드 ==
	
	void register(Scanner sc, List<CommonMember> mbr_list, Map<String, CommonMember> mbr_Map);
	
	
	// == 구직자(Gujikja) 및 기업회원(Company) 로그인 해주는 추상메소드(미완성 메소드)
	CommonMember login(Scanner sc, Map<String, CommonMember> mbr_map);
	
	
	
	
}
