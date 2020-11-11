
import java.util.Scanner; //imports scanner class

public class MyClass {
	public static void main(String args[]) {
		ProgramIntro();
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
}

