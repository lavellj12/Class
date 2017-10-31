package sample;

//Creating a class called "Traffic"
public class Traffic {
    //Traffic is public
    public Traffic() {
    }


    /*
    *Creating Main Method with Carz
     */
    public static void main(String[] args) {
        //Calling Carz (The Java file), and the public class Carz
        Carz.carz();
        //Calling Highway to attach it to the constructor "Turnpike"
        Highway.TurnPike();
    }
}
