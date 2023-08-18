      		////  CH 7  METHOD 

		import java.util.Scanner;

public class Main
{
   static int muNu(int x,int y){
       int z;
       z=x*y;
       return z;
    
   }
	public static void main(String[] args) {
	int a=5;
	int b=10;
	int c;
	c=muNu(a,b);
	System.out.println(c);
	
	}
}


			//// Method Overloading  //

		public class Main
{
   static void over(){
      System.out.println("HELLO VIJAY WELCOME TO THIS OVERLOADING");
   }
	public static void main(String[] args) {
	over();
	}
}

		/// do not changing the integer

public class Main
{
   static int change(int x){
    int a=98;
    return a;
 }
	public static void main(String[] args) {
    int x=45;
    change(x);
    System.out.println(x);
	}
}
			
			// change the array values //

public class Main
{
   static /*int[]*/void change(int []a){
     a[0]=98;
    // return a;
   
 }
	public static void main(String[] args) {
    int []x={75,65,32,52,66};
    change(x);
    System.out.println(x[0]);
	}
}