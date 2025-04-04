package my.day11.inheritance;

import java.util.Scanner;

import my.util.MyUtil;

public class Ctrl_gujikja {

	// == 메인 메뉴를 보여주는 메소드 생성하기 == //
	void main_menu() {
		System.out.println("\n === 메인메뉴 ===\n"
				         + "1.구직자 회원가입   2.구직자 모두보기   3.검색하기   4.프로그램종료\n");
		System.out.print("▷ 메뉴번호 선택 : ");
	}// end of void main_menu()-----------------------------------

	
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
	void title() {
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
