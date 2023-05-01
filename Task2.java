//Kanchakoduru akash//
package akashpedia;
import java.util.*;
public class Numguess {
	public static void main(String [] args) {
	Scanner s1=new Scanner(System.in);
	int Tattemt=5;
	int attempts=0;
	int userinput=0;
	int matscore=1000;
	int unmatscore=200;
	int attemptded=100;
	int score=0;
	int  rannum=(int)(Math.random()*99+1);
	System.out.println("Welcome to NUMBER GUESSING GAME\nGuess the correct number and win \n "
			+ "You have 5 attempts");
	boolean flag=true;
	
while(flag) {	
  while(true) {
		System.out.print("Enter a number between 1 and 100:");
		int a=s1.nextInt();
		score-=attemptded;
		if(a==rannum) {
			score=+matscore;
			System.out.println("Yayy!!! you won the game \n your score is"+score);
			break;
		}
		else if(a<rannum) {
			score+=unmatscore;
			System.out.println("The number you guessed is smaller!!");
		}
		else if(a>rannum){
			score+=unmatscore;
			System.out.println("The number you guessed is greater!!");
		}
		else {
			System.out.println("please enter valid number");
		}
		attempts++;
		if(attempts==Tattemt) {
			System.out.println("Sorry number of attempts exceeded!!");
			System.out.println("The number is"+rannum);
			System.out.println("Your score is"+score);
			break;
		}
		
	}
  System.out.println("Press 0 if you want to play again:");
  int b=s1.nextInt();
  if(b==0) {
	  flag=true;
  }
  else {
	  flag=false;
  }
}
  System.out.println("Thank you See You Again!!");
  
	}
}
