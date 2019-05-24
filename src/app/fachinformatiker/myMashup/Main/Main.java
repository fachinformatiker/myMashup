package app.fachinformatiker.myMashup.Main;

import app.fachinformatiker.myMashup.Control.CandyController;
import app.fachinformatiker.myMashup.Model.Candy;
import app.fachinformatiker.myMashup.Model.CandyModel;
import app.fachinformatiker.myMashup.View.CandyView;

import static app.fachinformatiker.myMashup.Constants.Constants.*;

public class Main {

    public static void main(String[] args) {

        int[] intArgs = new int[args.length];
        for (int i : intArgs) {
            try {
                intArgs[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.err.println(NONNUMERIC_ARGUMETS + args[i]);
            }
        }

        Candy candy = new Candy();
        CandyModel model = new CandyModel();
        CandyView view = new CandyView();
        CandyController controller = new CandyController(model, view, candy);

        controller.setProducerAmount(Integer.parseInt(args[0]));
        controller.setConsumerAmount(Integer.parseInt(args[1]));
        controller.setSyncValue(Integer.parseInt(args[2]));

        while (!model.finished) {
            controller.updateView();
        }


    }

}
