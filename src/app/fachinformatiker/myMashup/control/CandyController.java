package app.fachinformatiker.myMashup.control;

import app.fachinformatiker.myMashup.model.CandyModel;
import app.fachinformatiker.myMashup.view.CandyView;

public class CandyController {
    private CandyModel model;
    private CandyView view;

    public CandyController(CandyModel model, CandyView view){
        this.model = model;
        this.view = view;
    }

    public void setProducerValue(int producer){
        model.setProducer(producer);
    }

    public int getProducerValue() {
        return model.getProducer();
    }

    public void setConsumerValue(int consumer){
        model.setConsumer(consumer);
    }

    public int getConsumerValue() {
        return model.getConsumer();
    }

    public void setSyncValue(int sync){
        model.setSync(sync);
    }

    public int getSyncValue() {
        return model.getSync();
    }

    public void updateView(){
        view.printValues(model.getProducer(), model.getConsumer(), model.getSync());
    }

}
