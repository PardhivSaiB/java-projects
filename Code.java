import java.util.*;
public class Code {

	public static void numberguessinggame(){
		Scanner sc= new Scanner(System.in);
System.out.println("This is a Number guessing game,you have to guess the number choosen by computer.");
 int number = 1 + (int)(100 * Math.random());
 System.out.println("choose the no.of attempts");
  int attempts = sc.nextInt();

  System.out.println("you now have "+attempts+"attempts  to uess the right answer.");
  System.out.println("a number between 1 to 100 is choosen by the computer.");

  for(int i=1; i<=attempts;i++){
  System.out.println("enter your guess");
  int guess = sc.nextInt();

  if( guess == number){
	System.out.println("Congratulations! You have won the Game.");
	sc.close();
	return;
  }
  else if (guess < number) {
	System.out.println("your number is lower than the number choosen by the computer,Raise your guess number and also standards.");
	
  }
  else if(guess > number){
	System.out.println("your number is higher than the number choosen by the computer, lower your number and get on to the ground Dude");
  }
}
System.out.println("All your attempts are Exhausted, Better luck next time!");
System.out.println("the correct number was: "+number);

sc.close();

 

	}
	public static void main(String[] args) {
		numberguessinggame();
	}

	}
