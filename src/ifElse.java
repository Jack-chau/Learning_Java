import java.util.Scanner;

public class ifElse {
    public static void main ( String[] args) {
        
        String password = "let me in" ;

        System.out.println ( "Please enter the password: " ) ;

        Scanner scanner = new Scanner ( System.in ) ;
        String userInput = scanner.nextLine ( ) ;

        if ( password.equals ( userInput ) ) {
            System.out.println ( "Welcome" ) ;
        } else if ( userInput.equals ( "Jack") ) {
            System.out.println ( "Hello Jack" ) ;
        } else {
            System.out.println ( "You suck !!! " ) ;
        }
    }
}
