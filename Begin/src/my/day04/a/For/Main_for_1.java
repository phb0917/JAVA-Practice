package my.day04.a.For;
/*
 **** 반복문(loop) ==> for 문 ****

 ※ for 문의 형식

 for(초기화; 조건식; 증감식) {
       반복해서 실행할 문장;
 }  
 
 ▣ 순서
 1) 초기화;
 2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                           조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
            } 을 빠져나간다.)
 3) 증감식
 4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                           조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
            } 을 빠져나간다.) 
 5) 증감식
 6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                           조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
            } 을 빠져나간다.)                                                  
 
*/
public class Main_for_1 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i+1+ "안녕자바 ~~");
		}
		/*
			1.안녕자바 ~~
			2.안녕자바 ~~
			3.안녕자바 ~~
			4.안녕자바 ~~
			5.안녕자바 ~~
			6.안녕자바 ~~\
			7.안녕자바 ~~
			8.안녕자바 ~~
			9.안녕자바 ~~
			10.안녕자바 ~~
		*/
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<10; i+=1) { // i+=1; 은 i=i+1;
			System.out.println(i+1+ "안녕 java ~~");
		}
		/*
		 1.안녕자바 ~~
			2.안녕자바 ~~
			3.안녕자바 ~~
			4.안녕자바 ~~
			5.안녕자바 ~~
			6.안녕자바 ~~
			7.안녕자바 ~~
			8.안녕자바 ~~
			9.안녕자바 ~~
			10.안녕자바 ~~
		 
		 */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<10; i++) { 
		System.out.println(++i + "안녕 이클립스 ~~");
		}
		
	  /*
	   		1.안녕 이클립스 ~~
			3.안녕 이클립스 ~~
			5.안녕 이클립스 ~~
			7.안녕 이클립스 ~~
			9.안녕 이클립스 ~
	   */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0; i<10; i+=2) { // i+=2; 는 i=i+2; 와 같다
			System.out.println((i+1) + "안녕 eclipse");
			}
		 /*
   		1.안녕 eclipse ~~
		3.안녕 eclipse ~~
		5.안녕 eclipse ~~
		7.안녕 eclipse ~~
		9.안녕 eclipse ~
   */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0, j=0; i<10; i++, j+=2) {
			System.out.println((j+1) + "안녕 오라클~~");
		}
		/*
		 	1. 안녕 오라클~~
		 	3. 안녕 오라클~~
		 	5. 안녕 오라클~~
		 	7. 안녕 오라클~~
		 	9. 안녕 오라클~~
		 	11. 안녕 오라클~~
		 	13. 안녕 오라클~~
		 	15. 안녕 오라클~~
		 	17. 안녕 오라클~~
		 	19. 안녕 오라클~~
		 */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i>0; i--) {
			System.out.println(i+".안녕 oracle");
		}
	/*
	 		10. 안녕 oracle~~
		 	9. 안녕 oracle~~
		 	8. 안녕 oracle~~
		 	7. 안녕 oracle~~
		 	6. 안녕 oracle~~
		 	5. 안녕 oracle~~
		 	4. 안녕 oracle~~
		 	3. 안녕 oracle~~
		 	2. 안녕 oracle~~
		 	1. 안녕 oracle~~
	 */
		for(int i=0; i>0; i-=1) { // i-=1; 은 i=i-1 같다 
			System.out.println(i+".안녕 스프링");
		}
		
		for(int i=10; i>0; i--) {
			if(1%2 !=0) { // i%2 은 i를 2로 나누었을때의 나머지를 나타내는 것이다 
				System.out.println(1+" 안녕 spring");
			}
		}
		for(int i=10; i>0; i-=2) {
			
			System.out.println((i-1)+" 안녕하십니까 ");
		}	
		
		for(int i=10; i>0; i--) {
			if(1%2 !=0) { // i%2 은 i를 2로 나누었을때의 나머지를 나타내는 것이다 
				System.out.println(--i+" hello");
			}
			
		
			
	}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0, j= 9; i<5; i++, j-=2) { 
			System.out.println(j+".헬로~~");
		}
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	int i=0;
	for(; i<5; i++) { 
		System.out.println((i+1) +".길동");
	}
	System.out.println("길동을 "+i+" 번 반복했습니다 ");
	
	
	
	}//end of  main(String[] args)
	}


