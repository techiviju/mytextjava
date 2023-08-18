import java.util.Scanner;
public class Star{
public static void main(String[]args){
int  i=0,j;
for(i=0;i<5;i++){
for(j=i;j>=0;j--){
System.out.print("*");
}
System.out.println("");

}

System.out.println("this is a avg program");

float s1=98,s2=96,s3=85;
Scanner sc=new Scanner(System.in);


float avg,total=s1+s2+s3;
avg=total/3;
System.out.println("Average is = "+avg);


//System.out.println("Below program  is ask the user name and print it = \n");

//String name;
//System.out.println("enter the name");
//name=sc.nextLine();
//System.out.println("Hello "+name+" Have a good day \t Thnx");

//System.out.println("*** The program is check Wheathe nu is int or not ***");

//System.out.println(sc.hasNextInt());


			//  *** 7/4*9/2  ***///

int a=7/4*9/2;
System.out.println("the output of expression is = " +a);

System.out.println("\nEncript and decript program");

char grade='c';
grade=(char)(grade+8);
System.out.println(grade+"\n the decript program is = ");
grade=(char)(grade-8);
System.out.println(grade);


}

}
