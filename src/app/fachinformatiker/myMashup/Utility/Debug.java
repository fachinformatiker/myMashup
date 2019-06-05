package app.fachinformatiker.myMashup.Utility;


public class Debug {
    private static boolean isDebug = false;

    private Debug() {

    }

    public static void gebeInfoAus(String text) {
        if (isDebug()) {
            System.out.println(text);
        }
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static void setDebug(boolean isDebug) {
        Debug.isDebug = isDebug;
    }
}