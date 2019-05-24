package app.fachinformatiker.myMashup.View;

import static app.fachinformatiker.myMashup.Constants.Constants.*;

public class CandyView {
    public void printValues(int producer, int consumer, int sync){
        System.out.println(PRODUCER + producer);
        System.out.println(CONSUMER + consumer);
        System.out.println(SYNC + sync);
    }

//    public printValues(int producer, String hell, int hope) {
//        return producer;
//        return hell;
//        return hope;
//    }

    public void printRandomValue(String random){
        System.out.println(RANDOM_VALUE_HELL + random);
    }

    public void printRandomValue(int random){
        System.out.println(RANDOM_VALUE_HOPE + random);
    }
}
