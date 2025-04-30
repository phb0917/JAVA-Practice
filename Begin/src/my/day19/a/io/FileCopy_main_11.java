package my.day19.a.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	>>>>> BufferedInputStream 와 BufferedOutputStream <<<<<
	   -- 1 byte 기반 스트림.
	   -- 필터스트림(다른말로 보조스트림 이라고 부른다.)
	   -- 단독으로 사용할 수 없고, 반드시 노드스트림에 장착되어 사용되는 것이다.
	      마치 수영장에서 오리발처럼 보조기구로 사용한다.
	      이것을 사용하면 오리발처럼 속도가 향상되므로 많이 사용한다.
	           
	   -- 읽어올 데이터를 매번 1 byte 마다 읽고,쓰고 한다라면 입.출력에 너무 많은 시간이 소요된다. 
	      그래서 쓰는 작업없이 메모리 버퍼에 데이터를 한꺼번에 쭉~~ 읽기만 하여 모아두면
	      그만큼 쓰는 작업이 없으므로 읽기 속도는 빨라질 것이다.
	      그리고 나서 메모리 버퍼에 읽어서 모아두었던 내용을 한방에 쓰기를 하면 매번 1byte 씩 쓰는 것보다
	      속도가 빨라진다.
	           
	    BufferedInputStream 와  BufferedOutputStream 의 기본 버퍼크기는 512 byte 이다.
	    
	    [예제]
	    필터스트림(보조스트림)을 이용해서 파일로 부터 입력받고, 
	    입력받은 그 내용을 파일에 출력해본다. 즉, 파일복사하기
	       
	    >>> 데이터소스 : 파일(FileInputStream --> 노드스트림)
	                + 필터스트림(보조스트림)으로 BufferedInputStream 을 사용함.
	    
	    >>> 데이터목적지 : 파일(FileOutputStream --> 노드스트림)
	                  + 필터스트림(보조스트림)으로  BufferedOutputStream 을 사용함.
*/

public class FileCopy_main_11 {

	public static void main(String[] args) {

		String src_fileName = "";
		String target_fileName = "";
		
		try {
			// 입력노드스트림 ==> 파일(FileInputStream) 
			src_fileName = "C:/NCS/iotestdata/02.eclipse_2024_06_다운로드매뉴얼.zip";
			File src_file = new File(src_fileName);
			FileInputStream fist = new FileInputStream(src_file);
			
			// 입력노드스트림에 보조(필터)스트림(BufferedInputStream)을 장착한다.
		//	BufferedInputStream bist = new BufferedInputStream(fist);            // bist 의 버퍼크기는 512 byte 가 된다. 
			BufferedInputStream bist = new BufferedInputStream(fist, 1024*1024); // bist 의 버퍼크기는 1mb 가 된다. 
			// 입력노드스트림인 fist 에 보조(필터)스트림을 장착함.
			// bist 의 버퍼크기는 1024*1024 byte(== 1mb)가 된다.
			
			
			// 출력노드스트림 ==> 파일(FileOutputStream) 
			target_fileName = "C:/NCS/iotestdata/02.eclipse_2024_06_다운로드매뉴얼_COPY.zip";
			File target_file = new File(target_fileName);
			FileOutputStream fost = new FileOutputStream(target_file);
			
			// 출력노드스트림에 보조(필터)스트림(BufferedOutputStream)을 장착한다.
		//	BufferedOutputStream bost = new BufferedOutputStream(fost);            // bost 의 버퍼크기는 512 byte 가 된다. 
			BufferedOutputStream bost = new BufferedOutputStream(fost, 1024*1024); // bost 의 버퍼크기는 1mb 가 된다. 
			// 출력노드스트림인 fost 에 보조(필터)스트림을 장착함.
			// bost 의 버퍼크기는 1024*1024 byte(== 1mb)가 된다.
			
			
			byte[] data_arr = new byte[10*1024]; // 10*1024 byte == 10kb
			
			int input_length = 0;
			int totalByte = 0;  // byte 수 누적용도
			int cnt = 0;        // while문의 반복회수를 알기위한것
			
			int sharp_cnt = 0;
		
			long src_file_size = src_file.length(); // 파일의 크기를 알려준다.
			System.out.println(">> 원본파일("+src_fileName+") 크기 : "+src_file_size+"byte");
			
			long max_size = 10*1024*1024; // 10mb
			
			if(src_file_size > max_size) {
				// 원본 파일의 크기가 10mb 초과한 경우
				System.out.println(">> 원본 파일의 크기가 10mb 초과했으므로 복사할 수 없습니다. <<");
				
				// 닫을때는 보조(필터)스트림부터 먼저 닫고, 그 다음에 노드스트림을 닫는다.
				bist.close();
				fist.close();
				
				bost.close();
				fost.close();
				
				return; // main()메소드 종료
			}
			
			
			while( (input_length = bist.read(data_arr)) != -1 ) {
				
				bost.write(data_arr, 0, input_length);
				bost.flush();
				
				totalByte += input_length;
				
				if(input_length == 10*1024) {
					System.out.print("#");
					sharp_cnt++;
				}
				
				if(sharp_cnt%40 == 0) {
					System.out.print("\n");
				}
				
				cnt++; // 반복회수
			}// end of while-------------------
			
			System.out.println("\n복사완료!!");
			
			// 닫을때는 보조(필터)스트림부터 먼저 닫고, 그 다음에 노드스트림을 닫는다.
			bist.close();
			fist.close();
			
			bost.close();
			fost.close();
			
			System.out.println(target_fileName + "에 쓰기 완료!! " + totalByte + "byte 씀" );
			System.out.println("반복회수 : " + cnt + "번 반복함.");
			
		} catch (FileNotFoundException e) {
			System.out.println(src_fileName + " 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}// end of main(String[] args)----------------------

}
