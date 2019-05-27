package app.fachinformatiker.myMashup.Model;

import app.fachinformatiker.myMashup.Constants.Constants;
import app.fachinformatiker.myMashup.Utility.Debug;

import java.util.Scanner;

public class Terminator extends Thread{

    @Override
    public void run()
    {
        //Debug.gebeInfoAus("Thread gestartet");
        while(true) //Andere Threads schließen
            {
                try
                {
                    //Debug.gebeInfoAus("Terminator ist lebendig");
                    sleep(100);
                }
                catch (InterruptedException ex)
                {

                }
            }
        if (leseCodeEin() == Constants.MagicNumber)
        {
            //Debug.gebeInfoAus("MagicNumber");
            System.exit(1);
        }
    }

}

public int leseCodeEin()
{
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
}