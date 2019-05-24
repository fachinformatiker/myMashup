package app.fachinformatiker.myMashup.Model;

public class Consumer {

    // Thread for Consumer
    // will get values from Stack and return it to the view


    private CandyStack stack = new CandyStack();

    public CandyStack getStack() {
        return stack;
        // ? stack.getFromStack()
    }
}
