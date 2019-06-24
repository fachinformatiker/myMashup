/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.model;

import app.fachinformatiker.myMashup.constants.Constants;
import app.fachinformatiker.myMashup.utility.Debug;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 *
 */

public class Terminator extends Thread {

    /**
     * this is doing the following:
     * 1. start a timer to get the runtime
     * 2. wait until we enter the magic number (666)
     * 3. when we get the magic number it will stop the timer and get the execution time
     * 4. stop the whole script.
     *
     * Due to the execution time it could be that we will get the execution time and than some output from the consumers.
     */

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        Debug.returnInfo("Thread gestartet");
        while (Constants.run)
        {
            try {
                Debug.returnInfo("Terminator ist lebendig");
                sleep(100);
            } catch (InterruptedException ex) {
                return;
            }
            if (leseCodeEin() == Constants.MagicNumber) {
                System.out.println(Constants.MagicNumberDetected);
                //thread.notify
                long end = System.currentTimeMillis();
                NumberFormat formatter = new DecimalFormat("#0.00000");
                System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds" + "\n");
                System.exit(0);
            }
        }
    }

    /**
     *
     * @return the integer we write in the console while running the script
     */

    private int leseCodeEin() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}