import java.util.Scanner;

public class stringMethods {
    public static void main ( String [] args ) {

        String fullAd = "tummmm... MY OH MY chicken pot pir. Now with 20% more chicken" ; 
        System.out.println ( fullAd.substring ( 9, 18 ) ) ;

        System.out.println ( fullAd.repeat ( 2 ) ) ;
        
        System.out.println ( fullAd.equals( "hello " ) ) ; //false, fullAd no string "hello"

        System.out.println ( "Please enter the password: " ) ;        
        String password = "let me in" ; 

        Scanner scanner = new Scanner ( System.in ) ;
        String guess = scanner.nextLine ( ) ;
        System.out.println ( password.equals ( guess ) ) ;

    }   
}
