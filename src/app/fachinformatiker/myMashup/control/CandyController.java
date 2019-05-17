package app.fachinformatiker.myMashup.control;

import app.fachinformatiker.myMashup.model.Candy;
import app.fachinformatiker.myMashup.model.CandyModel;
import app.fachinformatiker.myMashup.view.CandyView;

public class CandyController {
    private Candy candy = new Candy();
    private CandyModel model = new CandyModel();
    private CandyView view = new CandyView();

    public CandyController(CandyModel model, CandyView view, Candy candy){
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

    public void setHellValue() {
        candy.createHell();
    }

    public int getHellValue() {
        return candy.getHell();
    }

    public void updateView(){
        view.printValues(model.getProducer(), model.getConsumer(), model.getSync());
        view.printRandomValue(candy.getHell());
        view.printRandomValue(candy.getHope());
    }

}
