/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.Utility;


/**
 * @author Patrick Szalewicz (info@fachinformatiker.app)
 */
public class Debug {
    private static boolean isDebug = false;

    private Debug() {

    }

    public static void returnInfo(String text) {
        if (isDebug()) {
            System.out.println(text);
        }
    }

    private static boolean isDebug() {
        return isDebug;
    }

    public static void setDebug(boolean isDebug) {
        Debug.isDebug = isDebug;
    }
}