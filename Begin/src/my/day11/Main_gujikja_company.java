package my.day11;

import java.util.Scanner;

public class Main_gujikja_company {

	public static void main(String[] args) {
		
		Gujikja[] gu_arr = new Gujikja[5];
	
		Gujikja gu1 = new Gujikja(); 
		gu1.setId("eomjh");
		gu1.setPasswd("Qwer1234$");
		gu1.setName("엄정화");
		gu1.setJubun("8610202");
		gu_arr[Gujikja.count++] = gu1;
		
		
		Gujikja gu2 = new Gujikja(); 
        gu2.setId("leess"); 
        gu2.setPasswd("Abcd12345$");
        gu2.setName("이순신"); 
        gu2.setJubun("8604011");
        gu_arr[Gujikja.count++] = gu2;
		
        Gujikja gu3 = new Gujikja(); 
        gu3.setId("chaew"); 
        gu3.setPasswd("Wxyz1234$");
        gu3.setName("차은우"); 
        gu3.setJubun("0106053"); 
        gu_arr[Gujikja.count++] = gu3;
    
        Company[] cp_arr = new Company[3];
        Company cp1 = new Company();
        cp1.setId("samsung");
        cp1.setPasswd("Abcd1234$");
        cp1.setName("삼성");
        cp1.setBusiness_number("8123456789");
        cp1.setJob_type("제조업");
        cp1.setSeed_money(800000000000L);
        cp_arr[Company.count++] =cp1;
        
        
        Company cp2 = new Company();
        cp2.setId("lg");
        cp2.setPasswd("Abcd0070$");
        cp2.setName("엘지");
        cp2.setBusiness_number("7123456789");
        cp2.setJob_type("it");
        cp2.setSeed_money(700000000000L);
        cp_arr[Company.count++] =cp2;
        
        //----------------------------------//
       
        Recruit[] rc_arr = new Recruit[10];
        Recruit rc1 = new Recruit();
        rc1.setCp(cp1);
        rc1.setSubject("성실한 사무직원을 채용합니다 ");
        rc1.setwork_type("정규사무직");
        rc1.setCnt(2);
        rc1.setYearpay(4000);
        rc1.setFinish_day("20250508");
        rc_arr[Recruit.count++] = rc1;		
        
        		
        
        Recruit rc2 = new Recruit();
        rc2.setCp(cp2);
        rc2.setSubject("우수한 기술직원을 채용합니다.");
        rc2.setwork_type("계약직");
        rc2.setCnt(5);
        rc2.setYearpay(4500);
        rc2.setFinish_day("20250608");
        rc_arr[Recruit.count++] = rc2;
        
        
        Recruit rc3 = new Recruit();
        rc3.setCp(cp2);
        rc3.setSubject("우수한 기술직원을 채용합니다.");
        rc3.setwork_type("계약직");
        rc3.setCnt(10);
        rc3.setYearpay(5000);
        rc3.setFinish_day("20250708");
        rc_arr[Recruit.count++] = rc3;
        
        
        //----------------------------------//
        
        RecruitApply[] rcapply_arr = new RecruitApply[20];
        RecruitApply rcapply1 = new RecruitApply();
        rcapply1.setRc(rc1);
        rcapply1.setGu(gu1);
        rcapply1.setApply_motive("엄정화는 사무에 최선을 다합니다 ");
        
        rcapply_arr[RecruitApply.count++] = rcapply1;
        
        RecruitApply rcapply2 = new RecruitApply();
        rcapply2.setRc(rc1);
        rcapply2.setGu(gu2);
        rcapply2.setApply_motive("이순신은 최고의 사무직 인재입니다 ");
        
        rcapply_arr[RecruitApply.count++] = rcapply2;
        
      
        RecruitApply rcapply3 = new RecruitApply();
        rcapply3.setRc(rc2);
        rcapply3.setGu(gu3);
        rcapply3.setApply_motive("차은우는 최고의 기술을 가진 엔지니어 입니다 ");
        
        rcapply_arr[RecruitApply.count++] = rcapply3;
        
        RecruitApply rcapply4 = new RecruitApply();
        
        rcapply4.setRc(rc3);
        rcapply4.setGu(gu1);
        rcapply4.setApply_motive(" 엄정화는 영업의 달인입니다   ");
        
        rcapply_arr[RecruitApply.count++] = rcapply4;
        
        RecruitApply rcapply5 = new RecruitApply();
        
        rcapply5.setRc(rc3);
        rcapply5.setGu(gu2);
        rcapply5.setApply_motive(" 이순신은 판매왕입니다  ");
        
        rcapply_arr[RecruitApply.count++] = rcapply5;
        
        
        
        
        //----------------------------------//
        
        Scanner sc = new Scanner(System.in);
        Ctrl_common ctrl_common = new Ctrl_common();
        Ctrl_gujikja ctrl_gu = new Ctrl_gujikja();
        Ctrl_company ctrl_cp = new Ctrl_company();
       
        
        String str_menuno = "";
        
        do {
        	ctrl_common.main_menu(); // 메인메뉴 
        	str_menuno = sc.nextLine();
        	
        	switch (str_menuno) {
				case "1": //.구직자 회원가입
					ctrl_gu.register(sc, gu_arr);
					break;
					
				case "2": // 2.구인회사 회원가입 
					ctrl_cp.register(sc, cp_arr);
					break;
					
				case "3": //3.구직자 로그인
					Gujikja login_gu = ctrl_gu.login(sc, gu_arr);
					
					if(login_gu != null) {
						System.out.println(" >> 구직자 " + login_gu.getName()+" 님 로그인 성공 <<\n");
						ctrl_gu.gu_menu(sc, login_gu,cp_arr,rc_arr,rcapply_arr);// 구직자 전용 메뉴
					}
					else {
						System.out.println(">> 구직자로 로그인 실패 <<");
					}
					break;	
					
				case "4": //4.구인회사 로그인\
					Company login_cp = ctrl_cp.login(sc, cp_arr);
					if(login_cp !=null) {
						System.out.println(">>> 구인회사" + login_cp.getName() + " 기업 로그인 성공 <<<");
						
						ctrl_cp.cp_menu(sc,login_cp,gu_arr,rc_arr,rcapply_arr);// 구인회사 전용메뉴
						
					}
					else { 
						System.out.println( " >> 구인회서 로그인 실패 <<\n");
					}
					break;					
					
				case "5":
					break;
					
				default:
					System.out.println("[경고] 메뉴에 없는 번호 입니다.\n");
					break;
			}// end of switch (str_menuno)----------------
        	        	
		} while (!("4".equals(str_menuno)));
        // end of do~while----------------
        
        sc.close();
        System.out.println("\n>>> 프로그램 종료 <<<");
        
	}

}
