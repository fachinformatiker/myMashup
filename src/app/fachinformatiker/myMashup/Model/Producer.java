package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Stack;

public class Producer extends Thread{
    private Stack<Candy> candyStack;
    private int producerid;

    public Producer(Stack<Candy> cS, int producerid) {
        candyStack = cS;
        this.producerid = producerid;
        Debug.gebeInfoAus("I'm producer Nr. " + this.producerid + " and I use the stack " + candyStack);
    }

    public synchronized void run() {
       while (true) {
            Debug.gebeInfoAus("I'm alive! - P");
            Candy candy = new Candy(this.producerid);
            candyStack.push(candy);
            Debug.gebeInfoAus("Producer Nr. " + producerid + " just pushed " + candy);
        }
    }
}