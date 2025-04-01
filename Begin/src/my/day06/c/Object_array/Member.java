package my.day06.c.Object_array;

public class Member {

	// field
	String id;
	String passwd;
	String name;
	
	// method
	String view_info() {
		
		String new_passwd = "";
		
		/* 첫번째 방법
		if(passwd != null) {
			for(int i = 0; i<passwd.length(); i++) {
				if (i<4)
					new_passwd += passwd.charAt(i);
				else
					new_passwd += "*";
			}
		}
			*/
		if(passwd !=null) {
		char[] arr_passwd =	passwd.toCharArray();
		
		/* passwd 가 Qwer1234$ 라면
		   passwd.tochararray(); 를 해주면 아래처럼 변경된다 
		  --------------------------------------------
		   |'Q'|'w'|'e'|'r'|'1'|'2'|'3'|'4'|'$'|
	index    0	 1   2   3   4   5   6   7   8
		   
		   */
		
		
		for(int i=0; i<arr_passwd.length; i++) {
			if(i<4)
				new_passwd += arr_passwd[i];
			else
				new_passwd += "*";
		}
		}
		
		
		
		
		return id+"\t"+new_passwd+"\t"+name;
	}
	
}
