package demo1;

public class AndOperator {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = true;
		boolean c = false;
		boolean d = false;
		
		
		System.out.println(a && b);
		System.out.println(a && c);
		System.out.println(b && c);
		System.out.println(d && c);
		
		System.out.println("");
		System.out.println(a || b);
		System.out.println(a || c);
		System.out.println(b || c);
		System.out.println(c || d);
		
		System.out.println("");
		System.out.println(!a); 
		System.out.println(!b);
		System.out.println(!c);
		System.out.println(!d); 
		
		
		
	}

}
