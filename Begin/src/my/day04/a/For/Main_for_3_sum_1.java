package my.day04.a.For;

public class Main_for_3_sum_1 {

	public static void main(String[] args) {
		
		int sum = 0; // sum 누적의 합을 저장시키는 변수 
		
		for(int i=1; i<=10; i++) { 
			sum += i; // sum = sum+ i 와 같은 뜻이다 
		 // sum = 0 + 1; ==> 1번쨰 반복
		 // sum = 1 + 2; ==> 2번째 반복
		 // sum = 1 + 2 + 3 ==> 3번쨰 반복
			}
	System.out.println("1 부터 10 까지의 누적의 합계 : " + sum);
	
	 sum = 0; // sum 누적의 합을 저장시키는 변수
	 String str = ""; // str 은 문자열을 누적시킨 것을  저장시키는 변수
	 for(int i=1; i<=10; i++) {
		
		 if(i<10)
			 str += i+"+";
			 else 
		     str +=i;
		
		 sum +=i;
	 
	 }
	 System.out.println(str+"="+ sum);	
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	

	 sum = 0; // sum 누적의 합을 저장시키는 변수
	 str = ""; // str 은 문자열을 누적시킨 것을  저장시키는 변수
	
	for(int i=1; i<=10; i++) { 
	 
		String temp = (i<10)? i+"+" :i+"=";
		str += temp; // 1+2+3+4+5+6+7+8+9+10
		sum += i ;
		
	}
	
	System.out.println(str + sum);
	
	
	
	
	
	
	}
	
	
	
	

}
