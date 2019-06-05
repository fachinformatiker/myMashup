/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Utility.Debug;

public class ArgController {

    private static int producerCount;
    private static int consumerCount;
    private static int syncCount;

    public static void parseArguments(int producerArg, int consumerArg, int syncArg) {
        producerCount = producerArg;
        consumerCount = consumerArg;
        syncCount = syncArg;
        Debug.returnInfo("producerArg: " + producerArg + ", consumerArg: " + consumerArg + "syncArg: " + syncArg);
    }

    public static int getProducerCount() {
        return producerCount;
    }

    public static int getConsumerCount() {
        return consumerCount;
    }

}
