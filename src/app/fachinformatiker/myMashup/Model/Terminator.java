package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Constants.Constants;
import app.fachinformatiker.myMashup.Utility.Debug;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Terminator extends Thread {

    private boolean isTerminated = false;

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        Debug.gebeInfoAus("Thread gestartet");
        while (true)
        {
            try {
                Debug.gebeInfoAus("Terminator ist lebendig");
                sleep(100);
            } catch (InterruptedException ex) {
                return;
            }
            if (leseCodeEin() == Constants.MagicNumber) {
                System.out.println(Constants.MagicNumberDetected);
                Debug.gebeInfoAus("stopping threads.");
                isTerminated = true;
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long end = System.currentTimeMillis();
                NumberFormat formatter = new DecimalFormat("#0.00000");
                System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds" + "\n");
                System.exit(0);
            }
        }
    }

    boolean isTerminated() {
        return isTerminated;
    }

    private int leseCodeEin() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}