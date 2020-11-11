import java.util.Scanner; //imports scanner class

public class MyClass {
  static String initialLeaderString, finalLeaderString; //declare static strings
	public static void main(String args[]) {
	   ProgramIntro();
     outro(true, true, array); //Parameters need to be updated from different methods
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
    public static void outro(boolean finalLeaders, boolean initialLeaders, int [] array) {
        if(initialLeaders) {
            initialLeaderString = "Including leaders in the original count";
        } else {
            initialLeaderString = "Excluding leaders in the original count";
        }

        if(finalLeaders) {
            finalLeaderString = "including leaders in the final count,";
        } else {
            finalLeaderString = "excluding leaders in the final count,";
        }

        System.out.println(initialLeaderString + " and \n" + finalLeaderString + " there will be \n" + array[0] + " programmers, " + array[1] + " builders, " + array[2] + " designers,\n" + 
        array[3] + " marketers, " + array[4] + " outreachers, " + array[5] + " initiaters,\n" + array[6] + " photographers, " + array[7] + " graphical creators, and " + array[8] + " financers.");

    }
}
