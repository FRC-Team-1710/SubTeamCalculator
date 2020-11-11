public class MyClass {
    static String initialLeaderString, finalLeaderString; //declare static strings

    public static void main(String args[]) {
        outro(true, true, array); //Parameters need to be updated from different methods
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
