import java.util.Scanner; //imports scanner class

public class MyClass {
	public static void main(String args[]) {
	   
	}
	   public static int pot(){
	     Scanner potScanner = new Scanner(System.in); //takes user input
	     System.out.println("How many people are on the team in total?"); //prints question
	     int pot = potScanner.nextInt(); //"pot" means people on team
	     return pot; //returns value of "pot"
	    }
}
