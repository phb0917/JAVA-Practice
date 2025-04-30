package my.day19.a.io;

import java.io.IOException;

public class InputStream_main_04 {

	public static void main(String[] args) throws IOException {
		
		// 키보드에서 "대한민국서울시쌍용센터엔터" 했다라면
		// "대한민국서"  "울시쌍용센"  "터엔터"
		//   10byte     10byte     4byte
		
		byte[] data_arr = new byte[10];
		// data_arr 변수의 용도는 빨대(System.in, 키보드)에서 흡입할 때 단위크기를 10byte 로 하는 것이다.
		
		int input_length = 0;
		// input_length 변수의 용도는 빨대(System.in, 키보드)에서 흡입한 실제 크기를 나타내는 용도임.
		
		int totalByte = 0; // byte 수 누적용도 
		int cnt = 0;       // while문의 반복회수를 알기위한 것
		
		while( (input_length = System.in.read(data_arr)) != -1 ) {
			// 키보드로 Ctrl + Z 를 누르지 않으면 계속실행해라 
			
			/*
			  System.in.read(data_arr)은 
			  입력한 데이터가 "대한민국서울시쌍용센터엔터" 이라면
			  입력한 내용에서 배열 data_arr의 크기만큼(지금은 10byte) 읽어들인다(지금은 "대한민국서"). 
			  읽어들인 "대한민국서"을 배열 data_arr 에 저장시키고, 읽어들인 크기를(지금은 10byte) 리턴시켜준다. 
			  
			  반복문의 첫번째일때
			    data_arr 에는 "대한민국서" 가 들어가고, input_length 에는 10 이 들어간다.
			
			  반복문의 두번째일때
			    data_arr 에는  "울시쌍용센" 이 들어가고, input_length 에는 10 이 들어간다.
			   
			  반복문의 세번째일때
			    data_arr 에는  "터엔터" 가 들어가고, input_length 에는 4 가 들어간다.   
			*/
			
			System.out.write(data_arr, 0, input_length);
			// 배열 data_arr 에 저장된 데이터에서 시작점이 0번째 index 부터(처음부터) input_length byte 수 만큼 출력해라는 말이다. 
			System.out.flush();
			
			totalByte += input_length; // 10 + 10 + 4
			
			cnt++; // 3
		}// end of while-------------------------
		
		System.out.println("총 : " + (totalByte-2) + "byte 입력함"); // 엔터크기를 빼려고 -2 를 한 것임.
		System.out.println("반복회수 : " + cnt + "번 반복함.");

	}// end of main(String[] args)----------------

 /*
    >>> 명령프롬프트에서 실행한 결과 화면 
	C:\NCS\workspace_java\Begin\bin>java my.day19.a.io.InputStream_main_04
	대한민국서울시쌍용센터
	대한민국서울시쌍용센터
	^Z
	총 : 22byte 입력함
	반복회수 : 3번 반복함. 
  */
}











