package app.fachinformatiker.myMashup.Model;

import java.util.Stack;

public class Producer {

    // Thread for producer
    // will create new values and send them to the stack

    private Candy candy = new Candy();


    int hell = candy.getHell();
    String hope = candy.getHope();

    public Producer(Stack<Candy> candyStack, int i) {

    }

    public void setCandy(Candy candy) {
        this.candy = candy;
    }
}