package PracticeTest;

public class Exceptionhandling {

	public static void main(String[] args) {
		
		
		
		int i = 100;
		
//		i=i/0;
		
		
		try {
			i = i/0;
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
			
//			System.out.println(" Arithmetic Exception occured");
		}
		
		System.out.println(" end line printed");
		

	}

}
