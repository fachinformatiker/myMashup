package app.fachinformatiker.myMashup.Control;

import app.fachinformatiker.myMashup.Model.CandyModel;
import app.fachinformatiker.myMashup.View.CandyView;

public class CandyController {
    private CandyModel model = new CandyModel();
    private CandyView view = new CandyView();

    public CandyController(CandyModel model, CandyView view){
        this.model = model;
        this.view = view;
    }

    public void setProducerAmount(int producer){
        model.setProducer(producer);
    }

    public int getProducerValue() {
        return model.getProducer();
    }

    public void setConsumerAmount(int consumer){
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
