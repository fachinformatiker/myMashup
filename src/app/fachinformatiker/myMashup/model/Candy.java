package app.fachinformatiker.myMashup.model;

import java.util.Random;
import java.util.Stack;

import static app.fachinformatiker.myMashup.constants.Constants.*;

public class Candy {
    private int hell;
    private String hope;
    private int producerID;
    Stack CandyStack = new Stack();

    public void createCandy() {
        createHell();
        createHope();
    }

    public void createHell() {
        hell = new Random().nextInt(MAX_HELL)- MIN_HELL;
    }

    public void createHope() {
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(HOPE_TARGET_STRING_LENGTH);
        for (int i = 0; i < HOPE_TARGET_STRING_LENGTH; i++) {
            int randomLimitedInt = HOPE_LEFT_LIMIT + (int)
                    (random.nextFloat() * (HOPE_RIGHT_LIMIT - HOPE_LEFT_LIMIT + 1));
            buffer.append((char) randomLimitedInt);
        }
        hope = buffer.toString();
    }

    public int getHell() {
        createHell();
        return hell;
    }

    public String getHope() {
        createHope();
        return hope;
    }

    public void addToStack(Candy candy) {
        CandyStack.push(candy);
    }
    public void removeFromStack() {
        CandyStack.pop();
    }
    public void peekToStack() {
        CandyStack.peek();
    }
}