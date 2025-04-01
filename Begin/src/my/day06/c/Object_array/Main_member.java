package my.day06.c.Object_array;

import java.util.Scanner;

import my.util.MyUtil;

public class Main_member {

	public static void main(String[] args) {
		
		Member[] arr_mbr = new Member[3];
		int mbr_cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String str_menuno = "";
		do {
			System.out.println("\n============ >> 메뉴 << ============\n"
			                 + "1.회원가입   2.모든회원조회   3.프로그램종료\n"
			                 + "=====================================");
			System.out.print("▷ 선택하세요 => ");	
			
			str_menuno = sc.nextLine();     // "  똘똘이   " , "이순신" , "  엄  정화   "
			str_menuno = str_menuno.trim(); // "  똘똘이   ".trim() ==>  "똘똘이"
			                                // "이순신".trim() ==> "이순신"
			                                // "  엄  정화   ".trim() ==> "엄  정화"
			//  "   3 ".trim();  ==> "3" 
			//  "3".trim();  ==> "3"
			
			switch (str_menuno) {
				case "1": // 회원가입
					
					if(mbr_cnt < arr_mbr.length) {
					
						String id=null, passwd=null, name=null;
						id_input:
						do {
							// ============================================= //
							System.out.print("\n▣아이디 : ");
							id = sc.nextLine(); // "    leess   ",  "          ", ""
						 
						//	System.out.println(id);
						//	System.out.println(MyUtil.deleteSpace(id)); 
						    // JDK 11 이전 방법
						/*
							if(id.trim().isEmpty()) {  // "leess".isEmpty() ==> false
							                           // "      ".isEmpty() ==> false
							                           // "".isEmpty() ==> true
							                           // "".isEmpty() ==> true
								System.out.println(">>[경고] 아이디값을 공백이 아닌 다른 값으로 입력하세요!!\n"); 
							}
						*/
						 // JDK 11 이후 방법	
							if(id.isBlank()) {  // "    leess   ".isBlank() ==> false
							                    // "          ".isBlank() ==> true
							                    // "".isBlank() ==> true
								System.out.println(">>[경고] 아이디값을 공백이 아닌 다른 값으로 입력하세요!!\n"); 
							}
							else {
								// === 입력한 아이디가 중복된 아이디 인지 검사하기 === //
								boolean id_duplicate = false; 
								
								for(int i =0; i< mbr_cnt; i++) {
								String exists_id = arr_mbr[i].id;
								if(id.equals(exists_id)) {
									System.out.println(">>[경고]입력하신 아이디 " + id + " 는 이미 사용중입니다. 새로운 아이디를 입력하세요");
									id_duplicate = true;
									break;
								}
								}
						
								if(!id_duplicate)  
								break id_input;
							}
								//break ; }
							// ============================================= //
						} while(true);
						
						
						// ======================================== //
						do {
							System.out.print("\n▣비밀번호 : ");
							passwd = sc.nextLine();
							if( !MyUtil.isCheckPasswd(passwd) ) 
								System.out.println(">>[경고] 비밀번호는 8글자 이상 15글자 이하의 영문 대,소문자 및 숫자 및 특수문자가 혼합되어야만 합니다.\n"); 
							else 
							    break;
						} while(true);
						// ======================================== //
						
						// 성명은 공백이 아닌 한글로만 되어야 하고, 글자길이는 2글자 이상 6글자 이하이어야 한다.
						do {
							System.out.print("\n▣성명 : ");
							name = sc.nextLine();
							
							boolean isUseName = true;
							
							if(name.length() < 2 || name.length() > 6) {
								isUseName = false;
							}
							else { // 입력한 성명의 길이가 2글자 이상 6글자 이하인 경우 
								// 성명은 공백이 아닌 한글로만 되어있는지 검사하기 
								for(int i=0; i<name.length(); i++) {
									if( !('가' <= name.charAt(i) && name.charAt(i) <= '힣') ) {
										isUseName = false;
										break;
									}
								}// end of for-------------------
							}
							
							if(isUseName)
								break;
							else
							    System.out.println(">>[경고]성명은 공백이 없는 한글로만 2글자 이상 6글자 이하로 입력하세요!! \n");
							
						} while(true);
						
						// == 데이터 유효성 검사가 끝난후 입력한 데이터를 가지고 Member 객체를 생성해야 한다. == //
						Member mbr = new Member();
						mbr.id = MyUtil.deleteSpace(id); // id 값에 좌,우 또는 가운데에 공백이 있으면 제거한 후 id 필드에 입력하기 
						mbr.passwd = passwd;
						mbr.name = name;
						
						arr_mbr[mbr_cnt++] = mbr;
						
						System.out.println(">> 회원가입 성공!! <<\n");
					}
					
					else {
						System.out.println(">> 정원마감되어 회원가입이 불가합니다!! <<\n");
					}
					// =========================================================== //
					
					break; // switch 문을 빠져나간다.
					
					
				case "2": // 모든회원조회
					if (mbr_cnt == 0)
					System.out.println(">> 현재 가입된 회원이 없습니다. << \n");
					else {
					System.out.println("------------------------------------------\n"
										+ " 아이디 비밀번호 성명\n "
									  +"-----------------------------------------");
					for(int i = 0; i<mbr_cnt; i++) {
						System.out.println(arr_mbr[i].view_info());
					
					
					}
					}
					
					
					
					
					
					break; // switch 문을 빠져나간다.
					
				case "3": // 프로그램종료
					
					break; // switch 문을 빠져나간다. 				
	
				default:   // 메뉴에 존재하지 않는 값
					System.out.println("== [경고] 메뉴에 없는 것입니다.==\n");
					break; // switch 문을 빠져나간다.
			}// end of switch (key)------------------------
			
		} while (!("3".equals(str_menuno)));
				
		sc.close();
		System.out.println("\n==== 프로그램 종료 ====");
		
	}// end of main(String[] args)----------------------------

}
