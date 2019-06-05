package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Utility.Debug;

public class ArgController {

    private static int producerCount;
    private static int consumerCount;
    private static int syncCount;

    public static void leseArgumenteAus(int producerArg, int consumerArg, int syncArg) {
        producerCount = producerArg;
        consumerCount = consumerArg;
        syncCount = syncArg;
        Debug.gebeInfoAus("producerArg: " + producerArg + ", consumerArg: " + consumerArg + "syncArg: " + syncArg);
    }

    public static int getAnzahlProduzenten() {
        return producerCount;
    }

    public static int getAnzahlConsumenten() {
        return consumerCount;
    }

}
