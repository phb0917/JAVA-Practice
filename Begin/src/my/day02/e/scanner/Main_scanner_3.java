package my.day02.e.scanner;

import java.util.Scanner;

public class Main_scanner_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수를 입력하세요"); 
		
		String inputStr = sc.nextLine(); //
		try {
		//	byte n = (byte)(Byte.parseByte(inputStr) + 10);
			// 그냥넣으면 문자의 타입이 다르기 때문에 형번환 시켜주는 integer.parseint 삽입
			
			//short n = short(Short.parseShort(inputStr)) +10; // "103" + 10 > "10310" 
			// 그냥넣으면 문자의 타입이 다르기 때문에 형번환 시켜주는 Short.parseShort 삽입
		
			//long n = long(Long.parseLong(inputStr)) +10; // "103" + 10 > "10310" 
			// 그냥넣으면 문자의 타입이 다르기 때문에 형번환 시켜주는 Long.parseLong 삽입	
		
		int n = Integer.parseInt(inputStr) +10; // "103" + 10 > "10310" 
		// 그냥넣으면 문자의 타입이 다르기 때문에 형번환 시켜주는 integer.parseint 삽입			 
		System.out.println("입력한 정수" + inputStr + "에 10을 더한값 :" + n);
		} catch(NumberFormatException e) { 
			System.out.println("경고" + inputStr + "정수가 아닙니다 정수를 입력하세요");
		}

		
	}

}
