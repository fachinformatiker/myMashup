package app.fachinformatiker.myMashup.model;

public class loadValues {

    private int producer;
    private int consumer;
    private int sync;

    public loadValues(int producer, int consumer, int sync){
        this.producer = producer;
        this.consumer = consumer;
        this.sync = sync;

        //System.out.println(producer + " " + consumer + " " + sync);
    }

}
