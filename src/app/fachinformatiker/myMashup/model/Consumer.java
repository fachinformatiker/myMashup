/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.model;

import app.fachinformatiker.myMashup.constants.Constants;
import app.fachinformatiker.myMashup.utility.Debug;

import java.util.Stack;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 *
 */

public class Consumer extends Thread {
    private Stack<Candy> candyStack;
    private int consumerID;
    private int sync;
    private boolean isSync;
    private int candyStackSize;

    /**
     * @param cS the CandyStack we are using
     * @param consumerID the ID of the current consumer
     * @param sync the amount of candies that have to be on the stack
     */

    public Consumer(Stack<Candy> cS, int consumerID, int sync) {
        candyStack = cS;
        this.consumerID = consumerID;
        this.sync = sync;
        Debug.returnInfo("I'm" + Constants.CONSUMER + this.consumerID + " and I use the stack " + candyStack + "but beware of the " + Constants.SYNC + this.sync + "!");
    }

    /**
     *
     * @return isSync true if stack size is less than sync, otherwise false
     */

    private boolean candyStackEqualsSync() {
        candyStackSize = candyStack.size();
        if (candyStackSize < this.sync) {
            return isSync;
        } else {
            return !isSync;
        }
    }

    /**
     * consumer thread
     * will consume candies to the stack for an infinite amount of time
     * we will see debug messages it we run it with:
     * Debug.setDebug(true);
     *
     */

    public synchronized void run() {
        while (!candyStack.empty() || !candyStackEqualsSync()) {
            Debug.returnInfo("I'm alive! - C");
            Candy value;
            value = candyStack.pop();
            System.out.println(Constants.CONSUMER + this.consumerID + " got new candy!" + "\n" +
                    Constants.PRODUCER + value.getProducerID() + "\n" +
                    Constants.HOPE + value.getHope() + "\n" +
                    Constants.HELL + value.getHell() + "\n");

            notify();
        }
    }
}