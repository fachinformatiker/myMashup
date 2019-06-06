/*
 * Copyright (c) 2019.
 * To learn more about my code have a look at:
 * - my GitHub page -> github.com/fachinformatiker
 * - my blog -> fachinformatiker.app
 * - my YouTube channel -> youtube.com/psvisualdesign
 */

package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Constants.Constants;
import app.fachinformatiker.myMashup.Utility.Debug;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 *
 */

public class Terminator extends Thread {

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        Debug.returnInfo("Thread gestartet");
        while (true)
        {
            try {
                Debug.returnInfo("Terminator ist lebendig");
                sleep(100);
            } catch (InterruptedException ex) {
                return;
            }
            if (leseCodeEin() == Constants.MagicNumber) {
                System.out.println(Constants.MagicNumberDetected);
                long end = System.currentTimeMillis();
                NumberFormat formatter = new DecimalFormat("#0.00000");
                System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds" + "\n");
                System.exit(0);
            }
        }
    }

    private int leseCodeEin() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}