package app.fachinformatiker.myMashup.Model;

public class CandyModel {
    public boolean finished = false;
    private int producer;
    private int consumer;
    private int sync;

    public int getProducer() {
        return producer;
    }

    public void setProducer(int producer){
        this.producer = producer;
    }

    public int getConsumer() {
        return consumer;
    }

    public void setConsumer(int consumer) {
        this.consumer = consumer;
    }

    public int getSync() {
        return sync;
    }

    public void setSync(int sync) {
        this.sync = sync;
    }
}