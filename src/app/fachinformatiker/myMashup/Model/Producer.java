package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Stack;

public class Producer extends Thread{
    private Stack<Candy> candyStack;
    private int number;

    public Producer(Stack<Candy> cS, int number) {
        candyStack = cS;
        this.number = number; // producerid
        Debug.gebeInfoAus("I'm producer Nr. " + this.number + " and I use the stack " + candyStack);
    }

    public synchronized void run() {
       while (true) {
            //Debug.gebeInfoAus("I'm alive! - P");
            Candy candy = new Candy();
            candyStack.push(candy);
            //Debug.gebeInfoAus("Producer #" + number + " just pushed " + candy);
        }
    }
}