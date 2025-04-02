package my.day07.b.object_array;

public class Student {

	// field
	String hakbun;
	String name;
	int    kor;
	int    eng;
	int    math;
	
	// method
	String getInfo() {
		
		int total = kor+eng+math;
		double avg = Math.round((double)total/3 * 10)/10.0;
		char grade = ' ';
		
        switch( (int)avg/10 ) {
        	case 10:
        	case  9:
        		grade = 'A';
        		break;
        		
        	case  8:
        		grade = 'B';
        		break;
        		
        	case  7:
        		grade = 'C';
        		break;	
        		
        	case  6:
        		grade = 'D';
        		break;
        		
        	default:
        		grade = 'F';
        		break;
        }// end of switch( (int)avg/10 )---------------------
		
		return hakbun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+grade+"\t";  
	}
	
	// 총점을 알려주는 메소드
	int getToal() {
		return kor+eng+math;
	}
	
}





