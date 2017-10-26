package sample;

public class Cars
{
    private int yearModel;
    private String make;
    private int speed;

    //Creating a public class with
    public Cars(String m, int year)
    {
        yearModel = year;
        make = m;
        speed = 0;
    }

    //Get Model, Make, and Speed
    public int getModel(int year)
    {
        return yearModel;
    }

    public String getMake()
    {
        return make;
    }

    public int getSpeed()
    {
       return speed;
    }

    public void setModel(int year)
    {
        yearModel = year;
    }

    public void setMake(String carMake)
    {
        make = carMake;
    }

    public void setSpeed(int s)
    {
        speed = s;
    }

    public void acceeleratedSpeed()
    {
        speed += 5;
    }

    public void brakes()
    {
        speed -= 4;
    }
}






