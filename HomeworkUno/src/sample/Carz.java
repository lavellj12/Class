package sample;

import javax.swing.*;

public class Carz {
    private Object model;

    public Carz(String car, int i) {

        String input, make;
        int model, yearModel, year, speed;

        Carz myCarz = new Carz("Car", 1998);

        make = JOptionPane.showInputDialog("Who is the maker of your car");
        myCarz.getMake(make);

        year = Integer.parseInt(JOptionPane.showInputDialog("What is the model of your car?"));
        myCarz.getModel(year);

        input = JOptionPane.showInputDialog("What speed is your car going?");
        i = Integer.parseInt(input);
        myCarz.setSpeed(i);

        for(int n = 0;n<5;n++);
        {
            myCarz.acceleratedSpeed();
            System.out.println();
            System.out.println("The " + " " +
            myCarz.getModel() + " " + myCarz.getMake() +
            " is gradually accelerating. ");
        }

        System.out.print("Your current speed");




    }

    private void acceleratedSpeed() {
    }

    public Object getModel(int year) {
        return model;
    }

    public Object getMake(Object make) {
        return make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
