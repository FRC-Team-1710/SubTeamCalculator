import java.util.Scanner; //imports scanner class

public class MyClass {
  static String initialLeaderString, finalLeaderString; //declare static strings
	public static void main(String args[]) {
	   ProgramIntro();
       outro(userInputLeadersInFinalCount(), userInputLeadersInOGCount(), calculation(pot(), userInputLeadersInFinalCount(), userInputLeadersInOGCount()));
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
            finalLeaderString = "including leaders in the final count.";
        } else {
            finalLeaderString = "excluding leaders in the final count.";
        }

        System.out.println(initialLeaderString + " and " + finalLeaderString);
        System.out.println("there will be:");
        System.out.println(array[0] + " builders");
        System.out.println(array[1] + " designers");
        System.out.println(array[2] + " financers");
        System.out.println(array[3] + " graphical creators");
        System.out.println(array[4] + " marketers");
        System.out.println(array[5] + " photographers");
        System.out.println(array[6] + " outreachers");
        System.out.println(array[7] + " programmers");
        System.out.println(array[8] + " initiaters");

    }
}
