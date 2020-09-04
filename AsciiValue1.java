package demo1;

public class AsciiValue1 {

	public static void main(String[] args) {
		
		
		int b = 3 ;
		
		int a = 5;
		
		System.out.println( ++a  +  2 * b  +  a++);//18
							//6 + 6 + 6 =18
		//a=7 b = 3
		System.out.println(++a  +  b++); //11
							// 8 + 3 = 11
		//a = 8, b=4
		System.out.println(++b  *  2); //10
		
		
		 //pre increment(++variable)    and       post increment  (variable++)
		// pre decrement(--variable)   and    post decrement   (variable--)  
		
		
		//System.out.println( a + b + " = total value" ); 
		

		//System.out.println( a + b + " total value " + a + b  ); 
		
		/*System.out.println('a' + b + " total value " + a + b + a);
		
		System.out.println( "Greater > " + (a>b) );
		System.out.println("Lesser < " + (a<b) );
		System.out.println("Equal == " + (a==b));
		System.out.println("Not Equal " + (a!=b));
		System.out.println("Equal == " + (num == b));
		
		*/
		
		
		
	}

}
