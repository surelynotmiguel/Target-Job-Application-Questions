public class Result {

    public static void verifyCharPresenceAndOccurrence(String text) {
        boolean isCharPresent = text.contains("a") || text.contains("A");

        int counter = 0;

        if(isCharPresent) {
            for(int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                    counter++;
                }
            }
        }

        String res = "Character 'a' and/or 'A' is ";
        System.out.println((isCharPresent ? res + "present and occurs " + counter + " times." : res + "not present."));
    }

}
