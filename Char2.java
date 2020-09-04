package demo1;
import java.util.*;
public class Char2 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	    String s=scn.next();
	    char[] c= s.toCharArray();
	    
	    int i=0;
	    while(i<c.length) {
	    	System.out.print(c[i]);
	    	i=i+2;
	    }
	    
	    System.out.print(" ");
	    
	    int j=0;
	    while(j<c.length) {
	    	System.out.print(c[j+1]);
	    	j=j+2;
	    }
	   scn.close(); 
	}
}