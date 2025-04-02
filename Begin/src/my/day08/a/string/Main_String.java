package my.day08.a.string;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main_String {
public static void main(String[] args) {
		
		// ==== 1. "문자열".charAt(int index) ==== 
		//         "안녕하세요".charAt(2) ==> '하' 
        // index => 01234
		
		char ch = "안녕하세요".charAt(2);
		System.out.println("ch => " + ch);
		// ch => 하
		
		String str = "안녕하세요";
	    // index  =>  01234
		
		String result = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}// end of for---------------
		
		System.out.println(result);
		// 요세하녕안
		
		
		
		// ==== 2. "문자열".toCharArray() ====
		// "안녕하세요".toCharArray() ==> char 타입의 배열로 만들어준다. 
		/*
		   ------------------------
		   |'안'|'녕'|'하'|'세'|'요'|
		   ------------------------
		     0    1   2    3    4   <== index
		*/
		
		str = "안녕하세요";
		char[] ch_arr = str.toCharArray();

		result = "";
		for(int i=ch_arr.length-1; i>=0; i--) {
			result += ch_arr[i];
		}// end of for----------------
		
		System.out.println(result);
		// 요세하녕안
		
		
		
		// ==== 3. "문자열".substring(int 시작인덱스, int 끝인덱스) ====
		// "안녕하세요".substring(1,4);
		// ==> "안녕하세요" 에서 시작인덱스가 1인 글자("녕") 부터
		//     "안녕하세요" 에서 끝인덱스 4인 글자("요") 앞(인덱스 3)에 까지인("세")만 뽑아온다.
		str = "안녕하세요".substring(1,4);
		System.out.println(str);
		// 녕하세

		str = "안녕하세요 오늘도 행복하시고 좋은 하루 되세요~~^^";
		str = str.substring(2, str.length());  // 문자열 str 에서 index 가 2 부터 끝까지 뽑아온다. 
		System.out.println(str);
		// 하세요 오늘도 행복하시고 좋은 하루 되세요~~^^
		
		
		
		// ==== 4. "문자열".substring(int 시작인덱스) ====
		str = "안녕하세요 오늘도 행복하시고 좋은 하루 되세요~~^^";
		str = str.substring(2);  // 문자열 str 에서 index 가 2 부터 끝까지 뽑아온다. 
		System.out.println(str);
		// 하세요 오늘도 행복하시고 좋은 하루 되세요~~^^
		
		
		
		// ==== 5. "문자열".indexOf("찾을문자열") ====
		//         "문자열" 에서 최초로 나오는 "찾을문자열"의 인덱스(int)를 알려준다.
		
		int index = "시작하라 안녕하세요 건강하세요".indexOf("하");
		          // 012 
		System.out.println(index); // 2
		
		index = "시작하라 안녕하세요 건강하세요".indexOf("하세");
		      // 01234567 
		System.out.println(index); // 7
		
		index = "시작하라 안녕하세요 건강하세요".indexOf("A");
 	    System.out.println(index); // -1  찾고자 하는 문자열이 없으면 -1 이 나온다.
		
 	    
 	    // ==== [퀴즈] ==== //
 	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
 	    
 	    String[] pathFileNameArr = {"C:/mydocument/resume/나의이력서.hwp",
 	    		                    "D:/mymusic.mp3",
 	    		                    "C:/photo/내얼굴.jpg"};
 	    
 	    for(int i=0; i<pathFileNameArr.length; i++) {
 	    	System.out.println(pathFileNameArr[i]);
 	    }// end of for--------------
		/*
		   C:/mydocument/resume/나의이력서.hwp
           D:/mymusicmp3
           C:/photo/내얼굴.jpg   
		*/
 	    
 	    System.out.println("====================");
 	    
 	    // ===> 개선된 확정 for문 <=== //
 	    for(String val : pathFileNameArr) {
 	        System.out.println(val);	
 	    }
 	   /*
		   C:/mydocument/resume/나의이력서.hwp
	       D:/mymusic.mp3
	       C:/photo/내얼굴.jpg   
	   */
 	  
 	   System.out.println("\n===== 파일명만 뽑아온 결과물 1 ======"); 
 	   
 	   for(String val : pathFileNameArr) {
 		   char[] chArr = val.toCharArray();
 		   
 		   String str_reverse = "";
 		   for(int i=chArr.length-1; i>=0; i--) {
 			   str_reverse += chArr[i];
 		   }// end of for------------
 		   
 	    // System.out.println(str_reverse);
 		   /*
 		       pwh.서력이의나/emuser/tnemucodym/:C
               3pm.cisumym/:D
               gpj.굴얼내/otohp/:C 
 		   */
 		   
 		// str_reverse.substring(0, str_reverse에서 최초로 "/"가 나오는 위치값);
 		// str_reverse에서 최초로 "/"가 나오는 위치값은 str_reverse.indexOf("/") 이다.
 		   int idx = str_reverse.indexOf("/");
 		   str_reverse = str_reverse.substring(0, idx);
 		// System.out.println(str_reverse);
 		   /*
			   pwh.서력이의나
			   3pm.cisumym
			   gpj.굴얼내
 		   */
 		   
 		   chArr = str_reverse.toCharArray();
 		   String str_result = "";
 		   for(int i=chArr.length-1; i>=0; i--) {
 			   str_result += chArr[i];
 		   }// end of for-----------------
 		   
 		   System.out.println(str_result);
 		   
 	   }// end of for----------------------
 	  /*  
 	       나의이력서.hwp
 	       mymusic.mp3
 	       내얼굴.jpg
	  */	
		
 	  System.out.println("\n===== 파일명만 뽑아온 결과물 2 ======");
 	  
 	  for(String val : pathFileNameArr) {
 		  
 		  String str_reverse = "";
 		  char[] chArr = val.toCharArray();
 		  for(int i=chArr.length-1; i>=0; i--) {
 			  char chr = chArr[i];
 			  if(chr != '/')
 			     str_reverse += chr;
 			  else
 				 break;  
 		  }// end of for-------------
 		  
 	   // System.out.println(str_reverse);
 		  /*
			pwh.서력이의나
			3pm.cisumym
			gpj.굴얼내 
 		  */
 		  
 		 String str_result = ""; 
 		 chArr = str_reverse.toCharArray();
 		 for(int i=chArr.length-1; i>=0; i--) {
 			str_result += chArr[i];
 		 }// end of for------------------
 		 
 		 System.out.println(str_result);
 		  
 	  }// end of for----------------------
 	  
 	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
 	  
 	  
 	  
 	// ==== 6. "문자열".lastIndexOf("찾을문자열") ====
	//         "문자열" 에서 마지막으로 나오는 "찾을문자열"의 인덱스(int)를 알려준다.
	
		index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하");
		      // 012 
		System.out.println(index); // 13
		
		index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하세");
		      // 01234567 
		System.out.println(index); // 13
		
		index = "시작하라 안녕하세요 건강하세요".lastIndexOf("A");
	    System.out.println(index); // -1  찾고자 하는 문자열이 없으면 -1 이 나온다.
 	  
    
	    System.out.println("\n===== 파일명만 뽑아온 결과물 3 ======");
	    
	    for(String val : pathFileNameArr) {
	    //	System.out.println(val);
	    /*
	        C:/mydocument/resume/나의이력서.hwp
			D:/mymusic.mp3
			C:/photo/내얼굴.jpg 	
	     */
	    	System.out.println(val.substring(val.lastIndexOf("/")+1));
	    	
	    }// end of for--------------------
	    
	    
	    
	 // ==== 7. "문자열".split("구분자") ====
	 //         "문자열"을 "구분자"로 잘라서 String 타입의 배열로 돌려주는 것이다.
	    System.out.println("\n 1.============================== \n");
	    
	    String food = "제육볶음,볶음밥,닭가슴살,함박스테이크,소고기덮밥";
	    
	    String[] food_arr = food.split(",");
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥"}
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1)+"."+food_arr[i]);
	    }// end of for--------------------------
 	    /*
			1.제육볶음
			2.볶음밥
			3.닭가슴살
			4.함박스테이크
			5.소고기덮밥 
 	     */
	    
	    
	    System.out.println("\n 2.============================== \n");
	    
	    food = "제육볶음	볶음밥	닭가슴살	함박스테이크	소고기덮밥";
	    
	    food_arr = food.split("\t");
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥"}
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1)+"."+food_arr[i]);
	    }// end of for--------------------------
 	    /*
			1.제육볶음
			2.볶음밥
			3.닭가슴살
			4.함박스테이크
			5.소고기덮밥 
 	     */
	    
	    
	    System.out.println("\n 3.=== split 사용시 구분자로 . | / 등 특수문자를 사용하려고 하는 경우 === \n");
	    
	    food = "제육볶음.볶음밥.닭가슴살.함박스테이크.소고기덮밥";
	    food_arr = food.split(".");
	    System.out.println("food_arr.length => " + food_arr.length);
	    // food_arr.length => 0
	    // ==> 0 이 나옴. 즉 . 단독만으로는 구분자로 인식을 못함.
        // split 사용시 구분자로 . | / 등 특수문자를 사용하려고 할 경우에는 구분자로 인식을 못할 경우가 많으므로 
        // 구분자 앞에 \\ 를 붙이거나 구분자를 [] 로 씌워주면 된다.
        // 즉, \\구분자  이거나  [구분자] 이렇게 해야 한다.
	    
	    food_arr = food.split("\\.");//[] 나 \\ 사용해야나온다
	    System.out.println("food_arr.length => " + food_arr.length);
	    // food_arr.length => 5
	    
	    food_arr = food.split("[.]");//[] 나 \\ 사용해야나온다
	    System.out.println("food_arr.length => " + food_arr.length);
	    // food_arr.length => 5
	    
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥"}
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1)+"."+food_arr[i]);
	    }// end of for--------------------------
 	    /*
			1.제육볶음
			2.볶음밥
			3.닭가슴살
			4.함박스테이크
			5.소고기덮밥 
 	     */
	    
	    
	    System.out.println("\n 4.============================== \n");
	    
	    food = "제육볶음,볶음밥.닭가슴살|함박스테이크,소고기덮밥	라면";
	    
	    food_arr = food.split("\\,|\\.|\\||\\\t");
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥","라면"}
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1)+"."+food_arr[i]);
	    }// end of for--------------------------
 	    /*
			1.제육볶음
			2.볶음밥
			3.닭가슴살
			4.함박스테이크
			5.소고기덮밥
			6.라면 
 	     */
 	   
	    
	    System.out.println("\n 5.============================== \n");
	    
	    food = "제육볶음,볶음밥.닭가슴살|함박스테이크,소고기덮밥	라면";
	    
	    food_arr = food.split("[,.|\t]");
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥","라면"}
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1)+"."+food_arr[i]);
	    }// end of for--------------------------
 	    /*
			1.제육볶음
			2.볶음밥
			3.닭가슴살
			4.함박스테이크
			5.소고기덮밥
			6.라면 
 	     */
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        
        // === [참고] \ 를 escape 문자라고 부른다. === 
        System.out.println("나의 이름은 \"이순신\" 입니다.");
        // 나의 이름은 "이순신" 입니다.
        
        System.out.println("C:\\NCS\\workspace_java");
        // C:\NCS\workspace_java
	    
        
        
     // ==== 8. String.join("합칠구분자", 문자열배열명)  ====
     //         문자열배열을 "합칠구분자"로 합쳐서 String 타입으로 돌려주는 것이다.
        String[] name_arr = {"한석규","두석규","세석규","네석규","오석규"}; 
        String names = String.join("-", name_arr);
        System.out.println(names);
	    // 한석규-두석규-세석규-네석규-오석규
        
        String str_1 = "시작하세요 안녕하세요 건강하세요 ";
        str_1 = String.join(" ", str_1.split("\\하세요 "));  // {"시작","안녕","건강"}
        System.out.println(str_1);
        // 시작 안녕 건강
        
        String id = "      super     man    ";
        System.out.println(id); //      super     man    
        
        id = String.join("", id.split("\\ "));  // {"super","man"}
        System.out.println(id); //superman
        
        String money1 = "$2,000,000";
        String money2 = "$500,000";
        
        String money1_1 = String.join("", money1.split("[$,]")); // {"2","000","000"}
        // "2000000"
        
        String money2_1 = String.join("", money2.split("[$,]")); // {"500","000"}
        // "500000"
                
        int money3 = Integer.parseInt(money1_1) + Integer.parseInt(money2_1);
        // 2500000
        
        DecimalFormat df = new DecimalFormat("#,###"); 
        // 정수를 세자리 마다 , 찍어서 String 타입으로 만들어 주는 것. 특히 금액을 나타낼 때 많이 쓰인다. 
        String hab = "$"+df.format(money3); // money3의 포멧을 변경하여 hab 에 넣었다
        
        System.out.println(money1 + " + " + money2 +" = " + hab);
        // $2,000,000 + $500,000 = 2500000
        
        System.out.println(money1 + " + " + money2 +" = $" + new DecimalFormat("#,###").format(money3)); 
        // $2,000,000 + $500,000 = $2,500,000
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("은행계좌번호 입력 : "); 
        String bank_number = sc.nextLine(); // "103-02-5678-1234"
        
        bank_number = String.join("", bank_number.split("\\-")); // {"103","02","5678","1234"} 
        // "1030256781234"
        
        System.out.println("입력받은 은행계좌번호 : " + bank_number);
        // 입력받은 은행계좌번호 : 1030256781234
        
        // ============================================================ //
        
        
        
        
     // === 9. "문자열".replaceAll("변경대상문자열", "새로이변경될문자열") ====
     //        "문자열" 에서 "변경대상문자열" 을 모두 "새로이변경될문자열" 로 교체해서 반환.
        
        names = "한석규-두석규-세석규-네석규-오석규";
        
        names = names.replaceAll("석규", "SK");
        System.out.println(names);
        // 한SK-두SK-세SK-네SK-오SK
        
     
        
     // === 10. "문자열".replaceFirst("변경대상문자열", "새로이변경될문자열") ====
     //         "문자열" 에서 "변경대상문자열" 을 첫번째만 "새로이변경될문자열" 로 교체해서 반환.   
        names = names.replaceFirst("SK", "석규");
        System.out.println(names);
        // 한석규-두SK-세SK-네SK-오SK
        
        names = "한SK-두SK-세SK-네SK-오SK";
        // replaceFirst 를 사용하여 첫번째, 두번째, 세번째 "SK" 를 "석규" 로 변환하세요.
        
        for(int i=0; i<3; i++) {
        	names = names.replaceFirst("SK", "석규");
        	     // 한석규-두SK-세SK-네SK-오SK
        	     // 한석규-두석규-세SK-네SK-오SK
        	     // 한석규-두석규-세석규-네SK-오SK  
        }// end of for-----------------
        
        System.out.println(names);
        // 한석규-두석규-세석규-네SK-오SK
        
        names = "한SK-두SK-세SK-네SK-오SK";
        String names1 = names.substring(0, names.indexOf("-네")); // "한SK-두SK-세SK";
        System.out.println(names1); // "한SK-두SK-세SK";
        names1 = names1.replaceAll("SK", "석규"); // "한석규-두석규-세석규"
        System.out.println(names1); // "한석규-두석규-세석규"
        
        String names2 = names.substring(names.indexOf("-네"));    // "-네SK-오SK";
        System.out.println(names2); // "-네SK-오SK";
        
        System.out.println(names1 + names2); // "한석규-두석규-세석규-네SK-오SK"
        // 한석규-두석규-세석규-네SK-오SK
        
        
        names = "한SK-두SK-세SK-네SK-오SK";
        // 홀수번째 나오는 것만 "SK" 를 "석규"로 변환하세요.
        
        String[] irum_arr =  names.split("\\-"); // {"한SK","두SK","세SK","네SK","오SK"}
                                          // index =>  0      1      2     3      4
        
        for(int i=0; i<irum_arr.length; i++) {
        	if(i%2 == 0) {
        		irum_arr[i] = irum_arr[i].replaceAll("SK", "석규");
        	}
        }// end of for-----------------
        // {"한석규","두SK","세석규","네SK","오석규"}
        
        names = String.join("-", irum_arr); // "한석규-두SK-세석규-네SK-오석규"
        
        System.out.println(names);
        // 한석규-두SK-세석규-네SK-오석규
        
        
        
        System.out.println("#####################################");
        
       
        
     // === 11. "문자열".toUpperCase()  ===
  	 //         "문자열"에서 소문자가 있으면 모두 대문자로 변경해서 반환.
  	   String words = "My Name is Tom 입니다.";
  	   System.out.println(words.toUpperCase());
  	   // MY NAME IS TOM 입니다. 
  			
  	   
  					
  	 // === 12. "문자열".toLowerCase()  ===
  	 //         "문자열"에서 대문자가 있으면 모두 소문자로 변경해서 반환.
  	   words = "My Name is Tom 입니다.";
  	   System.out.println(words.toLowerCase());
  	   // my name is tom 입니다.
         
  	   System.out.println("=================");   
        
  	   
        
        
     // === 13. "문자열".contains("찾을문자열") ====
     //         "문자열" 에서 "찾을문자열" 을 포함하고 있으면 true 를 반환.
     //         "문자열" 에서 "찾을문자열" 을 포함하고 있지 않으면 false 를 반환.
        System.out.println("안녕하세요 JaVa입니다.".contains("JaVa")); // true
        System.out.println("안녕하세요 JaVa입니다.".contains("java")); // false
        
        System.out.println("안녕하세요 JaVa입니다.".toLowerCase()); // 안녕하세요 java입니다.
        System.out.println("안녕하세요 JaVa입니다.".toUpperCase()); // 안녕하세요 JAVA입니다.
        
        System.out.println("안녕하세요 JaVa입니다.".toLowerCase().contains("jAVa".toLowerCase())); // true
        System.out.println("안녕하세요 JaVa입니다.".toUpperCase().contains("jAVa".toUpperCase())); // true  
        
        
        
        String[] contents = {"호호안녕하세요","건강하세요","행복하세요 또봐요","즐겁고 건강한 하루되세요"};
        
        // "건강" 이라는 단어가 포함된 것을 출력하세요.
        for(String val : contents) {
         //	System.out.println(val.indexOf("건강")); // -1  0  -1  4
        	if(val.indexOf("건강") >= 0)
        		System.out.println(val);
        }// end of for------------------------
        /*
          건강하세요
          즐겁고 건강한 하루되세요
        */
        
        // "건강" 이라는 단어가 포함된 것을 출력하세요.
        for(String val : contents) {
         //	System.out.println(val.contains("건강")); // false  true  false  true
        	if(val.contains("건강"))
        		System.out.println(val);
        }// end of for------------------------
        /*
          건강하세요
          즐겁고 건강한 하루되세요
        */
        
        
        
     // === 14. "문자열".startsWith("찾을문자열") ====
     //         "문자열" 에서 "찾을문자열" 이 맨첫번째에 나오면 true 를 반환.
     //         "문자열" 에서 "찾을문자열" 이 맨첫번째에 나오지 않으면 false 를 반환.
        
        String[] arr_content = {"호호안녕하세요","건강하세요","행복하세요 또봐요","즐겁고 건강한 하루되세요"}; 
        
        // "건강" 이라는 문자열로 시작하는 것만 출력하세요.
        for(String val : arr_content) {
        	if(val.indexOf("건강") == 0)
        		System.out.println("indexOf 활용한것 : " + val);
        }// end of for------------------------
        // indexOf 활용한것 : 건강하세요
        
        // "건강" 이라는 문자열로 시작하는 것만 출력하세요.
        for(String val : arr_content) {
        	if(val.startsWith("건강"))
        		System.out.println("startsWith 활용한것 : " + val);
        }// end of for---------------------
        // startsWith 활용한것 : 건강하세요
        
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
        
        
     // === 15. "문자열".endsWith("찾을문자열") ====
     //         "문자열" 에서 "찾을문자열" 로 끝나면 true 를 반환.
     //         "문자열" 에서 "찾을문자열" 로 끝나지 않으면 false 를 반환.   
        
        // "하세요" 라는 문자열로 끝나는 것만 출력하세요.
        for(String val : arr_content) {
        	int len = "하세요".length(); // 3
        	val.length(); // 7   5   9   13
        	
        	int idx = val.length() - len; // 4  2  6  10
        //	System.out.println(val.substring(idx));
        	/*
				하세요
				하세요
				또봐요
				되세요  
        	*/
        	if("하세요".equals(val.substring(idx)))
        		System.out.println(val);
        	
        }// end of for-----------------
        // 호호안녕하세요
        // 건강하세요	
        
        // "하세요" 라는 문자열로 끝나는 것만 출력하세요.
        for(String val : arr_content) {
        	if(val.endsWith("하세요"))
        		System.out.println("endsWith 활용한 것 : "+val);
        }// end of for----------------------------
        // endsWith 활용한 것 : 호호안녕하세요
        // endsWith 활용한 것 : 건강하세요
        
        
        // ▣ "문자열".repeat(반복회수) : 문자열을 파라미터로 주어진 수 만큼 반복
        System.out.println("\n" + "~".repeat(50) + "\n");
        System.out.println("안녕 ".repeat(5));
        
        // ▣ "문자열".trim()  : 문자열 공백 제거
        // ▣ "문자열".strip() : 문자열 공백 제거
        // ▣ "문자열".stripLeading()  : 문자열 앞의 공백 제거
        // ▣ "문자열".stripTrailing() : 문자열 뒤의 공백 제거
        
        System.out.println("시작" + "       ja    va        ".trim() + "끝");
        //시작ja    va끝
        
        System.out.println("시작" + "       ja    va        ".strip() + "끝");
        //시작ja    va끝
        
        System.out.println("시작" + "       ja    va        ".stripLeading() + "끝");
        //시작ja    va        끝
        
        System.out.println("시작" + "       ja    va        ".stripTrailing() + "끝");
        //시작       ja    va끝
	    
        
        // ▣ "문자열".isEmpty()  : "문자열" 이 "" 일때만 true
        // ▣ "문자열".isBlank()  : "문자열" 이 "" 또는 "     " 일때 true
        System.out.println("".isEmpty());      // true
        System.out.println("     ".isEmpty()); // false
        System.out.println("  k  ".isEmpty()); // false
        
        System.out.println("".isBlank());       // true
        System.out.println("     ".isBlank());  // true
        System.out.println("  s   ".isBlank()); // false
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        
        
        // ▣ "문자열".lines().toArray() ==> "문자열" 에서 줄단위로 나뉘어 있는 문자열을 배열로 반환
        Object[] arr_obj = "id:leess\npwd:qwer1234$\n성명:이순신\n주소:서울시 강남구".lines().toArray(); 
        for(Object obj : arr_obj) {
        	System.out.println((String)obj);
        }// end of for-----------------
        /*
			id:leess
			pwd:qwer1234$
			성명:이순신
			주소:서울시 강남구 
         */
         
         System.out.println("-".repeat(20));
        
         String[] arr_str = "id:leess\npwd:qwer1234$\n성명:이순신\n주소:서울시 강남구".split("\\\n");
         for(String val : arr_str) {
        	 System.out.println(val);
         }// end of for--------------------
         /*
			id:leess
			pwd:qwer1234$
			성명:이순신
			주소:서울시 강남구 
          */
         
         System.out.println("-".repeat(20));
         
         
      // === JDK 17 부터 새로이 추가된 String 관련 내용들 === //
	  /* 텍스트 블록은 3개의 큰 따옴표로 정의되며, 아래와 같이 작성할 수 있다. 
	     이것은 기존에 JSON 문자열을 직접 생성할 때 이스케이프 처리(\) 로 가독성이 떨어지던 문제를 
	     텍스트 블록을 통해 개선하게 되었다. */
         
         String msg1 = "안녕하세요\n"
         		     + "오늘은 수요일 입니다.\n"
         		     + "즐거운 오후 되세요";
         
         System.out.println(msg1);
         /*
			안녕하세요
			오늘은 수요일 입니다.
			즐거운 오후 되세요 
          */
         
         String msg2 = """
         		       안녕하세요2 
         		       오늘은 수요일 입니다.2
         		       즐거운 오후 되세요2
         		       """;
         System.out.println(msg2);
         /*
			안녕하세요2
			오늘은 수요일 입니다.2
			즐거운 오후 되세요2
         */
         
         String old_json = "{\n"
         		         + " \"name\": \"이순신\",\n"
         		         + " \"age\": 27,\n"
         		         + " \"address\": \"서울시 강남구 테혜란로\"\n"
         		         + "}";
         
         System.out.println(old_json);
         /*
			{
			 "name": "이순신",
			 "age": 27,
			 "address": "서울시 강남구 테혜란로"
			} 
         */
         
         System.out.println("-".repeat(20));
         
         String new_json = """
         		  {
			        "name": "이순신",
			        "age": 27,
			        "address": "서울시 강남구 테혜란로"
			      }
         		  """;
         
         System.out.println(new_json);
         /*
			{
			 "name": "이순신",
			 "age": 27,
			 "address": "서울시 강남구 테혜란로"
			} 
         */
         
	}// end of main(String[] args)-----------------------

}
