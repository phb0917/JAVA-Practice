package my.day03.b.sungjuk;

public class Sungjuk {

	// field
	String hakbun; // 0이 올수 있기때문에 string 타입
	String name ; 
	byte kor; // byte -128~ 127 까지 가능 		0~ 100 으로 제한
	byte eng; // byte -128~ 127 까지 가능 		0~ 100 으로 제한
	byte math; // byte -128~ 127 까지 가능   		0~ 100 으로 제한
	short age; // short -32768 ~ 32767 까지 가능 	20~ 50 으로 제한 
	
	// ====== method ==== 
	boolean check_jumsu(byte jumsu) { 
		
		if(0 <= jumsu && jumsu <= 100) {
			return true; // method 에서 return 을 만나면 해당 method 가 종료된다!
	}
		else {
			System.out.println("[경고] 입력하는 점수는 0 이상 100 이하 만 가능합니다 \n");
		return false; } 
		}// end of boolea check_jumsu(byte jumsu)
	
boolean check_age(short age) { 
		
		if( 20 <= age && age <= 50) {
			return true; // method 에서 return 을 만나면 해당 method 가 종료된다!
	}
		else {
			System.out.println("[경고] 입력하는 나이는 20 이상 50 이하 만 가능합니다 \n");
		return false; } 
		}// end of boolean check_age(short age)

	void sungjuk_print() {
		double avg = (double)(kor+eng+math)/3;
		char hakjum = ' ';
		
		if(avg >= 90 ) {
			 hakjum = 'A';
			
		}
		else if(avg >= 80) {
			hakjum = 'B';
		}
		else if(avg >= 70) {
			hakjum = 'C';
		}
		else if(avg >= 60) {
			hakjum = 'D';
		}
		else {
			hakjum = 'F';
		}
	System.out.println(
			"=== name님의 성적결과 ===\r\n"
			+ " 1. 학번 : "+hakbun+"\n"
			+ " 2. 성명 : "+name+"\n"
			+ " 3. 국어 : "+kor+"\n"
			+ " 4. 영어 : "+eng+"\n"
			+ " 5. 수학 : "+math+"\n"
			+ " 6. 평균 : "+avg+"\n"
			+ " 7. 학점 : "+hakjum+"\n"
			+ " 8. 나이 : "+age+" 세\n");
	
}//end of void sungjuk_print() --------------
	
	
}
