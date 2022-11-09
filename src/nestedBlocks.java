import java.util.Scanner ;
 
public class nestedBlocks {
    public static void main ( String[] args ) {

        Boolean additionalLogging = true ;

        for ( int i = 9 ; i >= 0 ; i--) {
            System.out.println ( i ) ;

            if ( i == 5 ) {
                if ( additionalLogging == true ) {
                    System.out.println ( "We found 5" ) ;
                }
            }
        }
    }
}
