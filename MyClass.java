  import java.util.*;
  public class MyClass {
      static String initialLeaderString, finalLeaderString; //declare static strings
      public static void main(String args[]) {
       ProgramIntro();
       outro(userInputLeadersInFinalCount(), userInputLeadersInOGCount(), calculation(pot(), userInputLeadersInFinalCount(), userInputLeadersInOGCount()));
      }
    
	// Subteam keys
	static final int BUILD = 0;
	static final int DESIGN = 1;
	static final int FINANCE = 2;
	static final int GRAPHICS = 3;
	static final int MARKETING = 4;
	static final int MEDIA = 5;
	static final int OUTREACH = 6;
	static final int PROGRAMMING = 7;
	static final int INITIATIVES = 8;
	// Used for simple access to array returned by calculation
    
      public static void ProgramIntro() {
          System.out.println("This program will calculate subteam sizes based on predetermined \nsubteam ratios that the user will input!");
          System.out.println("The questions are as follows:");
          System.out.println("How many people are on the team in total?");
          System.out.println("Are leaders included in the total count?");
          System.out.println("Are leaders included in the original number of people on the team?");
      }

      public static int pot() {
          Scanner potScanner = new Scanner(System.in); //takes user input
          System.out.println("How many people are on the team in total?"); //prints question
          int pot = potScanner.nextInt(); //"pot" means people on team
          if (pot < 0) {
              pot = 0; //this makes it so that if someone were to put a negative number, then "pot" is set to 0
          }
          return pot; //returns value of "pot"
      }

    public static int[] calculation(int total, boolean fcLead, boolean ogLead) {
		// Gaven
		/*
		* Takes in the total size of the team and returns the size of each individual
		* subteam in an array
		*/

		if(ogLead == true){
			// Remove leaders from the totals to streamline process
			total -= 11;
		}

		if(total < 0){
			//In the event of a number too low for realistic results
			System.out.println("Error: not enough members;  please try again");
			System.exit(1);
		}

		// Calculate numbers for each subteam
		int buildNum = (int)(40 * 0.3);
		int designNum = (int)(total * 0.125);
		int financeNum = (int)(total * 0.1);
		int graphicsNum = (int)(total * 0.1);
		int marketingNum = (int)(total * 0.075);
		int mediaNum = (int)(total * 0.075);
		int outreachNum = (int)(total * 0.05);
		int programmingNum = (int)(total * 0.125);
		int initiativesNum = (int)(total * 0.05);

		if(fcLead == true){
			// Add subteam leaders to final counts
			buildNum += 2;
			designNum += 1;
			financeNum += 1;
			graphicsNum += 1;
			marketingNum += 1;
			mediaNum += 1;
			outreachNum += 1;
			programmingNum += 1;
			initiativesNum += 1;
		}
		// Create and return an array
		int[] numbers = {buildNum, designNum, financeNum, graphicsNum, marketingNum, mediaNum, outreachNum, programmingNum, initiativesNum};
		return numbers;
	}
    
      public static boolean userInputLeadersInFinalCount() { //Returns whether leaders will be included in final count; Made by Andrew
          boolean leadersIncludedFinalCount = false;
          Scanner myObj = new Scanner(System.in);

          System.out.println("Are leaders included in the final count? (yes or no)");
          String leaderIncludedFinalCount = myObj.nextLine();

          if (leaderIncludedFinalCount.equals("yes")) {
              //System.out.println("Leaders will be included in final count");
              leadersIncludedFinalCount = true;
          } else if (leaderIncludedFinalCount.equals("no")) {
              //System.out.println("Leaders will not be included in final count");
              leadersIncludedFinalCount = false;
          } else {
              System.out.println("Please enter a correct response. (Non-capital yes or no)");
              leaderIncludedFinalCount = myObj.nextLine();
              if (leaderIncludedFinalCount.equals("yes")) {
                  //System.out.println("Leaders will be included in final count");
                  leadersIncludedFinalCount = true;
              } else if (leaderIncludedFinalCount.equals("no")) {
                  //System.out.println("Leaders will not be included in final count");
                  leadersIncludedFinalCount = false;
              } else {
                  System.out.println("Restart the program");
              }
          }
          return leadersIncludedFinalCount;
      }

      public static boolean userInputLeadersInOGCount() { //Returns whether leaders were included in original count; Made by Andrew
          boolean leadersIncludedOGCount = true;
          Scanner myObj = new Scanner(System.in);

          System.out.println("Were leaders included in the original count? (yes or no)");
          String leaderIncludedOGCount = myObj.nextLine();

          if (leaderIncludedOGCount.equals("yes")) {
              //System.out.println("Leaders were included in original count");
              leadersIncludedOGCount = true;
          } else if (leaderIncludedOGCount.equals("no")) {
              //System.out.println("Leaders were not included in original count");
              leadersIncludedOGCount = false;
          } else {
              System.out.println("Please enter a correct response. (Non-capital yes or no)");
              leaderIncludedOGCount = myObj.nextLine();
              if (leaderIncludedOGCount.equals("yes")) {
                  //System.out.println("Leaders were included in original count");
                  leadersIncludedOGCount = true;
              } else if (leaderIncludedOGCount.equals("no")) {
                  //System.out.println("Leaders were not included in original count");
                  leadersIncludedOGCount = false;
              } else {
                  System.out.println("Restart the program");
              }
          }

          return leadersIncludedOGCount;
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