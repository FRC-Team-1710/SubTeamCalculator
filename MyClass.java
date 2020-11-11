import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     ProgramIntro();
     pot();
     userInputLeadersInOGCount();    //can be removed if needed
     userInputLeadersInFinalCount(); //this too
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
  
    public static String userInputLeadersInFinalCount(){ //Returns whether leaders will be included in final count; Made by Andrew
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Are leaders included in the final count? (yes or no)");
        String leaderIncludedFinalCount = myObj.nextLine();
        
        if (leaderIncludedFinalCount.equals("yes")){
            System.out.println("Leaders will be included in final count");
        }
        else if (leaderIncludedFinalCount.equals("no")){
            System.out.println("Leaders will not be included in final count");
        }else{
            System.out.println("Please enter a correct response. (Non-capital yes or no)");
            leaderIncludedFinalCount = myObj.nextLine();
            if (leaderIncludedFinalCount.equals("yes")){
            System.out.println("Leaders will be included in final count");
        }
        else if (leaderIncludedFinalCount.equals("no")){
            System.out.println("Leaders will not be included in final count");
        }else{
            System.out.println("Restart the program");
        }
        }
        
        return leaderIncludedFinalCount;
    }
    
    public static String userInputLeadersInOGCount(){ //Returns whether leaders were included in original count; Made by Andrew
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Were leaders included in the original count? (yes or no)");
        String leaderIncludedOGCount = myObj.nextLine();
        
        if (leaderIncludedOGCount.equals("yes")){
            System.out.println("Leaders were included in original count");
        }
        else if (leaderIncludedOGCount.equals("no")){
            System.out.println("Leaders were not included in original count");
        }else{
            System.out.println("Please enter a correct response. (Non-capital yes or no)");
            leaderIncludedOGCount = myObj.nextLine();
            if (leaderIncludedOGCount.equals("yes")){
            System.out.println("Leaders were included in original count");
        }
        else if (leaderIncludedOGCount.equals("no")){
            System.out.println("Leaders were not included in original count");
        }else{
            System.out.println("Restart the program");
        }
        }
        
        return leaderIncludedOGCount;
    }
}