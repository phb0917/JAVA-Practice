package my.day16.d.lambda;

import java.awt.geom.Area;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class Main_2
{
	public static void main(String[] args)
	{
		System.out.println("=== 람다식(Lambda)을 사용하지 않은 것[무명(익명)클래스를 사용한 것]\n");
		
		Functional_Area_1 area_obj = new Functional_Area_1()
		{
			@Override
			public void area(double x, double y, int type)
			{
				switch (type)
				{
					case 1:
						System.out.println("가로 "+x+", 세로 "+y+"인 사각형 면적은 : "+(x*y));
						break;
					case 2:
						System.out.println("밑변 "+x+", 높이 "+y+"인 삼각형 면적은 : "+(x*y*0.5));
						break;
					case 3:
						System.out.println("장축의 반지름 "+x+", 단축의 반지름 "+y+"인 타원형 면적은 : "+(3.141592*x*y));
						break;
					default:
						System.out.println("세 번째 파라미터는 1, 2, 3 중에서만 가능합니다.");
						break;
				}	//	end of switch(type)-----------------------------------
			}
		};	//	end of Functional_Area_1 area_object = new Functional_Area_1()
		
		area_obj.area(10.5, 5.5, 1);
		//	가로 10.5, 세로 5.5인 사각형 면적은 : 57.75
		area_obj.area(10.5, 5.5, 2);
		//	밑변 10.5, 높이 5.5인 삼각형 면적은 : 28.875
		area_obj.area(10.5, 5.5, 3);
		//	장축의 반지름 10.5, 단축의 반지름 5.5인 타원형 면적은 : 181.426938
		area_obj.area(10.5, 5.5, 4);
		//	세 번째 파라미터는 1, 2, 3 중에서만 가능합니다.
		
		
		System.out.println("\n=== 람다(Lambda) 식을 사용한 것 ===\n");
	/*	람다(Lambda) 함수는 프로그래밍 언어에서 사용되는 개념으로 익명 함수(Anonymous functions)를 지칭하는 용어이다.
		현재 사용되고 있는 람다의 근간은 수학과 기초 컴퓨터과학 분야에서의 람다 대수이다. 
		람다 대수는 간단히 말하자면 수학에서 사용하는 함수를 보다 단순하게 표현하는 방법이다. 

		람다 대수는 이름을 가질 필요가 없다. 즉, 익명 함수 (Anonymous functions)이다.
		람다식(Lambda)은 익명함수(anonymous function)을 생성하기 위한 식으로서 객체 지향 언어보다 함수 지향 언어에 가깝다.
        
		자바에서 람다식의 사용 목적은 인터페이스에 정의된 메소드를 구현시 코딩양을 확 줄여서 간편하게 사용하는 것이 목적이다.  
        
		자바에서는 함수 단독으로는 사용할 수 없고 객체를 통해서만 사용이 가능한 형태이므로 
		자바에서 람다를 실행하려면 전제조건으로 먼저 FunctionalInterface(함수형 인터페이스)를 구현한 익명(무명)클래스 객체가 생성되어져 있어야만 한다. 
		람다는 FunctionalInterface(함수형 인터페이스)를 구현한 익명(무명)클래스 객체의 메소드로 동작하게 된다.  
		여기서 주의할 점은 FunctionalInterface(함수형 인터페이스)는 오로지 딱 한개만의 추상메소드로 이루어져야 한다는 것이다. 
		만약에 FunctionalInterface(함수형 인터페이스)에 두 개 이상의 메소드가 선언되면 자바 컴파일러는 오류를 발생시킨다.  
		함수형 인터페이스를 만드려면 @FunctionalInterface 어노테이션을 사용하면 된다.
    */	
		Functional_Area_1 lambda_area_obj = (x, y, type)	->
		{
			switch (type)
			{
				case 1:
					System.out.println("가로 "+x+", 세로 "+y+"인 사각형 면적은 : "+(x*y));
					break;
				case 2:
					System.out.println("밑변 "+x+", 높이 "+y+"인 삼각형 면적은 : "+(x*y*0.5));
					break;
				case 3:
					System.out.println("장축의 반지름 "+x+", 단축의 반지름 "+y+"인 타원형 면적은 : "+(3.141592*x*y));
					break;
				default:
					System.out.println("세 번째 파라미터는 1, 2, 3 중에서만 가능합니다.");
					break;
			}	//	end of switch(type)-----------------------------------
		};
		
		lambda_area_obj.area(10.5, 5.5, 1);
		//	가로 10.5, 세로 5.5인 사각형 면적은 : 57.75
		lambda_area_obj.area(10.5, 5.5, 2);
		//	밑변 10.5, 높이 5.5인 삼각형 면적은 : 28.875
		lambda_area_obj.area(10.5, 5.5, 3);
		//	장축의 반지름 10.5, 단축의 반지름 5.5인 타원형 면적은 : 181.426938
		lambda_area_obj.area(10.5, 5.5, 4);
		//	세 번째 파라미터는 1, 2, 3 중에서만 가능합니다.
		
		System.out.println("\n=== 람다식(lambda 표기방법 알아보기 ===\n");
		
		Functional_Operator_3 annonymous_op1 = new Functional_Operator_3() {

			@Override
			public double operator(double a, double b, String type) {
				double result = 0.0;
				switch (type) {
				case "+":
					result = a+b;
					break;
				case "-":
					result = a-b;
					break;
				case "*":
					result = a*b;
					break;
				case "/":
					result = a/b;
					break;
				default:
					System.out.println("세번째 파라미터는 + - * / 만 가능합니다");
					break;
				}//end switch
			return result;
			}
			
		};
		
			double opr_result =	annonymous_op1.operator(20, 10, "+");
			System.out.println(opr_result);
			
			//1. 람다식 표기 기본방법
			
			Functional_Operator_3 annonymous_op2 = (double a, double b, String type) -> {
					 {
					double result = 0.0;
					switch (type) {
					case "+":
						result = a+b;
						break;
					case "-":
						result = a-b;
						break;
					case "*":
						result = a*b;
						break;
					case "/":
						result = a/b;
						break;
					default:
						System.out.println("세번째 파라미터는 + - * / 만 가능합니다");
						break;
					}//end switch
				return result;
				}
				
			};
			
				opr_result =	annonymous_op2.operator(20, 10, "-");
				System.out.println(opr_result);
				
				//2. 파라미터의 타입은 생략할수 있다 
				
				Functional_Operator_3 annonymous_op3 = (a, b, type) -> {
					 {
					double result = 0.0;
					switch (type) {
					case "+":
						result = a+b;
						break;
					case "-":
						result = a-b;
						break;
					case "*":
						result = a*b;
						break;
					case "/":
						result = a/b;
						break;
					default:
						System.out.println("세번째 파라미터는 + - * / 만 가능합니다");
						break;
					}//end switch
				return result;
				}
				
			};
			
				opr_result =	annonymous_op3.operator(20, 10, "*");
				System.out.println(opr_result);
			
				// 3. 실행명령문이 1개 이라면 {};중괄호도 생략할수 있다 
				Functional_search_4 lambda_search1 = ( str ) -> 
					System.out.println("회원들 중 \""+ str +"\" 님을 조회합니다 ");
					
				
				lambda_search1.search("이순신");
				
				//4. 파라미터의 개수가 1개일 때는 피라미터를 감싸는 소괄호() 를 생략할수있다 
				Functional_search_4 lambda_search2 = str -> System.out.println("회원들 중 \""+ str +"\" 님을 조회합니다 ");
				
			
				lambda_search2.search("이순신");
				
				//5. 파라미터의 개수가 2개 이상일떄는 무조건 파라미터를 감싸는 소괄호는 () 는 꼭 기제해야한다 
			/*	Functional_Operator_3 annonymous_op3 = a, b, type -> { // () 가 없음으로 오류가 발생합
					 {
					double result = 0.0;
					switch (type) {
					case "+":
						result = a+b;
						break;
					case "-":
						result = a-b;
						break;
					case "*":
						result = a*b;
						break;
					case "/":
						result = a/b;
						break;
					default:
						System.out.println("세번째 파라미터는 + - * / 만 가능합니다");
						break;
					}//end switch
				return result;
				}
				
			};*/
				
				//6. 파라미터가 없는 람다식은 무조건 ()소괄호를 꼭 기재해야한다 
				Functional_search_5 lambda_search3 = () -> {
					System.out.println("1. 파라미터에 값이 없는것은 ");
					System.out.println("2. 반드시 소괄호()를 꼭 지재해야합니다 ");
					System.out.println(" === 모든 회원 조회결과 ===");
					};
					
					lambda_search3.searchAll();
					
				//7. 실행명령문이 1개 이더라고 return 이 있을 경우에는 반드시 {}; 을 써야한다 생략 불가하다 
					Functional_plus_6  lambda_plus_6 = ( a, b) -> { return a+b;};
					System.out.println(lambda_plus_6.plus(10,20));
					
				//8. return 문만 있는 단일 코드인 경우에는 {}; 및 return 을 생략할수있다 
					Functional_plus_6  lambda_plus_2 = ( a, b) -> a+b;;
					System.out.println(lambda_plus_2.plus(20,30));
					
				//===========================================================================
				// java 14 이후 부터는 switch 문에서 "->" 표기방식인 switch expression 을 사용할수 있게 되었다 
					int point =85;
				String grade = ""; 
					switch (point/10) {
					case 10:
					case 9:
						grade = "A";
						break;
					case 8:
						grade = "B";
						break;
					case 7:
						grade = "C";
						break;

					case 6:
						grade = "D";
						break;

					default:
						System.out.println("공부하셔야죠?");
						grade = "F";
						break;
					};
					System.out.println("점수 : " + grade); // 점수 
					
					String hakjum = switch (point/10) {
					case 10,9 -> "A"; 
						
						case 8 -> "B";
						case 7 -> "C";
						case 6 -> "D";
						
					default -> {  // // default에서 여러 줄을 사용할 경우 블록이 필요한데, 블록 안에서 값을 반환할 때는 return이 아닌 yield를 사용해야 함.
						System.out.println("공부하셔야죠");
						yield "F"; // 꼭 yield
					}
					};
					System.out.println("학점 : " + hakjum);
					
					//switch 자체가 값을 반환하므로 result 변수가 불필요하다 

					Functional_Operator_3 lambda_op3 = (a, b, type) -> {
					
					return switch (type) {
					case "+" -> a+b;
					case "-" -> a-b;
					case "*" -> a*b;
					case "/" -> a/b;
					default -> {
						System.out.println("세번쨰 파라미터는 + - * / 만 가능합니다 ");
						yield 0.0;
					}
					};
				};
				
					opr_result = lambda_op3.operator(10, 20, "-");
					System.out.println(opr_result); // -10
					
					
					Calcuator7 clac = (a,b,op) -> 
					 switch (op) {
						case ADD -> a+b;
						case MINUS -> a-b;
						case MULTIPLY -> a*b;
						case DIVIDE -> {
						if(b==0) {
							System.out.println("0 으로 나눌수 없습니다 ");
							yield 0.0;
						}
						else 
							yield a/b;
						}
					};//end switch 
					System.out.println("10 + 4 =" + clac.calculate(10,4,Operator.ADD)); // 10 + 4 =14.0
					System.out.println("10 - 4 =" + clac.calculate(10,4,Operator.MINUS));// 10 - 4 =6.0
					System.out.println("10 * 4 =" + clac.calculate(10,4,Operator.MULTIPLY));// 10 * 4 =40.0
					System.out.println("10 / 4 =" + clac.calculate(10,4,Operator.DIVIDE));// 10 / 4 =2.5
					System.out.println("10 / 4 =" + clac.calculate(10,0,Operator.DIVIDE));// 0 으로 나눌수 없습니다 
	}	//	end of main(String[] args)----------------------------------------
}
