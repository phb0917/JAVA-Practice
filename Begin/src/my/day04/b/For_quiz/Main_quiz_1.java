package my.day04.b.For_quiz;
// for 문을 사용하여 알파벳 소문자를 아래처럼 출력하세요.
// a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
public class Main_quiz_1 {

	public static void main(String[] args) {
		
		for(int i=0; i<'z'-'a'+1; i++  ) {
			String str = (i<'z'-'a')?",":"";
			System.out.print((char)('a'+ i)+ str);
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		/*String result = "";
		for(int i = 0; i<'z'-'a'+1; i++) {
			char ch = (char)('a'+i);
		String add = (i< 'z'-'a');
			result += ch+ add;
			
		}
		System.out.println(result);*/
	
	
	
	System.out.println("\n ===========================");
	String result = "";
			result = "";
			
			for(int i=0; i<'z'-'a'+1 ; i++) {
				char ch = (char)('a'+ i);
				String add = (ch =='m'|| ch=='z')?"\n":",";
				result += ch+add;
			 
		}
	System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}

}
