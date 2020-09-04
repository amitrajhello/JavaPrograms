package demo1;
import java.util.*;
public class challenge3HackerRank {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       // for(n=1; n<100; n++){
        
            if(n%2==1){
                System.out.println("Weird");   
            }
            
            if(n%2==0){
                if((n>=2 & n<=5) || n>20){
                    System.out.println("Not Weird");
                }
                if(n>=6 & n<=20){
                      System.out.println("Weird");
                }
            }
        
        scanner.close();
    }
}
