package app.fachinformatiker.myMashup.Model;

import java.util.Stack;

public class CandyStack {

    Stack CandyStack = new Stack();

    public Stack getCandyStack() {
        return CandyStack;
    }

    public void setCandyStack(Stack candyStack) {
        CandyStack = candyStack;
    }


    public void addToStack(int hell, String hope) {
        String candy = hell + ";" + hope;
        CandyStack.push(candy);
    }

    public String getFromStack() {
        return null;
    }

}
