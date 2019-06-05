/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.Main;

import app.fachinformatiker.myMashup.Model.ArgController;
import app.fachinformatiker.myMashup.Model.Candy;
import app.fachinformatiker.myMashup.Model.Consumer;
import app.fachinformatiker.myMashup.Model.Producer;
import app.fachinformatiker.myMashup.Model.Terminator;
import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.ArrayList;
import java.util.Stack;

import static app.fachinformatiker.myMashup.Constants.Constants.*;



public class Main {

    private static final Stack<Candy> candyStack = new Stack<>();
    private static final ArrayList<Producer> producerList = new ArrayList<>();
    private static final ArrayList<Consumer> consumerList = new ArrayList<>();
    private static final Terminator terminator = new Terminator();

    public static void main(String[] args) {

        int[] intArgs = new int[args.length];
        if (intArgs.length < 1) {
            System.out.println(NO_ARGUMETS);
            System.exit(1);
        } else {
            for (int i : intArgs) {
                try {
                    intArgs[i] = Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    System.err.println(NONNUMERIC_ARGUMETS + args[i]);
                }
            }
        }

        int producerArg = Integer.parseInt(args[0]);
        int consumerArg = Integer.parseInt(args[1]);
        int syncArg = Integer.parseInt(args[2]);

        Debug.setDebug(false);
        parseArguments(producerArg, consumerArg, syncArg);
        startTerminationThread();
        initializeProducers();
        initializeConsumers(syncArg);
        startProducers();
        startConsumer();

    }

    private static void parseArguments(int producerArg, int consumerArg, int syncArg ) {
        ArgController.parseArguments(producerArg, consumerArg, syncArg);
    }

    private static void startProducers() {
        for (int i = 0; i < producerList.size(); i++) {
            producerList.get(i).start();
            Debug.returnInfo("I'm starting producer nr. " + i + " now.");
        }
    }

    private static void startConsumer() {
        for (int i = 0; i < consumerList.size(); i++) {
            consumerList.get(i).start();
            Debug.returnInfo("I'm starting consumer nr. " + i + " now.");
        }
    }

    private static void initializeProducers() {
        for (int i = 0; i < ArgController.getProducerCount(); i++) {
            producerList.add(new Producer(candyStack, i));
            Debug.returnInfo(PRODUCER + i + " added to candyStack");
        }
    }

    private static void initializeConsumers(int syncArg) {
        for (int i = 0; i < ArgController.getConsumerCount(); i++) {
            consumerList.add(new Consumer(candyStack, i, syncArg));
            Debug.returnInfo(CONSUMER + i + " added to candyStack");
        }
    }

    private static void startTerminationThread()
    {
        terminator.start();
    }

}
