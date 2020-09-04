package demo1;

import java.util.*;

public class Char {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	    String s=scn.next();
	    char[] c= s.toCharArray();
	    
	    for(int i=0;i<c.length;i++) {
	    	
	    	if(i%2==0) {
	    		for(int j=0;j<c.length;j=j+2) {
	    			System.out.print(c[j]);
	    		}
	    		System.out.print(" ");
	    	}
	    	else {
	    		for(int j=1;j<c.length;j=j+2) {
	    			System.out.print(c[j]);
	    		}
	    	}
	    }
	   scn.close();
	}
}
