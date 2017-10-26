package sample;

import java.util.Random;

public class Carz {
    public Carz() {

    }
    public static void carz() {
        boolean tires = true;
        boolean doors = true;
        String[] location = new String[]{"left lane", "middle lane", "right lane"};
        String moving = location[(new Random()).nextInt(location.length)];
        String[] color = new String[]{"Red", "Blue", "Yellow", "Green", "Black", "White", "Silver"};
        String hover = color[(new Random()).nextInt(color.length)];
        String[] model = new String[]{"Ford", "Honda", "Chevy", "Toyota"};
        String type = model[(new Random()).nextInt(model.length)];
        System.out.println("A " + hover + " " + type + " is in the " + moving + " of ");


    }
}