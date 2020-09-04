package demo1;

public class Tracxn {

	public static void main(String[] args) {
		System.out.println( function1("abcdef", 1) );
		
	}
	
	public static String function1(String str, int flag ) {
		
		String result = "";
		
			if (flag==0) {
				for (int j=0; j<=str.length()-1; j=j+2) {
					result += str.charAt(j);
				}
			}
			else if(flag==1) {
				for (int j=1; j<=str.length()-1; j=j+2) {
					result += str.charAt(j);
				}
			}
			 
		
		return result;
	}

}
