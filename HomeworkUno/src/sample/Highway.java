package sample;

import java.util.Random;

public class Highway {
    public Highway() {
    }

    //Creating constructor for TurnPike
    public static void TurnPike() {
        //Declaring "lanes and speedlimit
        boolean lanes = true;
        boolean speedlimit = true;
        String[] direction = new String[]{"North", "South"};
        String compass = direction[(new Random()).nextInt(direction.length)];
        String[] Name = new String[]{"290", "HWY-6", "I-45"};
        String road = Name[(new Random()).nextInt(Name.length)];
        int[] speed = new int[]{55, 60, 65, 70, 75, 80, 85, 90};
        int mph = speed[(new Random()).nextInt(speed.length)];
        System.out.println(compass + " " + road + " going " + mph + " mph.");

        //Add More Arrays

    }
}
