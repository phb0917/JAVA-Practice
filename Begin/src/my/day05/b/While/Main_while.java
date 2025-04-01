package my.day05.b.While;
/*
=== while 문 형식 ===

변수의 초기화;
   
while(조건식) {
   조건식이 참(true)이라면 반복해서 실행할 명령문을 실행하고,
   조건식이 거짓(false)이라면 while의 { } 이부분을 빠져나간다. 
   
   반복해서 실행할 명령문;
   증감식;
}
*/
public class Main_while {

	public static void main(String[] args) {
		/*
		  1.안녕자바
		  2.안녕자바
		  3.안녕자바
		  4.안녕자바
		  5.안녕자바
		 */
		/* int loop=0;
	
		while (loop<5) {
			System.out.println((loop+1)+".안녕자바~~");
			loop++;
		} */
		int loop=0, cnt = 5;
		
		while (loop<cnt) {
			System.out.println((loop+1)+".안녕자바~~");
			loop++;
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
		
		/*
		  1.hello java
		  2.hello java
		  3.hello java
		  4.hello java
		  5.hello java
		 */
		loop = 0; cnt = 5;
		while (loop++<cnt) {
			System.out.println(loop+".hello java~~");
			}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
		/*
		  1.hi eclipse
		  2.hi eclipse
		  3.hi eclipse
		  4.hi eclipse
		  5.hi eclipse
		 */
		loop = 0; cnt = 5;
		while (loop<cnt) {
			System.out.println(++loop+".hi eclipse~~");
			}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
		/*
		  1.hi 이클립스
		  2.hi 이클립스
		  3.hi 이클립스
		  4.hi 이클립스
		  5.hi 이클립스
		 */
		loop=0;
		while(true) {
			System.out.println(++loop + ".hi 이클립스");
			
			
			if(loop == 5) {
				break;
			}
			
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
		/*
		  1.안녕 오라클
		  2.안녕 오라클
		  3.안녕 오라클
		  4.안녕 오라클
		  5.안녕 오라클
		 */
		loop = 0;
		while(!(++loop>5)) {
			System.out.println(loop + ".안녕오라클~~");
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
		/*
		  1.hi oracle
		  2.hi oracle
		  3.hi oracle
		  4.hi oracle
		  5.hi oracle
		 */
		while(true) {
			
			if(++loop > 10)// 탈출조건
				break;
			
			if(loop%2 == 0)
				continue; // 아래로 내려가지 않고 while()의 괄호()]속의 조건식으로 이동한다 
			
			System.out.println(loop+".hi oracle");
		}
		System.out.println("\n~~~~~~~~1case~~~~~~~~\n");
		
		loop =0;
		while (++loop <=9) {
			System.out.println("5*"+loop+"="+(5*loop));
		}
		
		System.out.println("\n~~~~~~~~2case~~~~~~~~~~\n");
		
		loop =0;
		while (true) {
			if(++loop > 9)
				break;
			System.out.println("5*"+loop+"="+(5*loop));
		}
		
		System.out.println("\n~~~~~~~~3case~~~~~~~~~\n");
		
		loop =0;
		while (!(++loop >9)) {// while 문의 탈출 조건을 쓴다 
			System.out.println("5*"+loop+"="+(5*loop));
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.printf("%45s\n", "==== 구구단 ====");
		int jul=0, dan=1;
		while (!(++jul > 9)) {
			while(!(++dan>9)) {
			System.out.printf(dan + "*" + jul + "=%-4d" , (dan*jul) );
		
		
		}
			System.out.print("\n");
			dan=1;//위 while 문을 빠져나올때 dan의 값은 10이다 
				  //그러므로 아래와 같이 dan의 값을 1로 초기화 해주어야한다	
		}
		
		System.out.println("\n>>> 프로그램 종료 <<<");
	}//end of main

}
