package app.fachinformatiker.myMashup.main;

//import app.fachinformatiker.myMashup.model.loadValues;

import app.fachinformatiker.myMashup.control.CandyController;
import app.fachinformatiker.myMashup.model.CandyModel;
import app.fachinformatiker.myMashup.view.CandyView;

public class Main {

    //private static loadValues loadValues;

    public static void main(String[] args) {
        //loadValues = new loadValues(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        //System.out.println(loadValues);

        CandyModel model = retrieveValues();

        CandyView view = new CandyView();

        CandyController controller = new CandyController(model, view);

        controller.updateView();

        controller.setProducerValue(10);

        controller.setConsumerValue(5);

        controller.setSyncValue(3);

        controller.updateView();
    }

    private static CandyModel retrieveValues() {
        CandyModel model = new CandyModel();
        model.setProducer(1);
        model.setConsumer(2);
        model.setSync(3);
        return model;
    }

}
