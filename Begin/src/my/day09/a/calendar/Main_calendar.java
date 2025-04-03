package my.day09.a.calendar;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import my.util.MyUtil;

public class Main_calendar {

	public static void main(String[] args) {
		//자바에서 날짜를 나타낼때는 date,calendar 를 사용한다 
		
		// ===1. date 클래스를 사용하여 현재 시작 나타내기 ===
		
		Date now = new Date(0);
		
		//System.out.println(">> 현재시각 1 => " + now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//System.out.println(">> 현재시각 2 => " + sdf.format(now));
		
		/*
	       <참고>
	         날짜 타입 format         설명
	        --------------------------------------------------
	           %tF              날짜를 yyyy-mm-dd 형식으로 포맷해주는 것
	         %tT              날짜의 시각을 HH:MM:SS 형식으로 포맷해주는 것  
	           %tp              오전, 오후를 출력
	         %tA              요일명 출력
	         %tY              4자리 년도만 출력
	           %tB              월의 이름(January, February ...)출력
	         %tm              월의 01,02,03 ~~ 10,11,12 로 출력
	         %td              일수를 1~31 로 출력
	         %te              %td와 동일함
	         %tk              시간을 0~23 으로 출력
	           %tl              시간을 1~12 으로 출력
	         %tM              분을 00~59 으로 출력
	           %tS              초를 00~59 으로 출력
	         %tZ              타임존을 출력(한국은 KST로 나옴).
	      */
		
		
		String currenttime = String.format("%tF %tp %tT %tp %tZ", now,now,now,now,now);
		
		System.out.println(">> 현재시각 3 ==> " + currenttime);
		
		
		// ===입력한 날짜가 실제로 유효한 날짜인지 검사하기 === 
		sdf = new SimpleDateFormat("yyyyMMdd");
		
		sdf.setLenient(false);
	      // false 로 해주어야만 입력한 값을 날짜 타입으로 변경할때 날짜로 되지 못하는 값일 경우 오류가 발생한다.
	      // 날짜로 파싱될 때 허술하게 하지 말고 엄격하게 하라고 설정해주는 것이라고 생각하면 된다.
		
		// 문자열을 날짜 형태로 변환하기 
		
		try {
			Date d = sdf.parse("20050428");
			System.out.println(d);
					
		}catch (ParseException e ) {
			System.out.println( " >> 달력에 존재하기 않는 값입니다 ");
			e.printStackTrace();
		}
		// 2개의 의 날짜를 비교하여 2개의 날짜가 같은 날짜인지 아니면 
		//2개의 날짜중 어떤 날짜가 이전날짜인지 이후 날자인지 알아오기 
		
		
		try {
		String str_date1 = "20050403";
		String str_date2 = "20050404";
		Date date1 = sdf.parse(String.join("", str_date1.split("\\-")));
		Date date2 = sdf.parse(String.join("", str_date2.split("\\-")));
		// 날짜 비교하기
		/* 
        >> Date 클래스에서 제공하는 compareTo() 메소드 <<
        
           date1.compareTo(date2);
        
             date1 날짜와 date2 날짜가 동일하면 0을 반환하고,
             date1 날짜가 date2 날짜 보다 이전 날짜인 경우 -1을 반환하고, 
             반대로 date1 날짜가 date2 날짜 보다 이후 날짜인 경우 경우 1을 반환한다. 
     */
		System.out.println(date1.compareTo(date2)); // -1
		System.out.println(date2.compareTo(date1));//   1
		
		if(date1.compareTo(date2) == -1) {
		
		
		}
		}catch (ParseException e ) {
			System.out.println( " >> 달력에 존재하기 않는 값입니다 ");
			e.printStackTrace();
		}
		/*
        >> Date 클래스에서 제공하는 Date.before 메소드 <<
          date1.before(date2);
        
          date1 날짜가 date2 날짜 보다 이전 날짜인 경우 true를 반환하고, 
          동일한 날짜이거나 이후 날짜인 경우 false를 반환한다.*/
     
		
	
		
		
		
		
		
		/*
        >> Date 클래스에서 제공하는 Date.after 메소드 <<
          date1.after(date2);
            
          date1 날짜가 date2 날짜 보다 이후 날짜인 경우 true를 반환하고, 
          동일한 날짜이거나 이전 날짜인 경우 false를 반환한다.
     */
		
	 //  만나이 구하기 	
	/*
	  "20000301"	==> 올해년도 2025- 태어난 년도 2000    ==> 만 25세 
	   오늘은 "20250403"
	   "20000501"	==> 올해년도 2025- 태어난 년도 2000 -1 ==> 만 24세
	   
	 */
		
		java.util.Date now1 = new java.util.Date();// 현재시작 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		String str_now_year = sdf1.format(now1);
		
		System.out.println(str_now_year);
		String birthday_1 = "20000301";
		String birthday_2 = "20000501";
		
		int now_year = Integer.parseInt(sdf1.format(new java.util.Date())); //2025
		
		int birthday_1_year = Integer.parseInt(birthday_1.substring(0, 4)); // 2000
		int birthday_2_year = Integer.parseInt(birthday_2.substring(0, 4)); // 2000

		String current_birthday_1 = sdf1.format(new java.util.Date()) + birthday_1.substring(4);
		//													2025  + 0301 ==> 20250301
		
		String current_birthday_2 = sdf1.format(new java.util.Date()) + birthday_2.substring(4);
		//													2025  + 0301 ==> 20250301
		
		// ==== 문자열을 날짜형태로 변환하기 ====
		SimpleDateFormat new_sdf = new SimpleDateFormat("yyyyMMdd");
		new_sdf.setLenient(false); 
		try { 
		java.util.Date birhday_date_1 = new_sdf.parse(current_birthday_1);
		java.util.Date birhday_date_2 = new_sdf.parse(current_birthday_2);
		int add = (birhday_date_1.after(new java.util.Date()))? -1:0;
		int age_1 = now_year -birthday_1_year + add;
		add = (birhday_date_2.after(new java.util.Date()))? -1:0;
		int age_2 = now_year -birthday_1_year + add;
		
		System.out.println("태어날 생일이 " + birthday_1 + "인 사람은 올해 만" +age_1 +"세입니다" );
		System.out.println("태어날 생일이 " + birthday_2 + "인 사람은 올해 만" +age_2 +"세입니다" );
		} catch(ParseException e) {
			System.out.println(">> 달력에 존재하지 않는 값입니다. <<");
			e.printStackTrace();
		}
		
		//-------------------------------------------------------------------------
		System.out.println("\n" + " = ".repeat(50) + "\n");
		
		
		// ====== 주민번호 7자리를 넣어주면 "만 나이를" 알려주기
		
		String jubun_1 = "안녕하세요하하 "; // 숫자로만 이루어지지 않았으므로
		String jubun_2 ="9803011235678"; // 입력받는 주민번호의 길이는 오로지 7글자가 아니므로
		String jubun_3 ="980301" ;// 입력받는 주민번호의 길이는 오로지 7글자가 아니므로
		String jubun_4 ="9803019" ;// 주민번호 마지막 글잔는 1또는 2또는 3또는 4만 가능 
		String jubun_5 ="9803321"; // 달력에 존재하지 않는 날짜이므로 
		
		String jubun_6 ="0003013"; //정상
		String jubun_7 ="0005014";
		try { 
			
		
		int age1 = MyUtil.age(jubun_6);
		System.out.println("만" + age1 + "세"); //만 25세
		
		int age2 = MyUtil.age(jubun_7);
		System.out.println("만" + age2 + "세"); //만 24세 
		} catch (Exception e) {
			System.out.println(">> 입력하신 주민번호는 올바르지 않습니다 ");
			
			
			
			
			
			
			
			
			
		}
		
		System.out.println("\n----------------------");
		
		/* 
         Date 클래스 보다 조금 더 향상시켜서 나온 것이 Calendar 클래스이다.
         간단한 날짜표현에는 Date 클래스를 사용하는 것이 더 나을 수 있으나,
         두 개 날짜사이의 날짜연산을 할 경우에는 메소드기능이 더 많이 추가된 
         Calendar 클래스를 사용하는 것이 나을 수 있다.
      */
		Calendar currentDate = Calendar.getInstance();
		// 현재 날짜와 시간을 얻어온다. 
		
		int year_current = currentDate.get(Calendar.YEAR);//현재년도 
		//int month_current = currentDate.get(Calendar.MONTH); //현재월 월은 0~11
		int month_current = currentDate.get(Calendar.MONTH)+1;
		System.out.println(year_current + "년"+ month_current+ "월");
		
		String str_month_currnt = (month_current < 10)? "0"+month_current:""+month_current;
		System.out.println(year_current + "년"+ str_month_currnt+ "월");
		
		
		/*
		 주의해야할 것은 get(Calendar.MONTH)로 얻어오는 값의 범위가 1~12가 아닌, 0~11 이라는 것이다. 
   	 	 그래서 get(Calendar.MONTH)로 얻어오는 값이 0이면 1월을 의미하고 11이면 12월을 의미한다.
		 */
		
		System.out.println("이 해의 몇 째 주: " + currentDate.get(Calendar.WEEK_OF_YEAR));
	    System.out.println("이 달의 몇 째 주: " + currentDate.get(Calendar.WEEK_OF_MONTH));
	    int day = currentDate.get(Calendar.DATE);
	    String str_day = (day < 10)? "0"+day:""+day;
	    System.out.println(year_current + "년"+ str_month_currnt+ "월"+ str_day +"일"); // 2025년 4월 3일 
		
	    
	    System.out.println("이 달의 몇 일: " + currentDate.get(Calendar.DATE));
	    System.out.println("이 달의 몇 일: " + currentDate.get(Calendar.DAY_OF_MONTH));
	    // currentDate.get(Calendar.DATE) 와 Calendar.DAY_OF_MONTH 은 같은 것이다.
	    System.out.println("이 해의 몇 일: " + currentDate.get(Calendar.DAY_OF_YEAR));
	       
	    // 1:일요일, 2:월요일, 3:화요일, 4:수요일, 5:목요일, 6:금요일, 7:토요일
	    System.out.println("요일(1~7, 1:일요일): " + currentDate.get(Calendar.DAY_OF_WEEK)); 
	    System.out.println("이 달의 몇 째 주: " + currentDate.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    
	    String dayname = "";
	    
	    switch (currentDate.get(Calendar.DAY_OF_WEEK)) {
	    case 1: 
	    dayname = "일";
	    break;
			
	    case 2: 
	    dayname = "월";
	    break;
	    
	    case 3: 
	    dayname = "화";
	    break;
	    case 4: 
	    dayname = "수";
	    break;
	    case 5: 
	    dayname = "목";
	    break;
	    case 6: 
	    dayname = "금";
	    break;
	    case 7: 
	    dayname = "토";
			break;
		}
	    System.out.println(year_current + "년"+ str_month_currnt+ "월"+ str_day +"일" + dayname +"요일입니다"); // 2025년 4월 3일 목요일입니다
	    
	    
	    System.out.println("오전_오후(0:오전, 1:오후): " + currentDate.get(Calendar.AM_PM));
	      System.out.println("시간(0~11): " + currentDate.get(Calendar.HOUR));
	      System.out.println("시간(0~23): " + currentDate.get(Calendar.HOUR_OF_DAY));
	      System.out.println("분(0~59): " + currentDate.get(Calendar.MINUTE));
	      System.out.println("초(0~59): " + currentDate.get(Calendar.SECOND));
	      System.out.println("1000분의 1초(0~999): " + currentDate.get(Calendar.MILLISECOND));
	    
	   // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초)
	      System.out.println("TimeZone(-12~+12): " + (currentDate.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
	      
	      // 이 달의 마지막 일을 찾는다.
	      System.out.println("이 달의 마지막 날: " + currentDate.getActualMaximum(Calendar.DATE) );
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      Calendar current_now = Calendar.getInstance();
	      SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	      
	   // === 어제시각 나타내기 ===
	      current_now.add(Calendar.DATE, -1);
	      System.out.println("어제시각 => " + current_now);
	      System.out.println("어제시각 => " + current_now.getTime() );
	      System.out.println("어제시각 => " + sdfmt.format(current_now.getTime()) );
	   // === 현재시각 나타내기 ===
	      current_now = Calendar.getInstance();
	      System.out.println("현재시각 => " + sdfmt.format(current_now.getTime()) );
	    //=== 내일시각 나타내기
	      current_now.add(Calendar.DATE, +1);
	      System.out.println("내일시각 => " + sdfmt.format(current_now.getTime()) );
	      
	      
	      
	   // === 한달전시각 나타내기 ===
      current_now = Calendar.getInstance();
	      current_now.add(Calendar.MONTH, -1);
	      System.out.println("한달전시각 => " + current_now);
	      System.out.println("한달전시각 => " + current_now.getTime() );
	      System.out.println("한달전시각 => " + sdfmt.format(current_now.getTime()) );
	   // === 현재시각 나타내기 ===
	      current_now = Calendar.getInstance();
	      System.out.println("현재시각 => " + sdfmt.format(current_now.getTime()) );
	    //=== 한달후시각 나타내기
	      current_now.add(Calendar.MONTH, +1);
	      System.out.println("한달후시각 => " + sdfmt.format(current_now.getTime()) );
	        
	    //=================================================================
	      
	      
	      current_now = Calendar.getInstance();
	     
	      
	      current_now.add(Calendar.MONTH, +14);
	      current_now.add(Calendar.DATE, +3);
	      current_now.add(Calendar.SECOND, +14706);
	      System.out.println(" 현재시각으로 부터 1년 2개월 3일 4시간 5분 6초 후");
	      System.out.println( sdfmt.format(current_now.getTime()) );
	      
	      
	      
	    
	      
	      
	      
	      
	      
	      
	      
	}// end main

}
