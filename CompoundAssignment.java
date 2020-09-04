package demo1;

public class CompoundAssignment {

	public static void main(String[] args) {
		
		int a=2,b=3;
		int x = a++ + ++b; // x= 2+4= 6  
		int y = a-- - --b; // a=3, b= 4 , y = 3-3= 0
		int z = --a + b--;  //a=2, b= 3 , z = 1 + 3 = 4
		int l = ++a - b++; //l = 2 - 2, l=0, a=2, b=3
		
		System.out.println(a + "- a value. " + b + " - b value ");
		System.out.println(x + " - x value " + y + " - y value " + z + " - z value " + l+ " - l value");
		
		
	}

}
