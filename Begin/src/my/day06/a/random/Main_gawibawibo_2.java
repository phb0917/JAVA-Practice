package my.day06.a.random;

import java.util.Random;
import java.util.Scanner;

public class Main_gawibawibo_2 {

/*
	============= 메뉴 ==============
	1.가위  2.바위  3.보  4.게임종료
	================================
	>> 선택하세요 => 5엔터
	[경고] 메뉴에 존재하지 않는 번호입니다!!
	
	>> 선택하세요 => 똘똘이엔터
	[경고] 정수로만 입력하세요!!
	
	>> 선택하세요 => 2
	>> 사용자님이 이겼습니다!!^^   이긴경우
	>> 사용자님이 졌습니다ㅜㅜ     진경우
	>> 비겼습니다~~             비긴경우
	
	============= 메뉴 ==============
	1.가위 2.바위 3.보 4.게임종료
	================================
	>> 선택하세요 => 4
	
	>> 프로그램 종료 <<
*/	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rndom = new Random();
		
		int choice_num = 0; // 사용자가 입력한 메뉴번호 
		
		do {
			System.out.println("============== 메뉴 ==============\n"
					         + "1.가위\t2.바위\t3.보\t4.게임종료\n"
					         + "=================================");
			System.out.print(">> 선택하세요 => ");
			
			try {
				 choice_num = Integer.parseInt(sc.nextLine()); // 5 
				                                               // 똘똘이
				                                               // 1 ~ 4 가능
				 if( !(1 <= choice_num && choice_num <= 4) ) {
					 System.out.println("[경고] 메뉴에 존재하지 않는 번호입니다!!\n");
					 continue; // do~while 문에서 continue;를 만나면 while(조건)에 들어간다.
				 }
				 
				 if(choice_num != 4) { // 사용자가 메뉴번호를 1~3 을 선택한 경우
					 
					 /*
					    PC 도 1 또는 2 또는 3 중에 하나를 랜덤하게 내야 한다.
					    // 처음얼마부터 마지막얼마까지 랜덤한 정수
					    // ==> rndom.nextInt(마지막수 - 처음수 + 1) + 처음수;  
					 */
					 int pc_num = rndom.nextInt(3 - 1 + 1) + 1; // 1 ~ 3
					 
					 String str_user_choice = "", str_pc_choice = "";
					 
					 switch (choice_num) {
						case 1:
							str_user_choice = "가위";
							break;
	
						case 2:
							str_user_choice = "바위";
							break;
							
						case 3:
							str_user_choice = "보";
							break;							
					 }// end of switch (choice_num)-------------
					 
					 switch (pc_num) {
						case 1:
							str_pc_choice = "가위";
							break;
	
						case 2:
							str_pc_choice = "바위";
							break;
							
						case 3:
							str_pc_choice = "보";
							break;							
					 }// end of switch (pc_num)-------------
					 
					 String msg = ">> 사용자:"+str_user_choice+", 컴퓨터:"+str_pc_choice+" ";
					 
					 // 사용자가 이긴 경우
					 if( (choice_num == 1 && pc_num == 3) ||
					     (choice_num == 2 && pc_num == 1) ||
					     (choice_num == 3 && pc_num == 2) ) {
						 msg += "사용자님이 이겼습니다!!^^\n";
					 }
					 
					 // 사용자가 진 경우
					 else if( (pc_num == 1 && choice_num == 3) ||
						      (pc_num == 2 && choice_num == 1) ||
						      (pc_num == 3 && choice_num == 2) ) {
						  msg += "사용자님이 졌습니다!!ㅜㅜ\n";
					 }
					 
					 // 사용자와 PC가 비긴 경우
					 else {
						 msg += "비겼습니다~~\n";
					 }
					 
					 System.out.println(msg);
				 }
				 
			} catch(NumberFormatException e) {
				System.out.println("[경고] 정수로만 입력하세요!!\n");
			}
			
		} while (!(choice_num == 4));
		// end of do~while----------------------------
		
		sc.close();
		System.out.println("\n>> 프로그램 종료 <<");
	}// end of main(String[] args)-------------------------

}






