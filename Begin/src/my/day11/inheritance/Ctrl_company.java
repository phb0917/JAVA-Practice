package my.day11.inheritance;

import java.util.Scanner;

public class Ctrl_company {
	
	// 2.구인회사 회원가입 
	// == 구직자 회원가입 ==
	/*
	   구인회사(company) 신규 회원가입시
	   company 클래스의 field 의 요구사항에 모두 맞으면
	   company[] cp_arr 에 저장시켜주는 메소드 생성하기 
	*/
	void register(Scanner sc,  Company[] cp_arr) {
		
		if(Company.count < cp_arr.length) { // 지금까지 생성된 구인회사 회원수가 gu_arr.length(==> 정원) 보다 적을 경우에만 신규회원을 받아들인다.  
		
			Company cp = new Company();
			
			// ===================================== //
			
			// 아이디는 필수 입력사항이면서 아이디 조건에 맞을때 까지 반복해야 한다.
			outer:
			do {
				System.out.print("1.아이디 : ");
				String id = sc.nextLine(); 
				
				// == 가입된 구인회사들에 대해 중복아이디 검사하기 == //
				for(int i=0; i<Company.count; i++) {
					if(id.equals(cp_arr[i].getId())) {
						System.out.println(">> 이미 사용중인 아이디 이므로 다른 아이디를 입력하세요 . <<\n");
				        continue outer;
					}
				}// end of for---------------------
				
				cp.setId(id);
				
			} while(!(cp.getId() != null));
			// end of do~while------------------------
			
			
			// 비밀번호는 필수 입력사항이면서 비밀번호 조건에 맞을때 까지 반복해야 한다.
			do {
				System.out.print("2.비밀번호 : ");
				String passwd = sc.nextLine(); 
				
				cp.setPasswd(passwd);

			} while (!(cp.getPasswd() != null));
			// end of do~while------------------------
		
			
			// 회사명은 필수 입력사항이므로 그냥 엔터나 공백만으로 된 것이 아닐때 까지 반복해야 한다.
			// 회사명은 공백없이 2글자 이상 6글자 이하의 한글로만 되어져야 한다.
			do {
				System.out.print("3.회사명 : ");
				String name = sc.nextLine(); 
				
				cp.setName(name);

			} while (!(cp.getName() != null));
			
			
			// 사업자등록번호는 필수 입력사항이므로 사업자등록번호 조건에 맞을때 까지 반복해야 한다.
			do {
				System.out.print("4.사업자등록번호 : ");
				String business_number = sc.nextLine(); 
				
				cp.setBusiness_number(business_number);

			} while (!(cp.getBusiness_number() != null));
			
			
			
			// 회사 직종 타입은 필수 입력사항이므로 조건이 맞을 때까지 반복해야한다 
			do {
				System.out.print("5.회사 직종 : ");
				String job_type = sc.nextLine(); 
				
				cp.setJob_type(job_type);

			} while (!(cp.getJob_type() != null));
			
			// 회사 직종 타입은 필수 입력사항이므로 조건이 맞을 때까지 반복해야한다 
			do {
				System.out.print("5.자본금 : ");
				long seed_money = 0;
				try {
				seed_money=Long.parseLong(sc.nextLine());
				}catch(NumberFormatException e) {
					System.out.println("[경고] 자본금은 숫자로만 입력하세요 ");
					continue;
				}
				
				
				cp.setSeed_money(seed_money);

			} while (!(cp.getSeed_money() > 0));
			// ===================================== //
			
			cp_arr[Company.count++] = cp;
			System.out.println(">> 구인회사 회원가입 성공 << \n");

			
		} 
		
		else { // 지금까지 생성된 구인회사 회원수가 gu_arr.length(==> 정원) 와 같거나 큰 경우에는 신규회원을 받아들이면 안된다. 
			System.out.println(">> 정원 " + cp_arr.length + "개가 꽉차서 구인회사 회원가입이 불가합니다.!! <<\n");
		}
		
	}// end of void register(Scanner sc, Company[] cp_arr )----------------------------
 
	//구인회사 로그인
	public Company login(Scanner sc, Company[] cp_arr) {
		
		System.out.print("> 구인회사 ID : ");
		String id = sc.nextLine();
		
		System.out.print("> 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i< Company.count; i++) {
			if(id.equals(cp_arr[i].getId())&&
			passwd.equals(cp_arr[i].getPasswd())) {
				return cp_arr[i];
			
			
		}
		
	}// end of login
		return null;
	}// end of 

	public void cp_menu(Scanner sc, Company login_cp) {
		String str_menuno = "";
		do {
		
			System.out.println("\n ===구인회사 전용메뉴(" + login_cp.getName() + "기업 로그인중) ===\n"
			         +  "1.우리회사정보 보기   2.우리회사 정보 수정   3.모든구직자조회   4.구직자검색하기\n"
                     + "5.채용공고입력   6.우리회사 채용공고조회   7.우리회사 채용공고 지원자조회   8.로그아웃\n");
			System.out.print("▷ 메뉴번호 선택 : ");
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": //1.우리회사정보 보기
					view_myinfo(login_cp);
					break;
				case "2": //2.우리회사 정보 수정
					update_myinfo(sc,login_cp);
					
					
					break; 
				case "3": //3.모든구직자조회
					
					break;
				
				case "4": //4.구직자검색하기
					
					break; 
				
				case "5": //5.채용공고입력
					
					break;
				
				case "6": // 6.우리회사 채용공고조회
					
					break;
				
				case "7": //7.우리회사 채용공고 지원자조회
					
					break;
				
				case "8": // 8.로그아웃
					
					break;
				
				
				
	
				default:
					System.out.println(">> [경고] 선택하신 번호는 메뉴에 없습니다 ");
					break;
			}//end switch
		
		
		
		}while(!"10".equals(str_menuno));	
		}
	

	
	//1.우리회사정보 보기
	private void view_myinfo(Company login_cp) {
/*
        
        >>> 삼성 기업의 정보 <<<
        ----------------------------------------------------------------------------------
          아이디     비밀번호      회사명   가입일자      사업자등록번호  직종타입   자본금
        ----------------------------------------------------------------------------------  
          samsung  Abcd1234$   삼성     2025-04-07  8123456789   제조업    8,000,000,000원
   */
		System.out.println(" >>>" + login_cp.getName() + "님의 정보 <<< ");
		title_company();
		System.out.println(login_cp.getcompanyInfo());
	}
		
	private void title_company() {
		System.out.println("-".repeat(70)+"\n"
		         + " 아이디   비밀번호        회사명       가입일자        사업자등록번호      직종타입       자본금 \n"
		         + "-".repeat(70)); 
		
	}

	//2.우리회사 정보 수정
	private void update_myinfo(Scanner sc, Company login_cp) {
		System.out.println("1. 비밀번호 :");
		
			view_myinfo(login_cp);
			
			System.out.println("\n>> [주의사항] 변경하지 않고 예전의 데이터값을 그대로 사용하시려면 그냥 엔터하세요!!\n");
			//===========================================================================//
			
			boolean exit_ok = false;
			
			do {
				System.out.println("1. 비밀번호 : ");
				String new_passwd = sc.nextLine(); 
				if (!new_passwd.equals("")) {//입력한 비밀번호 가 그냥 엔터가 아닐 경우 
					if(new_passwd.equals(login_cp.getPasswd())) { // 입력한 비밀번호가 기존 비밀번호와 같을 경우 
						System.out.println("기존비밀번호와 동일 함으로 변경이 불가 합니다");
					}
					else { // 입력한 비밀번호가 기존 비밀번호와 다를경우 
						login_cp.setPasswd(new_passwd);
						
						if(login_cp.getPasswd().equals(new_passwd)) { //비밀번호 정책에 맞는 경우 
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
			System.out.println("2. 회사명 : "); 
			String new_name = sc.nextLine(); 
			if(!new_name.equals("")) {
				if (new_name.equals(login_cp.getName())){
					System.out.println( "기존 회사명과 동일하므로 변경이 불가합니다.");
				}
				else {// 입력한 성명이 기존 성명과 다를경우
					login_cp.setName(new_name);
					if(login_cp.getName().equals(new_name)) { // 아이디 정책에 맞는 경우
						exit_ok = true;
						}
				}
				}
			else {//입력한 비밀번호 가 그냥 엔터일 경우 
				exit_ok = true;
				}// end if
			
			
			
			}while (!exit_ok);
			do {
				System.out.println("3. 사업자등록번호 : "); 

				String new_business_nuber = sc.nextLine(); 
				if(!new_business_nuber.equals("")) {
					if (new_business_nuber.equals(login_cp.getBusiness_number())){
						System.out.println( "기존 사업자번호와 동일하므로 변경이 불가합니다.");
					}
					else {// 입력한 성명이 기존 성명과 다를경우
						login_cp.setBusiness_number(new_business_nuber );
						if(login_cp.getBusiness_number().equals(new_business_nuber)) { // 아이디 정책에 맞는 경우
							exit_ok = true;}
					}
					}
				else {//입력한 비밀번호 가 그냥 엔터일 경우 
					exit_ok = true;
					}// end if
				
				
				}while (!exit_ok);
			
			
			do {
				System.out.println("4.회사 직종변경 : "); 

				String new_jobtype = sc.nextLine(); 
				if(!new_jobtype.equals("")) {
					if (new_jobtype.equals(login_cp.getJob_type())){
						System.out.println( "기존 직종과 동일하므로 변경이 불가합니다.");
					}
					else {// 입력한 성명이 기존 성명과 다를경우
						login_cp.setJob_type(new_jobtype);
						if(login_cp.getJob_type().equals(new_jobtype)) { // 아이디 정책에 맞는 경우
							exit_ok = true;}
					}
					}
				else {//입력한 비밀번호 가 그냥 엔터일 경우 
					exit_ok = true;
					}// end if
				
				
				}while (!exit_ok);
			
			do {
				System.out.println("5. 자본금 : ");
			try {
				String new_seedmoney = sc.nextLine();
			
				long moneyLong = Long.parseLong(new_seedmoney);
			
				if(!new_seedmoney.equals("")) {// 입력한 자본금이 엔터가 아닐경우 
					if (new_seedmoney.equals(login_cp.getSeed_money())){
						System.out.println( "기존 직종과 동일하므로 변경이 불가합니다.");
					}
					else {// 입력한 성명이 기존 성명과 다를경우
						login_cp.setSeed_money(moneyLong) ;
						if(login_cp.getSeed_money()==moneyLong) { //자본금이 같은 경우 
							exit_ok = true;}
					}
					}
				else {//입력한 자본금이 그냥 엔터일경우 
					exit_ok = true;
					}// end if
			}catch (NumberFormatException e) {
				System.out.println("[경고] 자본금은 숫자만 가능합니다 ");
			}
				
				}while (!exit_ok); 
			
			System.out.println("회원정보 변경 완료"); 
			
			/*do {
				System.out.println("5. 자본금 : ");
			
				String new_seedmoney = sc.nextLine();
			
				
			
				if(!new_seedmoney.equals("")) {// 입력한 자본금이 엔터가 아닐경우 
					
					String str_new_seedmoney = "";
			try {
				long new_seedmoney = Long.parseLong(String.join("", str_new_seedmoney.split("[,]")));
				if(login_cp.getSeed_money() == new_seedmoney) {
							
						
					if(login_cp.getSeed_money()== new_seedmoney) { //자본금이 같은 경우 
							exit_ok = true;
							System.out.println( "기본 자본금과 동일 하므로 변경이 불가합니다 \n");
					}
					else {// 입력한 성명이 기존 성명과 다를경우
						login_cp.setSeed_money(new_seedmoney) ;
						
					}
						
				}
				else {//입력한 자본금이 그냥 엔터일경우 
					exit_ok = true;
					}// end if
					}catch (NumberFormatException e) {
						
					
				System.out.println("[경고] 자본금은 숫자만 가능합니다 ");
							}
				
				}while (!exit_ok);
		
				
				*/
			
		}//end void
	
	
	

		
	
		
		
	}
	

	


	
	
	

