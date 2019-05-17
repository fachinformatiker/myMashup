package app.fachinformatiker.myMashup.view;

import static app.fachinformatiker.myMashup.constants.Constants.*;

public class CandyView {
    public void printValues(int producer, int consumer, int sync){
        System.out.println(PRODUCER + producer);
        System.out.println(CONSUMER + consumer);
        System.out.println(SYNC + sync);
    }

    public void printRandomValue(String random){
        System.out.println(RANDOM_VALUE + random);
    }

    public void printRandomValue(int random){
        System.out.println(RANDOM_VALUE + random);
    }
}
