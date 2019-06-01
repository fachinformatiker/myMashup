package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Stack;

public class Producer {

    private Candy candy = new Candy();
    private String myCandy;

    int hell = candy.getHell();
    String hope = candy.getHope();

    public Producer(Stack<String> candyStack, int i) {
        myCandy = i + ";" + hell + ";" + hope;
        candyStack.push(myCandy);
        Debug.gebeInfoAus(myCandy);
    }

    public void start() {

    }
}