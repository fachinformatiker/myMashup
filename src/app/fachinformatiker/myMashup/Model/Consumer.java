package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Constants.Constants;
import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Stack;

public class Consumer extends Thread {
    private Stack<Candy> candyStack;
    private int consumerid;

    public Consumer(Stack<Candy> cS, int consumerid) {
        candyStack = cS;
        this.consumerid = consumerid;
        Debug.gebeInfoAus("I'm consumer Nr. " + this.consumerid + " and I use the stack " + candyStack);
    }

    public synchronized void run() {
        while (!candyStack.empty()) {
            Debug.gebeInfoAus("I'm alive! - C");
            Candy value;
            value = candyStack.pop();
            System.out.println(Constants.CONSUMER + this.consumerid + " got new candy!" + "\n" +
                    Constants.PRODUCER + value.getProducerID() + "\n" +
                    Constants.HOPE + value.getHope() + "\n" +
                    Constants.HELL + value.getHell());
        }
    }
}