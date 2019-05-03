package app.fachinformatiker.myMashup.main;

import app.fachinformatiker.myMashup.control.CandyController;
import app.fachinformatiker.myMashup.model.CandyModel;
import app.fachinformatiker.myMashup.view.CandyView;

public class Main {

    public static void main(String[] args) {

        CandyModel model = new CandyModel();
        CandyView view = new CandyView();
        CandyController controller = new CandyController(model, view);

        controller.setProducerValue(Integer.parseInt(args[0]));
        controller.setConsumerValue(Integer.parseInt(args[1]));
        controller.setSyncValue(Integer.parseInt(args[2]));
        controller.updateView();
    }

}
