package sample;

import java.util.Random;

//Creating public Class Carz
public class Carz {
    public Carz() {

    }
    //Creating the constructor and attaching Carz
    public static void carz() {
        //Declaring the boolean variables are true
        boolean tires = true;
        boolean doors = true;
        //using a String to attach the lanes of a highway
        String[] location = new String[]{"left lane", "middle lane", "right lane"};
        //Using the string name "Location" to populate and generate the new location
        String moving = location[(new Random()).nextInt(location.length)];
        //Creating the string name "Color" to attach it to the cars
        String[] color = new String[]{"Red", "Blue", "Yellow", "Green", "Black", "White", "Silver"};
        //String "hover" is used to attach to color of a string
        String hover = color[(new Random()).nextInt(color.length)];
        //Creating a string to attach it to a car Model type
        String[] model = new String[]{"Ford", "Honda", "Chevy", "Toyota"};
        //String type is generating the random model cars that are driving on the highway
        String type = model[(new Random()).nextInt(model.length)];
        //Printing out "A (color) type is in the "model" is in the "location" of
        System.out.println("A " + hover + " " + type + " is in the " + moving + " of ");


    }
}