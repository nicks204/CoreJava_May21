package test;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		// ------ Data Types in Java -----------
		
		int num1;
		int num2;
		
		num1=50;
		num2=11;
		
		int sum = num1+num2;
		int mul = num1*num2;
		float div = (float) num1/num2;
		
		System.out.println("Addtion: " + sum);
		System.out.println("Multiplication: " + mul);
		System.out.println("Division: " + div);
		
		
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Name of User: ");
		String name = scanner.nextLine();
			
		System.out.println("Hello " + name);
		System.out.println("Length: " + name.length());
		System.out.println("Upper Case: " + name.toUpperCase());*/
		
		//---------------- Arrays --------------
		
		int myarray [] = {2,3,45,6,7};
		
		System.out.println("Third Value in Array: " + myarray[2]);
		
		

	}

}
