package my.day17.a.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_main_5 {

/*
	=== Map 계열 ===
	1. HashMap 과 Hashtable 이 있다.
	2. Map 계열은 List 계열(Vector, ArrayList, LinkedList)처럼 index 가 사용되어 저장되는 것이 아니라, 
	   Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
	   데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
	   이때 key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다.
	3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
	4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
	   value 값의 추출은 get(String key) 메소드를 사용한다. 
*/	
	
	public static void main(String[] args) {
		
	//	HashMap<String, Member> mbr_map = new HashMap<String, Member>(); // JDK 8 이전 방법
	//  또는 	
	//	Map<String, Member> mbr_map = new HashMap<String, Member>(); // JDK 8 이전 방법
		
	//	HashMap<String, Member> mbr_map = new HashMap<>(); // JDK 8 이후 방법
	//  또는 	
		Map<String, Member> mbr_map = new HashMap<>();     // JDK 8 이후 방법
		
		mbr_map.put("youjs", new Member("youjs","Qwer1234$","유재석","7209101"));
		mbr_map.put("eom", new Member("eom","Qwer1234$","엄정화","6808152"));
		mbr_map.put("kanghd", new Member("kanghd","Qwer1234$","강호동","7006151"));
		mbr_map.put("leess", new Member("leess","Qwer1234$","이순신","0010203"));
		mbr_map.put("kimth", new Member("kimth","Qwer1234$","김태희","0105064"));
		mbr_map.put("kangkc", new Member("kangkc","Qwer1234$","강감찬","9812301"));
		mbr_map.put("kimss", new Member("kimss","Qwer1234$","김순신","0203203"));
		
		mbr_map.get("kangkc").print_info();
		/*
			=== 강감찬님의 회원정보 ===
			1. 아이디 : kangkc
			2. 암호 : Qwer1234$
			3. 성명 : 강감찬
			4. 성별 : 남
			5. 만나이 : 26 
		 */
		
		mbr_map.put("kangkc", new Member("kangkc","Abcd0070$","강기춘","0112303"));
		// Key값이 중복되면 Value값은 덮어씌운다.
		
		mbr_map.get("kangkc").print_info();
		/*
			=== 강기춘님의 회원정보 ===
			1. 아이디 : kangkc
			2. 암호 : Abcd0070$
			3. 성명 : 강기춘
			4. 성별 : 남
			5. 만나이 : 23 
		 */
		
		mbr_map.putIfAbsent("seolh", new Member("seolh","Qwer1234$","설현","0212304"));
		
		mbr_map.get("seolh").print_info();
		/*
			=== 설현님의 회원정보 ===
			1. 아이디 : seolh
			2. 암호 : Qwer1234$
			3. 성명 : 설현
			4. 성별 : 여
			5. 만나이 : 22
		*/
		
		mbr_map.putIfAbsent("seolh", new Member("seolh","Abcd1234$","서리혜","0301014"));
		// putIfAbsent 을 사용할 경우 Key값이 중복되면 저장하지 않는다.
		
		
		mbr_map.get("seolh").print_info();
		/*
			=== 설현님의 회원정보 ===
			1. 아이디 : seolh
			2. 암호 : Qwer1234$
			3. 성명 : 설현
			4. 성별 : 여
			5. 만나이 : 22
		*/
		
		
		Member mem1 = new Member("parksj","Abcd1234$","박서준","8801011");
		Member mem2 = mem1;
		
		mem2.setName("이현우");
		
		mbr_map.put("mem1", mem1);  // Key 값이 다르면 Value 값은 중복된 값이 들어와도 괜찮다.
		mbr_map.put("mem2", mem2);  // Key 값이 다르면 Value 값은 중복된 값이 들어와도 괜찮다.
		
		System.out.println(mbr_map.get("mem1"));
		// my.day17.a.collection.Member@27973e9b
		
		System.out.println(mbr_map.get("mem2"));
		// my.day17.a.collection.Member@27973e9b
		
		System.out.println(mbr_map.get("mem1").getInfo());
		/*
			=== 이현우님의 회원정보 ===
			1. 아이디 : parksj
			2. 암호 : Abcd1234$
			3. 성명 : 이현우
			4. 성별 : 남
			5. 만나이 : 37
		*/
		System.out.println(mbr_map.get("mem2").getInfo());
		/*
			=== 이현우님의 회원정보 ===
			1. 아이디 : parksj
			2. 암호 : Abcd1234$
			3. 성명 : 이현우
			4. 성별 : 남
			5. 만나이 : 37
        */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// === mbr_map 에 저장되어진 모든 key 들을 읽어오는 첫번째 방법 === //
		Set<String> key_set = mbr_map.keySet(); 
		
		for(String key : key_set) {
			System.out.println(key);
		}// end of for--------------------
		/*
			eom
			youjs
			kimth
			kangkc
			kanghd
			kimss
			leess
			seolh
			mem2
			mem1
         */

		 // === mbr_map 에 저장되어진 모든 key 들을 읽어오는 두번째 방법 === //
		 Set<String> key_set2 = mbr_map.keySet();
		 
		 key_set2.stream()
		      // .forEach(key -> System.out.println(key)); 
		         .forEach(System.out::println);
		 /*
			eom
			youjs
			kimth
			kangkc
			kanghd
			kimss
			leess
			seolh
			mem2
			mem1
		 */
		 
		 System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");
		
		 mbr_map.keySet().stream()
		              // .forEach(key -> System.out.println(key));
		                 .forEach(System.out::println);
		 /*
			eom
			youjs
			kimth
			kangkc
			kanghd
			kimss
			leess
			seolh
			mem2
			mem1
		 */
		
		
		 System.out.println("\n== mbr_map 에 저장되어진 모든 Member 객체의 정보를 출력해주는 첫번째 방법 =="); 
		 
		 for(String key : key_set) {
			 mbr_map.get(key).print_info();
		 }// end of for--------------------
		 
		 System.out.println("\n== mbr_map 에 저장되어진 모든 Member 객체의 정보를 출력해주는 두번째 방법 =="); 
		 
		 mbr_map.keySet().stream()
		                 .forEach(key -> mbr_map.get(key).print_info());
		 
		 
		 System.out.println("\n== [퀴즈] mbr_map 에 아래와 같이 새로운 회원을 가입하시는데 아이디가 중복이라면 '아이디가 이미 사용중입니다.' 라는 메시지를 출력해주고 아이디가 중복이 아니라면 mbr_map 에 저장하도록 하세요..");
		 
	//	 String input_id = "leess";
		 String input_id = "leesusan";
		 String passwd = "Abcd0070$";
		 String name = "이수산";
		 String jubun = "9809101";
		 
		 if(mbr_map.get(input_id) == null) {
			 mbr_map.put(input_id, new Member(input_id, passwd, name, jubun));
			 System.out.println("\n"+input_id+"님 회원가입 성공 <<");
		 }
		 else {
			 System.out.println("\n >>> "+input_id+" 아이디가 이미 사용중입니다. 회원가입 실패!! <<< ");
		 }
		 
		 
		 
		 
		 

	}// end of main(String[] args)---------------------

}







