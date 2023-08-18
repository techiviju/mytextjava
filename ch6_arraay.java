					
						/// For practise//

	import java.util.Scanner;
	public class Main
	{
		public static void main(String[] args) {

	// 	int marks[]={78,30,50,55};
	//  	for (int i=0;i<marks.length;i++){
	//  	System.out.println(marks[i+1]);;
	//  	}
	//     for(int i=marks.length -1;i>=0;i--)
	//     {
	//         	System.out.println(marks[i]);;
	//     }

	Scanner sc=new Scanner(System.in);
	int []marks=new int[5];
	System.out.println("enter number");
	for(int i=0;i<marks.length;i++)
	{
	    marks[i]=sc.nextInt();
	    
	}
	for(int j=0;j<marks.length;j++)
	{
	    System.out.println(marks[j]);
	}
		    
		}
	}


						/* 2D ARRAY */


	import java.util.Scanner;
	public class Main
	{
		public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[][]=new int [2][3];
	    for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
	       a[i][j]=sc.nextInt();
		}
	    }
	    System.out.println("  ");
		for(int i=0;i<2;i++){
	    for(int j=0;j<3;j++){
		System.out.println(a[i][j]);
		System.out.println("RUN TIME ****" +i +j);
	    }
	}

		    
		}
	}



					/*  3D ARRAY */

	import java.util.Scanner;
	public class Main
	{
		public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[][][]=new int [1][1][2];
	    for(int i=0;i<1;i++){
		for(int j=0;j<1;j++){
		
		for(int k=0;k<2;k++){
		     a[i][j][k]=sc.nextInt();
		}
		}
	    }
	    System.out.println("  ");
		for(int i=0;i<1;i++){
	    for(int j=0;j<1;j++){
	       
	       for(int k=0;k<2;k++){
		    System.out.println(a[i][j][k]);
		System.out.println("RUN TIME ****" +i +j +k);
	       }
		
		
	    }
	}

		    
		}
	}

