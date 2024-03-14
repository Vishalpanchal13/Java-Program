import java.util.*;

class Switchcase2 
{
    public static void main(String[] args)
    {   
        String ch="a";

        switch(ch)
        { 
              
            case "a","e","i","o","u" ->
            {
                System.out.println("Value is Vowel.");
            }

            case "b","c","d","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z" ->
            {
            System.out.println("Value is Consonent.");
            }

            default -> System.out.println("Value is Integer.");

        }   
    }
}


