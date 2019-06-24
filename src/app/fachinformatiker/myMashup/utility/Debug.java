/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.utility;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 *
 */

public class Debug {
    private static boolean isDebug = false;

    private Debug() {

    }

    /**
     *
     * @param text the text we want to get printed as a debug message
     */

    public static void returnInfo(String text) {
        if (isDebug()) {
            System.out.println(text);
        }
    }

    /**
     * getter for debug
     * @return isDebug (true or false)
     */

    private static boolean isDebug() {
        return isDebug;
    }

    /**
     *
     * @param isDebug sets debug to either true or false
     */

    public static void setDebug(boolean isDebug) {
        Debug.isDebug = isDebug;
    }
}