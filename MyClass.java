public class MyClass {
    public static void main(String args[]) {
        outro();
    }
    
    public static void outro(boolean finalLeaders, boolean initialLeaders, int [] array) {
        if(initialLeaders) {
            String initialLeaderString = "Including leaders in the original count";
        } else {
            String initialLeaderString = "Excluding leaders in the original count";
        }

        if(finalLeaders) {
            String finalLeaderString = "including leaders in the final count,";
        } else {
            String finalLeaderString = "excluding leaders in the final count,";
        }

        System.out.println(initialLeaderString + " and \n" + finalLeaderString + " there \n will be " + programmerCount + " programmers, " + builderCount + " builders,\n " + designerCount + " designers, " + 
        marketerCount + " marketers, " + outreacherCount + " outreachers,\n " + initiativerCount + " initiativers, " + mediaerCount + " mediaers, " + graphicerCount + " graphicers,\n and " + financerCount + " financers.");

    }
}
