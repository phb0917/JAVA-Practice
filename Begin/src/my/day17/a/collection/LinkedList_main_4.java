package my.day17.a.collection;

import java.util.LinkedList;
import java.util.List;

/*
	== LinkedList == 
	1. 출력시 저장된 순서대로 나온다.
	2. 중복된 데이터를 저장할 수 있다.
	3. 데이터를 읽어오는 속도는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
	4. 순차적으로 데이터를 추가/삭제하는 경우에는 LinkedList 가  ArrayList 보다 상대적으로 느리다.
	5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 LinkedList 가 ArrayList 보다 상대적으로 빠르다.    
	6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
	7. LinkedList 보다는 ArrayList 를 사용하도록 하자. 
	
	== LinkedList (저장소) ==   
	
	          유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 3236)----(앞서존재하던객체의 메모리주소 3236)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)   
	
	== 엄정화 를 삭제할 경우
	          유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)
	    
	== 엄정화 를 특정 위치에 추가할 경우
	          엄정화(자신의 메모리주소 7876)를 유재석 다음에 추가하고자 한다.
	          유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 7876)----(앞서존재하던객체의 메모리주소 7876)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)
*/

public class LinkedList_main_4 {

	public static void main(String[] args) {
		
		// Member 클래스의 객체만을 저장할 수 있는 LinkedList 객체 mbrList 를 생성한다.
		List<Member> mbrList = new LinkedList<>();
		
		// Member 클래스의 객체 7개를 생성하여 mbrList 에 저장한다.
		mbrList.add(new Member("youjs","Qwer1234$","유재석","7209101"));
		mbrList.add(new Member("eom","Qwer1234$","엄정화","6808152"));
		mbrList.add(new Member("kanghd","Qwer1234$","강호동","7006151"));
		mbrList.add(new Member("leess","Qwer1234$","이순신","0010203"));
		mbrList.add(new Member("kimth","Qwer1234$","김태희","0105064"));
		mbrList.add(new Member("kangkc","Qwer1234$","강감찬","9812301"));
		mbrList.add(new Member("kimss","Qwer1234$","김순신","0203203"));
		
		// mbrList 에 저장된 회원들의 정보를 출력하도록 한다. 첫번째 방법 
		for(int i=0; i<mbrList.size(); i++) {
			System.out.println(mbrList.get(i).getInfo());
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// mbrList 에 저장된 회원들의 정보를 출력하도록 한다. 두번째 방법
		for(Member mbr : mbrList) {
			System.out.println(mbr.getInfo());
		}
		
		System.out.println("\n===============================\n");
		
		// mbrList 에 저장된 회원들의 정보를 출력하도록 한다. 세번째 방법
		mbrList.stream().forEach(mbr -> System.out.println(mbr.getInfo()));
		
		System.out.println("\n################################\n");
		
		// mbrList 에 저장된 회원들의 정보를 출력하도록 한다. 네번째 방법
		mbrList.forEach(m -> System.out.println(m.getInfo()));
		
		
		System.out.println("\n[퀴즈1] mbrList 에 저장되어진 모든 회원들중에 여자만 정보를 출력하세요 \n"); 
		
		boolean isFind = false;
		for(Member mbr : mbrList) {
			if("여".equals(mbr.gender())) {
				isFind = true;
				System.out.println(mbr.getInfo());
			}
		}// end of for-------------------
		
		if(!isFind) {
			System.out.println(">> mbrList 에는 여자가 없어요~~ <<");
		}
		
		
		System.out.println("\n[퀴즈2] mbrList 에 저장되어진 모든 회원들중에 성이 김씨인 회원만 정보를 출력하세요 \n"); 
		
		isFind = false;
		for(Member mbr : mbrList) {
			if(mbr.getName().startsWith("김")) {
				isFind = true;
				System.out.println(mbr.getInfo());
			}
		}// end of for---------------------
		
		if(!isFind) {
			System.out.println(">> mbrList 에는 김씨가 없어요~~ <<");
		}
		
		
		System.out.println("\n[퀴즈3] mbrList 에 저장되어진 모든 회원들중에 성을 뺀 이름이 \"순신\" 인 회원만 정보를 출력하세요 \n"); 
		
		isFind = false;
		for(Member mbr : mbrList) {
			if(mbr.getName().endsWith("순신")) {
				isFind = true;
				System.out.println(mbr.getInfo());
			}
		}// end of for---------------------
		
		if(!isFind) {
			System.out.println(">> mbrList 에는 성을 뺀 이름이 \"순신\" 인 회원이 없어요~~ <<");
		}
		
		
        System.out.println("\n[퀴즈4] mbrList 에 저장되어진 모든 회원들중에 성명에 \"정\" 이라는 글자가 들어간 회원만 정보를 출력하세요 \n"); 
		
		isFind = false;
		for(Member mbr : mbrList) {
			if(mbr.getName().contains("정")) {
				isFind = true;
				System.out.println(mbr.getInfo());
			}
		}// end of for---------------------
		
		if(!isFind) {
			System.out.println(">> mbrList 에는 성명에 \"정\" 이라는 글자가 들어간 회원이 없어요~~ <<");
		}
		
		
        System.out.println("\n[퀴즈5] mbrList 에 저장되어진 모든 회원들중에 나이가 20대인 회원만 정보를 출력하세요 \n"); 
		
        isFind = false;
		for(Member mbr : mbrList) {
			if(mbr.age()/10*10 == 20) {
				isFind = true;
				System.out.println(mbr.getInfo());
			}
		}// end of for---------------------
		
		if(!isFind) {
			System.out.println(">> mbrList 에는 나이가 20대인 회원이 없어요~~ <<");
		}
		
		System.out.println("\n~~~~~~~ 또는 ~~~~~~~~\n");
		
		isFind = false;
		for(Member mbr : mbrList) {
			switch(mbr.age()/10*10) {
			   case 20 -> {isFind = true; 
			   	   System.out.println(mbr.getInfo());} 
			   }
		}// end of for---------------------
		
		if(!isFind) {
			System.out.println(">> mbrList 에는 나이가 20대인 회원이 없어요~~ <<");
		}
		
		
		System.out.println("\n ==== mbrList 에 새로운 Member 객체 추가하기 ==== \n");
		
		mbrList.add(new Member("seolh", "Qwer1234$", "설현", "9910152"));
		// index 가 없으면 mbrList 의 맨 뒤에 추가된다.
		
		System.out.println(mbrList.get(mbrList.size()-1).getInfo());
		
		
		System.out.println("\n###############################\n");
		
		/*
		    LinkedList 타입인 mbrList 에 새로운 Member 객체 추가시
		    특정 index(위치)에 들어가도록 할 수 있다. 
		*/
		mbrList.add(3, new Member("seokj", "Qwer1234$", "서강준", "0110153"));
		
		for(Member mbr : mbrList) {
			System.out.println(mbr.getInfo());
		}
		
		
		// **** LinkedList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 **** //
		
		System.out.println("\n**** LinkedList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 ****\n");
		
		System.out.println(">> 삭제하기 전 mbrList.size() => " + mbrList.size());
		// >> 삭제하기 전 mbrList.size() => 9
		
		Member deleted_mbr = mbrList.remove(3);  // mbrList.remove(삭제할 Member 객체의 인덱스번호);
		System.out.println(deleted_mbr.getInfo());
		
		System.out.println(">> 삭제한 후 mbrList.size() => " + mbrList.size());
		// >> 삭제한 후 mbrList.size() => 8
		
		for(Member mbr : mbrList) {
			System.out.println(mbr.getInfo());
		}
		
		
		System.out.println("\n**** LinkedList 타입인 mbrList 에 저장되어진 Member 객체중 남자만 삭제하기 ****\n");
		
		// === 잘못된 풀이 === //
	/*	
		for(int i=0; i<mbrList.size(); i++) {
			if("남".equals(mbrList.get(i).gender())) {
				mbrList.remove(i);
			}
		}
	*/	
		/*
		      // >>> !!! 잘못된 풀이 !!! <<< //
		      === 만약에 index 0번이 남자(남자1), index 1번이 남자(남자2), index 2번이 여자(여자1), index 3번이 남자(남자3), index 4번이 여자(여자2) 이라면 
		      //        남자1  남자2  여자1  남자3  여자2
		      // index   0      1     2     3     4
		      
		      //        남자2  여자1  남자3  여자2
		      // index   0      1     2     3     
		      
		      //        남자2  여자1  여자2
		      // index   0      1     2  
		*/
	
	/*	
		for(int i=0; i<mbrList.size(); i++) {
			System.out.println(mbrList.get(i).getInfo());
		}
	*/	
		
		System.out.println("=== 올바른 풀이 1 ===");
	/*	
		for(int i=0; i<mbrList.size(); i++) {
			if("남".equals(mbrList.get(i).gender())) {
				mbrList.remove(i);
				i--;
			}
		}
		
		for(int i=0; i<mbrList.size(); i++) {
			System.out.println(mbrList.get(i).getInfo());
		}
	*/	
		
		System.out.println("=== 올바른 풀이 2 ===");
	/*
		=== 만약에 index 0번이 남자(남자1), index 1번이 남자(남자2), index 2번이 여자(여자1), index 3번이 남자(남자3), index 4번이 여자(여자2) 이라면 
       //        남자1  남자2  여자1  남자3  여자2
       // index   0      1     2     3     4
      
       //        남자1  남자2  여자1  여자2
       // index   0      1     2     3  
       
       //        남자1  여자1  여자2
       // index   0      1     2  
       
       //        여자1  여자2
       // index   0      1          
              
	*/	
		for(int i=mbrList.size()-1; i>=0; i--) {
			if("남".equals(mbrList.get(i).gender())) {
				mbrList.remove(i);
			}
		}
		
		for(int i=0; i<mbrList.size(); i++) {
			System.out.println(mbrList.get(i).getInfo());
		}
		
		System.out.println(">> 현재 mbrList.size() => " + mbrList.size());
		// >> 현재 mbrList.size() => 3
		
		
		System.out.println("\n ==== mbrList 에 저장된 모든 객체 삭제하기 === \n");
		mbrList.clear();
		
		System.out.println(">> 현재 mbrList.size() => " + mbrList.size());
		// >> 현재 mbrList.size() => 0
		
		
		// === 2. List 계열은 중복된 데이터를 저장할 수 있다. 
		mbrList.add(new Member("leemj","Qwer1234$","이미자","9803202"));
		mbrList.add(new Member("leemj","Qwer1234$","이미자","9803202")); // 이것은 중복이 아니다. 
		
		Member mbr_1 = new Member("sammj","Qwer1234$","삼미자","8804202"); 
		Member mbr_2 = mbr_1; // 이것이 중복이다.
		
		mbrList.add(mbr_1);
		mbrList.add(mbr_2);
				
		for(Member mbr : mbrList) {
			System.out.println(mbr);
		}
		/*
			my.day17.a.collection.Member@3d494fbf
			my.day17.a.collection.Member@1ddc4ec2
			my.day17.a.collection.Member@133314b
            my.day17.a.collection.Member@133314b
		*/
		
		System.out.println(">> mbrList.size() => " + mbrList.size());
		// >> mbrList.size() => 4
				
	}// end of main()---------------------------

}



