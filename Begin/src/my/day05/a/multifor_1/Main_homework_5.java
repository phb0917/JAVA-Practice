package my.day05.a.multifor_1;
/*
== 숙제 1 == 
*
**
***
****
*****
      
      
== 숙제 2 == 
    *
   **
  ***
 ****
***** 


== 숙제 3 == 
*****   
****    
***    
**     
*   

      
== 숙제 4 ==

  *
 ***
***** 

      
== 숙제 5 ==
      
*****
 ***
  *

          
== 숙제 6 ==
   
  *
 ***
*****
 ***   
  *      


== 입사문제 == 
    
*********1
********2
*******3
******4
*****5
****6
***7
**8
*9

*/   
public class Main_homework_5 {

	public static void main(String[] args) {
		
	/*	== 숙제 1 == 
				*
				**
				***
				****
				*****    */
		System.out.println("== 숙제 1 == ");
		//5행 5열 
				for(int i=0; i<5; i++) { //5행
					for(int j=0; j<=i; j++) {
						System.out.print("*");
					}
					System.out.println("\n");
				}
			/*	== 숙제 2 == 
					    *
					   **
					  ***
					 ****
					*****  */
				System.out.println("== 숙제 2 == ");
				//5행 5열 
						for(int i=0; i<5; i++) { //5행
							for(int j=4; j>=0; j-- ) {
								if(j <= i ) {
									System.out.print("*");
								}
								else {
									System.out.print(" ");
								}
							}
							System.out.println("\n");
						}
						
					/*	== 숙제 3 == 
						*****   
						****    
						***    
						**     
						*   */
						System.out.println("== 숙제 3 == ");
						for(int i=4; i>=0; i--) { //5행
							for(int j= 0; j<5; j++ ) {
								if(j <= i ) {
									System.out.print("*");
								}
								else {
									System.out.print(" ");
								}
							}
							System.out.println("\n");
						}

						/*	== 숙제 4 ==
							
							  *
							 ***
							*****  */

						System.out.println("== 숙제 4 == ");
						
						for(int i=5; i>=0; i--) { //5행
							for(int j= 0; j<5; j++ ) {
								if(j==i ) {
									System.out.print("*");
								}
								else {
									System.out.print(" ");
								}
							}
							System.out.println("\n");
						}
						
						
						
	}//end of main

}
