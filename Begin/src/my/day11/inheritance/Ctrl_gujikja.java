package my.day11.inheritance;

import java.util.Scanner;

import my.util.MyUtil;

public class Ctrl_gujikja {


	
	// == 구직자 회원가입 ==
	/*
	   구직자(Gujikja) 신규 회원가입시
	   Gujikja 클래스의 field 의 요구사항에 모두 맞으면
	   Gujikja[] gu_arr 에 저장시켜주는 메소드 생성하기 
	*/
	void register(Scanner sc, Gujikja[] gu_arr) {
		
		if(Gujikja.count < gu_arr.length) { // 지금까지 생성된 구직자 회원수가 gu_arr.length(==> 정원) 보다 적을 경우에만 신규회원을 받아들인다.  
		
			Gujikja gu = new Gujikja();
			
			// ===================================== //
			
			// 아이디는 필수 입력사항이면서 아이디 조건에 맞을때 까지 반복해야 한다.
			outer:
			do {
				System.out.print("1.아이디 : ");
				String userid = sc.nextLine(); 
				
				// == 가입된 회원들에 대해 중복아이디 검사하기 == //
				for(int i=0; i<Gujikja.count; i++) {
					if(userid.equals(gu_arr[i].getId())) {
						System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
				        continue outer;
					}
				}// end of for---------------------
				
				gu.setId(userid);
				
			} while(!(gu.getId() != null));
			// end of do~while------------------------
			
			
			// 비밀번호는 필수 입력사항이면서 비밀번호 조건에 맞을때 까지 반복해야 한다.
			do {
				System.out.print("2.비밀번호 : ");
				String passwd = sc.nextLine(); 
				
				gu.setPasswd(passwd);

			} while (!(gu.getPasswd() != null));
			// end of do~while------------------------
		
			
			// 성명은 필수 입력사항이므로 그냥 엔터나 공백만으로 된 것이 아닐때 까지 반복해야 한다.
			// 성명은 공백없이 2글자 이상 6글자 이하의 한글로만 되어져야 한다.
			do {
				System.out.print("3.성명 : ");
				String name = sc.nextLine(); 
				
				gu.setName(name);

			} while (!(gu.getName() != null));
			
			
			// 주민번호는 필수 입력사항이므로 주민번호 조건에 맞을때 까지 반복해야 한다.
			do {
				System.out.print("4.주민번호 : ");
				String jubun = sc.nextLine(); 
				
				gu.setJubun(jubun);

			} while (!(gu.getJubun() != null));
			
			// ===================================== //
			
			gu_arr[Gujikja.count++] = gu;
			
		} 
		
		else { // 지금까지 생성된 구직자 회원수가 gu_arr.length(==> 정원) 와 같거나 큰 경우에는 신규회원을 받아들이면 안된다. 
			System.out.println(">> 정원 " + gu_arr.length + "명이 꽉차서 구직자 회원가입이 불가합니다.!! <<\n");
		}
		
	}// end of void register(Scanner sc, Gujikja[] gu_arr)----------------------------

	// === 구직자 로그인 === 
	public Gujikja login(Scanner sc, Gujikja[] gu_arr) { 
		
		System.out.print("> 구직자 ID : ");
		String id = sc.nextLine();
		
		System.out.print("> 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i< Gujikja.count; i++) {
			if(id.equals(gu_arr[i].getId()) && passwd.equals(gu_arr[i].getPasswd())) {
				return gu_arr[i];
			}
			
		}
		return null;
	}// end of login 
	
	
	// 구직자 전용 메뉴
	public void gu_menu(Scanner sc,  Gujikja login_gu, Company[] cp_arr) {
		String str_menuno = "";
		do {
		
			System.out.println("\n ===구직자 전용메뉴(" + login_gu.getName() + "님 로그인중) ===\n"
			         +  "1.내정보 보기   2.내정보 수정   3.모든구인회사 조회   4.구인회사검색하기\n"
                     + "5.모든채용공고조회   6.채용공고상세보기   7.채용응모하기   8.채용응모한것조회\n"
                     + "9.채용응모한것수정하기    10.로그아웃\n");
			System.out.print("▷ 메뉴번호 선택 : ");
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": //1.내정보 보기
					view_myinfo(login_gu);
					break;
				case "2": //  2.내정보 수정
					update_myinfo(sc,login_gu);
					
					
					break; 
				case "3": // 3.모든구인회사 조회
					view_all_company_info(cp_arr);
					break;
				
				case "4": //4.구인회사검색하기
					search_company(sc,cp_arr);
					break; 
				
				case "5": //5.모든채용공고조회
					
					break;
				
				case "6": //6.채용공고상세보기
					
					break;
				
				case "7": //7.채용응모하기
					
					break;
				
				case "8": // 8.채용응모한것조회
					
					break;
				
				case "9": //9.채용응모한것수정하기
					
					break;
				
				case "10": //10.로그아웃
					
					break;

	
				default:
					System.out.println(">> [경고] 선택하신 번호는 메뉴에 없습니다 ");
					break;
			}//end switch
		
		
		
		}while(!"10".equals(str_menuno));	
		}
	
	
	
	
	

	//== 1.내정보 보기 ==
	private void view_myinfo(Gujikja login_gu) {
	/*
	  >>> 엄정화님의 정보 <<<
	  ---------------------------------------------------------------------------------
	      아이디   비밀번호         성명     생년월일       성별   현재만나이   가입일자
	    ---------------------------------------------------------------------------------
	      eomjh	  Qwer1234$    엄정화	   1986-10-20	   여	 38	   2025-04-04 10:07:05
	    ----------------------------------------------------------------------------------  
	  	
	 */
		System.out.println(" >>>" + login_gu.getName() + "님의 정보 <<< ");
		title();
		System.out.println(login_gu.getMyInfo());
		
		
		
	}//end void 
	
	//  2.내정보 수정
	private void update_myinfo(Scanner sc, Gujikja login_gu) {
		view_myinfo(login_gu);
		
		System.out.println("\n>> [주의사항] 변경하지 않고 예전의 데이터값을 그대로 사용하시려면 그냥 엔터하세요!!\n");
		//===========================================================================//
		
		boolean exit_ok = false;
		
		do {
			System.out.println("1. 비밀번호 : ");
			String new_passwd = sc.nextLine(); // 기존비밀번호인 Qwer1234$ 을 Qwer0070$ 으로 변경 하려고 한다 >> 정상
											   // 기존비밀번호인 Qwer1234$ 을 Qwer1234$ 으로 변경 하려고 한다 >> 기존비밀번호와 동일 함으로 변경이 불가 합니다 라는 메세지 출력 비정상
											   // 기존비밀번호인 Qwer1234$ 을 Qwer00700 으로 변경 하려고 한다 >> 비밀번호 정책에 맞지 않으므로 비정상 
											   // 그냥 엔터 하면 비밀번호 변경이 없어야 한다.
			if (!new_passwd.equals("")) {//입력한 비밀번호 가 그냥 엔터가 아닐 경우 
				if(new_passwd.equals(login_gu.getPasswd())) { // 입력한 비밀번호가 기존 비밀번호와 같을 경우 
					System.out.println("기존비밀번호와 동일 함으로 변경이 불가 합니다");
				}
				else { // 입력한 비밀번호가 기존 비밀번호와 다를경우 
					login_gu.setPasswd(new_passwd);
					
					if(login_gu.getPasswd().equals(new_passwd)) { //비밀번호 정책에 맞는 경우 
					exit_ok = true;	
						
					}// end if
				}
			}
			else {//입력한 비밀번호 가 그냥 엔터일 경우 
			exit_ok = true;
			}// end if
		}while (!exit_ok);
		
		exit_ok = false ;
		
		do {
		System.out.println("2. 성명 : "); 
		String new_name = sc.nextLine(); // 기존성명인 엄정화 를 정화엄 으로 변경하려고 한다. --> 정상
								         // 기존성명인 엄정화 를 엄정화 으로 변경하려고 한다. --> "기존 성명과 동일하므로 변경이 불가합니다." 라는 메시지 출력한다. 비정상. 
								         // 기존성명인 엄정화 를 엄JH 으로 변경하려고 한다. --> 성명 정책에 맞지 않으므로 비정상.  
								         // 그냥 엔터하면 성명 변경이 없어야 한다.
		if(!new_name.equals("")) {
			if (new_name.equals(login_gu.getName())){
				System.out.println( "기존 성명과 동일하므로 변경이 불가합니다.");
			}
			else {// 입력한 성명이 기존 성명과 다를경우
				login_gu.setName(new_name);
				if(login_gu.getName().equals(new_name)) { // 아이디 정책에 맞는 경우
					exit_ok = true;
					}
			}
			}
		else {//입력한 비밀번호 가 그냥 엔터일 경우 
			exit_ok = true;
			}// end if
		
		
		
		}while (!exit_ok);
		do {
			System.out.println("3. 주민번호 : "); 

			String new_jubun = sc.nextLine(); 
			if(!new_jubun.equals("")) {
				if (new_jubun.equals(login_gu.getJubun())){
					System.out.println( "기존 주민번호와 동일하므로 변경이 불가합니다.");
				}
				else {// 입력한 성명이 기존 성명과 다를경우
					login_gu.setJubun(new_jubun);
					if(login_gu.getJubun().equals(new_jubun)) { // 아이디 정책에 맞는 경우
						exit_ok = true;}
				}
				}
			else {//입력한 비밀번호 가 그냥 엔터일 경우 
				exit_ok = true;
				}// end if
			
			
			}while (!exit_ok);
	System.out.println("회원정보 변경 완료");
		
	}//end void

	// 3.모든구인회사 조회
		private void view_all_company_info(Company[] cp_arr) {
		
			if(Company.count == 0) {
				System.out.println(">> 구인회사로 등록된 회사가 없습니다 <<");
			}
			else {
				title_company();
				
				StringBuilder sb = new StringBuilder();
				
				for(int i=0; i<Company.count; i++) {
					sb.append(cp_arr[i].getInfo()+"\n");
				}//end for
			System.out.println(sb.toString());
			}
			
		}//end void 
	
	
	
	
	private void title_company() {
		System.out.println("-".repeat(70)+"\n"
		         + " 회사명      직종타입         사업자등록번호    자본금        \n"
		         + "-".repeat(70)); 
		
	}

	//4.구인회사검색하기
		private void search_company(Scanner sc, Company[] cp_arr) {
			
			
		}//end void 
	
	
	// === 구직자 모두보기 === //
	public void view_all_info(Gujikja[] gu_arr) {
		
	/*
	    ---------------------------------------------------------------------------------
	      아이디   비밀번호         성명     생년월일       성별   현재만나이   가입일자
	    ---------------------------------------------------------------------------------
	      eomjh	  Qwe******	    엄정화	1986-10-20	   여	 38	   2025-04-04 10:07:05
          leess	  Abc*******	이순신	1986-04-01	   남	 39	   2025-04-04 10:07:05
          chaew	  Wxy******	    차은우	2001-06-05	   남	 23	   2025-04-04 10:07:05
	    ----------------------------------------------------------------------------------  
	*/
		
		if(Gujikja.count == 0) {
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");
		}
		
		else {
			title(); 
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<Gujikja.count; i++) {
				sb.append(gu_arr[i].getInfo()+"\n"); 
			}// end of for----------------------------
			
			System.out.println(sb.toString());
		}
		
	}// end of public void view_all_info(Gujikja[] gu_arr)----------------------------

    // 타이틀 
	private void title() {
		System.out.println("-".repeat(70)+"\n"
				         + " 아이디   비밀번호       성명      생년월일       성별   현재만나이   가입일자 \n"
				         + "-".repeat(70)); 
	}// end of void title()------------------------------

	
    // === 검색하기 ===
	void search_menu(Scanner sc, Gujikja[] gu_arr) {
		
		String str_menuno = "";
		do {
			System.out.println("\n === 검색메뉴 ===\n"
			                 + "1.연령대검색   2.성별검색   3.연령대 및 성별 검색하기   4.메인메뉴로 돌아가기\n"); 
			System.out.print("▷ 메뉴번호 선택 : ");
			
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1":  // 연령대검색
					search_ageLine(sc, gu_arr);      
					break;
					
				case "2":  // 성별검색
					search_gender(sc, gu_arr);      
					break;	
					
				case "3":  // 연령대 및 성별 검색하기
					search_ageLine_gender(sc, gu_arr);
					break;
					
				case "4":  // 메인메뉴로 돌아가기 
					
					break;				
		
				default:
					System.out.println("[경고] 검색메뉴에 존재하는 번호만 입력하세요!!\n");
					break;
			}// end of switch (str_menuno)--------------------
			
		} while(!("4".equals(str_menuno)));
		// end of do~while------------------------
		
	}// end of void search_menu(Scanner sc)------------------------


	
	// == 연령대 검색 == 
	void search_ageLine(Scanner sc, Gujikja[] gu_arr) {
		
		if(Gujikja.count == 0) { // 구직자가 없는 경우
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");
		}	
		
		else { // 구직자가 있는 경우
			
			boolean isUse_ageLine = false;
			String str_ageLine = "";
			
			do {
				System.out.print("▷ 검색하고자 하는 연령대[예: 20] => ");
				str_ageLine = sc.nextLine(); // "0" "10" "20" "30" "40" "50" "60" "70" "80" --> 정상 
	                                         // "25" "강아지" "-20" --> 비정상
				
				switch (str_ageLine) {
					case "0":
					case "10":
					case "20":
					case "30":
					case "40":
					case "50":
					case "60":
					case "70":
					case "80":
						isUse_ageLine = true;
						break;
		
					default:
						System.out.println("[경고] 올바른 연령대를 입력하세요!!\n");
						break;
				}// end of switch (str_ageLine)------------------------
			} while(!isUse_ageLine);
			// end of do~while---------------------------------
			
			
			// == 입력받은 연령대에 해당하는 구직자 찾기 == //
			StringBuilder sb = new StringBuilder();
			boolean isFind = false;
			
			for(int i=0; i<Gujikja.count; i++) {
				
				try {
					 int ageLine = MyUtil.age( gu_arr[i].getJubun() )/10*10;
					                        // 38  ==> 30
					                        // 39  ==> 30
					                        // 23  ==> 20 
					 if(Integer.parseInt(str_ageLine) == ageLine) {
						 isFind = true;
						 sb.append(gu_arr[i].getInfo()+"\n");
					 }
				} catch (Exception e) {	}
				
			}// end of for-------------------------------------
			
			if(isFind) {
				title();
				System.out.println(sb.toString());
			}
			else {
				System.out.println("[검색결과 연령대 " + str_ageLine + "대인 구직자는 없습니다]\n");
			}
			
		}// end of if~else-----------------------
		
	}// end of void search_ageLine(Scanner sc)---------------------
	
	
	// == 성별 검색 == 
	void search_gender(Scanner sc, Gujikja[] gu_arr) {
		
		if(Gujikja.count == 0) { // 구직자가 없는 경우
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");
		}	
		
		else { // 구직자가 있는 경우
			
			boolean isUse_gender = false;
			String input_gender = "";
			
			do {
				System.out.print("▷ 검색하고자 하는 성별[남/여] => ");
				input_gender = sc.nextLine(); // "남" "여" "   남" "여    " "   남   " "   여   " --> 정상 
	                                          // "" "       " "강아지" --> 비정상
				
				switch (input_gender.trim()) {
					case "남":
					case "여":
						isUse_gender = true;
						break;
		
					default:
						System.out.println("[경고] \"남\" 또는 \"여\" 만 입력하세요!!\n");
						break;
				}// end of switch (str_ageLine)------------------------
			} while(!isUse_gender);
			// end of do~while---------------------------------
			
			
			// == 입력받은 성별에 해당하는 구직자 찾기 == //
			StringBuilder sb = new StringBuilder();
			boolean isFind = false;
			
			for(int i=0; i<Gujikja.count; i++) {
				
				if(input_gender.trim().equals(gu_arr[i].gender()) ) {
					isFind = true;
					sb.append(gu_arr[i].getInfo()+"\n");
				}
				
			}// end of for-------------------------------------
			
			if(isFind) {
				title();
				System.out.println(sb.toString());
			}
			else {
				System.out.println("[검색결과 성별 " + input_gender.trim() + "자 구직자는 없습니다]\n");
			}
			
		}// end of if~else----------------------------------
		
	}// end of void search_gender(Scanner sc, Gujikja[] gu_arr)-------------	
	
	
	// == 연령대 및 성별 검색하기 ==
	void search_ageLine_gender(Scanner sc, Gujikja[] gu_arr) {
	
		if(Gujikja.count == 0) { // 구직자가 없는 경우
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");
		}	
		
		else { // 구직자가 있는 경우
			
			boolean isUse_ageLine = false;
			String str_ageLine = "";
			
			do {
				System.out.print("▷ 검색하고자 하는 연령대[예: 20] => ");
				str_ageLine = sc.nextLine(); // "0" "10" "20" "30" "40" "50" "60" "70" "80" --> 정상 
	                                         // "25" "강아지" "-20" --> 비정상
				
				switch (str_ageLine) {
					case "0":
					case "10":
					case "20":
					case "30":
					case "40":
					case "50":
					case "60":
					case "70":
					case "80":
						isUse_ageLine = true;
						break;
		
					default:
						System.out.println("[경고] 올바른 연령대를 입력하세요!!\n");
						break;
				}// end of switch (str_ageLine)------------------------
			} while(!isUse_ageLine);
			// end of do~while---------------------------------
			
			
			// == 입력받은 연령대에 해당하는 구직자 찾기 == //
			boolean isFind_ageline = false;
			
			for(int i=0; i<Gujikja.count; i++) {
				
				try {
					 int ageLine = MyUtil.age( gu_arr[i].getJubun() )/10*10;
					                        // 38  ==> 30
					                        // 39  ==> 30
					                        // 23  ==> 20 
					 if(Integer.parseInt(str_ageLine) == ageLine) {
						 isFind_ageline = true;
						 break;
					 }
				} catch (Exception e) {	}
				
			}// end of for-------------------------------------
			
			if(!isFind_ageline) { // 검색하고자 하는 연령대에 해당하는 구직자가 존재하지 않는 경우
				System.out.println("[검색결과 연령대 " + str_ageLine + "대인 구직자는 없습니다]\n");
				return; // 해당 메소드(search_ageLine_gender()) 를 종료하는 것이다.
			}
			
			else { // 검색하고자 하는 연령대에 해당하는 구직자가 존재하는 경우
				
				// === !! 입력받은 연령대 및 성별에 해당하는 구직자 찾기 !! === //
				boolean isUse_gender = false;
				String input_gender = "";
				
				do {
					System.out.print("▷ 검색하고자 하는 성별[남/여] => ");
					input_gender = sc.nextLine(); // "남" "여" "   남" "여    " "   남   " "   여   " --> 정상 
		                                          // "" "       " "강아지" --> 비정상
					
					switch (input_gender.trim()) {
						case "남":
						case "여":
							isUse_gender = true;
							break;
			
						default:
							System.out.println("[경고] \"남\" 또는 \"여\" 만 입력하세요!!\n");
							break;
					}// end of switch (str_ageLine)------------------------
				} while(!isUse_gender);
				// end of do~while---------------------------------
				
				
				StringBuilder sb = new StringBuilder();
				boolean isFind_ageline_gender = false;
				
				for(int i=0; i<Gujikja.count; i++) {
					
					try {
						if( Integer.parseInt(str_ageLine) == MyUtil.age(gu_arr[i].getJubun())/10*10
							&& input_gender.trim().equals(gu_arr[i].gender()) ) {
							
							isFind_ageline_gender = true;
							sb.append(gu_arr[i].getInfo()+"\n");
						}
					} catch(Exception e) {
						
					}
					
				}// end of for-------------------------------------
				
				if(isFind_ageline_gender) {
					title();
					System.out.println(sb.toString());
				}
				else {
					System.out.println("[검색결과 연령대가 " + str_ageLine + "대인 " + input_gender.trim() + "자 구직자는 없습니다]\n");
				}
				
			}
			
		}// end of if~else-----------------------		
		
	}// end of void search_ageLine_gender(Scanner sc, Gujikja[] gu_arr)--------------

	
	
}
