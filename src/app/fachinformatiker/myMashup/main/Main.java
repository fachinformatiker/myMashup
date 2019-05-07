package app.fachinformatiker.myMashup.main;

import app.fachinformatiker.myMashup.control.CandyController;
import app.fachinformatiker.myMashup.model.CandyModel;
import app.fachinformatiker.myMashup.view.CandyView;

import java.util.Scanner;

import static app.fachinformatiker.myMashup.constants.Constants.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();



        int[] intArgs = new int[args.length];
        for (int i : intArgs) {
            try {
                intArgs[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.err.println(NONNUMERIC_ARGUMETS + args[i]);
            }
        }

        CandyModel model = new CandyModel();
        CandyView view = new CandyView();
        CandyController controller = new CandyController(model, view);

        controller.setProducerValue(Integer.parseInt(args[0]));
        controller.setConsumerValue(Integer.parseInt(args[1]));
        controller.setSyncValue(Integer.parseInt(args[2]));

        while(!model.finished) {
            controller.updateView();
        }

        if(input.equals("666")){
            model.finished = true;
            System.out.println("Magic number detected!");
        }
    }

}
