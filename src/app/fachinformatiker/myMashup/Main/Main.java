package app.fachinformatiker.myMashup.Main;

import app.fachinformatiker.myMashup.Model.ArgController;
import app.fachinformatiker.myMashup.Model.Candy;
import app.fachinformatiker.myMashup.Model.Consumer;
import app.fachinformatiker.myMashup.Model.Producer;
import app.fachinformatiker.myMashup.Model.Terminator;
import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.ArrayList;
import java.util.Stack;

import static app.fachinformatiker.myMashup.Constants.Constants.NONNUMERIC_ARGUMETS;

public class Main {

    private static final Stack<Candy> candyStack = new Stack<>();
    private static final ArrayList<Producer> producerList = new ArrayList<>();
    private static final ArrayList<Consumer> consumerList = new ArrayList<>();
    private static final Terminator terminator = new Terminator();


    public static void main(String[] args) {

        int[] intArgs = new int[args.length];
        for (int i : intArgs) {
            try {
                intArgs[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.err.println(NONNUMERIC_ARGUMETS + args[i]);
            }
        }

        int producerArg = Integer.parseInt(args[0]);
        int consumerArg = Integer.parseInt(args[1]);
        int syncArg = Integer.parseInt(args[2]);

        Debug.setDebug(true);
        werteArgumenteAus(producerArg, consumerArg, syncArg);
        starteAbbruchThread();
        initializeProducers();;
        initializeConsumers();
        startProducers();
        startConsumer();

    }

    private static void werteArgumenteAus(int producerArg, int consumerArg, int syncArg ) {
        ArgController.leseArgumenteAus(producerArg, consumerArg, syncArg);
    }

    private static void startProducers() {
        for (int i = 0; i < producerList.size(); i++) {
            System.out.println("I would start producer Nr. " + i + " now.");
//            producerList.get(i).start();
        }
    }

    private static void startConsumer() {
        for (int i = 0; i < consumerList.size(); i++) {
            System.out.println("I would start consumer Nr. " + i + " now.");
//            consumerList.get(i).start();
        }
    }

    private static void initializeProducers() {
        if (ArgController.istAusgewertet) {
            Debug.gebeInfoAus("Producer istAusgewertet");
            return;
        }
        for (int i = 0; i < ArgController.getAnzahlProduzenten(); i++) {
            System.out.println("Producer Nr. " + i + " addad to candyStack");
            producerList.add(new Producer(candyStack, i));
        }
    }

    private static void initializeConsumers() {
        if (ArgController.istAusgewertet) {
            Debug.gebeInfoAus("Consumer istAusgewertet");
            return;
        }
        for (int i = 0; i < ArgController.getAnzahlConsumenten(); i++) {
            System.out.println("Consumer Nr. " + i + " addad to candyStack");
            consumerList.add(new Consumer(candyStack, i));
        }
    }

    private static void starteAbbruchThread()
    {
        terminator.start();
    }

}
