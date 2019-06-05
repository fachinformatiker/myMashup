package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Stack;

public class Producer extends Thread{
    private Stack<Candy> candyStack;
    private int producerID;
    private boolean isRunning;
    private static final Terminator terminator = new Terminator();

    public Producer(Stack<Candy> cS, int producerID) {
        candyStack = cS;
        this.producerID = producerID;
        Debug.gebeInfoAus("I'm producer Nr. " + this.producerID + " and I use the stack " + candyStack);
    }

    private boolean isRunning() {
        isRunning = terminator.isTerminated();
        return isRunning;
    }

    public synchronized void run() {
       while (!isRunning()) {
            Debug.gebeInfoAus("I'm alive! - P");
            Candy candy = new Candy(this.producerID);
            candyStack.push(candy);
            Debug.gebeInfoAus("Producer Nr. " + producerID + " just pushed " + candy);
        }
    }
}