package my.day10.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class Ctrl_gujikja {

	// ==메인 메뉴를 보여주는 메소드 생성하기 == 
	void main_menu() {
		System.out.println("\n === 메인메뉴 === \n"
				 + "1. 구직자 회원가입	 2구직자 모두보기	3.검색하기	4.프로그램종료 \n");
		System.out.println("> 메뉴번호 선택 : ");
	
	
	}//end void 

	//=== 구직자 회원가입 == 
	/*
	  구직자(Gujikja) 신규회원가입시 
	  gujikja 클래스의 field 의 요구사항에 모두 맞으면 
	  Gujikja[] gu_arr 에 저장시켜주는 메소드 생성하기 
	 */
	void register(Scanner sc,Gujikja[] gu_arr) {
		if(Gujikja.count < gu_arr.length) { // 지금까지 생성된 구직자 회원수가  gu_arr.length(정원 ) 보다 적을 경우에만 신규회원을 받아들인다
			String userid;
			String passwd;
			String name;
			String jubun;
			boolean isUse_userid ;
			do {
			isUse_userid = true;
			System.out.println("1.아이디 : ");
			userid = sc.nextLine(); // " " 또는 "      " 공백만으로는 입력이 안되어야한다 
										   // "eomjh" "leess" "chaew" 는 현재 사용중인 아이디 이므로 입력불가해야함
			if(userid.isBlank()) {		   // "hongkd" 정상 
				System.out.println(">> 아이디는 필수 입력사항입니다 <<\n");
				isUse_userid = false;
			}
			else {
				// == 가입된 회원 들에 대해 중복아이디 검사하기 == 
				for(int i = 0; i<Gujikja.count; i++) {
					if(userid.equals(gu_arr[i].userid)) {
						System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
						isUse_userid = false;
						break;
					}
				}// end for
			
			}
			
			}while(!isUse_userid);//end do while
			// 비밀번호는 필수 입력 사항 
			//"[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합되어야만 합니다.\n"
			
				
			
			
			
			boolean isUse_passwd ;
			do {
			isUse_passwd = true;
			System.out.println("2.비밀번호 : ");
			passwd = sc.nextLine(); // " " 또는 "      " 공백만으로는 입력이 안되어야한다 
										   // "eomjh" "leess" "chaew" 는 현재 사용중인 아이디 이므로 입력불가해야함
			if(!MyUtil.isCheckPasswd(passwd)) {		   // "hongkd" 정상 
				System.out.println("[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합되어야만 합니다.\n");
				isUse_passwd = false;
			}
			
			
			
			
			}while(!isUse_passwd);//end do while
			// 성명은 필수 입력사항이므로 그냥 엔터나 공백만으로 된 것이 아닐때 까지 반복해야 한다.
	        // 성명은 2글자 이상 6글자 이하의 한글로만 되어져야 한다.
			boolean isuse_name;
			do {
			isuse_name = true;
			System.out.println("3.성명 : ");
			name = sc.nextLine();
			
			if(name.isBlank()) {		    
				System.out.println(">> 이름는 필수 입력사항입니다 <<\n");
				isuse_name = false;
			}
			else {
				char[] ch_arr = name.toCharArray();
				if (name.length()< 2||name.length()>6) {
					
					isuse_name = false;
				}
				else {
					for(int i=0; i<ch_arr.length; i++) {
						if(!('가' <= ch_arr[i] && ch_arr[i] <='힣'))
					isuse_name = false; 
						break;
					}
				}
			if(!isuse_name) {
				System.out.println("[경고] 성명은 공백없이 2글자 이상 6글자 이하의 한글로만 되어져야합니다");
			}
			}
				
			}while(!isuse_name);
			
			// 주민번호는 필수입력사항이므로 주민번호 조건에 맞을때 까지 반복해야한다 .
			boolean isUse_jubun ;
			do {
			isUse_jubun = true;
			System.out.println("4. 주민번호 : ");
			jubun = sc.nextLine(); 
										   
			if(!MyUtil.isCheckJubun(jubun)) {		   // "hongkd" 정상 
				System.out.println("[경고] 올바른 주민번호를 입력하세요 .\n");
				isUse_jubun = false;// "9610021" "9610022"  정상
						            // "0010023" "0010024"  정상
						            // "9604311" "9604312"  "0004313"  "0004314" 비정상
						            // "9610025" "0010026"  비정상 
			}
			
			
			
			
			}while(!isUse_jubun);//end do while
			
			Gujikja gu = new Gujikja();
			gu.userid = userid;
			gu.passwd = passwd;
			gu.name = name;
			gu.jubun = jubun;
			
			gu_arr[Gujikja.count++] = gu;
			
			System.out.println(">> 구직자 회원가입 성공!! << \n");
			
		}
		else { // 지금까지 생성된 구직자 회원수가  gu_arr.length(정원 ) 보다 같거나 큰경우에는 신규회원을 받아들이지 않는다 
			System.out.println(">> 정원" + gu_arr.length + "명이 꽉차서 구직자 회원가입이 불가합니다 ");
		}
	}	//end void
	}
	
	
	
	
	
	

