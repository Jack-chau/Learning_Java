public class nestedForLoop {
    public static void main ( String[] args ) { 
    
    // To make a triangle using two loop
    /*
        for ( int i = 9 ; i >= 0 ; i--) {
            for ( int k = i ; k >= 0 ; k-- ) {
                System.out.println ( k ) ;
            }
            System.out.println ( ) ;
        }
    */
    // if you are awesome, you can make a while while loop:
        int i = 9 ;  
        while ( i >= 0 ) {
            int k = i ;
            while ( k >= 0 ){
                System.out.println ( k + " " ) ;
                k --; 
            }
            System.out.println ( ) ;
            i-- ;
        }
    }    
}