/*
    Syntax :
        do {
            at least run once
        } while ( conditions ) ;   // if condition doesn't match, break the do while loop, otherwhise keep looping
 */
import java.util.Scanner ; 

public class doWhileLoop {
    public static void main ( String[] args ) {

        String password = "Jack123Jack123" ;
        Scanner scanner = new Scanner ( System.in ) ;
        String passwordInputed ;

        do {
            System.out.println ( "Please input your password: ") ;
            passwordInputed = scanner.nextLine ( ) ;
        } while ( ! passwordInputed.equals( password ) ) ;
        System.out.println ( "Correct password!" ) ;
        scanner.close ( ) ;
    }
}
