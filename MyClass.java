import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
     userInputLeadersInFinalCount();
     userInputLeadersInOGCount();
     }
    public static String userInputLeadersInFinalCount(){ //Returns whether leaders will be included in final count; Made by Andrew Kepych
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
    
    public static String userInputLeadersInOGCount(){ //Returns whether leaders were included in original count; Made by Andrew Kepych
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