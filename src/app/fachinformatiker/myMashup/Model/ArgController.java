package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Utility.Debug;

public class ArgController {

    static int producerCount;
    static int consumerCount;
    static int syncCount;

    public static boolean istAusgewertet = false;

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
