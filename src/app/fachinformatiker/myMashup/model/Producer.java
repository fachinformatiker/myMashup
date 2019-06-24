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

public class Producer extends Thread{
    private Stack<Candy> candyStack;
    private int producerID;
    private static final Terminator terminator = new Terminator();

    /**
     * @param cS the CandyStack we are using
     * @param producerID the ID of the current producer
     */

    public Producer(Stack<Candy> cS, int producerID) {
        candyStack = cS;
        this.producerID = producerID;
        Debug.returnInfo("I'm producer Nr. " + this.producerID + " and I use the stack " + candyStack);
    }

    /**
     * producer thread
     * will push new candies to the stack for an infinite amount of time
     * we will see debug messages it we run it with:
     * Debug.setDebug(true);
     *
     */

    public synchronized void run() {
        while (Constants.run) {
            Debug.returnInfo("I'm alive! - P");
            Candy candy = new Candy(this.producerID);
            candyStack.push(candy);
            Debug.returnInfo( Constants.PRODUCER + this.producerID + " just pushed " + candy);

            notify();
        }
    }
}