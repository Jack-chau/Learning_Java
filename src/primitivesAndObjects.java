public class primitivesAndObjects {

    public static final double PI = 3.14159 ; // This is globle variable
    private int B = 10 ; // also work as final

    public static void main ( String[] args ) {
/*         
        int x = 5; // primitive datatype
        Integer y = 6; // object (6 is autoboxed), we call a class Integer and autobox 6 into an integer

        int z = x + y ;

        System.out.println ( z ) ;
 */
        int j ; // declaration
        j = 5 ; // initialization
        j = 10 ;
    
        final int Y = 15 ; // constant datatype
        // Y = 1 ; will have an error because cannot alter constant datatype
        System.out.println ( j ) ;
        System.out.println ( Y ) ;

        System.out.println ( PI ) ; 
    }
}
