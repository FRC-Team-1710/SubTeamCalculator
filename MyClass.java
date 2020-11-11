import java.util.Scanner; //imports scanner class

public class MyClass {
	public static void main(String args[]) {
	   
	}
	   public static int pot(){
	     Scanner potScanner = new Scanner(System.in);
	     System.out.println("How many people are on the team?");
	     //"pot" means people on team
	     int pot = potScanner.nextInt();
	     return pot;
	    }
	

}