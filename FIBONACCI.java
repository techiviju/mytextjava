		//// 	FIBONACCI ////
		import java.util.Scanner;
		public class Main
		{
		   
		    
			public static void main(String[] args) {
		    int term,a=0,b=1,c;
		    System.out.println("Enter term");
		    Scanner sc=new Scanner(System.in);
		    term=sc.nextInt();
		    for(int i=1;i<=term;i++){
			System.out.println(a+"  ");
			c=a+b;
			a=b;
			b=c;
		    }
		    	 
		}
		}




			      USING RECURSION 

		public class Main
		{
		    static int fib(int n){
			// if(n==0 || n==1){
			//     return n;
			// }
			    // OR
			
			if (n==1 || n==2){
			    return 1;
			}
			else{
			    return fib(n-1) + fib(n-2);
			}
		    }
			public static void main(String[] args) {
				System.out.println(fib(7));
			}
		}


				ALL FIBO SERIES


		public class Main
		{
		    static int fib(int n){
			if(n==0 || n==1){
			    return n;
			}
			    // OR
			
			// if (n==1 || n==2){
			//     return 1;
			// }
			else{
			    return fib(n-1) + fib(n-2);
			}
		    }
			public static void main(String[] args) {
			int n=5;
			for(int i=0;i<=n;i++){
			    System.out.print(fib(i)+",");
			}
			}
		}





