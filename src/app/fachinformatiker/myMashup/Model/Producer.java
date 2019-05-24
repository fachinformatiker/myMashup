package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Control.CandyController;
import app.fachinformatiker.myMashup.View.CandyView;

public class Producer {

    // Thread for producer
    // will create new values and send them to the stack

    private Candy candy = new Candy();
    private CandyView view = new CandyView();
    private CandyStack stack = new CandyStack();


    int hell = candy.getHell();
    String hope = candy.getHope();

    public void setCandy(Candy candy) {
        this.candy = candy;
        // ? stack.addToStack();
    }
}