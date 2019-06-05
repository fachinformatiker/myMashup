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

public class Consumer extends Thread {
    private Stack<Candy> candyStack;
    private int consumerID;
    private int sync;
    private boolean isSync;
    private int candyStackSize;

    public Consumer(Stack<Candy> cS, int consumerID, int sync) {
        candyStack = cS;
        this.consumerID = consumerID;
        this.sync = sync;
        Debug.returnInfo("I'm" + Constants.CONSUMER + this.consumerID + " and I use the stack " + candyStack + "but beware of the " + Constants.SYNC + this.sync + "!");
    }

    private boolean candyStackEqualsSync() {
        candyStackSize = candyStack.size();
        if (candyStackSize < this.sync) {
            return isSync;
        } else {
            return !isSync;
        }
    }

    public synchronized void run() {
        while (!candyStack.empty() || !candyStackEqualsSync()) {
            Debug.returnInfo("I'm alive! - C");
            Candy value;
            value = candyStack.pop();
            System.out.println(Constants.CONSUMER + this.consumerID + " got new candy!" + "\n" +
                    Constants.PRODUCER + value.getProducerID() + "\n" +
                    Constants.HOPE + value.getHope() + "\n" +
                    Constants.HELL + value.getHell() + "\n");
        }
    }
}