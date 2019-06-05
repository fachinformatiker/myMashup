package app.fachinformatiker.myMashup.Constants;

public interface Constants {
    String NO_ARGUMETS = "You passed no arguments or less than three! Please try again!";
    String NONNUMERIC_ARGUMETS = "Failed trying to parse a non-numeric argument: ";
    String INVALID_ARGUMENTS = "You passed invalid arguments!";
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
