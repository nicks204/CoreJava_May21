package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10; 
		int b =  0;
		
		try {
			
			int result = a/b;
			
			
		}catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception Handled");
			System.out.println("Hello");
			
		}catch(Exception e){
			
			System.out.println("Exception Handled");
			
			
		} finally {
			
			System.out.println("Try Catch executed sucessfuly");
		}
		
//		System.out.println("After error");
//		System.out.println("Hello");
		
		int myarray [] = {2,3,45,6,7};
		
		try {
			
			System.out.println("Third Value in Array: " + myarray[6]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("AOB Exception Handled");
		}
		
	}
	

	
	


}
