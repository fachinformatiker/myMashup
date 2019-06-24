/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.model;

import java.util.Random;

import static app.fachinformatiker.myMashup.constants.Constants.*;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 *
 */

public class Candy {
    private int hell;
    private String hope;
    private int producerID;

    /**
     * @param producerID sets the producerID in this thread to the producerID it gets
     */

    public Candy(int producerID) {
        this.producerID = producerID;
    }

    /**
     * creates a hell object (random number)
     */

    private void createHell() {
        hell = new Random().nextInt(MAX_HELL)- MIN_HELL;
    }

    /**
     * creates a hope object (random string)
     */

    private void createHope() {
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(HOPE_TARGET_STRING_LENGTH);
        for (int i = 0; i < HOPE_TARGET_STRING_LENGTH; i++) {
            int randomLimitedInt = HOPE_LEFT_LIMIT + (int)
                    (random.nextFloat() * (HOPE_RIGHT_LIMIT - HOPE_LEFT_LIMIT + 1));
            buffer.append((char) randomLimitedInt);
        }
        hope = buffer.toString();
    }

    /**
     * returns a hell object
     */

    int getHell() {
        createHell();
        return hell;
    }

    /**
     * returns a hope object
     */

    String getHope() {
        createHope();
        return hope;
    }

    /**
     * returns the current producerID
     */

    int getProducerID() {

        return producerID;
    }
}