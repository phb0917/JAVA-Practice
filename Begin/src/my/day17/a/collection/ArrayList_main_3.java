package my.day17.a.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList_main_3 {

	public static void main(String[] args) {
	/*
	    List 객체를 Stream 객체로 변환한 후
	    Stream 클래스에서 제공해주는 forEach, map, filter, Method Reference(메서드 참조)에 대해서 알아본다.
	*/
		
		// Member 클래스의 객체만을 저장할 수 있는 ArrayList 객체 mbrList 를 생성한다.
		List<Member> mbrList = new ArrayList<>();
		
		// Member 클래스의 객체 7개를 생성하여 mbrList 에 저장한다.
		mbrList.add(new Member("youjs","Qwer1234$","유재석","7209101"));
		mbrList.add(new Member("eom","Qwer1234$","엄정화","6808152"));
		mbrList.add(new Member("kanghd","Qwer1234$","강호동","7006151"));
		mbrList.add(new Member("leess","Qwer1234$","이순신","0010203"));
		mbrList.add(new Member("kimth","Qwer1234$","김태희","0105064"));
		mbrList.add(new Member("kangkc","Qwer1234$","강감찬","9812301"));
		mbrList.add(new Member("kimss","Qwer1234$","김순신","0203203"));
		
	/*
		Stream 클래스는 컬렉션(리스트, 셋 등)에 저장된 데이터를 쉽게 처리할 수 있게 해주는 기능을 가진 클래스이다.
        Stream 은 반복문(for, while) 없이도 데이터를 필터링, 변환, 정렬, 집계 등 다양한 작업을 간단하게 할 수 있게 해준다.
        
        >> Stream 클래스의 주요 메서드 요약 <<
		   ---------------------------------------------------	
			 메서드	        설명
		   ---------------------------------------------------	
			.stream()	    컬렉션에서 Stream 생성
			.filter()	    조건에 맞는 값만 추림
			.map()	        어떤 객체를 다른 객체로 변환할 때 사용 <예: String 을 Integer, Person 을 이름>
			.mapToInt()     스트림 요소를 int 윈시형으로 변환. 숫자 연산시 사용
			.mapToLong()    스트림 요소를 long 윈시형으로 변환. 숫자 연산시 사용
			.mapToDouble()  스트림 요소를 double 윈시형으로 변환. 숫자 연산시 사용
			.sorted()	    정렬
			.collect()	    다시 리스트 등으로 모음
			.forEach()	    각각에 대해 실행
			.count()	    개수 반환
			.anyMatch()	    조건 만족하는 게 하나라도 있으면 true, 모두가 만족하지 않으면 false
			.allMatch()	    모두 조건을 만족하면 true, 하나라도 조건을 만족하지 않으면 false
			.reduce()	    누적 연산(합계 등)
			.max()          최대값
			.min()          최소값
			.sum()          합계
			.average()      평균
        ---------------------------------------------------
    */
        System.out.println("\n"+"=".repeat(40)+"\n");
		mbrList.stream().forEach(mbr -> mbr.print_info());
		
		System.out.println("\n"+">".repeat(40)+"\n");
		mbrList.forEach(mbr -> mbr.print_info());  // 바로 forEach 사용시에만 stream() 을 생략해도 가능함.
		
		System.out.println("\n"+"#".repeat(40)+"\n");
		mbrList.forEach(Member::print_info); // Method Reference(메서드 참조)
		
		System.out.println("\n"+"~".repeat(40)+"\n");
		mbrList.stream().forEach(m -> System.out.println(m.getInfo()));
		
		System.out.println("\n"+"@".repeat(40)+"\n");
		mbrList.stream().map(mbr -> mbr.getInfo()).forEach(System.out::println); // Method Reference(메서드 참조) 
		// map()은 "데이터를 특정 데이터로 변환" 하는 역할을 한다.
		// Member 클래스 객체인 mbr 을 mbr.getInfo()의 형태인 String 으로 형태를 바꾸고
		// forEach 를 통해서 각각의 mbr.getInfo() 를 화면에 출력해주는 것이다. 
		
		// === mbrList 에 저장되어진 회원의 성명만 출력해본다. === //
		System.out.println("\n === mbrList 에 저장되어진 회원의 성명만 출력해본다. === \n");
		
		mbrList.stream().map(mbr -> mbr.getName()).forEach(name -> System.out.println(name));
		
		System.out.println("\n>>> 또는 <<<\n");
		
		mbrList.stream().map(mbr -> mbr.getName()).forEach(System.out::println);  // Method Reference(메서드 참조)
		
		System.out.println("\n### 또는 ###\n");
		
		mbrList.stream().map(Member::getName).forEach(System.out::println);  // Method Reference(메서드 참조)
		
		
		System.out.println("\n"+"~~~~ 회원들중에 여자만 성명 출력하기 ~~~~\n");
		
		mbrList.stream()
		       .filter(mbr -> mbr.getJubun().endsWith("2") || mbr.getJubun().endsWith("4") )
		       .map(mbr -> mbr.getName())
		       .forEach(name -> System.out.println(name));
		// .filter() 는	조건에 맞는 것만 추려내는 것이다.
		
		System.out.println("\n### 또는 ###\n");
		
		mbrList.stream()
		       .filter(mbr -> "여".equals(mbr.gender()))
		       .map(mbr -> mbr.getName())
		       .forEach(name -> System.out.println(name));
		
		System.out.println("\n!!! 또는 !!!\n");
		
		mbrList.stream()
	           .filter(mbr -> "여".equals(mbr.gender()))
	           .map(Member::getName)
	           .forEach(System.out::println);
		
		
		System.out.println("\n"+"~~~~ 회원들중에 남자만 성명을 오름차순으로 출력하기 ~~~~\n");
		
		mbrList.stream()
               .filter(mbr -> "남".equals(mbr.gender()))
               
            // .sorted(Comparator.comparing(mbr -> mbr.getName() ) )
               .sorted(Comparator.comparing(Member::getName) )
               
            // .map(mbr -> mbr.getName())
               .map(Member::getName)
               
            // .forEach(name -> System.out.println(name));
		       .forEach(System.out::println);
		
		    // sorted() 는 정렬하는 것이다. Comparator.comparing(mbr -> mbr.getName()) 은 문자열 기준 오름차순 정렬이다.
		
		
        System.out.println("\n"+"~~~~ 회원들중에 남자만 성명을 내림차순으로 출력하기 ~~~~\n");
		
		mbrList.stream()
               .filter(mbr -> "남".equals(mbr.gender()))
               .sorted(Comparator.comparing(Member::getName).reversed() )
               .map(Member::getName)
		       .forEach(System.out::println);
		
		// sorted() 는 정렬하는 것이다. Comparator.comparing(mbr -> mbr.getName().reversed()) 은 문자열 기준 내림차순 정렬이다.  
		
		
		System.out.println("\n"+"~~~~ 회원들중에 남자만 나이의 오름차순으로 회원정보를 출력하기 ~~~~\n");
		
		mbrList.stream()
               .filter(mbr -> "남".equals(mbr.gender()))
               .sorted(Comparator.comparingInt(mbr -> mbr.age()))
		       .forEach(mbr -> System.out.println(mbr.getInfo()));
		// sorted() 는 정렬하는 것이다. Comparator.comparingInt(mbr -> mbr.age()) 은 숫자 기준 오름차순 정렬이다. 
		
		
		System.out.println("\n"+"~~~~ 회원들중에 남자만 나이의 내림차순으로 회원정보를 출력하기 ~~~~\n");
		
		mbrList.stream()
               .filter(mbr -> "남".equals(mbr.gender()))
               .sorted(Comparator.comparingInt(Member::age).reversed())
		       .forEach(mbr -> System.out.println(mbr.getInfo()));
		// sorted() 는 정렬하는 것이다. Comparator.comparingInt(Member::age).reversed() 은 숫자 기준 내림차순 정렬이다.
		
		
		System.out.println("\n"+"~~~~ mbrList 에 저장되어닌 회원들중에 남자만 가져와서 "
				         + "저장순서를 나이의 오름차순으로 되어진 List<Member> man_List 를 "
				         + "생성하세요. ~~~~\n");
		
		List<Member> man_List = 
				mbrList.stream()
				       .filter(mbr -> "남".equals(mbr.gender()))
				       .sorted(Comparator.comparingInt(Member::age))
				       .collect(Collectors.toList());
		// collect() 은 다시 리스트 등으로 모으는 것이다.
		
		man_List.stream().forEach(man -> System.out.println(man.getInfo()));
				
		
		System.out.println("\n mbrList 에서 나이가 50대인 회원들만 성명의 오름차순으로 정렬하여 new_mbrList 를 생성하세요. \n");
		
		// === mbrList 에서 나이가 50대인 회원들만 성명의 오름차순으로 정렬하여 new_mbrList 를 생성하세요. === //
		List<Member> new_mbrList =
				mbrList.stream()
				       .filter(mbr -> mbr.age()/10*10==50)
				       .sorted(Comparator.comparing(Member::getName))
				       .collect(Collectors.toList());
		
		new_mbrList.stream().forEach(Member::print_info);
		
		System.out.println("\n>>> 또는 <<<\n");
		
		new_mbrList.stream().forEach(mbr -> mbr.print_info());
		
		
		System.out.println("\n=== mbrList 에 저장되어진 데이터중 여자가 몇 명인지 알아보기 ===\n");
		long female_cnt = mbrList.stream()
		                         .filter(mbr -> "여".equals(mbr.gender()) )
		                         .count();
		
		System.out.println("여자는 "+female_cnt+"명 있어요");
		// 여자는 2명 있어요
		
		
		boolean bool = mbrList.stream()
		                      .anyMatch(mbr -> mbr.getName().contains("엄"));
		// anyMatch() 는 조건에 만족하는 것이 하나라도 있으면 true
		// anyMatch() 는 조건에 만족하는 것이 모두 없으면 false
		
		System.out.println("bool : " + bool);
		// bool : true
		
		bool = mbrList.stream()
		              .allMatch(mbr -> mbr.getName().contains("엄"));
		// allMatch() 는 모두 조건에 만족해야만 true
		// anyMatch() 는 하나라도 조건에 만족하지 않으면 false
		
		System.out.println("bool : " + bool);
		// bool : false
		
		System.out.println("\n"+"~".repeat(40)+"\n");
		
		String names = mbrList.stream()
				           // .map(mbr -> mbr.getName())
				              .map(Member::getName)
				              .reduce("", (a,b) -> a+b+", ");  // 초기값 "" 부터 시작해서 누적해서 더함.
		
		System.out.println(names);
		// 유재석, 엄정화, 강호동, 이순신, 김태희, 강감찬, 김순신, 
		
		System.out.println(names.substring(0, names.length()-2));
		// 유재석, 엄정화, 강호동, 이순신, 김태희, 강감찬, 김순신
		
		System.out.println(">>> 나이 최대값 구하기 <<<");
		int max_age = mbrList.stream()
				             .map(Member::age)
				             .reduce(Integer.MIN_VALUE, (a,b) -> Math.max(a, b)); 
		                     // 나열되어진 것 중에서 제일 작은 값 부터 시작해서 제일 큰 값을 찾는 것이다.  
		
		System.out.println("나이 최대값 : " + max_age);
		// 나이 최대값 : 56
		
		max_age = mbrList.stream()
	             .mapToInt(Member::age) // .mapToInt() 은 스트림 요소를 int 원시형으로 변환 
	             .max()
	             .orElse(0);  // 값이 없을 경우 0 을 반환
		
		System.out.println("나이 최대값 : " + max_age);
		// 나이 최대값 : 56
		
		System.out.println(">>> 나이 최소값 구하기 <<<");
		int min_age = mbrList.stream()
	                         .map(Member::age)
	                         .reduce(Integer.MAX_VALUE, (a,b) -> Math.min(a, b)); 
                             // 나열되어진 것 중에서 제일 큰 값 부터 시작해서 제일 작은 값을 찾는 것이다.
		
		System.out.println("나이 최소값 : " + min_age);
		// 나이 최소값 : 23
		
		min_age = mbrList.stream()
	             .mapToInt(Member::age) // .mapToInt() 은 스트림 요소를 int 원시형으로 변환 
	             .min()
	             .orElse(0);  // 값이 없을 경우 0 을 반환
		
		System.out.println("나이 최소값 : " + min_age);
		// 나이 최소값 : 23
		
		int sum_age = mbrList.stream()
				             .mapToInt(mbr -> mbr.age())
				         //  .mapToInt(Member::age)
				             .sum();
		
		System.out.println("나이 합계 : " + sum_age);
		// 나이 합계 : 258
		
		double avg_age = mbrList.stream()
				             // .mapToInt(mbr -> mbr.age())
		                        .mapToInt(Member::age)
		                        .average()
		                        .orElse(0.0); // 값이 없을 경우 0.0 을 반환
		
		System.out.println("나이 평균 : " + avg_age);
		// 나이 평균 : 36.857142857142854
		
	}// end of main(String[] args)-----------------------

}






