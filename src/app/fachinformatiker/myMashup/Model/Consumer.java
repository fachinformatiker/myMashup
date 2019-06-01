package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Stack;

public class Consumer {

    public Consumer(Stack<String> candyStack) {
        String Candy = candyStack.pop();
        Debug.gebeInfoAus(Candy);
    }

    public void start() {

    }
}
