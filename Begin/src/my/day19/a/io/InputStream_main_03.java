package my.day19.a.io;

import java.io.IOException;

public class InputStream_main_03 {

	public static void main(String[] args) throws IOException {
		
		int input = 0;
		int totalByte = 0; // byte 수 누적용도
		
		while( (input = System.in.read()) != -1 ) {
			// -1 은 키보드로 부터 Ctrl+Z(윈도우), Ctrl+D(유닉스,리눅스,맥) 를 입력한 값이다.
			// 키보드로 부터 Ctrl+Z(윈도우), Ctrl+D(유닉스,리눅스,맥) 를 하면 while 을 빠져 나간다.
			// System.in.read() 는 1byte 씩 읽어온다.
			
			if( input != 13 && input != 10 ) {
				// 키보드로 부터 입력받은 것이 엔터가 아니라면 
				totalByte++;
				System.out.write(input);
				System.out.flush();
			}
			else {
				// 키보드로 부터 입력받은 것이 엔터이라면
				System.out.print("\n");
			}
			
		}// end of while---------------------------

		System.out.println("총 : " + totalByte + "byte 입력함");
		
	}// end of main(String[] args)------------------------------

}
