package my.day03.b.sungjuk;

import java.util.Scanner;

public class Main_sungjuk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Sungjuk sj = new Sungjuk(); // 기본 생성자 
		
		System.out.print("1. 학번 : ");
		sj.hakbun = sc.nextLine(); // "091234"
		
		System.out.print("2. 성명 : ");
		sj.name = sc.nextLine(); // "이순신"
		
		String str_input = "";
		int status = 0 ; 
		
		
		 try {
			// === ****** 데이터의 유효성 검사하기 ( 올바른 데이터인지 , 틀린 데이터인지 검사하는것)
		status = 1;
		System.out.print("3. 국어 : ");
		str_input = sc.nextLine();
		byte kor = Byte.parseByte(str_input);	// 90 
												// 101 x
												//-30 x
												//234567 x
												// "똘똘이"
		if( !sj.check_jumsu(kor)) { //kor 값이 byte 타입의 해당하는 숫자이지만 0 미만 또는 100이상일 경우 
			sc.close();
			
			return; // return 을 만나면 해당 메소드( 지금은 main() 메소드가) 종료된다 
		
		}
		else { 
			// kor 값이 0이상 100 이하인 경우 
			sj.kor = kor; 
		}
		status = 2; 
		System.out.print("4. 영어 : ");
		str_input =  sc.nextLine();
		byte eng = Byte.parseByte(str_input);	// 90 
												// 101 x
												//-30 x
												//234567 x
												// "똘똘이"
		if( !sj.check_jumsu(eng)) { //eng 값이 byte 타입의 해당하는 숫자이지만 0 미만 또는 100이상일 경우 
			sc.close();
			
			return; // return 을 만나면 해당 메소드( 지금은 main() 메소드가) 종료된다 
		
		}
		else { 
			// eng 값이 0이상 100 이하인 경우 
			sj.eng = eng; 
		}
		status = 3;
		System.out.print("5. 수학 : ");
		str_input =  sc.nextLine();
		byte math = Byte.parseByte(str_input);	// 90 
												// 101 x
												//-30 x
												//234567 x
												// "똘똘이"
		if( !sj.check_jumsu(math)) { //math 값이 byte 타입의 해당하는 숫자이지만 0 미만 또는 100이상일 경우 
			sc.close();
			
			return; // return 을 만나면 해당 메소드( 지금은 main() 메소드가) 종료된다 
		
		}
		else { 
			// math 값이 0이상 100 이하인 경우 
			sj.math = math; 
		}
		
		status = 4;
		System.out.print("6. 나이 : ");
		str_input =  sc.nextLine();
		short age = Short.parseShort(str_input);
		
		if(!sj.check_age(age)) { 
			sc.close();
			return;
		} else {
			sj.age = age; 
			
		}
		sj.sungjuk_print();
		
		/*
        === 이순신님의 성적결과 ===
        1. 학번 : 091234
        2. 성명 : 이순신
        3. 국어 : 90
        4. 영어 : 80
        5. 수학 : 78
        6. 평균 : 82.66666666666667
        7. 학점 : B
        8. 나이 : 26세
      */
		
		} catch (NumberFormatException e) {
			
			String data = "";
			
			if( status == 1 ) {
				data = "국어";
				
				
			} else if ( status == 2) { 
				data = "영어";
					}
			else if ( status == 3) {
				data = "수학";
			}
			else {
				data ="나이";
			}
			System.out.println(" >> 입력하신 "+data+" "+str_input+" 는 올바른 데이터가 아닙니다 <<");
		
		}
		
		
		
		
		
		
		
		

	}

}
