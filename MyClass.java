
import java.util.Scanner; //imports scanner class

public class MyClass {
	public static void main(String args[]) {
	   ProgramIntro();
  }

   public static void ProgramIntro(){
	    System.out.println("This program will calculate subteam sizes based on predetermined \nsubteam ratios that the user will input!");
    	System.out.println("The questions are as follows:");
   	  System.out.println("How many people are on the team in total?");
    	System.out.println("Are leaders included in the total count?");
    	System.out.println("Are leaders included in the original number of people on the team?");
    }
	  public static int pot(){
	    Scanner potScanner = new Scanner(System.in); //takes user input
	    System.out.println("How many people are on the team in total?"); //prints question
	    int pot = potScanner.nextInt(); //"pot" means people on team
            if (pot < 0){
	      pot = 0; //this makes it so that if someone were to put a negative number, then "pot" is set to 0
	    }
	    return pot; //returns value of "pot"
	  }
}

