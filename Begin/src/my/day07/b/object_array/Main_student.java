package my.day07.b.object_array;

import java.util.Scanner;



/*
	================== >> 메뉴 << ==============================
	 1.학생점수입력  2.모든학생성적출력  3.특정학생성적출력   4.프로그램종료
	===========================================================
	▷ 메뉴번호선택 : 5
	>> [경고] 메뉴에 없습니다.
	
	▷ 메뉴번호선택 : 1
	>> 학생점수입력 <<
	1) 학번 : 001
	2) 성명 : 이순신
	3) 국어 : 110
	>> [경고] 점수는 0 ~ 100 만 가능합니다. 
	3) 국어 : 90
	4) 영어 : 100  
	5) 수학 : 80
	== 학생점수입력 완료 ==
	
	================== >> 메뉴 << ==============================
	 1.학생점수입력  2.모든학생성적출력  3.특정학생성적출력   4.프로그램종료
	===========================================================
	▷ 메뉴번호선택 : 1
	>> 정원(3명)마감되어 더이상 학생점수입력이 불가합니다.
		
		
	================== >> 메뉴 << ==============================
	 1.학생점수입력  2.모든학생성적출력  3.특정학생성적출력   4.프로그램종료
	===========================================================   	
	▷ 메뉴번호선택 : 2
		
	=====>> 모든학생성적출력 <<=====
	----------------------------------------------
	학번  성명   국어   영어  수학  총점  평균  학점  등수 
	----------------------------------------------
	001  이순신  90   100  80   270  90.0   A   2
	002  엄정화  100  100  100  300  100.0  A   1
	003  차은우  80   80   80   240  80.0   B   3
	----------------------------------------------
		
		
	================== >> 메뉴 << ==============================
	 1.학생점수입력  2.모든학생성적출력  3.특정학생성적출력   4.프로그램종료
	===========================================================   	
	▷ 메뉴번호선택 : 3
	>> 조회할 학번 : 004
	>> [경고] 학번 004 는 존재하지 않습니다.
		
	================== >> 메뉴 << ==============================
	 1.학생점수입력  2.모든학생성적출력  3.특정학생성적출력   4.프로그램종료
	===========================================================   	
	▷ 메뉴번호선택 : 3
	>> 조회할 학번 : 002
		
	----------------------------------------------
	학번  성명   국어   영어  수학  총점  평균  학점  등수 
	----------------------------------------------
	002  엄정화  100  100  100  300  100.0  A   1  
	----------------------------------------------
		
		
	================== >> 메뉴 << ==============================
	 1.학생점수입력  2.모든학생성적출력  3.특정학생성적출력   4.프로그램종료
	===========================================================   	
	▷ 메뉴번호선택 : 4
		  
	>> 프로그램 종료!!! <<  
*/

public class Main_student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] arr_student = new Student[3]; 
		int cnt_student = 0;
		
		String str_menuno = "";
		
		do {
			System.out.println("================== >> 메뉴 << ==============================\n"
					         + " 1.학생점수입력  2.모든학생성적출력  3.특정학생성적출력   4.프로그램종료\n"
					         + "===========================================================");
			System.out.print("▷ 메뉴번호선택 : ");
			
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": // 학생점수입력
					
					if(cnt_student < arr_student.length) {
						System.out.println(">> 학생점수입력 <<");
					    
						String hakbun = "";
						for(;;) {
							System.out.print("1) 학번 : ");
						    hakbun = sc.nextLine();
						    
						    // ========== 학번 중복검사하기 =========== //
						    boolean isDupicate_hakbun = false;
						    for(int i=0; i<cnt_student; i++) {
						    	if(hakbun.equals(arr_student[i].hakbun)) {
						    		System.out.println(">> [경고] "+ hakbun + " 학번은 이미 사용중입니다.\n");
						    		isDupicate_hakbun = true;
						    		break;
						    	}
						    }// end of for--------------------
						    
						    if(!isDupicate_hakbun) break;
							// ===================================== //
						}// end of for------------------
					    
					    System.out.print("2) 성명 : ");
					    String name = sc.nextLine();
					    
					    int kor=0, eng=0, math=0; 
					    
					    for(;;) {
						    System.out.print("3) 국어 : ");
						    String str_kor = sc.nextLine();
						    try {
							    kor = Integer.parseInt(str_kor); // 똘똘이  꽝!!
							                                     //  110   꽝!!
							                                     //   90   정상
							    if( !(0 <= kor && kor <= 100) ) 
							    	System.out.println(">> [경고] 점수는 0 ~ 100 만 가능합니다."); 
							    else break;
							    
						    } catch(NumberFormatException e) {
						    	System.out.println(">> [경고] 점수입력은 정수로만 하세요!!");
						    }
					    }// end of for------------------------
					    
					    
					    for(;;) {
						    System.out.print("4) 영어 : ");
						    String str_eng = sc.nextLine();
						    try {
							    eng = Integer.parseInt(str_eng); // 똘똘이  꽝!!
							                                     //  110   꽝!!
							                                     //   90   정상
							    if( !(0 <= eng && eng <= 100) ) 
							    	System.out.println(">> [경고] 점수는 0 ~ 100 만 가능합니다."); 
							    else break;
							    
						    } catch(NumberFormatException e) {
						    	System.out.println(">> [경고] 점수입력은 정수로만 하세요!!");
						    }
					    }// end of for------------------------
					    
					    
					    for(;;) {
						    System.out.print("5) 수학 : ");
						    String str_math = sc.nextLine();
						    try {
							    math = Integer.parseInt(str_math); // 똘똘이  꽝!!
							                                       //  110   꽝!!
							                                       //   90   정상
							    if( !(0 <= math && math <= 100) ) 
							    	System.out.println(">> [경고] 점수는 0 ~ 100 만 가능합니다."); 
							    else break;
							    
						    } catch(NumberFormatException e) {
						    	System.out.println(">> [경고] 점수입력은 정수로만 하세요!!");
						    }
					    }// end of for------------------------
					    
					    Student st = new Student();
					    st.hakbun = hakbun;
					    st.name = name;
					    st.kor = kor;
					    st.eng = eng;
					    st.math = math;
					    
					    arr_student[cnt_student++] = st;
					    
					    System.out.println("== 학생점수입력 완료 ==\n");
					}
					
					else {
						System.out.println(">> 정원(3명)마감되어 더이상 학생점수입력이 불가합니다.\n");
					}
					
					break;
				
					
				case "2": // 모든학생성적출력
					
					if(cnt_student == 0) {
						System.out.println(">> 가입된 학생정보가 없습니다.\n");
					}
				    
					else {
					    System.out.println("-----------------------------------------------------------------\n"
					    		         + " 학번   성명   국어   영어   수학   총점     평균      학점        등수\n"
					    		         + "-----------------------------------------------------------------");   
					    
						for(int i=0; i<cnt_student; i++) {
							int rank = 1;
							for(int j=0; j<cnt_student; j++) {
								
								if(i != j && arr_student[i].getToal() < arr_student[j].getToal())
								   rank++;
							}// end of for-------------------------
							
							System.out.println(arr_student[i].getInfo() + rank);
						}// end of for--------------------
						System.out.println("");
						
					}
					
					break;
					
					
				case "3": // 특정학생성적출력
					
					if(cnt_student == 0) {
						System.out.println(">> 가입된 학생정보가 없습니다.\n");
					}
					else {
						System.out.print(">> 조회할 학번 : ");
						String serach_hakbun = sc.nextLine();
						
						boolean isExists = false;
						
						for(int i=0; i<cnt_student; i++) {
							if(serach_hakbun.equals(arr_student[i].hakbun)) {
								
								int rank = 1;
								for(int j=0; j<cnt_student; j++) {
									if(i != j && arr_student[i].getToal() < arr_student[j].getToal()) {
										rank++;
									}
								}// end of for--------------------
								
								System.out.println("-----------------------------------------------------------------\n"
					    		                 + " 학번   성명   국어   영어   수학   총점     평균      학점        등수\n"
					    		                 + "-----------------------------------------------------------------"); 
								System.out.println(arr_student[i].getInfo() + rank);
								isExists = true;
								break;
							}
						}// end of for-----------------------
						
						if(!isExists) {
							System.out.println(">> [경고] 학번 "+serach_hakbun+" 는(은) 존재하지 않습니다.");
						}
						
						System.out.println("");
					}
					
					break;
					
					
				case "4": // 프로그램종료
					
					break;					
	
				default:
					System.out.println(">> [경고] 메뉴에 없습니다.\n");
					break;
			}
			
		} while(!("4".equals(str_menuno)));
		
		sc.close();
		System.out.println("\n>> 프로그램 종료!!! <<");
	}// end of main(String[] args)--------------------------

}
