/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.Constants;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 *
 */

public interface Constants {
    String NO_ARGUMETS = "You passed no arguments or less than three! Please try again!";
    String NONNUMERIC_ARGUMETS = "Failed trying to parse a non-numeric argument: ";
    String PRODUCER = "Producer: ";
    String CONSUMER = "Consumer: ";
    String SYNC = "Sync: ";
    String HELL = "Hell: ";
    String HOPE = "Hope: ";
    String MagicNumberDetected = "I've detected the Magic Number so I'm terminating myself!";

    int MagicNumber = 666;
    int MIN_HELL = 9999;
    int MAX_HELL = 19998;

    int HOPE_LEFT_LIMIT = 58;
    int HOPE_RIGHT_LIMIT = 126;
    int HOPE_TARGET_STRING_LENGTH = 20;
}
