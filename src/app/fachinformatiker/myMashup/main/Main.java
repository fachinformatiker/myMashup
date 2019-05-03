package app.fachinformatiker.myMashup.main;

import app.fachinformatiker.myMashup.model.loadValues;

public class Main {

    private static loadValues loadValues;

    public static void main(String[] args) {
        loadValues = new loadValues(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        System.out.println(loadValues);
    }

}
