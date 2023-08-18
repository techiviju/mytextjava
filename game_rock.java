import java.util.Random;
import java.util.Scanner;
public class game_rock{
public static void mian(String [] args){

System.out.println("enter 0 for Rock 1 for Paper and 2 for Scissor");
Scanner sc=new Scanner(System.in);
int userIput=sc.nextInt();
//int Random;
Random random = random.nextInt();
int computerinput=random.nextInt(3);

if(userinput==computerinput){
System.out.println("DRAW");
}

else if(userinput>4){
System.out.println("choose valid item");
}

else if(userinput=0 && computerinput =2 || userinput =1 && computerinput = 0 || userinput =2 && computerinpute =1){
Syste.out.println("YOU WON");
}

else {
Syste.out.println("Computer Won");
}
}
}