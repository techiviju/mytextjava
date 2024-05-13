/// write a java program to increapt a grade by adding 8 to it . decrept to show the correct grade/// 

public class Main
{
	public static void main(String[] args) {
	  char g,e,d;
        Scanner sc=new Scanner(System.in);
        g=sc.next().charAt(0);
        
        e=(char)(g+8);
        System.out.println("Encrypted = "+e);
        
        d=(char)(e-8);
        System.out.println("decrypted is = "+d);
	    
	
	}
}
