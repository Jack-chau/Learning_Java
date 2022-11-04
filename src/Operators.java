import java.util.Scanner;
public class Operators {
    public static void main ( String[] args ) {
        System.out.println ( "How old are your ? " ) ;

        Scanner scanner = new Scanner ( System.in ) ;
        int age = Integer.parseInt ( scanner.nextLine ( ) ) ;

        System.out.println ( "Cats or dogs ?" ) ;

        String animals = scanner.nextLine ( ) ;

        if ( age > 12 ) {
            System.out.println ( "Welcome" ) ;
        }

        /* comparison operators
         * == equality (equal to)
         * != innequality (not equal to)
         * < less than
         * > greater than
         * <= less than or equal to
         * >= grater than or equal to
         * ! not ( inverse the boolean )
         */

        if ( age > 12 && animals.equals ( "dogs" ) ) // && == and operator
        {
            System.out.println ( "Welcome" ) ;
        }

        if ( age > 12 || animals.equals ( "Cats") ) ;
        {
            System.out.println ( "Welcome" ) ;
        }
    }
}
