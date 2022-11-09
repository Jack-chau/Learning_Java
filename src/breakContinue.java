public class breakContinue {
    public static void main ( String[] args ) {

    /* Different between break and continue :
     * break : stop the loop
     * continue : skip the iteration 
     */

        /* 
        for ( int i = 5 ; i >= 0 ; i-- ) {
           
            for ( int k = i ; k >= 0 ; k-- ) { 
                if ( k == 1) {
                    break ;
                }
                System.out.println ( k ) ;
            }

            if ( i == 2 ) {
                break ;
            }
        */
        
        // The iteration will continue, just skip 3
        System.out.println ( "here is break: " ) ;
        for ( int i = 3 ; i >= 0 ; i-- ) {
            for ( int k = i ; k >= 0 ; k-- ) {
                if ( k == 1 ) {
                    break ;
                }
                System.out.println ( k ) ;
            }
        }
        
        System.out.println ( "here is continue: " ) ;
        for ( int i = 3 ; i >= 0 ; i-- ) {
            for ( int k = i ; k >= 0 ; k-- ) {
                if ( k == 1 ) {
                    continue ;
                }
                System.out.println ( k ) ;
            }
        }
    }
}

