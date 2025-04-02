package my.day07.a.twodimension.array;

public class Main_twodimension_array_1 {

	public static void main(String[] args) {
		// 1차원 배열 
		int[] subject_arr = new int[5]; // 1행 5열 
		/*
		   값 ==> | 0 | 0 | 0 | 0 | 0 |
		index ==>   0	1 	2	3	4  
		 */
		subject_arr[0] = 100;
		subject_arr[1] = 90;
		subject_arr[2] = 95;
		subject_arr[3] = 80;
		subject_arr[4] = 88;
		/*
		   값 ==> | 100 | 90 | 95 | 80 | 88 |
		index ==>   0	  1    2	3	 4  
		 */
		
		
		// 2차원 배열 
		int[][] point_arr = new int[4][3];
		
		/*
		  값 ==> 
		  		----------------------------
		  		| [0][0] | [0][1] | [0][2] |
		  		----------------------------
		  		| [1][0] | [1][1] | [1][2] |
		  		----------------------------
		  		| [2][0] | [2][1] | [2][2] |
		  		----------------------------
		  		| [3][0] | [3][1] | [3][2] |
		  		----------------------------
		 */
		point_arr[0][0] = 10;
		point_arr[0][1] = 20;
		point_arr[0][2] = 30;
		
		point_arr[1][0] = 40;
		point_arr[1][1] = 50;
		point_arr[1][2] = 60;
		
		point_arr[2][0] = 70;
		point_arr[2][1] = 80;
		point_arr[2][2] = 90;

		point_arr[3][0] = 100;
		point_arr[3][1] = 100;
		point_arr[3][2] = 100;
		
		System.out.println("point_arr.length : " + point_arr.length);
		// point_arr.length : 4 
		// 2차원 배열명. length 는 행의 길이가 나온다 
	
		System.out.println("point_arr[0].length : " + point_arr[0].length);
		// point_arr[0].length : 3
		// 2차원배열명[행의 인덱스].length 는 그 행에 존재하는 열의 길이(크기)가 나온다 
		System.out.println("point_arr[1].length : " + point_arr[1].length);
		// point_arr[0].length : 3
		// 2차원배열명[행의 인덱스].length 는 그 행에 존재하는 열의 길이(크기)가 나온다 
		System.out.println("point_arr[2].length : " + point_arr[2].length);
		// point_arr[0].length : 3
		// 2차원배열명[행의 인덱스].length 는 그 행에 존재하는 열의 길이(크기)가 나온다 
		System.out.println("point_arr[3].length : " + point_arr[3].length);
		// point_arr[0].length : 3
		// 2차원배열명[행의 인덱스].length 는 그 행에 존재하는 열의 길이(크기)가 나온다 
		
		System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		for(int i=0; i<point_arr.length; i++) {//행
			for(int j=0; j<point_arr[i].length; j++){// 열 
				String add = (j<point_arr[i].length -1)?",":"\n";
				System.out.printf("%d%s",point_arr[i][j], add);
				
			}//end of for
			}//end of for
		/*
		10,20,30
		40,50,60
		70,80,90
		100,100,100
		 */
		
		/*
	      ----------------------------------------------------
	      국어       영어       수학      총점    평균      학점   등수
	      ----------------------------------------------------
	      90       80       70      240    80.0       B   4
	      80       85       76      241    80.3       B   2
	      80       85       76      241    80.3       B   2
	      85       70       90      245    81.7       B   1
	      60       80       50      190    63.3       D   5
	      ====================================================
	      395       400       362   
	      79.0   80.0   72.4
	*/
		System.out.println("\n ========= 성적 결과 ========\n");
		
		int[][] jumsu_arr = { {90,80,70},//이순신
							  {80,85,76},//엄정화
							  {80,85,76},//홍길동
							  {85,70,90},//공유
							  {60,80,50}//아이유 
		
							};
		int [] total_arr = new int[jumsu_arr.length]; 
		// 각 학생별 총점을 저장시켜두는 곳이다 
		
		String[] result_arr = new String[jumsu_arr.length];
		// 각 학생별로 등수를 제외한 국어,영어,수학,총점,평균,학점까지 성적결과를 저장시켜두는 곳이다.
		
		
		System.out.println("----------------------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점\t등수");
		System.out.println("----------------------------------------------------");
		
		for(int i=0; i<jumsu_arr.length; i++) {//행 
			String result = "";
			int sum = 0;
			
			for(int j =0; j<jumsu_arr[i].length; j++) {//열
				
				result += jumsu_arr[i][j] + "\t";
				sum += jumsu_arr[i][j];
			}//end of for 
			double avg = Math.round((double)sum/jumsu_arr[i].length*10)/10.0;
			char grade = ' ';
			// 		100.0 		98.5 		92.4 
			// int시 100			98			92
			// 		100/10		98/10		92/10
			// 		10			9			9
			switch((int)avg/10) { // byte, short,int, char, string
			case 10:
			case 9:
				grade ='A';
				break;
			
			case 8:
				grade ='B';
				break;
				
			case 7:
				grade ='C';
				break;
				
			case 6:
				grade ='D';
				break;
				
			default:
				grade ='F';
				break;
			}//end of switch
			
				result += sum + "\t" + avg + "\t" + grade + "\t";
			
				//System.out.println(result);
				
				result_arr[i] = result;	// 각 학생별로 등수를 제외한 국어,영어,수학,총점,평균,학점까지 성적결과를 저장시켜두는 곳이다.
				
				
			total_arr[i] = sum; // 각 학생별 총점을 구해서 배열 total_arr 에 저장시켜둔다 
		}//end of for 
		
		//등수 구해서 성적 결과 출력하기 
		for(int i=0; i < total_arr.length; i++) { //학생수 학생의 성적을 가져와서 비교
			int rank = 1;
			for(int j=0 ; j< total_arr.length; j++) { //
				
				if(i != j && total_arr[i]< total_arr[j]) {
					rank++;
				}
				//total_arr[i] 이 자신의 총점
				//i!=j && total_arr[j] 이 다른 사람의 총점
			}//end of for 
		result_arr[i] += rank; // 	result_arr[i] = result_arr[i] + rank 와 같음
			
		}//end of for
		for (int i=0; i<result_arr.length; i++) {
			System.out.println(result_arr[i]);
		}
		System.out.println("----------------------------------------------------");
		int[] arr_subject_total = new int[jumsu_arr[0].length]; // new int [3] 와 같다 
		for(int i = 0; i<arr_subject_total.length; i++) {
			for(int j= 0; j<jumsu_arr.length; j++) {
				arr_subject_total[i] += jumsu_arr[j][i];
		}
		}//end of for
		/*   
        arr_subject_total[0] += jumsu_arr[0][0];
                             += jumsu_arr[1][0];
                             += jumsu_arr[2][0];
                             += jumsu_arr[3][0];
                             += jumsu_arr[4][0];
                                
                                
        arr_subject_total[1] += jumsu_arr[0][1];
                             += jumsu_arr[1][1];
                             += jumsu_arr[2][1];
                             += jumsu_arr[3][1];
                             += jumsu_arr[4][1];
                                
                                
        arr_subject_total[2] += jumsu_arr[0][2];
                             += jumsu_arr[1][2];
                             += jumsu_arr[2][2];
                             += jumsu_arr[3][2];
                             += jumsu_arr[4][2];                                 
     */
		
		// 각 과목별 총점을 저장시켜두는 곳이다 
		
		String str_subject_total = "",str_subject_avg = "";
		for (int i = 0; i<arr_subject_total.length; i++ ) {
		str_subject_total += arr_subject_total[i] +"\t";
		str_subject_total += Math.round((double)arr_subject_total[i]/jumsu_arr.length*10)/10.0+"\t";
		}
		
		System.out.println(str_subject_total + "\n"  + str_subject_avg);
		
	}//end of main

}
