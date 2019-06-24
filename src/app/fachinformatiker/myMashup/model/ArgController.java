/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.model;

import app.fachinformatiker.myMashup.utility.Debug;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 *
 */

public class ArgController {

    private static int producerCount;
    private static int consumerCount;
    private static int syncCount;

    /**
     *
     * @param producerArg the amount of producers (producer threads)
     * @param consumerArg the amount of consumers (consumer threads)
     * @param syncArg the amount of candies there have to be on the stack
     */

    public static void parseArguments(int producerArg, int consumerArg, int syncArg) {
        producerCount = producerArg;
        consumerCount = consumerArg;
        syncCount = syncArg;
        Debug.returnInfo("producerArg: " + producerArg + ", consumerArg: " + consumerArg + "syncArg: " + syncArg);
    }

    /**
     *
     * @return producerCount amount of producers
     */

    public static int getProducerCount() {
        return producerCount;
    }

    /**
     *
     * @return consumerCount amount of consumers
     */

    public static int getConsumerCount() {
        return consumerCount;
    }

}
