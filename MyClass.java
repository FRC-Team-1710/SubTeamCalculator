public class MyClass {
    static String initialLeaderString, finalLeaderString; //declare static strings

    public static void main(String args[]) {
        int array[] = { 0,1,2,3,4,5,6,7,8 };
        outro(userInputLeadersInFinalCount(), userInputLeadersInOGCount(), calculation(pot(), userInputLeadersInFinalCount(), userInputLeadersInOGCount())); //Parameters need to be updated from different methods
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