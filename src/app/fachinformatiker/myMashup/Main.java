package app.fachinformatiker.myMashup;

public class Main {

    public static void main(String[] args) {
        int producer = 0;
        int consumer = 0;
        int sync = 0;

        try {
            producer = Integer.parseInt(args[0]);
            consumer = Integer.parseInt(args[1]);
            sync = Integer.parseInt(args[2]);
        }
        catch (NumberFormatException nfe) {
            System.out.println("You have to pass me integers, not strings!");
            System.exit(1);
        }

        System.out.println(producer + " " + consumer + " " + sync);
    }
}
