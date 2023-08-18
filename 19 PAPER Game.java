		////********  ROCK , PAPER AND SCISSOR GAME  **********/////////


import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome To the GAME");
		System.out.println("Enter your chose");
		System.out.println("press 1 to chose ROCK \npress 2 to chose PAPER \npress 3 to chose SCISSOR");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		Random random = new Random();
		int ROCK=1,PAPER=2,SCISSOR=3;
    	int randomInt = random.nextInt(3)+1;
		
		System.out.println("computer move\t"+randomInt);
		if(a == randomInt)
		System.out.println
		("***TIE***");
		
		else if(a == 1 && randomInt == 3)
		System.out.println("***YOU WIN***");
		
		else if(a == 2 &&  randomInt == 1)
		System.out.println("***YOU WIN***");
		
		else if(a== 3 && randomInt == 2)
		System.out.println("***YOU WIN***");
		
		else if(a == 1 && randomInt == 2)
		System.out.println("***YOU WON***");
		
		else if(a>3)
		System.out.println("ENTER VALID NUMBER");
	
		else 
		System.out.println("**YOUR LOSS**");
		
	}
}
