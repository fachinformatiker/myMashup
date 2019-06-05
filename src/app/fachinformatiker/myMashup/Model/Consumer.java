package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Constants.Constants;
import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Stack;

public class Consumer extends Thread {
    private Stack<Candy> candyStack;
    private int consumerID;
    private boolean isRunning;
    private int sync;
    private boolean isSync;
    private int candyStackSize;
    private static final Terminator terminator = new Terminator();

    public Consumer(Stack<Candy> cS, int consumerID, int sync) {
        candyStack = cS;
        this.consumerID = consumerID;
        this.sync = sync;
        Debug.gebeInfoAus("I'm consumer Nr. " + this.consumerID + " and I use the stack " + candyStack + "but beware of the sync " + this.sync + "!");
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
        while (!candyStack.empty() || candyStackEqualsSync()) {
            Debug.gebeInfoAus("I'm alive! - C");
            Candy value;
            value = candyStack.pop();
            System.out.println(Constants.CONSUMER + this.consumerID + " got new candy!" + "\n" +
                    Constants.PRODUCER + value.getProducerID() + "\n" +
                    Constants.HOPE + value.getHope() + "\n" +
                    Constants.HELL + value.getHell() + "\n");
        }
    }
}