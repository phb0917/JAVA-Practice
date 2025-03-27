package my.day04.a.For;

public class Main_for_2_break_continue {

	public static void main(String[] args) {
		System.out.println(">> 1.break << ");
		
		for(int i=0; i<10; i++) {
			if(i==5 ) { 
				break;// 반복문에서 break; 를 만나면 가장 가까운 반복문을 벗어나는 것이다 
			}
			
			System.out.println(i+1);
			}//end of for
		
		System.out.println("\n ~~~~~~~~~~~~~~~~~~~~ \n");
	int cnt = 0;
	
	for(; ;) { 
		if(cnt == 5) { 
			break;
		}
		
		System.out.println(++cnt + "번째 반복");
		}//end of for
	
	System.out.println("\n >>2. continue <<");
	
	for(int i=0; i<10; i++) {
		if( (i+1)%2 == 0) { // 출력하고자 하는 값이 짝수 이라면
			continue; // 반복문에서 continue 를 만나면 실행 순서가 
					  //밑으로 내려가지 않고, 가장 가까운 반복문의 증감식으로 이동시켜준다 
		}
		System.out.print((i+1) + " ");
	}
	
	System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	for(int i=0; i<10; i++) { 
		String str = (i<9)?",":" ";// (i<9)? 는 9보다 작을때까지 , 를 넣고 9를 넘어 가는 순간 " " 넣어준다 
		
		System.out.print((i+1) + str );
	}
	
	System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	for(int i=0; i<10; i++) { 
	String str = ((i+1)<9)?",":" ";
		if( (i+1)%2 ==0) {
	continue;}

	System.out.print((i+1) + str );
	
	
	
	
	
	
	}

	System.out.println("\n 프로그램 종료 ");
	}
	}
