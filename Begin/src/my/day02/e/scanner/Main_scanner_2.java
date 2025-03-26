package my.day02.e.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_scanner_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 ==>");
		
		try {
			
		
		int inputnum = sc.nextInt(); //123
									 // 이순신
		sc.nextLine();
		
		System.out.println("입력한정수 :" + inputnum);
		} catch(InputMismatchException e) {
			System.out.println(">> 경고 : 정수만 입력하세요 !! <<");
			//e.printStackTrace();
		}
		
		sc.close();
		
		
	}

}
