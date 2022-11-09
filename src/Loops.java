import java.util.Scanner ;

public class Loops {
    public static void main ( String[] args ) { 
        /*
         * icu
         * initialization
         * comparison
         * update
         */
        
        /*
         int i = 0 ;
        while ( i < 10 ) {
            i++ ;
            System.out.println ( i ) ;
        }
         */

        System.out.println ( "Please enter your password: " ) ;
        String password = "Jack123Jack123" ;
        Scanner scanner = new Scanner ( System.in ) ;
        String passwordInput = scanner.nextLine ( ) ;

        while ( !passwordInput.equals( password ) ) {
            System.out.println ( "Please input your password again! " ) ;
            passwordInput = scanner.nextLine ( ) ;
        }
        
        System.out.println ( "congrats" ) ;
        
    }
}
