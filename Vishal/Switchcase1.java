import java.util.*;
class Switchcase1 {
    
    public static void main(String[] args) 
    {
        String color = "blue"; 

        switch(color)
        {
            case "red":
                System.out.println("Your Color is Red.");
            break;

            case "blue":
                System.out.println("Your Color is Blue.");
            break;

            case "orange":
                System.out.println("Your Color is Orange.");
            break;

            case "purple":
                System.out.println("Your Color is Purple.");
            break;

            case "green":
                System.out.println("Your Color is Green.");
            break;

            default:
                System.out.println("Not Available.");
        }
    }
    
}
