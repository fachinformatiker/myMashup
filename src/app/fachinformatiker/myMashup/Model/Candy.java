package app.fachinformatiker.myMashup.Model;

import java.util.Random;

import static app.fachinformatiker.myMashup.Constants.Constants.*;

public class Candy {
    private int hell;
    private String hope;
    private int producerID;

    public void createHell() {
        hell = new Random().nextInt(MAX_HELL)- MIN_HELL;
    }

    public void createHope() {
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(HOPE_TARGET_STRING_LENGTH);
        for (int i = 0; i < HOPE_TARGET_STRING_LENGTH; i++) {
            int randomLimitedInt = HOPE_LEFT_LIMIT + (int)
                    (random.nextFloat() * (HOPE_RIGHT_LIMIT - HOPE_LEFT_LIMIT + 1));
            buffer.append((char) randomLimitedInt);
        }
        hope = buffer.toString();
    }

    public int getHell() {
        createHell();
        return hell;
    }

    public String getHope() {
        createHope();
        return hope;
    }

    public String getCandy() {
        return getHell() + ";" + getHope();
    }
}