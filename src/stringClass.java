public class stringClass {
    public static void main ( String[] args ) {
        String x = "hello" ; // object (instance of class)
        
        // sclicing x.charAt(index)
        System.out.println ( x.charAt ( 0 ) );
        System.out.println ( x.charAt ( 1 ) );
        System.out.println ( x.charAt ( 2 ) );
        System.out.println ( x.charAt ( 3 ) );
        System.out.println ( x.charAt ( 4 ) );
        // System.out.println ( x.charAt ( 5 ) ); //out of bound

        x += " cat and puppies" ; // x was changed
        System.out.println ( x ) ;

        String name = "Jack" ;
        String HelloJack = String.format ( "Hello, %s ", name ) ;
        System.out.println ( HelloJack ) ;

        System.out.println ( name.length ( ) ) ; // return how long of the string, start from 0
        
    }
}
