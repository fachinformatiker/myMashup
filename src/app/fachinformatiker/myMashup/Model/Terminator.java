package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Constants.Constants;
import app.fachinformatiker.myMashup.Utility.Debug;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Terminator extends Thread {

    private static final ArrayList<Producer> producerList = new ArrayList<>();
    private static final ArrayList<Consumer> consumerList = new ArrayList<>();

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

            }
            if (leseCodeEin() == Constants.MagicNumber) {
                Debug.gebeInfoAus("MagicNumber detected");
                System.out.println(Constants.MagicNumberDetected);
                Debug.gebeInfoAus("stopping threads.");
                stopProducers();
                stopConsumer();
                try {
                    TimeUnit.SECONDS.sleep(2);
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

    public int leseCodeEin() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void stopProducers() {
        for (int i = 0; i < producerList.size(); i++) {
            producerList.get(i).interrupt();
            Debug.gebeInfoAus("I'm stopping producer nr. " + i + " now.");
        }
    }

    private static void stopConsumer() {
        for (int i = 0; i < consumerList.size(); i++) {
            consumerList.get(i).interrupt();
            Debug.gebeInfoAus("I'm stopping consumer nr. " + i + " now.");
        }
    }


}