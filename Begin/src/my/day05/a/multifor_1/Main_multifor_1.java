package my.day05.a.multifor_1;

public class Main_multifor_1 {

	public static void main(String[] args) {
	
		// 단일 for 문으로 아래와 같이 나오도록 한다 
	/*
	  abcdefg
	  hijklmn
	  opqrstu	
	 */
		char ch = 'a';
		for(int i=0; i<'u'-'a'+1; i++) {
			String add =((i+1)%7==0)?"\n":"";
			System.out.print(ch++ + add); // ch = ch+1 와 같다 타입은 인트로 바뀜
			
			
			
		}//end of for
	System.out.println( "\n=======================================");	
		
	//이중 for 문을 아래와 같이 나오도록 한다 /*
	  
	/*abcdefg
	  hijklmn
	  opqrstu	
	 */
		ch = 'a';
		for(int i=0; i<3; i++) {//바깥 for 문읜==> 행
			
			
			for (int j=0; j<7; j++) {//내부 for 문 ==> 열
				System.out.print(ch++);
			}
			System.out.print("\n");
		}

		System.out.println("\n=======================\n");
	
		
		/*
		    [0,0][0,1][0,2]
		    [1,0][1,1][1,2]
		    [2,0][2,1][2,2]
		    [3,0][3,1][3,2]
		 */
		// 단일 for 문 사용
		int m=0,n=0;
		for(int i=0; i<12; i++) {
			
			//n== 3 왜안됨
			if(i>0 && i%3== 0 ) {
				n=0;
			}
			if (i>0 &&i%3 == 0) {
			m++;
			}
			System.out.print("[" +m+ "," + n++ + "]");
			
			if((i+1)%3 == 0) { 
				System.out.println("\n");
			
			
		}
		}//end of for
		
	  /* [0,0][0,1][0,2]
	    [1,0][1,1][1,2]
	    [2,0][2,1][2,2]
	    [3,0][3,1][3,2]*/
		// 이중 for 문을 사용하여 출력해본다 
			for(int i=0; i<4; i++) {
				
				for(int j=0; j<3; j++) {
					System.out.print("[" +i+","+j+ "]");
				}
				System.out.print("\n");
			}
		
		System.out.println("\n=======================\n");
		
	  /*[0,0][0,1][0,2]
	    [1,0][1,1][1,2]
	    [2,0][2,1][2,2] ==> 이줄 스킵 
	    [3,0][3,1][3,2]*/
		
		for(int i=0; i<4; i++) {
			if(i == 2) {
				continue;
			}
			
			for(int j=0; j<3; j++) {
				System.out.print("[" +i+","+j+ "]");
			}
			System.out.print("\n");
		}
		System.out.println("\n=======================\n");
		
		  /*[0,0][0,1][0,2]
		    [1,0][1,1][1,2]
		    [2,0][2,1][2,2] 
		    [3,0][3,1][3,2]*/
			// 2번째열 스킵
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3; j++) {
				if(j == 1) {
					continue;
				}
				
				System.out.print("[" +i+","+j+ "]");
				
			}
			System.out.print("\n");
		}
		
		System.out.println("\n=======================\n");
		
		/*
		 	501호	502호	503호	505호	
		 	301호	302호	303호	305호
		 	201호	202호	203호	205호
		 	101호	102호	103호	105호
		 */
		
		for(int i=5; i>0; i--) {
			if(i == 4) continue;
			for(int j=1; j<6; j++) {
				if(j == 4) continue;
					System.out.print(i+"0"+j+"호\t");	
			}
			System.out.print("\n");
		}
		
		
		System.out.println("\n >>프로그램 종료<<");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//end of main
	

}
