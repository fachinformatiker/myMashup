package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Stack;

public class Consumer extends Thread {
    private Stack<Candy> candyStack;
    private int number;

    public Consumer(Stack<Candy> cS) {
        candyStack = cS;
    }

    public synchronized void run() {
        while (!candyStack.empty()) {
            //Debug.gebeInfoAus("I'm alive! - C");
            Candy value;
            value = candyStack.pop();
            Debug.gebeInfoAus("Consumer #" + this.number + " got: " + value.getHope() + " " + value.getHell());
        }
    }
}