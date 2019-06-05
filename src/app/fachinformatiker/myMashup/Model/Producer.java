/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Constants.Constants;
import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Stack;

public class Producer extends Thread{
    private Stack<Candy> candyStack;
    private int producerID;
    private static final Terminator terminator = new Terminator();

    public Producer(Stack<Candy> cS, int producerID) {
        candyStack = cS;
        this.producerID = producerID;
        Debug.returnInfo("I'm producer Nr. " + this.producerID + " and I use the stack " + candyStack);
    }

    public synchronized void run() {
        //noinspection InfiniteLoopStatement
        while (true) {
            Debug.returnInfo("I'm alive! - P");
            Candy candy = new Candy(this.producerID);
            candyStack.push(candy);
            Debug.returnInfo( Constants.PRODUCER + this.producerID + " just pushed " + candy);
        }
    }
}