import java.math.BigDecimal;
import java.util.Scanner;

public class scannerInput {
    public static void main ( String[] args ) {
        
        Scanner scanner = new Scanner ( System.in ) ;

        // Return name
        System.out.println ( "Please Enter Your Name: ") ;
        String name = scanner.nextLine ( ) ;

        System.out.println ( "Hi " + name ) ;

        // Return integer
        int y = scanner.nextInt ( ) ; // return integer only
        System.out.println ( "Here is y: " + y ) ;

        // Return y + 10
        int a = y + 10 ;
        System.out.println ( "Here is y + 10 : " + a ) ;

        // for bigdecimal
        BigDecimal money = scanner.nextBigDecimal ( ) ;
        System.out.println ( money ) ;

        // for boolean
        boolean bool = scanner.nextBoolean ( ) ;
        System.out.println ( bool ) ;
  
        int hax = scanner.nextInt( 16 ) ;
        System.out.println ( hax ) ;
        // if you input 10, which means 16^1, = 16
    }
}
