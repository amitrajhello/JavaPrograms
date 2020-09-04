package demo1;
import java.util.Scanner;

class VariableNameConcept {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int a = s.nextInt();
		
		System.out.println("enter second number: ");
		int b = s.nextInt();
		
		System.out.println("Sum: " + (a + b));	
		
		s.close();
		
	}

}

