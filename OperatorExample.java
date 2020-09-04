package demo1;

public class OperatorExample {

	public static void main(String[] args) {
		
		int i = 100, a=20;
		System.out.println(i);//100
		
		i = ++i + 30;//101+30=131
		System.out.println(i);
		
		i = i++ + 2*a; //131+40=171
		System.out.println(i);
		
		i += i-- + 2*a;  //i = i + (i-- + 2*a)
		// 171 + (171 +40)= 382
		
		--i; // 381
		System.out.println(i);
		
		i -= 2*a; // i = i - 2*a;  
		
		i = i + 1;
		i += 1;  // i = i+1 ;
		System.out.println(i);
		
		i = i - 200;
		// i -= 200;
		
		
		System.out.println("pallavi is good in Java: " + i);
		
		
	}

}
