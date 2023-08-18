///*** GUESS THE NU GAME  ****////

import java.util.Random;
import java.util.Scanner;

public class Game
{
	public static void main(String[] args) {
		System.out.println("Welcome To the GAME");
		System.out.println("GUESS the number");
		
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		Random random = new Random();
    	int randomInt = random.nextInt(3)+1;
		
		System.out.println("computer move\t"+randomInt);
		if(a == randomInt)
		System.out.println("CONGRATULATION YOUR WIN");
		
		else 
		System.out.println("**FAIL TRY AGEN**");
		
	}
}

